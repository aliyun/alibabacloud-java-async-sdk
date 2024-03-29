// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserAuthenticateOptionsResponse} extends {@link TeaModel}
 *
 * <p>CreateUserAuthenticateOptionsResponse</p>
 */
public class CreateUserAuthenticateOptionsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateUserAuthenticateOptionsResponseBody body;

    private CreateUserAuthenticateOptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateUserAuthenticateOptionsResponse create() {
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
    public CreateUserAuthenticateOptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserAuthenticateOptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateUserAuthenticateOptionsResponseBody body);

        @Override
        CreateUserAuthenticateOptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserAuthenticateOptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateUserAuthenticateOptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserAuthenticateOptionsResponse response) {
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
        public Builder body(CreateUserAuthenticateOptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserAuthenticateOptionsResponse build() {
            return new CreateUserAuthenticateOptionsResponse(this);
        } 

    } 

}
