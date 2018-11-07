package org.imooc.dao;

import org.imooc.bean.Dic;

import java.util.List;

public interface DicDao {
    List<Dic> select(Dic dic);
}