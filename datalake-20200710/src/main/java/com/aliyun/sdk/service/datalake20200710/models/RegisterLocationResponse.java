// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterLocationResponse} extends {@link TeaModel}
 *
 * <p>RegisterLocationResponse</p>
 */
public class RegisterLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterLocationResponseBody body;

    private RegisterLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterLocationResponse create() {
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
     * @return body
     */
    public RegisterLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterLocationResponseBody body);

        @Override
        RegisterLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterLocationResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(RegisterLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterLocationResponse build() {
            return new RegisterLocationResponse(this);
        } 

    } 

}
