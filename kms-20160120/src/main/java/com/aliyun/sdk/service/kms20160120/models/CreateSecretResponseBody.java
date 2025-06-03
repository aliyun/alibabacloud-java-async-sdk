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
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
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
         * <p>Enabled</p>
         */
        public Builder automaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }

        /**
         * DKMSInstanceId.
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * ExtendedConfig.
         */
        public Builder extendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * <p>The extended configuration of the secret.</p>
         * <blockquote>
         * <p> This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
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
         * <p>The time when the next rotation will be performed.</p>
         * <blockquote>
         * <p> This parameter is returned if automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3bf02f7a-015b-4f93-be0f-cc043fda2dd3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RotationInterval.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The interval for automatic rotation.</p>
         * <p>The value is in the <code>integer[unit]</code> format. The value of the <code>unit</code> field is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
         * <blockquote>
         * <p> This parameter is returned if automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mydbconninfo</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The ID of the dedicated KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Rds</p>
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
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
