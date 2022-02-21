// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStreamsPublishListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsStreamsPublishListResponse</p>
 */
public class DescribeVsStreamsPublishListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVsStreamsPublishListResponseBody body;

    private DescribeVsStreamsPublishListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVsStreamsPublishListResponse create() {
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
    public DescribeVsStreamsPublishListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsStreamsPublishListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVsStreamsPublishListResponseBody body);

        @Override
        DescribeVsStreamsPublishListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsStreamsPublishListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVsStreamsPublishListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsStreamsPublishListResponse response) {
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
        public Builder body(DescribeVsStreamsPublishListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsStreamsPublishListResponse build() {
            return new DescribeVsStreamsPublishListResponse(this);
        } 

    } 

}
