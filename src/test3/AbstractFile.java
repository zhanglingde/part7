package test3;

//抽象构件，可以是接口
public abstract class AbstractFile {
	public abstract void add(AbstractFile c);
	public abstract void remove(AbstractFile c);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
