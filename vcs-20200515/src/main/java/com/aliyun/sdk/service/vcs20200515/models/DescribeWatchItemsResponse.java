// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchItemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeWatchItemsResponse</p>
 */
public class DescribeWatchItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWatchItemsResponseBody body;

    private DescribeWatchItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWatchItemsResponse create() {
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
    public DescribeWatchItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWatchItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWatchItemsResponseBody body);

        @Override
        DescribeWatchItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWatchItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWatchItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWatchItemsResponse response) {
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
        public Builder body(DescribeWatchItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWatchItemsResponse build() {
            return new DescribeWatchItemsResponse(this);
        } 

    } 

}
