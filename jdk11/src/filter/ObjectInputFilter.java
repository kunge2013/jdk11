package filter;

public class ObjectInputFilter implements java.io.ObjectInputFilter{

	@Override
	public Status checkInput(FilterInfo filterInfo) {
		Class<?> clazz = filterInfo.serialClass();
        if (clazz != null) {
            return (Number.class.isAssignableFrom(clazz)) ? Status.ALLOWED : Status.REJECTED;
        }
		return Status.UNDECIDED;
	}
	
}
