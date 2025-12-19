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
 * {@link ListOAuth2CredentialProvidersResponse} extends {@link TeaModel}
 *
 * <p>ListOAuth2CredentialProvidersResponse</p>
 */
public class ListOAuth2CredentialProvidersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListOAuth2CredentialProvidersResponseBody body;

    private ListOAuth2CredentialProvidersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListOAuth2CredentialProvidersResponse create() {
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
    public ListOAuth2CredentialProvidersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOAuth2CredentialProvidersResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListOAuth2CredentialProvidersResponseBody body);

        @Override
        ListOAuth2CredentialProvidersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOAuth2CredentialProvidersResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListOAuth2CredentialProvidersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOAuth2CredentialProvidersResponse response) {
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
        public Builder body(ListOAuth2CredentialProvidersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOAuth2CredentialProvidersResponse build() {
            return new ListOAuth2CredentialProvidersResponse(this);
        } 

    } 

}
