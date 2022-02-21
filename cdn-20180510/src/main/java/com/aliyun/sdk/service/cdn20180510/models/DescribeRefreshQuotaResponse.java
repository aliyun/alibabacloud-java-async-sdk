// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRefreshQuotaResponse} extends {@link TeaModel}
 *
 * <p>DescribeRefreshQuotaResponse</p>
 */
public class DescribeRefreshQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRefreshQuotaResponseBody body;

    private DescribeRefreshQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRefreshQuotaResponse create() {
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
    public DescribeRefreshQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRefreshQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRefreshQuotaResponseBody body);

        @Override
        DescribeRefreshQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRefreshQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRefreshQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRefreshQuotaResponse response) {
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
        public Builder body(DescribeRefreshQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRefreshQuotaResponse build() {
            return new DescribeRefreshQuotaResponse(this);
        } 

    } 

}
