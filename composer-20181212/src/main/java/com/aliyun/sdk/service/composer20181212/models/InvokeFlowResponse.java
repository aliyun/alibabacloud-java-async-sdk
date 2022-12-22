// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeFlowResponse} extends {@link TeaModel}
 *
 * <p>InvokeFlowResponse</p>
 */
public class InvokeFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvokeFlowResponseBody body;

    private InvokeFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvokeFlowResponse create() {
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
    public InvokeFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvokeFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvokeFlowResponseBody body);

        @Override
        InvokeFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvokeFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvokeFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvokeFlowResponse response) {
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
        public Builder body(InvokeFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvokeFlowResponse build() {
            return new InvokeFlowResponse(this);
        } 

    } 

}
