// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCommodityInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageCommodityInfoResponse</p>
 */
public class DescribeImageCommodityInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageCommodityInfoResponseBody body;

    private DescribeImageCommodityInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageCommodityInfoResponse create() {
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
    public DescribeImageCommodityInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageCommodityInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageCommodityInfoResponseBody body);

        @Override
        DescribeImageCommodityInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageCommodityInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageCommodityInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageCommodityInfoResponse response) {
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
        public Builder body(DescribeImageCommodityInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageCommodityInfoResponse build() {
            return new DescribeImageCommodityInfoResponse(this);
        } 

    } 

}
