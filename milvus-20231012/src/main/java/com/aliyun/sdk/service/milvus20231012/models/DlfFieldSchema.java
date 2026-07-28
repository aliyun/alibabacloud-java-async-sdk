// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link DlfFieldSchema} extends {@link TeaModel}
 *
 * <p>DlfFieldSchema</p>
 */
public class DlfFieldSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("dimension")
    private Integer dimension;

    @com.aliyun.core.annotation.NameInMap("dlfFieldType")
    private String dlfFieldType;

    @com.aliyun.core.annotation.NameInMap("fieldName")
    private String fieldName;

    @com.aliyun.core.annotation.NameInMap("isPrimaryKey")
    private Boolean isPrimaryKey;

    @com.aliyun.core.annotation.NameInMap("isSupported")
    private Boolean isSupported;

    @com.aliyun.core.annotation.NameInMap("isVectorField")
    private Boolean isVectorField;

    @com.aliyun.core.annotation.NameInMap("milvusFieldType")
    private String milvusFieldType;

    @com.aliyun.core.annotation.NameInMap("nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("unsupportedReason")
    private String unsupportedReason;

    private DlfFieldSchema(Builder builder) {
        this.comment = builder.comment;
        this.dimension = builder.dimension;
        this.dlfFieldType = builder.dlfFieldType;
        this.fieldName = builder.fieldName;
        this.isPrimaryKey = builder.isPrimaryKey;
        this.isSupported = builder.isSupported;
        this.isVectorField = builder.isVectorField;
        this.milvusFieldType = builder.milvusFieldType;
        this.nullable = builder.nullable;
        this.unsupportedReason = builder.unsupportedReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DlfFieldSchema create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return dimension
     */
    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * @return dlfFieldType
     */
    public String getDlfFieldType() {
        return this.dlfFieldType;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return isPrimaryKey
     */
    public Boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    /**
     * @return isSupported
     */
    public Boolean getIsSupported() {
        return this.isSupported;
    }

    /**
     * @return isVectorField
     */
    public Boolean getIsVectorField() {
        return this.isVectorField;
    }

    /**
     * @return milvusFieldType
     */
    public String getMilvusFieldType() {
        return this.milvusFieldType;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * @return unsupportedReason
     */
    public String getUnsupportedReason() {
        return this.unsupportedReason;
    }

    public static final class Builder {
        private String comment; 
        private Integer dimension; 
        private String dlfFieldType; 
        private String fieldName; 
        private Boolean isPrimaryKey; 
        private Boolean isSupported; 
        private Boolean isVectorField; 
        private String milvusFieldType; 
        private Boolean nullable; 
        private String unsupportedReason; 

        private Builder() {
        } 

        private Builder(DlfFieldSchema model) {
            this.comment = model.comment;
            this.dimension = model.dimension;
            this.dlfFieldType = model.dlfFieldType;
            this.fieldName = model.fieldName;
            this.isPrimaryKey = model.isPrimaryKey;
            this.isSupported = model.isSupported;
            this.isVectorField = model.isVectorField;
            this.milvusFieldType = model.milvusFieldType;
            this.nullable = model.nullable;
            this.unsupportedReason = model.unsupportedReason;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * dimension.
         */
        public Builder dimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * dlfFieldType.
         */
        public Builder dlfFieldType(String dlfFieldType) {
            this.dlfFieldType = dlfFieldType;
            return this;
        }

        /**
         * fieldName.
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * isPrimaryKey.
         */
        public Builder isPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }

        /**
         * isSupported.
         */
        public Builder isSupported(Boolean isSupported) {
            this.isSupported = isSupported;
            return this;
        }

        /**
         * isVectorField.
         */
        public Builder isVectorField(Boolean isVectorField) {
            this.isVectorField = isVectorField;
            return this;
        }

        /**
         * milvusFieldType.
         */
        public Builder milvusFieldType(String milvusFieldType) {
            this.milvusFieldType = milvusFieldType;
            return this;
        }

        /**
         * nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * unsupportedReason.
         */
        public Builder unsupportedReason(String unsupportedReason) {
            this.unsupportedReason = unsupportedReason;
            return this;
        }

        public DlfFieldSchema build() {
            return new DlfFieldSchema(this);
        } 

    } 

}
