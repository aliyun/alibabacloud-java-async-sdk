// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiStoreUserTask} extends {@link TeaModel}
 *
 * <p>AiStoreUserTask</p>
 */
public class AiStoreUserTask extends TeaModel {
    @NameInMap("ApiDesc")
    private String apiDesc;

    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("BucketKeyPrefix")
    private String bucketKeyPrefix;

    @NameInMap("BucketName")
    private String bucketName;

    @NameInMap("DisableTime")
    private String disableTime;

    @NameInMap("EnableTime")
    private String enableTime;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Name")
    private String name;

    @NameInMap("ParamInfo")
    private String paramInfo;

    @NameInMap("Product")
    private String product;

    @NameInMap("ProductDesc")
    private String productDesc;

    @NameInMap("ReceiveConfig")
    private String receiveConfig;

    @NameInMap("Region")
    private String region;

    @NameInMap("RegionDesc")
    private String regionDesc;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("Status")
    private String status;

    @NameInMap("TaskVersion")
    private String taskVersion;

    @NameInMap("Version")
    private String version;

    private AiStoreUserTask(Builder builder) {
        this.apiDesc = builder.apiDesc;
        this.apiName = builder.apiName;
        this.bucketKeyPrefix = builder.bucketKeyPrefix;
        this.bucketName = builder.bucketName;
        this.disableTime = builder.disableTime;
        this.enableTime = builder.enableTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.name = builder.name;
        this.paramInfo = builder.paramInfo;
        this.product = builder.product;
        this.productDesc = builder.productDesc;
        this.receiveConfig = builder.receiveConfig;
        this.region = builder.region;
        this.regionDesc = builder.regionDesc;
        this.remark = builder.remark;
        this.status = builder.status;
        this.taskVersion = builder.taskVersion;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiStoreUserTask create() {
        return builder().build();
    }

    /**
     * @return apiDesc
     */
    public String getApiDesc() {
        return this.apiDesc;
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return bucketKeyPrefix
     */
    public String getBucketKeyPrefix() {
        return this.bucketKeyPrefix;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return disableTime
     */
    public String getDisableTime() {
        return this.disableTime;
    }

    /**
     * @return enableTime
     */
    public String getEnableTime() {
        return this.enableTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paramInfo
     */
    public String getParamInfo() {
        return this.paramInfo;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return productDesc
     */
    public String getProductDesc() {
        return this.productDesc;
    }

    /**
     * @return receiveConfig
     */
    public String getReceiveConfig() {
        return this.receiveConfig;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionDesc
     */
    public String getRegionDesc() {
        return this.regionDesc;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskVersion
     */
    public String getTaskVersion() {
        return this.taskVersion;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String apiDesc; 
        private String apiName; 
        private String bucketKeyPrefix; 
        private String bucketName; 
        private String disableTime; 
        private String enableTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String name; 
        private String paramInfo; 
        private String product; 
        private String productDesc; 
        private String receiveConfig; 
        private String region; 
        private String regionDesc; 
        private String remark; 
        private String status; 
        private String taskVersion; 
        private String version; 

        /**
         * ApiDesc.
         */
        public Builder apiDesc(String apiDesc) {
            this.apiDesc = apiDesc;
            return this;
        }

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * BucketKeyPrefix.
         */
        public Builder bucketKeyPrefix(String bucketKeyPrefix) {
            this.bucketKeyPrefix = bucketKeyPrefix;
            return this;
        }

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * DisableTime.
         */
        public Builder disableTime(String disableTime) {
            this.disableTime = disableTime;
            return this;
        }

        /**
         * EnableTime.
         */
        public Builder enableTime(String enableTime) {
            this.enableTime = enableTime;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParamInfo.
         */
        public Builder paramInfo(String paramInfo) {
            this.paramInfo = paramInfo;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * ProductDesc.
         */
        public Builder productDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }

        /**
         * ReceiveConfig.
         */
        public Builder receiveConfig(String receiveConfig) {
            this.receiveConfig = receiveConfig;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * RegionDesc.
         */
        public Builder regionDesc(String regionDesc) {
            this.regionDesc = regionDesc;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskVersion.
         */
        public Builder taskVersion(String taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public AiStoreUserTask build() {
            return new AiStoreUserTask(this);
        } 

    } 

}
