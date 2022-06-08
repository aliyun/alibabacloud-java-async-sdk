// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourceRequest} extends {@link RequestModel}
 *
 * <p>TagResourceRequest</p>
 */
public class TagResourceRequest extends Request {
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
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private TagResourceRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.keyId = builder.keyId;
        this.secretName = builder.secretName;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourceRequest create() {
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
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagResourceRequest, Builder> {
        private String certificateId; 
        private String keyId; 
        private String secretName; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(TagResourceRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.keyId = request.keyId;
            this.secretName = request.secretName;
            this.tags = request.tags;
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
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagResourceRequest build() {
            return new TagResourceRequest(this);
        } 

    } 

}
