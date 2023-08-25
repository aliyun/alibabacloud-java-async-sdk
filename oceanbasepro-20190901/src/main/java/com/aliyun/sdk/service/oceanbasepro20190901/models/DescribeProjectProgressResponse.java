// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectProgressResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectProgressResponse</p>
 */
public class DescribeProjectProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectProgressResponseBody body;

    private DescribeProjectProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectProgressResponse create() {
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
    public DescribeProjectProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectProgressResponseBody body);

        @Override
        DescribeProjectProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectProgressResponse response) {
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
        public Builder body(DescribeProjectProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectProgressResponse build() {
            return new DescribeProjectProgressResponse(this);
        } 

    } 

}
