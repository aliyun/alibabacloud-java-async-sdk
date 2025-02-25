// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link OAuth2RevocationEndpointResponse} extends {@link TeaModel}
 *
 * <p>OAuth2RevocationEndpointResponse</p>
 */
public class OAuth2RevocationEndpointResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OAuth2RevocationEndpointResponseBody body;

    private OAuth2RevocationEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OAuth2RevocationEndpointResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public OAuth2RevocationEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OAuth2RevocationEndpointResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OAuth2RevocationEndpointResponseBody body);

        @Override
        OAuth2RevocationEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OAuth2RevocationEndpointResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OAuth2RevocationEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OAuth2RevocationEndpointResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(OAuth2RevocationEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OAuth2RevocationEndpointResponse build() {
            return new OAuth2RevocationEndpointResponse(this);
        } 

    } 

}
