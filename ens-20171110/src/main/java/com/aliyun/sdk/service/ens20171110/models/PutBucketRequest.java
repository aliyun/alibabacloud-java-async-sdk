// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link PutBucketRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRequest</p>
 */
public class PutBucketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketAcl")
    private String bucketAcl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchScope")
    private String dispatchScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalBucketType")
    private String logicalBucketType;

    private PutBucketRequest(Builder builder) {
        super(builder);
        this.bucketAcl = builder.bucketAcl;
        this.bucketName = builder.bucketName;
        this.comment = builder.comment;
        this.dispatchScope = builder.dispatchScope;
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
     * @return dispatchScope
     */
    public String getDispatchScope() {
        return this.dispatchScope;
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
        private String dispatchScope; 
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
            this.dispatchScope = request.dispatchScope;
            this.ensRegionId = request.ensRegionId;
            this.logicalBucketType = request.logicalBucketType;
        } 

        /**
         * <p>Bucket permission type: private (default). public-read-write: Allows public read and write access. public-read: Allows public read access.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder bucketAcl(String bucketAcl) {
            this.putQueryParameter("BucketAcl", bucketAcl);
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * <p>Bucket name. Must be 3 to 50 characters long. Use only lowercase letters, numbers, and hyphens (-). Cannot start or end with a hyphen.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>Comment. Up to 128 characters, including letters, digits, Chinese characters, and emojis.</p>
         * 
         * <strong>example:</strong>
         * <p>this is comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>Scheduling scope. Valid values:</p>
         * <ul>
         * <li><p>domestic (within China)</p>
         * </li>
         * <li><p>outside China</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify this parameter when creating a global bucket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sink</p>
         */
        public Builder dispatchScope(String dispatchScope) {
            this.putQueryParameter("DispatchScope", dispatchScope);
            this.dispatchScope = dispatchScope;
            return this;
        }

        /**
         * <p>Edge zone ID. If not specified, the global default edge zone is used.</p>
         * 
         * <strong>example:</strong>
         * <p>xx-xx-xx</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The logical type of the bucket. Valid values: sink: A sink bucket on a specified node. standard: A standard global bucket. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>sink</p>
         */
        public Builder logicalBucketType(String logicalBucketType) {
            this.putQueryParameter("LogicalBucketType", logicalBucketType);
            this.logicalBucketType = logicalBucketType;
            return this;
        }

        @Override
        public PutBucketRequest build() {
            return new PutBucketRequest(this);
        } 

    } 

}
