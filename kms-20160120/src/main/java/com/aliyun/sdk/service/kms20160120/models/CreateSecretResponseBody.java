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
        private String extendedConfig; 
        private String nextRotationDate; 
        private String requestId; 
        private String rotationInterval; 
        private String secretName; 
        private String secretType; 
        private String versionId; 

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * AutomaticRotation.
         */
        public Builder automaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
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

        public CreateSecretResponseBody build() {
            return new CreateSecretResponseBody(this);
        } 

    } 

}
