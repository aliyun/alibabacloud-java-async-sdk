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
         * BucketAcl.
         */
        public Builder bucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * DispatcherType.
         */
        public Builder dispatcherType(String dispatcherType) {
            this.dispatcherType = dispatcherType;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StorageClass.
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
