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
         * Errors.
         */
        public Builder errors(java.util.List<Errors> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretValues.
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * HttpStatus.
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * SecretName.
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
             * AutomaticRotation.
             */
            public Builder automaticRotation(String automaticRotation) {
                this.automaticRotation = automaticRotation;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * LastRotationDate.
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * NextRotationDate.
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * RequestId.
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
             * SecretData.
             */
            public Builder secretData(String secretData) {
                this.secretData = secretData;
                return this;
            }

            /**
             * SecretDataType.
             */
            public Builder secretDataType(String secretDataType) {
                this.secretDataType = secretDataType;
                return this;
            }

            /**
             * SecretName.
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * SecretType.
             */
            public Builder secretType(String secretType) {
                this.secretType = secretType;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionStages.
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
