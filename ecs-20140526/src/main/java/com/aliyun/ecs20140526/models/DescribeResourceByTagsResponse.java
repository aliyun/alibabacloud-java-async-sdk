// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceByTagsResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceByTagsResponse</p>
 */
public class DescribeResourceByTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceByTagsResponseBody body;

    private DescribeResourceByTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceByTagsResponse create() {
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
    public DescribeResourceByTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceByTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceByTagsResponseBody body);

        @Override
        DescribeResourceByTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceByTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceByTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceByTagsResponse response) {
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
        public Builder body(DescribeResourceByTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceByTagsResponse build() {
            return new DescribeResourceByTagsResponse(this);
        } 

    } 

}
