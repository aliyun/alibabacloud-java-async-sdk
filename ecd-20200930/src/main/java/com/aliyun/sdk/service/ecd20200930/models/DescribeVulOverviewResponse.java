// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulOverviewResponse} extends {@link TeaModel}
 *
 * <p>DescribeVulOverviewResponse</p>
 */
public class DescribeVulOverviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVulOverviewResponseBody body;

    private DescribeVulOverviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVulOverviewResponse create() {
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
    public DescribeVulOverviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVulOverviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVulOverviewResponseBody body);

        @Override
        DescribeVulOverviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVulOverviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVulOverviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVulOverviewResponse response) {
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
        public Builder body(DescribeVulOverviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVulOverviewResponse build() {
            return new DescribeVulOverviewResponse(this);
        } 

    } 

}
