package test3;

//���󹹼��������ǽӿ�
public abstract class AbstractFile {
	public abstract void add(AbstractFile c);
	public abstract void remove(AbstractFile c);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
