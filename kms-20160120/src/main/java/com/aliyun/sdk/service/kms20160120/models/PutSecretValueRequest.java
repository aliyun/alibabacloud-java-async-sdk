// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutSecretValueRequest} extends {@link RequestModel}
 *
 * <p>PutSecretValueRequest</p>
 */
public class PutSecretValueRequest extends Request {
    @Query
    @NameInMap("SecretData")
    @Validation(required = true)
    private String secretData;

    @Query
    @NameInMap("SecretDataType")
    private String secretDataType;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("VersionStages")
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

        private Builder(PutSecretValueRequest response) {
            super(response);
            this.secretData = response.secretData;
            this.secretDataType = response.secretDataType;
            this.secretName = response.secretName;
            this.versionId = response.versionId;
            this.versionStages = response.versionStages;
        } 

        /**
         * SecretData.
         */
        public Builder secretData(String secretData) {
            this.putQueryParameter("SecretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * SecretDataType.
         */
        public Builder secretDataType(String secretDataType) {
            this.putQueryParameter("SecretDataType", secretDataType);
            this.secretDataType = secretDataType;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * VersionStages.
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
