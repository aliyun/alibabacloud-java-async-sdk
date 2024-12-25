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
    @com.aliyun.core.annotation.NameInMap("DispatchScope")
    private String dispatchScope;

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
         * <p>The access control list (ACL) of the bucket. Valid values:</p>
         * <ul>
         * <li><strong>private</strong> (default)</li>
         * <li><strong>public-read-write</strong></li>
         * <li><strong>public-read</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder bucketAcl(String bucketAcl) {
            this.putBodyParameter("BucketAcl", bucketAcl);
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * <p>The name of the bucket. This parameter can contain 3 to 50 characters in length and can contain only lowercase letters, digits, and hyphens (-). The name cannot start or end with a hyphen (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder bucketName(String bucketName) {
            this.putBodyParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The remarks. The remarks are 0 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>numb</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The scheduling scope. This parameter takes effect only when the value of the LogicalBucketType parameter is standard. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland.</li>
         * <li><strong>oversea</strong>: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        public Builder dispatchScope(String dispatchScope) {
            this.putBodyParameter("DispatchScope", dispatchScope);
            this.dispatchScope = dispatchScope;
            return this;
        }

        /**
         * <p>The region ID of the node. This parameter is required if the value of the LogicalBucketType parameter is sink.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-15</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putBodyParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The type of the bucket. Valid values:</p>
         * <ul>
         * <li><strong>sink</strong>: single-node bucket.</li>
         * <li><strong>standard</strong>: bucket for global scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sink</p>
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
