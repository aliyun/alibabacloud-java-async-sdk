// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvStatusResponse</p>
 */
public class DescribeAppEnvStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppEnvStatusResponseBody body;

    private DescribeAppEnvStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppEnvStatusResponse create() {
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
    public DescribeAppEnvStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppEnvStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppEnvStatusResponseBody body);

        @Override
        DescribeAppEnvStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppEnvStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppEnvStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppEnvStatusResponse response) {
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
        public Builder body(DescribeAppEnvStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppEnvStatusResponse build() {
            return new DescribeAppEnvStatusResponse(this);
        } 

    } 

}
