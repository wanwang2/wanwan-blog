//package org.wei.blog.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.wei.blog.util.Log;
//
///**
// * 切面
// * 
// */
//public class TimeAspect {
//
//	public void doAfter(JoinPoint jp) {
//		Log.log("vvvv doAfter vvvv: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
//	}
//
//	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
//		long time = System.currentTimeMillis();
//		Object retVal = pjp.proceed();
//		time = System.currentTimeMillis() - time; 
//		Log.log("vvvv doAround vvvv: process time: " + time + " ms");
//		return retVal;
//	}
//
//	public void doBefore(JoinPoint jp) {
//		Log.log("vvvv doBefore vvvv: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
//	}
//
//	public void doThrowing(JoinPoint jp, Throwable ex) {
//		Log.log("vvvv doThrowings vvvv: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName()
//				+ " throw exception");
//		Log.log(ex.getMessage());
//	}
//
//	// private void sendEx(String ex) {
//	// //TODO 发送短信或邮件提醒
//	// }
//}