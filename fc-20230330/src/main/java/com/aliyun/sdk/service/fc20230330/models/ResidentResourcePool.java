// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ResidentResourcePool} extends {@link TeaModel}
 *
 * <p>ResidentResourcePool</p>
 */
public class ResidentResourcePool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allocationStatus")
    private ResidentResourceAllocationStatus allocationStatus;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("residentResourcePoolId")
    private String residentResourcePoolId;

    @com.aliyun.core.annotation.NameInMap("residentResourcePoolName")
    private String residentResourcePoolName;

    @com.aliyun.core.annotation.NameInMap("resourcePoolCapacity")
    private ResidentResourceCapacity resourcePoolCapacity;

    @com.aliyun.core.annotation.NameInMap("resourcePoolConfig")
    private ResidentResourceCapacity resourcePoolConfig;

    private ResidentResourcePool(Builder builder) {
        this.allocationStatus = builder.allocationStatus;
        this.createdTime = builder.createdTime;
        this.expireTime = builder.expireTime;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.residentResourcePoolId = builder.residentResourcePoolId;
        this.residentResourcePoolName = builder.residentResourcePoolName;
        this.resourcePoolCapacity = builder.resourcePoolCapacity;
        this.resourcePoolConfig = builder.resourcePoolConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResidentResourcePool create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationStatus
     */
    public ResidentResourceAllocationStatus getAllocationStatus() {
        return this.allocationStatus;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return residentResourcePoolId
     */
    public String getResidentResourcePoolId() {
        return this.residentResourcePoolId;
    }

    /**
     * @return residentResourcePoolName
     */
    public String getResidentResourcePoolName() {
        return this.residentResourcePoolName;
    }

    /**
     * @return resourcePoolCapacity
     */
    public ResidentResourceCapacity getResourcePoolCapacity() {
        return this.resourcePoolCapacity;
    }

    /**
     * @return resourcePoolConfig
     */
    public ResidentResourceCapacity getResourcePoolConfig() {
        return this.resourcePoolConfig;
    }

    public static final class Builder {
        private ResidentResourceAllocationStatus allocationStatus; 
        private String createdTime; 
        private String expireTime; 
        private String lastModifiedTime; 
        private String residentResourcePoolId; 
        private String residentResourcePoolName; 
        private ResidentResourceCapacity resourcePoolCapacity; 
        private ResidentResourceCapacity resourcePoolConfig; 

        private Builder() {
        } 

        private Builder(ResidentResourcePool model) {
            this.allocationStatus = model.allocationStatus;
            this.createdTime = model.createdTime;
            this.expireTime = model.expireTime;
            this.lastModifiedTime = model.lastModifiedTime;
            this.residentResourcePoolId = model.residentResourcePoolId;
            this.residentResourcePoolName = model.residentResourcePoolName;
            this.resourcePoolCapacity = model.resourcePoolCapacity;
            this.resourcePoolConfig = model.resourcePoolConfig;
        } 

        /**
         * <p>资源池实时分配情况，包含每个函数的具体分配情况</p>
         */
        public Builder allocationStatus(ResidentResourceAllocationStatus allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }

        /**
         * <p>代表创建时间的资源属性字段</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>资源池过期时间</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>上次修改时间，包含扩容、续费、更名等操作</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * residentResourcePoolId.
         */
        public Builder residentResourcePoolId(String residentResourcePoolId) {
            this.residentResourcePoolId = residentResourcePoolId;
            return this;
        }

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        public Builder residentResourcePoolName(String residentResourcePoolName) {
            this.residentResourcePoolName = residentResourcePoolName;
            return this;
        }

        /**
         * <p>资源池总体规格</p>
         */
        public Builder resourcePoolCapacity(ResidentResourceCapacity resourcePoolCapacity) {
            this.resourcePoolCapacity = resourcePoolCapacity;
            return this;
        }

        /**
         * resourcePoolConfig.
         */
        public Builder resourcePoolConfig(ResidentResourceCapacity resourcePoolConfig) {
            this.resourcePoolConfig = resourcePoolConfig;
            return this;
        }

        public ResidentResourcePool build() {
            return new ResidentResourcePool(this);
        } 

    } 

}
