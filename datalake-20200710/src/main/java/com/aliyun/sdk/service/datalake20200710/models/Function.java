// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Function} extends {@link TeaModel}
 *
 * <p>Function</p>
 */
public class Function extends TeaModel {
    @NameInMap("CatalogId")
    private String catalogId;

    @NameInMap("ClassName")
    private String className;

    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("CreatedBy")
    private String createdBy;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("FunctionName")
    private String functionName;

    @NameInMap("FunctionType")
    private String functionType;

    @NameInMap("OwnerName")
    private String ownerName;

    @NameInMap("OwnerType")
    private String ownerType;

    @NameInMap("ResourceUri")
    private java.util.List < ResourceUri > resourceUri;

    @NameInMap("UpdateTime")
    private Integer updateTime;

    private Function(Builder builder) {
        this.catalogId = builder.catalogId;
        this.className = builder.className;
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.databaseName = builder.databaseName;
        this.functionName = builder.functionName;
        this.functionType = builder.functionType;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.resourceUri = builder.resourceUri;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Function create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return resourceUri
     */
    public java.util.List < ResourceUri > getResourceUri() {
        return this.resourceUri;
    }

    /**
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String catalogId; 
        private String className; 
        private Integer createTime; 
        private String createdBy; 
        private String databaseName; 
        private String functionName; 
        private String functionType; 
        private String ownerName; 
        private String ownerType; 
        private java.util.List < ResourceUri > resourceUri; 
        private Integer updateTime; 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * ClassName.
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * FunctionType.
         */
        public Builder functionType(String functionType) {
            this.functionType = functionType;
            return this;
        }

        /**
         * OwnerName.
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * OwnerType.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * ResourceUri.
         */
        public Builder resourceUri(java.util.List < ResourceUri > resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Function build() {
            return new Function(this);
        } 

    } 

}
