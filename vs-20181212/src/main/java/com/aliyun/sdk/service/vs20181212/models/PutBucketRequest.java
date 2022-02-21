// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutBucketRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRequest</p>
 */
public class PutBucketRequest extends Request {
    @Query
    @NameInMap("BucketAcl")
    private String bucketAcl;

    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("DataRedundancyType")
    private String dataRedundancyType;

    @Query
    @NameInMap("DispatcherType")
    private String dispatcherType;

    @Query
    @NameInMap("Endpoint")
    private String endpoint;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("StorageClass")
    private String storageClass;

    private PutBucketRequest(Builder builder) {
        super(builder);
        this.bucketAcl = builder.bucketAcl;
        this.bucketName = builder.bucketName;
        this.comment = builder.comment;
        this.dataRedundancyType = builder.dataRedundancyType;
        this.dispatcherType = builder.dispatcherType;
        this.endpoint = builder.endpoint;
        this.ownerId = builder.ownerId;
        this.resourceType = builder.resourceType;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<PutBucketRequest, Builder> {
        private String bucketAcl; 
        private String bucketName; 
        private String comment; 
        private String dataRedundancyType; 
        private String dispatcherType; 
        private String endpoint; 
        private Long ownerId; 
        private String resourceType; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketRequest response) {
            super(response);
            this.bucketAcl = response.bucketAcl;
            this.bucketName = response.bucketName;
            this.comment = response.comment;
            this.dataRedundancyType = response.dataRedundancyType;
            this.dispatcherType = response.dispatcherType;
            this.endpoint = response.endpoint;
            this.ownerId = response.ownerId;
            this.resourceType = response.resourceType;
            this.storageClass = response.storageClass;
        } 

        /**
         * BucketAcl.
         */
        public Builder bucketAcl(String bucketAcl) {
            this.putQueryParameter("BucketAcl", bucketAcl);
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * DataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putQueryParameter("DataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * DispatcherType.
         */
        public Builder dispatcherType(String dispatcherType) {
            this.putQueryParameter("DispatcherType", dispatcherType);
            this.dispatcherType = dispatcherType;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public PutBucketRequest build() {
            return new PutBucketRequest(this);
        } 

    } 

}
