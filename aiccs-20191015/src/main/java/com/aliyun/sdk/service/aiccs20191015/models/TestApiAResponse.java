// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestApiAResponse} extends {@link TeaModel}
 *
 * <p>TestApiAResponse</p>
 */
public class TestApiAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestApiAResponseBody body;

    private TestApiAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestApiAResponse create() {
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
    public TestApiAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestApiAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestApiAResponseBody body);

        @Override
        TestApiAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestApiAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestApiAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestApiAResponse response) {
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
        public Builder body(TestApiAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestApiAResponse build() {
            return new TestApiAResponse(this);
        } 

    } 

}
