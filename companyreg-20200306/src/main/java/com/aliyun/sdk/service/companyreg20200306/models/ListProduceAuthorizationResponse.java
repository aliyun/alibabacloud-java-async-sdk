// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProduceAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>ListProduceAuthorizationResponse</p>
 */
public class ListProduceAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProduceAuthorizationResponseBody body;

    private ListProduceAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProduceAuthorizationResponse create() {
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
    public ListProduceAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProduceAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProduceAuthorizationResponseBody body);

        @Override
        ListProduceAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProduceAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProduceAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProduceAuthorizationResponse response) {
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
        public Builder body(ListProduceAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProduceAuthorizationResponse build() {
            return new ListProduceAuthorizationResponse(this);
        } 

    } 

}
