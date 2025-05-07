// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link JudgeNodeMetaDesc} extends {@link TeaModel}
 *
 * <p>JudgeNodeMetaDesc</p>
 */
public class JudgeNodeMetaDesc extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualValue")
    private String actualValue;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private Integer dataType;

    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("FieldType")
    private Integer fieldType;

    @com.aliyun.core.annotation.NameInMap("Symbol")
    private Integer symbol;

    @com.aliyun.core.annotation.NameInMap("Value")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(JudgeNodeMetaDesc model) {
            this.actualValue = model.actualValue;
            this.dataType = model.dataType;
            this.field = model.field;
            this.fieldType = model.fieldType;
            this.symbol = model.symbol;
            this.value = model.value;
        } 

        /**
         * ActualValue.
         */
        public Builder actualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * FieldType.
         */
        public Builder fieldType(Integer fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Symbol.
         */
        public Builder symbol(Integer symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
         * Value.
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
