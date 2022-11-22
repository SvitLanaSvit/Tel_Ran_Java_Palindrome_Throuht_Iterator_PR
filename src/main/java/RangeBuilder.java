public class RangeBuilder {
    private int head = 0;
    private int tail = 0;

    public RangeBuilder setHead(int head) {
        this.head = head;
        return this;
    }

    public RangeBuilder setTail(int tail) {
        this.tail = tail;
        return this;
    }

    public IteratorRange.Range createRange() {
        return new IteratorRange.Range(head, tail);
    }
}