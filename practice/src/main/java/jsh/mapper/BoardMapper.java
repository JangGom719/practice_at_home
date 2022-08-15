package jsh.mapper;

import java.util.List;
import jsh.domain.Board;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardMapper {


	public void register(Board board) throws Exception;

	public Board read(Integer boardNo) throws Exception;

	public void modify(Board board) throws Exception;

	public void remove(Integer boardNo) throws Exception;

	public List<Board> list() throws Exception;

}
