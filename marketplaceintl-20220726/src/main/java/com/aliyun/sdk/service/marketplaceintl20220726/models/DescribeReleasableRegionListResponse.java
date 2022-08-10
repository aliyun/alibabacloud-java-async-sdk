// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReleasableRegionListResponse} extends {@link TeaModel}
 *
 * <p>DescribeReleasableRegionListResponse</p>
 */
public class DescribeReleasableRegionListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReleasableRegionListResponseBody body;

    private DescribeReleasableRegionListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReleasableRegionListResponse create() {
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
    public DescribeReleasableRegionListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReleasableRegionListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReleasableRegionListResponseBody body);

        @Override
        DescribeReleasableRegionListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReleasableRegionListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReleasableRegionListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReleasableRegionListResponse response) {
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
        public Builder body(DescribeReleasableRegionListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReleasableRegionListResponse build() {
            return new DescribeReleasableRegionListResponse(this);
        } 

    } 

}
