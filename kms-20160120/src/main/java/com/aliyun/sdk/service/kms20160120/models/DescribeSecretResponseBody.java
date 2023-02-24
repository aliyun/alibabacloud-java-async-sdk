// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecretResponseBody</p>
 */
public class DescribeSecretResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("AutomaticRotation")
    private String automaticRotation;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @NameInMap("Description")
    private String description;

    @NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @NameInMap("ExtendedConfig")
    private String extendedConfig;

    @NameInMap("LastRotationDate")
    private String lastRotationDate;

    @NameInMap("NextRotationDate")
    private String nextRotationDate;

    @NameInMap("PlannedDeleteTime")
    private String plannedDeleteTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RotationInterval")
    private String rotationInterval;

    @NameInMap("SecretName")
    private String secretName;

    @NameInMap("SecretType")
    private String secretType;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("UpdateTime")
    private String updateTime;

    private DescribeSecretResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.automaticRotation = builder.automaticRotation;
        this.createTime = builder.createTime;
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.description = builder.description;
        this.encryptionKeyId = builder.encryptionKeyId;
        this.extendedConfig = builder.extendedConfig;
        this.lastRotationDate = builder.lastRotationDate;
        this.nextRotationDate = builder.nextRotationDate;
        this.plannedDeleteTime = builder.plannedDeleteTime;
        this.requestId = builder.requestId;
        this.rotationInterval = builder.rotationInterval;
        this.secretName = builder.secretName;
        this.secretType = builder.secretType;
        this.tags = builder.tags;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return automaticRotation
     */
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return DKMSInstanceId
     */
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encryptionKeyId
     */
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /**
     * @return extendedConfig
     */
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    /**
     * @return lastRotationDate
     */
    public String getLastRotationDate() {
        return this.lastRotationDate;
    }

    /**
     * @return nextRotationDate
     */
    public String getNextRotationDate() {
        return this.nextRotationDate;
    }

    /**
     * @return plannedDeleteTime
     */
    public String getPlannedDeleteTime() {
        return this.plannedDeleteTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return secretType
     */
    public String getSecretType() {
        return this.secretType;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String arn; 
        private String automaticRotation; 
        private String createTime; 
        private String DKMSInstanceId; 
        private String description; 
        private String encryptionKeyId; 
        private String extendedConfig; 
        private String lastRotationDate; 
        private String nextRotationDate; 
        private String plannedDeleteTime; 
        private String requestId; 
        private String rotationInterval; 
        private String secretName; 
        private String secretType; 
        private Tags tags; 
        private String updateTime; 

        /**
         * The Alibaba Cloud Resource Name (ARN) of the secret.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Indicates whether automatic rotation is enabled. Valid values:
         * <p>
         * 
         * *   Enabled: indicates that automatic rotation is enabled.
         * *   Disabled: indicates that automatic rotation is disabled.
         * *   Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.
         * 
         * >  This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.
         */
        public Builder automaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }

        /**
         * The time when the secret was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The ID of the dedicated KMS instance.
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * The description of the secret.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the customer master key (CMK) that is used to encrypt the secret value.
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * The extended configuration of the secret.
         * <p>
         * 
         * >  This parameter is returned only for a managed ApsaraDB RDS secret, a managed Resource Access Management (RAM) secret, or a managed Elastic Compute Service (ECS) secret.
         */
        public Builder extendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * The time when the last rotation was performed.
         * <p>
         * 
         * >  This parameter is returned if the secret was rotated.
         */
        public Builder lastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }

        /**
         * The time when the next rotation will be performed.
         * <p>
         * 
         * >  This parameter is returned when automatic rotation is enabled.
         */
        public Builder nextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }

        /**
         * The time when the secret is scheduled to be deleted.
         */
        public Builder plannedDeleteTime(String plannedDeleteTime) {
            this.plannedDeleteTime = plannedDeleteTime;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The interval for automatic rotation.
         * <p>
         * 
         * The value is in the `integer[unit]` format. `integer` indicates the length of time. `unit`: indicates the time unit. The value of `unit` is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.
         * 
         * >  This parameter is returned when automatic rotation is enabled.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * The type of the secret. Valid values:
         * <p>
         * 
         * *   Generic: indicates a generic secret.
         * *   Rds: indicates a managed ApsaraDB RDS secret.
         * *   RAMCredentials: indicates a managed RAM secret.
         * *   ECS: indicates a managed ECS secret.
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * The resource tags of the secret.
         * <p>
         * 
         * This parameter is not returned if you set the FetchTags parameter to false or you do not specify the FetchTags parameter.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The time when the secret was updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeSecretResponseBody build() {
            return new DescribeSecretResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
