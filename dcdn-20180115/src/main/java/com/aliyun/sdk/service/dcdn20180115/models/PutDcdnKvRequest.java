// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDcdnKvRequest} extends {@link RequestModel}
 *
 * <p>PutDcdnKvRequest</p>
 */
public class PutDcdnKvRequest extends Request {
    @Query
    @NameInMap("Expiration")
    private Long expiration;

    @Query
    @NameInMap("ExpirationTtl")
    private Long expirationTtl;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private PutDcdnKvRequest(Builder builder) {
        super(builder);
        this.expiration = builder.expiration;
        this.expirationTtl = builder.expirationTtl;
        this.key = builder.key;
        this.namespace = builder.namespace;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDcdnKvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PutDcdnKvRequest, Builder> {
        private Long expiration; 
        private Long expirationTtl; 
        private String key; 
        private String namespace; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(PutDcdnKvRequest request) {
            super(request);
            this.expiration = request.expiration;
            this.expirationTtl = request.expirationTtl;
            this.key = request.key;
            this.namespace = request.namespace;
            this.value = request.value;
        } 

        /**
         * The time when the key expires.Example: "1690081381".
         */
        public Builder expiration(Long expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * The time when the key expires.Example: "3600".
         */
        public Builder expirationTtl(Long expirationTtl) {
            this.putQueryParameter("ExpirationTtl", expirationTtl);
            this.expirationTtl = expirationTtl;
            return this;
        }

        /**
         * The key. The key can be up to 512 characters in length, and cannot contain spaces.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The value of the key. The maximum size is 2 MB (2 x 1000 x 1000 bytes).
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public PutDcdnKvRequest build() {
            return new PutDcdnKvRequest(this);
        } 

    } 

}
