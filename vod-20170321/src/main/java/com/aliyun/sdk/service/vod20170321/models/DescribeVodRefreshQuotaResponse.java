// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodRefreshQuotaResponse} extends {@link TeaModel}
 *
 * <p>DescribeVodRefreshQuotaResponse</p>
 */
public class DescribeVodRefreshQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVodRefreshQuotaResponseBody body;

    private DescribeVodRefreshQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVodRefreshQuotaResponse create() {
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
    public DescribeVodRefreshQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVodRefreshQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVodRefreshQuotaResponseBody body);

        @Override
        DescribeVodRefreshQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVodRefreshQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVodRefreshQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVodRefreshQuotaResponse response) {
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
        public Builder body(DescribeVodRefreshQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVodRefreshQuotaResponse build() {
            return new DescribeVodRefreshQuotaResponse(this);
        } 

    } 

}
