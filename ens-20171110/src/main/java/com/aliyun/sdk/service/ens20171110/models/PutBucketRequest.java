// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutBucketRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRequest</p>
 */
public class PutBucketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketAcl")
    private String bucketAcl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogicalBucketType")
    private String logicalBucketType;

    private PutBucketRequest(Builder builder) {
        super(builder);
        this.bucketAcl = builder.bucketAcl;
        this.bucketName = builder.bucketName;
        this.comment = builder.comment;
        this.ensRegionId = builder.ensRegionId;
        this.logicalBucketType = builder.logicalBucketType;
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
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return logicalBucketType
     */
    public String getLogicalBucketType() {
        return this.logicalBucketType;
    }

    public static final class Builder extends Request.Builder<PutBucketRequest, Builder> {
        private String bucketAcl; 
        private String bucketName; 
        private String comment; 
        private String ensRegionId; 
        private String logicalBucketType; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketRequest request) {
            super(request);
            this.bucketAcl = request.bucketAcl;
            this.bucketName = request.bucketName;
            this.comment = request.comment;
            this.ensRegionId = request.ensRegionId;
            this.logicalBucketType = request.logicalBucketType;
        } 

        /**
         * The access control list (ACL) of the bucket.
         * <p>
         * 
         * *   **private** (default)
         * *   **public-read-write**
         * *   **public-read**
         */
        public Builder bucketAcl(String bucketAcl) {
            this.putBodyParameter("BucketAcl", bucketAcl);
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * The name of the bucket.
         * <p>
         * 
         * This parameter can contain 3 to 50 characters in length and can contain only lowercase letters, digits, and hyphens (-). The name cannot start or end with a hyphen (-).
         */
        public Builder bucketName(String bucketName) {
            this.putBodyParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The remarks. The remarks are 0 to 128 characters in length.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the region where the node is located. If this parameter is not specified, the node is the global default node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putBodyParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Single-node storage. Set the value to sink.
         */
        public Builder logicalBucketType(String logicalBucketType) {
            this.putBodyParameter("LogicalBucketType", logicalBucketType);
            this.logicalBucketType = logicalBucketType;
            return this;
        }

        @Override
        public PutBucketRequest build() {
            return new PutBucketRequest(this);
        } 

    } 

}
