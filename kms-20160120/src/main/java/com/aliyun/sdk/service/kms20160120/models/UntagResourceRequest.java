// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourceRequest} extends {@link RequestModel}
 *
 * <p>UntagResourceRequest</p>
 */
public class UntagResourceRequest extends Request {
    @Query
    @NameInMap("CertificateId")
    private String certificateId;

    @Query
    @NameInMap("KeyId")
    private String keyId;

    @Query
    @NameInMap("SecretName")
    private String secretName;

    @Query
    @NameInMap("TagKeys")
    @Validation(required = true)
    private String tagKeys;

    private UntagResourceRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.keyId = builder.keyId;
        this.secretName = builder.secretName;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return tagKeys
     */
    public String getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourceRequest, Builder> {
        private String certificateId; 
        private String keyId; 
        private String secretName; 
        private String tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourceRequest response) {
            super(response);
            this.certificateId = response.certificateId;
            this.keyId = response.keyId;
            this.secretName = response.secretName;
            this.tagKeys = response.tagKeys;
        } 

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
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
         * TagKeys.
         */
        public Builder tagKeys(String tagKeys) {
            this.putQueryParameter("TagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourceRequest build() {
            return new UntagResourceRequest(this);
        } 

    } 

}
