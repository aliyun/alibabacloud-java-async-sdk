// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCommodityStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageCommodityStatusResponse</p>
 */
public class DescribeImageCommodityStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageCommodityStatusResponseBody body;

    private DescribeImageCommodityStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageCommodityStatusResponse create() {
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
    public DescribeImageCommodityStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageCommodityStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageCommodityStatusResponseBody body);

        @Override
        DescribeImageCommodityStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageCommodityStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageCommodityStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageCommodityStatusResponse response) {
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
        public Builder body(DescribeImageCommodityStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageCommodityStatusResponse build() {
            return new DescribeImageCommodityStatusResponse(this);
        } 

    } 

}
