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
         * <p>The secret value. The value is encrypted and then stored in the new version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>importantdata</p>
         */
        public Builder secretData(String secretData) {
            this.putQueryParameter("SecretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * <p>The type of the secret value. Valid values:</p>
         * <ul>
         * <li>text: This is the default value.</li>
         * <li>binary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder secretDataType(String secretDataType) {
            this.putQueryParameter("SecretDataType", secretDataType);
            this.secretDataType = secretDataType;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The new version of the secret value. Version numbers must be unique in each secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000000000000000000000000000203</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The stage labels that are used to mark the new version. If you do not specify this parameter, Secrets Manager marks the new version with ACSCurrent.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ACSCurrent&quot;,&quot;ACSNext&quot;]</p>
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
