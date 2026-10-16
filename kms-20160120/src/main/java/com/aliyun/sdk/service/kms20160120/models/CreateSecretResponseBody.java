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
 * {@link CreateSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecretResponseBody</p>
 */
public class CreateSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("AutomaticRotation")
    private String automaticRotation;

    @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
    private String extendedConfig;

    @com.aliyun.core.annotation.NameInMap("NextRotationDate")
    private String nextRotationDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("SecretType")
    private String secretType;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private CreateSecretResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.automaticRotation = builder.automaticRotation;
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.extendedConfig = builder.extendedConfig;
        this.nextRotationDate = builder.nextRotationDate;
        this.requestId = builder.requestId;
        this.rotationInterval = builder.rotationInterval;
        this.secretName = builder.secretName;
        this.secretType = builder.secretType;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretResponseBody create() {
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
     * @return DKMSInstanceId
     */
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    /**
     * @return extendedConfig
     */
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    /**
     * @return nextRotationDate
     */
    public String getNextRotationDate() {
        return this.nextRotationDate;
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String arn; 
        private String automaticRotation; 
        private String DKMSInstanceId; 
        private String extendedConfig; 
        private String nextRotationDate; 
        private String requestId; 
        private String rotationInterval; 
        private String secretName; 
        private String secretType; 
        private String versionId; 

        private Builder() {
        } 

        private Builder(CreateSecretResponseBody model) {
            this.arn = model.arn;
            this.automaticRotation = model.automaticRotation;
            this.DKMSInstanceId = model.DKMSInstanceId;
            this.extendedConfig = model.extendedConfig;
            this.nextRotationDate = model.nextRotationDate;
            this.requestId = model.requestId;
            this.rotationInterval = model.rotationInterval;
            this.secretName = model.secretName;
            this.secretType = model.secretType;
            this.versionId = model.versionId;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN).</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:154035569884****:secret/mydbconninfo</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
         * <ul>
         * <li>Enabled: Automatic rotation is enabled.</li>
         * <li>Disabled: Automatic rotation is disabled.</li>
         * <li>Invalid: The rotation status is abnormal, and Secrets Manager cannot automatically rotate the secret.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when SecretType is set to Rds, Redis, PolarDB, RAMCredentials, or ECS.</p>
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
         * <p>The instance ID of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62d8f5e0sgtx8h****</p>
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * <p>The extended configuration of the secret.  </p>
         * <blockquote>
         * <p>This parameter is returned only when SecretType is set to Rds, Redis, PolarDB, RAMCredentials, or ECS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;} }</p>
         */
        public Builder extendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * <p>The time of the next rotation.  </p>
         * <blockquote>
         * <p>This parameter is returned only when automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-07-06T18:22:03Z</p>
         */
        public Builder nextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }

        /**
         * <p>The ID of the request, which is a unique identifier generated by Alibaba Cloud for the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3bf02f7a-015b-4f93-be0f-cc043fda2dd3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The interval for automatic secret rotation.<br>The value is in the <code>integer[unit]</code> format. <code>integer</code> specifies the time length, and <code>unit</code> specifies the time unit. Valid value for <code>unit</code>: s (seconds). For example, a 7-day rotation interval is represented as 604800s.</p>
         * <blockquote>
         * <p>This parameter is returned only when automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>604800s</p>
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The secret name.</p>
         * 
         * <strong>example:</strong>
         * <p>mydbconninfo</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The type of the secret. Valid values:</p>
         * <ul>
         * <li>Generic: generic secret.  </li>
         * <li>Rds: ApsaraDB RDS secret.  </li>
         * <li>Redis: Redis secret.</li>
         * <li>RAMCredentials: RAM secret.  </li>
         * <li>ECS: ECS secret.</li>
         * <li>PolarDB: PolarDB secret.</li>
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
         * <p>The version ID of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public CreateSecretResponseBody build() {
            return new CreateSecretResponseBody(this);
        } 

    } 

}
