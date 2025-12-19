// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetOAuth2CredentialProviderResponse} extends {@link TeaModel}
 *
 * <p>GetOAuth2CredentialProviderResponse</p>
 */
public class GetOAuth2CredentialProviderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetOAuth2CredentialProviderResponseBody body;

    private GetOAuth2CredentialProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOAuth2CredentialProviderResponse create() {
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
    public GetOAuth2CredentialProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOAuth2CredentialProviderResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOAuth2CredentialProviderResponseBody body);

        @Override
        GetOAuth2CredentialProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOAuth2CredentialProviderResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetOAuth2CredentialProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOAuth2CredentialProviderResponse response) {
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
        public Builder body(GetOAuth2CredentialProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOAuth2CredentialProviderResponse build() {
            return new GetOAuth2CredentialProviderResponse(this);
        } 

    } 

}
