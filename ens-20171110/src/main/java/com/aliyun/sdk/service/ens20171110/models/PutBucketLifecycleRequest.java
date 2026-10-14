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
    private Boolean allowSameActionOverlap;

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
    public Boolean getAllowSameActionOverlap() {
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
        private Boolean allowSameActionOverlap; 
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
         * <p>Whether to allow overlapping prefixes. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Overlapping prefixes are allowed.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Overlapping prefixes are not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowSameActionOverlap(Boolean allowSameActionOverlap) {
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
         * <p>The date before which objects expire. The system applies the lifecycle rule to objects last modified before this date.</p>
         * <p>Use ISO 8601 format and UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * <blockquote>
         * <p>ExpirationDays and CreatedBeforeDate are mutually exclusive. Specify one.</p>
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
         * <p>The number of days after an object\&quot;s last modification when the lifecycle rule takes effect. Must be a positive integer greater than zero.</p>
         * <blockquote>
         * <p>ExpirationDays and CreatedBeforeDate are mutually exclusive. Specify one.</p>
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
         * <p>The prefix that the rule applies to. You cannot set duplicate prefixes.</p>
         * <ul>
         * <li><p>If you specify a prefix, the rule applies only to objects in the bucket whose names start with that prefix.</p>
         * </li>
         * <li><p>If you leave Prefix empty, the rule applies to all objects in the bucket.</p>
         * </li>
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
         * <p>A unique ID that identifies the rule. Maximum length is 255 bytes.</p>
         * <ul>
         * <li><p>Omit this parameter when creating a new rule. The system generates a unique ID automatically.</p>
         * </li>
         * <li><p>Specify RuleId when updating an existing rule. The rule must exist. Otherwise, the call fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>b8f93xxxxx4881xxxxxc71d991</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: The system runs the rule on schedule.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: The system ignores the rule.</p>
         * </li>
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
