// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutBucketLifecycleRequest} extends {@link RequestModel}
 *
 * <p>PutBucketLifecycleRequest</p>
 */
public class PutBucketLifecycleRequest extends Request {
    @Query
    @NameInMap("AllowSameActionOverlap")
    private String allowSameActionOverlap;

    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("CreatedBeforeDate")
    private String createdBeforeDate;

    @Query
    @NameInMap("ExpirationDays")
    private Long expirationDays;

    @Query
    @NameInMap("Prefix")
    private String prefix;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
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
         * Specifies whether to allow overlapped prefixes. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder allowSameActionOverlap(String allowSameActionOverlap) {
            this.putQueryParameter("AllowSameActionOverlap", allowSameActionOverlap);
            this.allowSameActionOverlap = allowSameActionOverlap;
            return this;
        }

        /**
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The expiration data. EOS executes a lifecycle rule for objects that were last updated before the expiration date.
         * <p>
         * 
         * Specify the time that follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
         * 
         * > ExpirationDays and CreateBeforeDate are mutually exclusive.
         */
        public Builder createdBeforeDate(String createdBeforeDate) {
            this.putQueryParameter("CreatedBeforeDate", createdBeforeDate);
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }

        /**
         * The number of days from when the objects were last modified to when the lifecycle rule takes effect. The value must be a positive integer that is greater than 0.
         * <p>
         * 
         * > ExpirationDays and CreateBeforeDate are mutually exclusive.
         */
        public Builder expirationDays(Long expirationDays) {
            this.putQueryParameter("ExpirationDays", expirationDays);
            this.expirationDays = expirationDays;
            return this;
        }

        /**
         * The prefix of a rule. The prefix must be unique.
         * <p>
         * 
         * *   If you specify a prefix, the rule applies only to objects in the bucket that match the prefix.
         * *   If you do not specify a prefix, the rule applies to all objects in the bucket.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The unique ID of the rule. The ID of a lifecycle rule can be up to 255 bytes in length.
         * <p>
         * 
         * *   You do not need to configure this parameter when you create a rule. The system automatically generates a unique ID.
         * *   When you update a rule, you need to specify the rule ID, and the rule must exist. Otherwise, an error occurs.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The status of the rule. Valid values:
         * <p>
         * 
         * *   **Enabled**: The rule is periodically executed.
         * *   **Disabled**: The rule is ignored.
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
