// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link FullDataType} extends {@link TeaModel}
 *
 * <p>FullDataType</p>
 */
public class FullDataType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("element")
    private FullDataType element;

    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<DataField> fields;

    @com.aliyun.core.annotation.NameInMap("key")
    private FullDataType key;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private FullDataType value;

    private FullDataType(Builder builder) {
        this.element = builder.element;
        this.fields = builder.fields;
        this.key = builder.key;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FullDataType create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return element
     */
    public FullDataType getElement() {
        return this.element;
    }

    /**
     * @return fields
     */
    public java.util.List<DataField> getFields() {
        return this.fields;
    }

    /**
     * @return key
     */
    public FullDataType getKey() {
        return this.key;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public FullDataType getValue() {
        return this.value;
    }

    public static final class Builder {
        private FullDataType element; 
        private java.util.List<DataField> fields; 
        private FullDataType key; 
        private String type; 
        private FullDataType value; 

        private Builder() {
        } 

        private Builder(FullDataType model) {
            this.element = model.element;
            this.fields = model.fields;
            this.key = model.key;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>The data type.</p>
         */
        public Builder element(FullDataType element) {
            this.element = element;
            return this;
        }

        /**
         * <p>The list of field definitions. This parameter is required when <code>type</code> is <code>ROW</code>.</p>
         */
        public Builder fields(java.util.List<DataField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * <p>The data type of the key. This parameter is required when <code>type</code> is <code>MAP</code>.</p>
         */
        public Builder key(FullDataType key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The data type. This parameter is required when <code>type</code> is <code>ARRAY</code> or <code>MULTISET</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The data type of the value. This parameter is required when <code>type</code> is <code>MAP</code>.</p>
         */
        public Builder value(FullDataType value) {
            this.value = value;
            return this;
        }

        public FullDataType build() {
            return new FullDataType(this);
        } 

    } 

}
