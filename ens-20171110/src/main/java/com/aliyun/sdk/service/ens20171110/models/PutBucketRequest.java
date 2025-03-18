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
         * BucketAcl.
         */
        public Builder bucketAcl(String bucketAcl) {
            this.putQueryParameter("BucketAcl", bucketAcl);
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * DispatchScope.
         */
        public Builder dispatchScope(String dispatchScope) {
            this.putQueryParameter("DispatchScope", dispatchScope);
            this.dispatchScope = dispatchScope;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * LogicalBucketType.
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
