package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.MaterialProperty;
import com.jsh.erp.datasource.entities.MaterialPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int countByExample(MaterialPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int deleteByExample(MaterialPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int insert(MaterialProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int insertSelective(MaterialProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    List<MaterialProperty> selectByExample(MaterialPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    MaterialProperty selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MaterialProperty record, @Param("example") MaterialPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MaterialProperty record, @Param("example") MaterialPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MaterialProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_materialproperty
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MaterialProperty record);

    List<MaterialProperty> selectByConditionMaterialProperty(
            @Param("name") String name,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    int countsByMaterialProperty(@Param("name") String name);
}