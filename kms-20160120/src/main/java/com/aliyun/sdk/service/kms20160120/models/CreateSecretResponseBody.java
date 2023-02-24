// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecretResponseBody</p>
 */
public class CreateSecretResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("AutomaticRotation")
    private String automaticRotation;

    @NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @NameInMap("ExtendedConfig")
    private String extendedConfig;

    @NameInMap("NextRotationDate")
    private String nextRotationDate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RotationInterval")
    private String rotationInterval;

    @NameInMap("SecretName")
    private String secretName;

    @NameInMap("SecretType")
    private String secretType;

    @NameInMap("VersionId")
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
         * >  This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.
         */
        public Builder automaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
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
         * The extended configuration of the secret.
         * <p>
         * 
         * >  This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.
         */
        public Builder extendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * The time when the next rotation will be performed.
         * <p>
         * 
         * >  This parameter is returned if automatic rotation is enabled.
         */
        public Builder nextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
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
         * The value is in the `integer[unit]` format. The value of the `unit` field is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.
         * 
         * >  This parameter is returned if automatic rotation is enabled.
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
         * The version number of the secret.
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
