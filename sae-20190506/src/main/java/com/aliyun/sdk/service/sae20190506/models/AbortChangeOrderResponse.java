// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortChangeOrderResponse} extends {@link TeaModel}
 *
 * <p>AbortChangeOrderResponse</p>
 */
public class AbortChangeOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbortChangeOrderResponseBody body;

    private AbortChangeOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbortChangeOrderResponse create() {
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
    public AbortChangeOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbortChangeOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbortChangeOrderResponseBody body);

        @Override
        AbortChangeOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbortChangeOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbortChangeOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbortChangeOrderResponse response) {
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
        public Builder body(AbortChangeOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbortChangeOrderResponse build() {
            return new AbortChangeOrderResponse(this);
        } 

    } 

}
