package com.todo.app.mapper;

import java.util.List;

import com.todo.app.entity.Todo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
  public List<Todo> selectAll();

  public List<Todo> selectIncomplete();

  public List<Todo> selectComplete();

  public void add(Todo todo); /* データベースに追加する命令 */

  public void update(Todo todo);

  public void delete();
}
