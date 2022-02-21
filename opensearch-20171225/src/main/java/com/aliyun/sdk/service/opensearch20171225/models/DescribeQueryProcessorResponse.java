// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQueryProcessorResponse} extends {@link TeaModel}
 *
 * <p>DescribeQueryProcessorResponse</p>
 */
public class DescribeQueryProcessorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeQueryProcessorResponseBody body;

    private DescribeQueryProcessorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeQueryProcessorResponse create() {
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
    public DescribeQueryProcessorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeQueryProcessorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeQueryProcessorResponseBody body);

        @Override
        DescribeQueryProcessorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeQueryProcessorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeQueryProcessorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeQueryProcessorResponse response) {
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
        public Builder body(DescribeQueryProcessorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeQueryProcessorResponse build() {
            return new DescribeQueryProcessorResponse(this);
        } 

    } 

}
