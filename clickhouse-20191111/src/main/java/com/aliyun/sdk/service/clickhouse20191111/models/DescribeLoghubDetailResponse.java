// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoghubDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeLoghubDetailResponse</p>
 */
public class DescribeLoghubDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLoghubDetailResponseBody body;

    private DescribeLoghubDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLoghubDetailResponse create() {
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
    public DescribeLoghubDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLoghubDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLoghubDetailResponseBody body);

        @Override
        DescribeLoghubDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLoghubDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLoghubDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLoghubDetailResponse response) {
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
        public Builder body(DescribeLoghubDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLoghubDetailResponse build() {
            return new DescribeLoghubDetailResponse(this);
        } 

    } 

}
