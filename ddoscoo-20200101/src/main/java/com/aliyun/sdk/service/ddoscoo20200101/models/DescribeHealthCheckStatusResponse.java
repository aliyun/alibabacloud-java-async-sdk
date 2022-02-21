// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckStatusResponse</p>
 */
public class DescribeHealthCheckStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHealthCheckStatusResponseBody body;

    private DescribeHealthCheckStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHealthCheckStatusResponse create() {
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
    public DescribeHealthCheckStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHealthCheckStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHealthCheckStatusResponseBody body);

        @Override
        DescribeHealthCheckStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHealthCheckStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHealthCheckStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHealthCheckStatusResponse response) {
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
        public Builder body(DescribeHealthCheckStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHealthCheckStatusResponse build() {
            return new DescribeHealthCheckStatusResponse(this);
        } 

    } 

}
