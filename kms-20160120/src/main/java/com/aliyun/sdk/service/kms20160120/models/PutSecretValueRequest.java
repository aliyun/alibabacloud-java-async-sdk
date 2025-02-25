// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutSecretValueRequest} extends {@link RequestModel}
 *
 * <p>PutSecretValueRequest</p>
 */
public class PutSecretValueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretDataType")
    private String secretDataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionStages")
    private String versionStages;

    private PutSecretValueRequest(Builder builder) {
        super(builder);
        this.secretData = builder.secretData;
        this.secretDataType = builder.secretDataType;
        this.secretName = builder.secretName;
        this.versionId = builder.versionId;
        this.versionStages = builder.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutSecretValueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionStages
     */
    public String getVersionStages() {
        return this.versionStages;
    }

    public static final class Builder extends Request.Builder<PutSecretValueRequest, Builder> {
        private String secretData; 
        private String secretDataType; 
        private String secretName; 
        private String versionId; 
        private String versionStages; 

        private Builder() {
            super();
        } 

        private Builder(PutSecretValueRequest request) {
            super(request);
            this.secretData = request.secretData;
            this.secretDataType = request.secretDataType;
            this.secretName = request.secretName;
            this.versionId = request.versionId;
            this.versionStages = request.versionStages;
        } 

        /**
         * The secret value. The value is encrypted and then stored in the new version.
         */
        public Builder secretData(String secretData) {
            this.putQueryParameter("SecretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * The type of the secret value. Valid values:
         * <p>
         * 
         * *   text: This is the default value.
         * *   binary
         */
        public Builder secretDataType(String secretDataType) {
            this.putQueryParameter("SecretDataType", secretDataType);
            this.secretDataType = secretDataType;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * The new version of the secret value. Version numbers must be unique in each secret.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * The stage labels that are used to mark the new version. If you do not specify this parameter, Secrets Manager marks the new version with ACSCurrent.
         */
        public Builder versionStages(String versionStages) {
            this.putQueryParameter("VersionStages", versionStages);
            this.versionStages = versionStages;
            return this;
        }

        @Override
        public PutSecretValueRequest build() {
            return new PutSecretValueRequest(this);
        } 

    } 

}
