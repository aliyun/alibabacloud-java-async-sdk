// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DLFunction} extends {@link TeaModel}
 *
 * <p>DLFunction</p>
 */
public class DLFunction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("ClassName")
    private String className;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private Long creatorId;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("FunctionType")
    private String functionType;

    @com.aliyun.core.annotation.NameInMap("ModifierId")
    private Long modifierId;

    @com.aliyun.core.annotation.NameInMap("OwnerName")
    private String ownerName;

    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("ResourceUris")
    private java.util.List<DLResourceUri> resourceUris;

    private DLFunction(Builder builder) {
        this.catalogName = builder.catalogName;
        this.className = builder.className;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.dbName = builder.dbName;
        this.functionName = builder.functionName;
        this.functionType = builder.functionType;
        this.modifierId = builder.modifierId;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.resourceUris = builder.resourceUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLFunction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
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
     * @return creatorId
     */
    public Long getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
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
     * @return modifierId
     */
    public Long getModifierId() {
        return this.modifierId;
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
     * @return resourceUris
     */
    public java.util.List<DLResourceUri> getResourceUris() {
        return this.resourceUris;
    }

    public static final class Builder {
        private String catalogName; 
        private String className; 
        private Integer createTime; 
        private Long creatorId; 
        private String dbName; 
        private String functionName; 
        private String functionType; 
        private Long modifierId; 
        private String ownerName; 
        private String ownerType; 
        private java.util.List<DLResourceUri> resourceUris; 

        private Builder() {
        } 

        private Builder(DLFunction model) {
            this.catalogName = model.catalogName;
            this.className = model.className;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.dbName = model.dbName;
            this.functionName = model.functionName;
            this.functionType = model.functionType;
            this.modifierId = model.modifierId;
            this.ownerName = model.ownerName;
            this.ownerType = model.ownerType;
            this.resourceUris = model.resourceUris;
        } 

        /**
         * <p>The name of the data catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The Java class that contains the function code.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.hive.MyCustomUDF</p>
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * <p>The time when the function was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1731586286</p>
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the user who created the function.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder creatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The name of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>my_funciton</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The type of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>JAVA</p>
         */
        public Builder functionType(String functionType) {
            this.functionType = functionType;
            return this;
        }

        /**
         * <p>The ID of the user who modified the function.</p>
         * 
         * <strong>example:</strong>
         * <p>26****</p>
         */
        public Builder modifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        /**
         * <p>The owner of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * <p>The type of the owner. Valid values:</p>
         * <ul>
         * <li><p>ROLE</p>
         * </li>
         * <li><p>GROUP</p>
         * </li>
         * <li><p>USER</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>The resource URIs of the function. This parameter cannot be modified after the function is created.</p>
         */
        public Builder resourceUris(java.util.List<DLResourceUri> resourceUris) {
            this.resourceUris = resourceUris;
            return this;
        }

        public DLFunction build() {
            return new DLFunction(this);
        } 

    } 

}
