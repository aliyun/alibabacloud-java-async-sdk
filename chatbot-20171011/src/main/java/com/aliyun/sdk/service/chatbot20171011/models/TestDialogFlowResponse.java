// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDialogFlowResponse} extends {@link TeaModel}
 *
 * <p>TestDialogFlowResponse</p>
 */
public class TestDialogFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestDialogFlowResponseBody body;

    private TestDialogFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestDialogFlowResponse create() {
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
    public TestDialogFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestDialogFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestDialogFlowResponseBody body);

        @Override
        TestDialogFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestDialogFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestDialogFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestDialogFlowResponse response) {
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
        public Builder body(TestDialogFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestDialogFlowResponse build() {
            return new TestDialogFlowResponse(this);
        } 

    } 

}
