package web.bms.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import web.bms.entity.Reader;
import web.bms.utility.Page;

public interface IReaderMapper {
	public List<Reader> getAll(@Param("page") Page page, @Param("number") String number, @Param("name") String name);

	public int count(@Param("number") String number, @Param("name") String name);

	public Reader get(int id);

	public Reader select(Reader reader);

	public int create(Reader reader);

	public void update(Reader reader);

	public void delete(int id);
}
