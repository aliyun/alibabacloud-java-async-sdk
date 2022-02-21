// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RotateSecretRequest} extends {@link RequestModel}
 *
 * <p>RotateSecretRequest</p>
 */
public class RotateSecretRequest extends Request {
    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private RotateSecretRequest(Builder builder) {
        super(builder);
        this.secretName = builder.secretName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RotateSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RotateSecretRequest, Builder> {
        private String secretName; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(RotateSecretRequest response) {
            super(response);
            this.secretName = response.secretName;
            this.versionId = response.versionId;
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

        @Override
        public RotateSecretRequest build() {
            return new RotateSecretRequest(this);
        } 

    } 

}
