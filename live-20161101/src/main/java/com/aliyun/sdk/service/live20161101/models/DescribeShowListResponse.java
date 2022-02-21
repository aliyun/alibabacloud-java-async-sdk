// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShowListResponse} extends {@link TeaModel}
 *
 * <p>DescribeShowListResponse</p>
 */
public class DescribeShowListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeShowListResponseBody body;

    private DescribeShowListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeShowListResponse create() {
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
    public DescribeShowListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeShowListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeShowListResponseBody body);

        @Override
        DescribeShowListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeShowListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeShowListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeShowListResponse response) {
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
        public Builder body(DescribeShowListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeShowListResponse build() {
            return new DescribeShowListResponse(this);
        } 

    } 

}
