// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceVncUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceVncUrlResponse</p>
 */
public class DescribeInstanceVncUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceVncUrlResponseBody body;

    private DescribeInstanceVncUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceVncUrlResponse create() {
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
    public DescribeInstanceVncUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceVncUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceVncUrlResponseBody body);

        @Override
        DescribeInstanceVncUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceVncUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceVncUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceVncUrlResponse response) {
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
        public Builder body(DescribeInstanceVncUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceVncUrlResponse build() {
            return new DescribeInstanceVncUrlResponse(this);
        } 

    } 

}
