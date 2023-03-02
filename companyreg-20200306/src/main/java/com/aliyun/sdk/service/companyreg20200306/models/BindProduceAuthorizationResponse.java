// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindProduceAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>BindProduceAuthorizationResponse</p>
 */
public class BindProduceAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindProduceAuthorizationResponseBody body;

    private BindProduceAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindProduceAuthorizationResponse create() {
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
    public BindProduceAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindProduceAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindProduceAuthorizationResponseBody body);

        @Override
        BindProduceAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindProduceAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindProduceAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindProduceAuthorizationResponse response) {
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
        public Builder body(BindProduceAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindProduceAuthorizationResponse build() {
            return new BindProduceAuthorizationResponse(this);
        } 

    } 

}
