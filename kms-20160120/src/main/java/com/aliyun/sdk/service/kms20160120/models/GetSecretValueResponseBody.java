// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretValueResponseBody</p>
 */
public class GetSecretValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutomaticRotation")
    private String automaticRotation;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
    private String extendedConfig;

    @com.aliyun.core.annotation.NameInMap("LastRotationDate")
    private String lastRotationDate;

    @com.aliyun.core.annotation.NameInMap("NextRotationDate")
    private String nextRotationDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.NameInMap("SecretData")
    private String secretData;

    @com.aliyun.core.annotation.NameInMap("SecretDataType")
    private String secretDataType;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("SecretType")
    private String secretType;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    @com.aliyun.core.annotation.NameInMap("VersionStages")
    private java.util.List < String > versionStages;

    private GetSecretValueResponseBody(Builder builder) {
        this.automaticRotation = builder.automaticRotation;
        this.createTime = builder.createTime;
        this.extendedConfig = builder.extendedConfig;
        this.lastRotationDate = builder.lastRotationDate;
        this.nextRotationDate = builder.nextRotationDate;
        this.requestId = builder.requestId;
        this.rotationInterval = builder.rotationInterval;
        this.secretData = builder.secretData;
        this.secretDataType = builder.secretDataType;
        this.secretName = builder.secretName;
        this.secretType = builder.secretType;
        this.versionId = builder.versionId;
        this.versionStages = builder.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretValueResponseBody create() {
        return builder().build();
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
     * @return secretData
     */
    public String getSecretData() {
        return this.secretData;
    }

    /**
     * @return secretDataType
     */
    public String getSecretDataType() {
        return this.secretDataType;
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

    /**
     * @return versionStages
     */
    public java.util.List < String > getVersionStages() {
        return this.versionStages;
    }

    public static final class Builder {
        private String automaticRotation; 
        private String createTime; 
        private String extendedConfig; 
        private String lastRotationDate; 
        private String nextRotationDate; 
        private String requestId; 
        private String rotationInterval; 
        private String secretData; 
        private String secretDataType; 
        private String secretName; 
        private String secretType; 
        private String versionId; 
        private java.util.List < String > versionStages; 

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
         * The extended configuration of the secret.
         * <p>
         * 
         * >  This parameter is returned if you set the FetchExtendedConfig parameter to true. This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.
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
         * >  This parameter is returned if automatic rotation is enabled.
         */
        public Builder nextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The interval for automatic rotation.
         * <p>
         * 
         * The value is in the `integer[unit]` format. The `unit` field has a fixed value of s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.
         * 
         * >  This parameter is returned if automatic rotation is enabled.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * The secret value. Secrets Manager decrypts the ciphertext of the secret value and returns the plaintext of the secret value in this parameter.
         * <p>
         * 
         * *   For a generic secret, the secret value of the specified version is returned.
         * 
         * *   For a managed ApsaraDB RDS secret, the value is returned in the following format:`{"AccountName":"","AccountPassword":""}` .
         * 
         * *   For a managed RAM secret, the secret value is returned in the following format: `{"AccessKeyId":"Adfdsfd","AccessKeySecret":"fdsfdsf","GenerateTimestamp": "2016-03-25T10:42:40Z"}`.
         * 
         * *   For a managed ECS secret, the secret value is returned in one of the following formats:
         * 
         *     *   `{"UserName":"root","Password":"H5asdasdsads****"}`: The secret value is returned in this format if the ECS secret is a password.
         *     *   `{"UserName":"root","PublicKey":"ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key","PrivateKey": "d6bee1cb-2e14-4277-ba6b-73786b21****"}`: The secret value is returned in this format is the ECS secret is a pair of SSH keys. The private key is in the Privacy Enhanced Mail (PEM) format.
         */
        public Builder secretData(String secretData) {
            this.secretData = secretData;
            return this;
        }

        /**
         * The type of the secret value. Valid values:
         * <p>
         * 
         * *   text
         * *   binary
         */
        public Builder secretDataType(String secretDataType) {
            this.secretDataType = secretDataType;
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
         * The version number of the secret value.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * The stage labels that mark the secret versions.
         */
        public Builder versionStages(java.util.List < String > versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public GetSecretValueResponseBody build() {
            return new GetSecretValueResponseBody(this);
        } 

    } 

}
