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

        private Builder(UntagResourceRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.keyId = request.keyId;
            this.secretName = request.secretName;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * The ID of the certificate.
         * <p>
         * 
         * >  You can configure only one of the KeyId, SecretName, and CertificateId parameters.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The ID of the customer master key (CMK). The ID must be globally unique.
         * <p>
         * 
         * >  You can configure only one of the KeyId, SecretName, and CertificateId parameters.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The name of the secret.
         * <p>
         * 
         * >  You can configure only one of the KeyId, SecretName, and CertificateId parameters.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * One or more tag keys. Separate multiple tag keys with commas (,).
         * <p>
         * 
         * You need to specify only the tag keys, not the tag values.
         * 
         * Each tag key must be 1 to 128 bytes in length.
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
