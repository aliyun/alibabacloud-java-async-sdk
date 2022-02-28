// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageStatisticsResponse</p>
 */
public class DescribeImageStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageStatisticsResponseBody body;

    private DescribeImageStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageStatisticsResponse create() {
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
    public DescribeImageStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageStatisticsResponseBody body);

        @Override
        DescribeImageStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageStatisticsResponse response) {
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
        public Builder body(DescribeImageStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageStatisticsResponse build() {
            return new DescribeImageStatisticsResponse(this);
        } 

    } 

}
