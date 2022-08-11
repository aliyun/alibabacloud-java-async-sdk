// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestNetworkConnectionResponse} extends {@link TeaModel}
 *
 * <p>TestNetworkConnectionResponse</p>
 */
public class TestNetworkConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestNetworkConnectionResponseBody body;

    private TestNetworkConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestNetworkConnectionResponse create() {
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
    public TestNetworkConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestNetworkConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestNetworkConnectionResponseBody body);

        @Override
        TestNetworkConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestNetworkConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestNetworkConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestNetworkConnectionResponse response) {
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
        public Builder body(TestNetworkConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestNetworkConnectionResponse build() {
            return new TestNetworkConnectionResponse(this);
        } 

    } 

}
