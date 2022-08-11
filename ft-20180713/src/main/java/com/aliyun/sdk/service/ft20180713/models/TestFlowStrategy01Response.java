// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestFlowStrategy01Response} extends {@link TeaModel}
 *
 * <p>TestFlowStrategy01Response</p>
 */
public class TestFlowStrategy01Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestFlowStrategy01ResponseBody body;

    private TestFlowStrategy01Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestFlowStrategy01Response create() {
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
    public TestFlowStrategy01ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestFlowStrategy01Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestFlowStrategy01ResponseBody body);

        @Override
        TestFlowStrategy01Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestFlowStrategy01Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestFlowStrategy01ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestFlowStrategy01Response response) {
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
        public Builder body(TestFlowStrategy01ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestFlowStrategy01Response build() {
            return new TestFlowStrategy01Response(this);
        } 

    } 

}
