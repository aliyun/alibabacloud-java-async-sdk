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
 * {@link BatchGetSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetSecretValueResponseBody</p>
 */
public class BatchGetSecretValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Errors")
    private java.util.List<Errors> errors;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretValues")
    private java.util.List<SecretValues> secretValues;

    private BatchGetSecretValueResponseBody(Builder builder) {
        this.errors = builder.errors;
        this.requestId = builder.requestId;
        this.secretValues = builder.secretValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetSecretValueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errors
     */
    public java.util.List<Errors> getErrors() {
        return this.errors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretValues
     */
    public java.util.List<SecretValues> getSecretValues() {
        return this.secretValues;
    }

    public static final class Builder {
        private java.util.List<Errors> errors; 
        private String requestId; 
        private java.util.List<SecretValues> secretValues; 

        private Builder() {
        } 

        private Builder(BatchGetSecretValueResponseBody model) {
            this.errors = model.errors;
            this.requestId = model.requestId;
            this.secretValues = model.secretValues;
        } 

        /**
         * <p>The list of errors for secrets that failed to be retrieved.</p>
         */
        public Builder errors(java.util.List<Errors> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8252db58-2036-408c-a3d5-56e656dc2551</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of secrets that are successfully retrieved.</p>
         */
        public Builder secretValues(java.util.List<SecretValues> secretValues) {
            this.secretValues = secretValues;
            return this;
        }

        public BatchGetSecretValueResponseBody build() {
            return new BatchGetSecretValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetSecretValueResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetSecretValueResponseBody</p>
     */
    public static class Errors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HttpStatus")
        private Integer httpStatus;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        private Errors(Builder builder) {
            this.code = builder.code;
            this.httpStatus = builder.httpStatus;
            this.message = builder.message;
            this.secretName = builder.secretName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Errors create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return httpStatus
         */
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        public static final class Builder {
            private String code; 
            private Integer httpStatus; 
            private String message; 
            private String secretName; 

            private Builder() {
            } 

            private Builder(Errors model) {
                this.code = model.code;
                this.httpStatus = model.httpStatus;
                this.message = model.message;
                this.secretName = model.secretName;
            } 

            /**
             * <p>The service error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Forbidden.ResourceNotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The HTTP status code returned for the error.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * <p>The error message for the failed secret retrieval.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource not found.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The secret name.</p>
             * 
             * <strong>example:</strong>
             * <p>secret002</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            public Errors build() {
                return new Errors(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetSecretValueResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetSecretValueResponseBody</p>
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
             * <p>The version stages of the secret.</p>
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
    /**
     * 
     * {@link BatchGetSecretValueResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetSecretValueResponseBody</p>
     */
    public static class SecretValues extends TeaModel {
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

        private SecretValues(Builder builder) {
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

        public static SecretValues create() {
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

            private Builder(SecretValues model) {
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
             * <li>Enabled: Automatic rotation is enabled.</li>
             * <li>Disabled: Automatic rotation is disabled.</li>
             * <li>Invalid: The rotation status is abnormal. KMS cannot automatically rotate the secret.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only for ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, or ECS secrets.</p>
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
             * <p>The time when the secret was created (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-21T15:39:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The extended configuration of the secret.  </p>
             * <blockquote>
             * <p>This parameter is returned only for ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, or ECS secrets when FetchExtendedConfig is set to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:{} }</p>
             */
            public Builder extendedConfig(String extendedConfig) {
                this.extendedConfig = extendedConfig;
                return this;
            }

            /**
             * <p>The time of the most recent rotation (UTC).</p>
             * <blockquote>
             * <p>This parameter is returned only when the secret has been rotated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-07-05T08:22:03Z</p>
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * <p>The time of the next rotation (UTC).</p>
             * <blockquote>
             * <p>This parameter is returned only when automatic rotation is enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-07-06T18:22:03Z</p>
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * <p>The ID of this request, which is a unique identifier generated by Alibaba Cloud for troubleshooting purposes.</p>
             * 
             * <strong>example:</strong>
             * <p>8252db58-2036-408c-a3d5-56e656dc2551</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The interval for automatic rotation of the secret.
             * The format is integer[unit], where integer specifies the duration and unit specifies the time unit. The value of unit is s (seconds). For example, a rotation interval of 7 days is 604800s.</p>
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
             * <p>The secret value. KMS decrypts the stored ciphertext secret value and returns this parameter.  </p>
             * <ul>
             * <li><p>A generic secret returns the secret value that you specified.</p>
             * </li>
             * <li><p>An ApsaraDB RDS secret or Redis/Tair secret returns the secret value in the following format: <code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code>.</p>
             * </li>
             * <li><p>A RAM secret returns the secret value in the following format: <code>{&quot;AccessKeyId&quot;:&quot;Adfdsfd&quot;,&quot;AccessKeySecret&quot;:&quot;fdsfdsf&quot;,&quot;GenerateTimestamp&quot;: &quot;2023-03-25T10:42:40Z&quot;}</code>.  </p>
             * </li>
             * <li><p>An ECS secret returns the secret value in the following formats:  </p>
             * <ul>
             * <li>Password-type secret: <code>{&quot;UserName&quot;:&quot;ecs-user&quot;,&quot;Password&quot;:&quot;H5asdasdsads****&quot;}</code>.  </li>
             * <li>Public-private key-type secret (private key in PEM format): <code>{&quot;UserName&quot;:&quot;ecs-user&quot;,&quot;PublicKey&quot;:&quot;ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key&quot;,&quot;PrivateKey&quot;: &quot;d6bee1cb-2e14-4277-ba6b-73786b21****&quot;}</code>.</li>
             * </ul>
             * </li>
             * <li><p>A PolarDB secret returns the secret value in the following format: <code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code>.</p>
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
             * <p>The secret name.</p>
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
             * <li>Generic: generic secret.  </li>
             * <li>Rds: ApsaraDB RDS secret.  </li>
             * <li>Redis: Redis/Tair secret.</li>
             * <li>RAMCredentials: RAM secret.  </li>
             * <li>ECS: ECS secret.</li>
             * <li>PolarDB: PolarDB secret.</li>
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
             * <p>The version number of the secret.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * <p>The version stages of the secret.</p>
             */
            public Builder versionStages(VersionStages versionStages) {
                this.versionStages = versionStages;
                return this;
            }

            public SecretValues build() {
                return new SecretValues(this);
            } 

        } 

    }
}
