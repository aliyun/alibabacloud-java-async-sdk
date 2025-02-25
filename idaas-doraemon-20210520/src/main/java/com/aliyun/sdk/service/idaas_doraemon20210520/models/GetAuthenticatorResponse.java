// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthenticatorResponse} extends {@link TeaModel}
 *
 * <p>GetAuthenticatorResponse</p>
 */
public class GetAuthenticatorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAuthenticatorResponseBody body;

    private GetAuthenticatorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAuthenticatorResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public GetAuthenticatorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthenticatorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAuthenticatorResponseBody body);

        @Override
        GetAuthenticatorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthenticatorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAuthenticatorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthenticatorResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(GetAuthenticatorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthenticatorResponse build() {
            return new GetAuthenticatorResponse(this);
        } 

    } 

}
