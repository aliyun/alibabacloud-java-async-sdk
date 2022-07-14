// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BucketInfo} extends {@link TeaModel}
 *
 * <p>BucketInfo</p>
 */
public class BucketInfo extends TeaModel {
    @NameInMap("BucketAcl")
    private String bucketAcl;

    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @NameInMap("Comment")
    private String comment;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DataRedundancyType")
    private String dataRedundancyType;

    @NameInMap("DispatcherType")
    private String dispatcherType;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("StorageClass")
    private String storageClass;

    private BucketInfo(Builder builder) {
        this.bucketAcl = builder.bucketAcl;
        this.bucketName = builder.bucketName;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.dataRedundancyType = builder.dataRedundancyType;
        this.dispatcherType = builder.dispatcherType;
        this.endpoint = builder.endpoint;
        this.ensRegionId = builder.ensRegionId;
        this.modifyTime = builder.modifyTime;
        this.resourceType = builder.resourceType;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BucketInfo create() {
        return builder().build();
    }

    /**
     * @return bucketAcl
     */
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataRedundancyType
     */
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return dispatcherType
     */
    public String getDispatcherType() {
        return this.dispatcherType;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder {
        private String bucketAcl; 
        private String bucketName; 
        private String comment; 
        private String createTime; 
        private String dataRedundancyType; 
        private String dispatcherType; 
        private String endpoint; 
        private String ensRegionId; 
        private String modifyTime; 
        private String resourceType; 
        private String storageClass; 

        /**
         * Bucket读写权限类型： public-read-write：公共读写 public-read：公共读 private：私有（默认值）
         */
        public Builder bucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * Bucket名称。 3~50 个字符，只允许小写字母、数字、短横线（-），且不能以短横线开头或结尾。
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * 备注。 1-128个字符或汉字，UTF-8编码。
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Bucket创建时间。 （格式：yyyy-mm-ddThh:mm:ss.timezone, 例如 2011-12-01T12:27:13.000Z）
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 指定Bucket的数据容灾类型。 取值范围： LRS（默认值）。本地冗余LRS ZRS 同城冗余ZRS采用多可用区（AZ）机制。
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * Bucket的调度类型： node：节点(同城) area：区域(多城市) global：全局(全国)
         */
        public Builder dispatcherType(String dispatcherType) {
            this.dispatcherType = dispatcherType;
            return this;
        }

        /**
         * 访问域名，边缘存储取值： eos.aliyuncs.com
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * 节点区域id，如果为空表示全局
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Bucket修改时间。 （格式：yyyy-mm-ddThh:mm:ss.timezone, 例如 2011-12-01T12:27:13.000Z）
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * 指定Bucket的资源类型。 取值范围： general：通用 national-network：国网
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Bucket存储类型，支持Standard
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public BucketInfo build() {
            return new BucketInfo(this);
        } 

    } 

}
