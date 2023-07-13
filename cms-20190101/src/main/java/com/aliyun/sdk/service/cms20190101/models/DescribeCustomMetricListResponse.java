// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomMetricListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomMetricListResponse</p>
 */
public class DescribeCustomMetricListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomMetricListResponseBody body;

    private DescribeCustomMetricListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomMetricListResponse create() {
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
    public DescribeCustomMetricListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomMetricListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomMetricListResponseBody body);

        @Override
        DescribeCustomMetricListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomMetricListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomMetricListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomMetricListResponse response) {
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
        public Builder body(DescribeCustomMetricListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomMetricListResponse build() {
            return new DescribeCustomMetricListResponse(this);
        } 

    } 

}
