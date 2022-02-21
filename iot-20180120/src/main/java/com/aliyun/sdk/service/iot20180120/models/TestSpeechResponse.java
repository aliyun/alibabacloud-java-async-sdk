// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestSpeechResponse} extends {@link TeaModel}
 *
 * <p>TestSpeechResponse</p>
 */
public class TestSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestSpeechResponseBody body;

    private TestSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestSpeechResponse create() {
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
    public TestSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestSpeechResponseBody body);

        @Override
        TestSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestSpeechResponse response) {
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
        public Builder body(TestSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestSpeechResponse build() {
            return new TestSpeechResponse(this);
        } 

    } 

}
