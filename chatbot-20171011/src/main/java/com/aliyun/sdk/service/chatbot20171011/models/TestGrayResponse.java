// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestGrayResponse} extends {@link TeaModel}
 *
 * <p>TestGrayResponse</p>
 */
public class TestGrayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestGrayResponseBody body;

    private TestGrayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestGrayResponse create() {
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
    public TestGrayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestGrayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestGrayResponseBody body);

        @Override
        TestGrayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestGrayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestGrayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestGrayResponse response) {
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
        public Builder body(TestGrayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestGrayResponse build() {
            return new TestGrayResponse(this);
        } 

    } 

}
