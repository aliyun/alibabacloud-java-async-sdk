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
 * {@link PutBucketLifecycleRequest} extends {@link RequestModel}
 *
 * <p>PutBucketLifecycleRequest</p>
 */
public class PutBucketLifecycleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowSameActionOverlap")
    private String allowSameActionOverlap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedBeforeDate")
    private String createdBeforeDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirationDays")
    private Long expirationDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private PutBucketLifecycleRequest(Builder builder) {
        super(builder);
        this.allowSameActionOverlap = builder.allowSameActionOverlap;
        this.bucketName = builder.bucketName;
        this.createdBeforeDate = builder.createdBeforeDate;
        this.expirationDays = builder.expirationDays;
        this.prefix = builder.prefix;
        this.ruleId = builder.ruleId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketLifecycleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowSameActionOverlap
     */
    public String getAllowSameActionOverlap() {
        return this.allowSameActionOverlap;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return createdBeforeDate
     */
    public String getCreatedBeforeDate() {
        return this.createdBeforeDate;
    }

    /**
     * @return expirationDays
     */
    public Long getExpirationDays() {
        return this.expirationDays;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PutBucketLifecycleRequest, Builder> {
        private String allowSameActionOverlap; 
        private String bucketName; 
        private String createdBeforeDate; 
        private Long expirationDays; 
        private String prefix; 
        private String ruleId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketLifecycleRequest request) {
            super(request);
            this.allowSameActionOverlap = request.allowSameActionOverlap;
            this.bucketName = request.bucketName;
            this.createdBeforeDate = request.createdBeforeDate;
            this.expirationDays = request.expirationDays;
            this.prefix = request.prefix;
            this.ruleId = request.ruleId;
            this.status = request.status;
        } 

        /**
         * <p>Specifies whether to allow overlapped prefixes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowSameActionOverlap(String allowSameActionOverlap) {
            this.putQueryParameter("AllowSameActionOverlap", allowSameActionOverlap);
            this.allowSameActionOverlap = allowSameActionOverlap;
            return this;
        }

        /**
         * <p>The name of the bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The expiration time. EOS executes a lifecycle rule for objects that were last updated before the expiration time.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> ExpirationDays and CreateBeforeDate are mutually exclusive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-10-12T05:45:00Z</p>
         */
        public Builder createdBeforeDate(String createdBeforeDate) {
            this.putQueryParameter("CreatedBeforeDate", createdBeforeDate);
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }

        /**
         * <p>The number of days from when the objects were last modified to when the lifecycle rule takes effect. The value must be a positive integer that is greater than 0.</p>
         * <blockquote>
         * <p> ExpirationDays and CreateBeforeDate are mutually exclusive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder expirationDays(Long expirationDays) {
            this.putQueryParameter("ExpirationDays", expirationDays);
            this.expirationDays = expirationDays;
            return this;
        }

        /**
         * <p>The prefix of a object name. The prefix must be unique.</p>
         * <ul>
         * <li>If you specify a prefix, the rule applies only to objects in the bucket that match the prefix.</li>
         * <li>If you do not specify a prefix, the rule applies to all objects in the bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The unique ID of the rule. The ID of a lifecycle rule can be up to 255 bytes in length.</p>
         * <ul>
         * <li>You do not need to configure this parameter when you create a rule. The system automatically generates a unique ID.</li>
         * <li>When you update a rule, you need to specify this parameter. Make sure that the rule specified by RuleId exists. Otherwise, an error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public PutBucketLifecycleRequest build() {
            return new PutBucketLifecycleRequest(this);
        } 

    } 

}
