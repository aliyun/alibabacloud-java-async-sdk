// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link Field} extends {@link TeaModel}
 *
 * <p>Field</p>
 */
public class Field extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlobValue")
    private String blobValue;

    @com.aliyun.core.annotation.NameInMap("BooleanValue")
    private Boolean booleanValue;

    @com.aliyun.core.annotation.NameInMap("DoubleValue")
    private Double doubleValue;

    @com.aliyun.core.annotation.NameInMap("IsNull")
    private Boolean isNull;

    @com.aliyun.core.annotation.NameInMap("LongValue")
    private Long longValue;

    @com.aliyun.core.annotation.NameInMap("StringValue")
    private String stringValue;

    private Field(Builder builder) {
        this.blobValue = builder.blobValue;
        this.booleanValue = builder.booleanValue;
        this.doubleValue = builder.doubleValue;
        this.isNull = builder.isNull;
        this.longValue = builder.longValue;
        this.stringValue = builder.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Field create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blobValue
     */
    public String getBlobValue() {
        return this.blobValue;
    }

    /**
     * @return booleanValue
     */
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * @return doubleValue
     */
    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * @return isNull
     */
    public Boolean getIsNull() {
        return this.isNull;
    }

    /**
     * @return longValue
     */
    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * @return stringValue
     */
    public String getStringValue() {
        return this.stringValue;
    }

    public static final class Builder {
        private String blobValue; 
        private Boolean booleanValue; 
        private Double doubleValue; 
        private Boolean isNull; 
        private Long longValue; 
        private String stringValue; 

        private Builder() {
        } 

        private Builder(Field model) {
            this.blobValue = model.blobValue;
            this.booleanValue = model.booleanValue;
            this.doubleValue = model.doubleValue;
            this.isNull = model.isNull;
            this.longValue = model.longValue;
            this.stringValue = model.stringValue;
        } 

        /**
         * <p>The Base64-encoded binary.</p>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG8=</p>
         */
        public Builder blobValue(String blobValue) {
            this.blobValue = blobValue;
            return this;
        }

        /**
         * <p>The Boolean value.</p>
         */
        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        /**
         * <p>The Double value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.25</p>
         */
        public Builder doubleValue(Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        /**
         * <p>The null status.</p>
         */
        public Builder isNull(Boolean isNull) {
            this.isNull = isNull;
            return this;
        }

        /**
         * <p>The Long value.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder longValue(Long longValue) {
            this.longValue = longValue;
            return this;
        }

        /**
         * <p>The string.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample text</p>
         */
        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Field build() {
            return new Field(this);
        } 

    } 

}
