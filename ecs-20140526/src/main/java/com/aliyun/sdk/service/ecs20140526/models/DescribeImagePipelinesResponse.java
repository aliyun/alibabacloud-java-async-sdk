// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePipelinesResponse} extends {@link TeaModel}
 *
 * <p>DescribeImagePipelinesResponse</p>
 */
public class DescribeImagePipelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImagePipelinesResponseBody body;

    private DescribeImagePipelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImagePipelinesResponse create() {
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
    public DescribeImagePipelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImagePipelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImagePipelinesResponseBody body);

        @Override
        DescribeImagePipelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImagePipelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImagePipelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImagePipelinesResponse response) {
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
        public Builder body(DescribeImagePipelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImagePipelinesResponse build() {
            return new DescribeImagePipelinesResponse(this);
        } 

    } 

}
