// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthenticatorRegistrationResponse} extends {@link TeaModel}
 *
 * <p>CreateAuthenticatorRegistrationResponse</p>
 */
public class CreateAuthenticatorRegistrationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateAuthenticatorRegistrationResponseBody body;

    private CreateAuthenticatorRegistrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateAuthenticatorRegistrationResponse create() {
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
    public CreateAuthenticatorRegistrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAuthenticatorRegistrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateAuthenticatorRegistrationResponseBody body);

        @Override
        CreateAuthenticatorRegistrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAuthenticatorRegistrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateAuthenticatorRegistrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAuthenticatorRegistrationResponse response) {
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
        public Builder body(CreateAuthenticatorRegistrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAuthenticatorRegistrationResponse build() {
            return new CreateAuthenticatorRegistrationResponse(this);
        } 

    } 

}
