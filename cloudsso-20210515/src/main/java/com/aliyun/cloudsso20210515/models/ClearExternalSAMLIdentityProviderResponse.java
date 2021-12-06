// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ClearExternalSAMLIdentityProviderResponse} extends {@link TeaModel}
 *
 * <p>ClearExternalSAMLIdentityProviderResponse</p>
 */
public class ClearExternalSAMLIdentityProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClearExternalSAMLIdentityProviderResponseBody body;


    private ClearExternalSAMLIdentityProviderResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearExternalSAMLIdentityProviderResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ClearExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ClearExternalSAMLIdentityProviderResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ClearExternalSAMLIdentityProviderResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(ClearExternalSAMLIdentityProviderResponseBody body) {
            this.body = body;
            return this;
        }

        public ClearExternalSAMLIdentityProviderResponse build() {
            return new ClearExternalSAMLIdentityProviderResponse(this);
        } 

    } 

}
