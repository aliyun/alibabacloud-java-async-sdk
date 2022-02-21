// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvInstanceHealthResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvInstanceHealthResponse</p>
 */
public class DescribeAppEnvInstanceHealthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppEnvInstanceHealthResponseBody body;

    private DescribeAppEnvInstanceHealthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppEnvInstanceHealthResponse create() {
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
    public DescribeAppEnvInstanceHealthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppEnvInstanceHealthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppEnvInstanceHealthResponseBody body);

        @Override
        DescribeAppEnvInstanceHealthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppEnvInstanceHealthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppEnvInstanceHealthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppEnvInstanceHealthResponse response) {
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
        public Builder body(DescribeAppEnvInstanceHealthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppEnvInstanceHealthResponse build() {
            return new DescribeAppEnvInstanceHealthResponse(this);
        } 

    } 

}
