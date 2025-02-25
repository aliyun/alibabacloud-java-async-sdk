// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FieldCondition} extends {@link TeaModel}
 *
 * <p>FieldCondition</p>
 */
public class FieldCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fieldName")
    private String fieldName;

    @com.aliyun.core.annotation.NameInMap("nestFieldPath")
    private String nestFieldPath;

    @com.aliyun.core.annotation.NameInMap("nestFieldValue")
    private java.util.List < Long > nestFieldValue;

    @com.aliyun.core.annotation.NameInMap("operateType")
    private String operateType;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private FieldCondition(Builder builder) {
        this.fieldName = builder.fieldName;
        this.nestFieldPath = builder.nestFieldPath;
        this.nestFieldValue = builder.nestFieldValue;
        this.operateType = builder.operateType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldCondition create() {
        return builder().build();
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return nestFieldPath
     */
    public String getNestFieldPath() {
        return this.nestFieldPath;
    }

    /**
     * @return nestFieldValue
     */
    public java.util.List < Long > getNestFieldValue() {
        return this.nestFieldValue;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String fieldName; 
        private String nestFieldPath; 
        private java.util.List < Long > nestFieldValue; 
        private String operateType; 
        private String value; 

        /**
         * fieldName.
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * nestFieldPath.
         */
        public Builder nestFieldPath(String nestFieldPath) {
            this.nestFieldPath = nestFieldPath;
            return this;
        }

        /**
         * nestFieldValue.
         */
        public Builder nestFieldValue(java.util.List < Long > nestFieldValue) {
            this.nestFieldValue = nestFieldValue;
            return this;
        }

        /**
         * operateType.
         */
        public Builder operateType(String operateType) {
            this.operateType = operateType;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public FieldCondition build() {
            return new FieldCondition(this);
        } 

    } 

}
