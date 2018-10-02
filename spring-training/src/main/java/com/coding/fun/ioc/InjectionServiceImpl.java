package com.coding.fun.ioc;

public class InjectionServiceImpl implements InjectionService {
	private InjectionDao injectionDao;
	//injection from the constructor;
	public InjectionServiceImpl(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}
	//injection from the setting method
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}
	
	public void save(String arg) {
		System.out.print("Service arg:"+arg);
		arg = arg +":"+this.hashCode();
		injectionDao.save(arg);
	}
}
