// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutKvRequest} extends {@link RequestModel}
 *
 * <p>PutKvRequest</p>
 */
public class PutKvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Base64")
    private Boolean base64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private Long expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirationTtl")
    private Long expirationTtl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private PutKvRequest(Builder builder) {
        super(builder);
        this.base64 = builder.base64;
        this.expiration = builder.expiration;
        this.expirationTtl = builder.expirationTtl;
        this.key = builder.key;
        this.namespace = builder.namespace;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutKvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return base64
     */
    public Boolean getBase64() {
        return this.base64;
    }

    /**
     * @return expiration
     */
    public Long getExpiration() {
        return this.expiration;
    }

    /**
     * @return expirationTtl
     */
    public Long getExpirationTtl() {
        return this.expirationTtl;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<PutKvRequest, Builder> {
        private Boolean base64; 
        private Long expiration; 
        private Long expirationTtl; 
        private String key; 
        private String namespace; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(PutKvRequest request) {
            super(request);
            this.base64 = request.base64;
            this.expiration = request.expiration;
            this.expirationTtl = request.expirationTtl;
            this.key = request.key;
            this.namespace = request.namespace;
            this.value = request.value;
        } 

        /**
         * Base64.
         */
        public Builder base64(Boolean base64) {
            this.putQueryParameter("Base64", base64);
            this.base64 = base64;
            return this;
        }

        /**
         * Expiration.
         */
        public Builder expiration(Long expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * ExpirationTtl.
         */
        public Builder expirationTtl(Long expirationTtl) {
            this.putQueryParameter("ExpirationTtl", expirationTtl);
            this.expirationTtl = expirationTtl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public PutKvRequest build() {
            return new PutKvRequest(this);
        } 

    } 

}
