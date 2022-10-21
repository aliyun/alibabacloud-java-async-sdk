// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JudgeNodeMetaDesc} extends {@link TeaModel}
 *
 * <p>JudgeNodeMetaDesc</p>
 */
public class JudgeNodeMetaDesc extends TeaModel {
    @NameInMap("ActualValue")
    private String actualValue;

    @NameInMap("DataType")
    private Integer dataType;

    @NameInMap("Field")
    private String field;

    @NameInMap("FieldType")
    private Integer fieldType;

    @NameInMap("Symbol")
    private Integer symbol;

    @NameInMap("Value")
    private String value;

    private JudgeNodeMetaDesc(Builder builder) {
        this.actualValue = builder.actualValue;
        this.dataType = builder.dataType;
        this.field = builder.field;
        this.fieldType = builder.fieldType;
        this.symbol = builder.symbol;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JudgeNodeMetaDesc create() {
        return builder().build();
    }

    /**
     * @return actualValue
     */
    public String getActualValue() {
        return this.actualValue;
    }

    /**
     * @return dataType
     */
    public Integer getDataType() {
        return this.dataType;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return fieldType
     */
    public Integer getFieldType() {
        return this.fieldType;
    }

    /**
     * @return symbol
     */
    public Integer getSymbol() {
        return this.symbol;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String actualValue; 
        private Integer dataType; 
        private String field; 
        private Integer fieldType; 
        private Integer symbol; 
        private String value; 

        /**
         * 实际值
         */
        public Builder actualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }

        /**
         * 数据类型
         */
        public Builder dataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * 系统字段
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * 字段数据来源类型：1：系统预定义字段 2：传参质检字段
         */
        public Builder fieldType(Integer fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * 逻辑表达式
         */
        public Builder symbol(Integer symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
         * 预设值的值
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public JudgeNodeMetaDesc build() {
            return new JudgeNodeMetaDesc(this);
        } 

    } 

}
