// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseTaskOrderResponse} extends {@link TeaModel}
 *
 * <p>CloseTaskOrderResponse</p>
 */
public class CloseTaskOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseTaskOrderResponseBody body;

    private CloseTaskOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseTaskOrderResponse create() {
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
    public CloseTaskOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseTaskOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseTaskOrderResponseBody body);

        @Override
        CloseTaskOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseTaskOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseTaskOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseTaskOrderResponse response) {
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
        public Builder body(CloseTaskOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseTaskOrderResponse build() {
            return new CloseTaskOrderResponse(this);
        } 

    } 

}
