// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceCoverageDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceCoverageDetailResponse</p>
 */
public class DescribeResourceCoverageDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceCoverageDetailResponseBody body;

    private DescribeResourceCoverageDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceCoverageDetailResponse create() {
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
    public DescribeResourceCoverageDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceCoverageDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceCoverageDetailResponseBody body);

        @Override
        DescribeResourceCoverageDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceCoverageDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceCoverageDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceCoverageDetailResponse response) {
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
        public Builder body(DescribeResourceCoverageDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceCoverageDetailResponse build() {
            return new DescribeResourceCoverageDetailResponse(this);
        } 

    } 

}
