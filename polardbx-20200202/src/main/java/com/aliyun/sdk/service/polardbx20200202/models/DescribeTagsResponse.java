// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsResponse} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponse</p>
 */
public class DescribeTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTagsResponseBody body;

    private DescribeTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTagsResponse create() {
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
    public DescribeTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTagsResponseBody body);

        @Override
        DescribeTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTagsResponse response) {
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
        public Builder body(DescribeTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTagsResponse build() {
            return new DescribeTagsResponse(this);
        } 

    } 

}
