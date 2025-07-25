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
    private VersionStages versionStages;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public VersionStages getVersionStages() {
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
        private VersionStages versionStages; 

        private Builder() {
        } 

        private Builder(GetSecretValueResponseBody model) {
            this.automaticRotation = model.automaticRotation;
            this.createTime = model.createTime;
            this.extendedConfig = model.extendedConfig;
            this.lastRotationDate = model.lastRotationDate;
            this.nextRotationDate = model.nextRotationDate;
            this.requestId = model.requestId;
            this.rotationInterval = model.rotationInterval;
            this.secretData = model.secretData;
            this.secretDataType = model.secretDataType;
            this.secretName = model.secretName;
            this.secretType = model.secretType;
            this.versionId = model.versionId;
            this.versionStages = model.versionStages;
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
         * <p>2020-02-21T15:39:26Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The extended configuration of the secret.</p>
         * <blockquote>
         * <p> This parameter is returned if you set the FetchExtendedConfig parameter to true. This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
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
         * <p>2020-07-05T08:22:03Z</p>
         */
        public Builder lastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }

        /**
         * <p>The time when the next rotation will be performed.</p>
         * <blockquote>
         * <p> This parameter is returned if automatic rotation is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-07-06T18:22:03Z</p>
         */
        public Builder nextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6a3e9c36-1150-4881-84d3-eb8672fcafad</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The interval for automatic rotation.</p>
         * <p>The value is in the <code>integer[unit]</code> format. The <code>unit</code> field has a fixed value of s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
         * <blockquote>
         * <p> This parameter is returned if automatic rotation is enabled.</p>
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
         * <p>The secret value. Secrets Manager decrypts the ciphertext of the secret value and returns the plaintext of the secret value in this parameter.</p>
         * <ul>
         * <li><p>For a generic secret, the secret value of the specified version is returned.</p>
         * </li>
         * <li><p>For a managed ApsaraDB RDS secret, the value is returned in the following format:<code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code> .</p>
         * </li>
         * <li><p>For a managed RAM secret, the secret value is returned in the following format: <code>{&quot;AccessKeyId&quot;:&quot;Adfdsfd&quot;,&quot;AccessKeySecret&quot;:&quot;fdsfdsf&quot;,&quot;GenerateTimestamp&quot;: &quot;2016-03-25T10:42:40Z&quot;}</code>.</p>
         * </li>
         * <li><p>For a managed ECS secret, the secret value is returned in one of the following formats:</p>
         * <ul>
         * <li><code>{&quot;UserName&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;H5asdasdsads****&quot;}</code>: The secret value is returned in this format if the ECS secret is a password.</li>
         * <li><code>{&quot;UserName&quot;:&quot;root&quot;,&quot;PublicKey&quot;:&quot;ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key&quot;,&quot;PrivateKey&quot;: &quot;d6bee1cb-2e14-4277-ba6b-73786b21****&quot;}</code>: The secret value is returned in this format is the ECS secret is a pair of SSH keys. The private key is in the Privacy Enhanced Mail (PEM) format.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testdata1</p>
         */
        public Builder secretData(String secretData) {
            this.secretData = secretData;
            return this;
        }

        /**
         * <p>The type of the secret value. Valid values:</p>
         * <ul>
         * <li>text</li>
         * <li>binary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>binary</p>
         */
        public Builder secretDataType(String secretDataType) {
            this.secretDataType = secretDataType;
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
         * <p>Generic</p>
         */
        public Builder secretType(String secretType) {
            this.secretType = secretType;
            return this;
        }

        /**
         * <p>The version number of the secret value.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000000000000000000000000001</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The stage labels that mark the secret versions.</p>
         */
        public Builder versionStages(VersionStages versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public GetSecretValueResponseBody build() {
            return new GetSecretValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecretValueResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecretValueResponseBody</p>
     */
    public static class VersionStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionStage")
        private java.util.List<String> versionStage;

        private VersionStages(Builder builder) {
            this.versionStage = builder.versionStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionStages create() {
            return builder().build();
        }

        /**
         * @return versionStage
         */
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private java.util.List<String> versionStage; 

            private Builder() {
            } 

            private Builder(VersionStages model) {
                this.versionStage = model.versionStage;
            } 

            /**
             * VersionStage.
             */
            public Builder versionStage(java.util.List<String> versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public VersionStages build() {
                return new VersionStages(this);
            } 

        } 

    }
}
