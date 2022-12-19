// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineItemListResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineItemListResponse</p>
 */
public class DescribeImageBaselineItemListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageBaselineItemListResponseBody body;

    private DescribeImageBaselineItemListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageBaselineItemListResponse create() {
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
    public DescribeImageBaselineItemListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageBaselineItemListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageBaselineItemListResponseBody body);

        @Override
        DescribeImageBaselineItemListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageBaselineItemListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageBaselineItemListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageBaselineItemListResponse response) {
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
        public Builder body(DescribeImageBaselineItemListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageBaselineItemListResponse build() {
            return new DescribeImageBaselineItemListResponse(this);
        } 

    } 

}
