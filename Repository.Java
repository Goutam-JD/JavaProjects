public interface repository implements JPARepository<CurdRepository,Integer>();
{
	public void doProcess();
}