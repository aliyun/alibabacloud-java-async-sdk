// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretValueResponseBody</p>
 */
public class GetSecretValueResponseBody extends TeaModel {
    @NameInMap("AutomaticRotation")
    private String automaticRotation;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExtendedConfig")
    private String extendedConfig;

    @NameInMap("LastRotationDate")
    private String lastRotationDate;

    @NameInMap("NextRotationDate")
    private String nextRotationDate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RotationInterval")
    private String rotationInterval;

    @NameInMap("SecretData")
    private String secretData;

    @NameInMap("SecretDataType")
    private String secretDataType;

    @NameInMap("SecretName")
    private String secretName;

    @NameInMap("SecretType")
    private String secretType;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("VersionStages")
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

        public GetSecretValueResponseBody build() {
            return new GetSecretValueResponseBody(this);
        } 

    } 

    public static class VersionStages extends TeaModel {
        @NameInMap("VersionStage")
        private java.util.List < String > versionStage;

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
        public java.util.List < String > getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private java.util.List < String > versionStage; 

            /**
             * VersionStage.
             */
            public Builder versionStage(java.util.List < String > versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public VersionStages build() {
                return new VersionStages(this);
            } 

        } 

    }
}
