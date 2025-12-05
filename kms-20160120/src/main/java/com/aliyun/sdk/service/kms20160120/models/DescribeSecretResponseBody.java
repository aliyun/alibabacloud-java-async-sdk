// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link DescribeSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecretResponseBody</p>
 */
public class DescribeSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("AutomaticRotation")
    private String automaticRotation;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
    private String extendedConfig;

    @com.aliyun.core.annotation.NameInMap("LastRotationDate")
    private String lastRotationDate;

    @com.aliyun.core.annotation.NameInMap("NextRotationDate")
    private String nextRotationDate;

    @com.aliyun.core.annotation.NameInMap("OwingService")
    private String owingService;

    @com.aliyun.core.annotation.NameInMap("PlannedDeleteTime")
    private String plannedDeleteTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("SecretType")
    private String secretType;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
        this.owingService = builder.owingService;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return owingService
     */
    public String getOwingService() {
        return this.owingService;
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
        private String owingService; 
        private String plannedDeleteTime; 
        private String requestId; 
        private String rotationInterval; 
        private String secretName; 
        private String secretType; 
        private Tags tags; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(DescribeSecretResponseBody model) {
            this.arn = model.arn;
            this.automaticRotation = model.automaticRotation;
            this.createTime = model.createTime;
            this.DKMSInstanceId = model.DKMSInstanceId;
            this.description = model.description;
            this.encryptionKeyId = model.encryptionKeyId;
            this.extendedConfig = model.extendedConfig;
            this.lastRotationDate = model.lastRotationDate;
            this.nextRotationDate = model.nextRotationDate;
            this.owingService = model.owingService;
            this.plannedDeleteTime = model.plannedDeleteTime;
            this.requestId = model.requestId;
            this.rotationInterval = model.rotationInterval;
            this.secretName = model.secretName;
            this.secretType = model.secretType;
            this.tags = model.tags;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:154035569884****:secret/secret001</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
         * <ul>
         * <li>Enabled: indicates that automatic rotation is enabled.</li>
         * <li>Disabled: indicates that automatic rotation is disabled.</li>
         * <li>Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder automaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }

        /**
         * <p>The time when the secret was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-21T15:39:26Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the dedicated KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62d8f5e0sgtx8h****</p>
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * <p>The description of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>userinfo</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the customer master key (CMK) that is used to encrypt the secret value.</p>
         * 
         * <strong>example:</strong>
         * <p>00aa68af-2c02-4f68-95fe-3435d330****</p>
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * <p>The extended configuration of the secret.</p>
         * <blockquote>
         * <p> This parameter is returned only for a managed ApsaraDB RDS secret, a managed Resource Access Management (RAM) secret, or a managed Elastic Compute Service (ECS) secret.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SecretSubType&quot;:&quot;SingleUser&quot;, &quot;DBInstanceId&quot;:&quot;rm-uf667446pc955****&quot;,  &quot;CustomData&quot;:{} }</p>
         */
        public Builder extendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * <p>The time when the last rotation was performed.</p>
         * <blockquote>
         * <p> This parameter is returned if the secret was rotated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-07-05T08:22:03Z</p>
         */
        public Builder lastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }

        /**
         * <p>The time when the next rotation will be performed.</p>
         * <blockquote>
         * <p> This parameter is returned when automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06T18:22:03Z</p>
         */
        public Builder nextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }

        /**
         * OwingService.
         */
        public Builder owingService(String owingService) {
            this.owingService = owingService;
            return this;
        }

        /**
         * <p>The time when the secret is scheduled to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T15:45:12Z</p>
         */
        public Builder plannedDeleteTime(String plannedDeleteTime) {
            this.plannedDeleteTime = plannedDeleteTime;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>93348dfb-3627-4417-8d90-487a76a909c9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The interval for automatic rotation.</p>
         * <p>The value is in the <code>integer[unit]</code> format. <code>integer</code> indicates the length of time. <code>unit</code>: indicates the time unit. The value of <code>unit</code> is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
         * <blockquote>
         * <p> This parameter is returned when automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3153600s</p>
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The type of the secret. Valid values:</p>
         * <ul>
         * <li>Generic: indicates a generic secret.</li>
         * <li>Rds: indicates a managed ApsaraDB RDS secret.</li>
         * <li>RAMCredentials: indicates a managed RAM secret.</li>
         * <li>ECS: indicates a managed ECS secret.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rds</p>
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * <p>The resource tags of the secret.</p>
         * <p>This parameter is not returned if you set the FetchTags parameter to false or you do not specify the FetchTags parameter.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The time when the secret was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-21T15:39:26Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeSecretResponseBody build() {
            return new DescribeSecretResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecretResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecretResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>val1</p>
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
    /**
     * 
     * {@link DescribeSecretResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecretResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
