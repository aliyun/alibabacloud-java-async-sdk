// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MockOrderFreeFlowProductResponse} extends {@link TeaModel}
 *
 * <p>MockOrderFreeFlowProductResponse</p>
 */
public class MockOrderFreeFlowProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MockOrderFreeFlowProductResponseBody body;

    private MockOrderFreeFlowProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MockOrderFreeFlowProductResponse create() {
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
    public MockOrderFreeFlowProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MockOrderFreeFlowProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MockOrderFreeFlowProductResponseBody body);

        @Override
        MockOrderFreeFlowProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MockOrderFreeFlowProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MockOrderFreeFlowProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MockOrderFreeFlowProductResponse response) {
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
        public Builder body(MockOrderFreeFlowProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MockOrderFreeFlowProductResponse build() {
            return new MockOrderFreeFlowProductResponse(this);
        } 

    } 

}
