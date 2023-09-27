package org.woanchin.illumina.LearnNumbers.model;

public class Pair<M,N> {
    private long id;
    private M m;
    private N n;
    public Pair(M l, N n){
        this.m = l;
        this.n = n;
    }
    public M getFirst(){ return m; }
    public N getSecond(){ return n; }
    public void setFirst(M m){ this.m = m; }
    public void setSecond(N n){ this.n = n; }
}