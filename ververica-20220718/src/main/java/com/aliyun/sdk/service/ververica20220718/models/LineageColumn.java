// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LineageColumn} extends {@link TeaModel}
 *
 * <p>LineageColumn</p>
 */
public class LineageColumn extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("columnNativeType")
    private String columnNativeType;

    @com.aliyun.core.annotation.NameInMap("columnType")
    private String columnType;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private Long modifiedAt;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("nullable")
    private Boolean nullable;

    private LineageColumn(Builder builder) {
        this.columnName = builder.columnName;
        this.columnNativeType = builder.columnNativeType;
        this.columnType = builder.columnType;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.description = builder.description;
        this.id = builder.id;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.nullable = builder.nullable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageColumn create() {
        return builder().build();
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return columnNativeType
     */
    public String getColumnNativeType() {
        return this.columnNativeType;
    }

    /**
     * @return columnType
     */
    public String getColumnType() {
        return this.columnType;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifiedAt
     */
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    public static final class Builder {
        private String columnName; 
        private String columnNativeType; 
        private String columnType; 
        private Long createdAt; 
        private String creator; 
        private String description; 
        private String id; 
        private Long modifiedAt; 
        private String modifier; 
        private Boolean nullable; 

        /**
         * columnName.
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * columnNativeType.
         */
        public Builder columnNativeType(String columnNativeType) {
            this.columnNativeType = columnNativeType;
            return this;
        }

        /**
         * columnType.
         */
        public Builder columnType(String columnType) {
            this.columnType = columnType;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * modifiedAt.
         */
        public Builder modifiedAt(Long modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        public LineageColumn build() {
            return new LineageColumn(this);
        } 

    } 

}
