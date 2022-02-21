// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStreamResponse} extends {@link TeaModel}
 *
 * <p>DescribeStreamResponse</p>
 */
public class DescribeStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStreamResponseBody body;

    private DescribeStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStreamResponse create() {
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
    public DescribeStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStreamResponseBody body);

        @Override
        DescribeStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStreamResponse response) {
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
        public Builder body(DescribeStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStreamResponse build() {
            return new DescribeStreamResponse(this);
        } 

    } 

}
