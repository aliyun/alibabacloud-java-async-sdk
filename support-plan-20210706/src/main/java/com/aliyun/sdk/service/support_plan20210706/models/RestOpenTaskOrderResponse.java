// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestOpenTaskOrderResponse} extends {@link TeaModel}
 *
 * <p>RestOpenTaskOrderResponse</p>
 */
public class RestOpenTaskOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestOpenTaskOrderResponseBody body;

    private RestOpenTaskOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestOpenTaskOrderResponse create() {
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
    public RestOpenTaskOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestOpenTaskOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestOpenTaskOrderResponseBody body);

        @Override
        RestOpenTaskOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestOpenTaskOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestOpenTaskOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestOpenTaskOrderResponse response) {
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
        public Builder body(RestOpenTaskOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestOpenTaskOrderResponse build() {
            return new RestOpenTaskOrderResponse(this);
        } 

    } 

}
