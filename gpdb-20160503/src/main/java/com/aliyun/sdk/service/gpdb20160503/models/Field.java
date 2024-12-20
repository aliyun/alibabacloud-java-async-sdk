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

        /**
         * BlobValue.
         */
        public Builder blobValue(String blobValue) {
            this.blobValue = blobValue;
            return this;
        }

        /**
         * BooleanValue.
         */
        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        /**
         * DoubleValue.
         */
        public Builder doubleValue(Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        /**
         * IsNull.
         */
        public Builder isNull(Boolean isNull) {
            this.isNull = isNull;
            return this;
        }

        /**
         * LongValue.
         */
        public Builder longValue(Long longValue) {
            this.longValue = longValue;
            return this;
        }

        /**
         * StringValue.
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
