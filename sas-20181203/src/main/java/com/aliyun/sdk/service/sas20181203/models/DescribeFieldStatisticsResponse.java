// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFieldStatisticsResponse</p>
 */
public class DescribeFieldStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFieldStatisticsResponseBody body;

    private DescribeFieldStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFieldStatisticsResponse create() {
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
    public DescribeFieldStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFieldStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFieldStatisticsResponseBody body);

        @Override
        DescribeFieldStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFieldStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFieldStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFieldStatisticsResponse response) {
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
        public Builder body(DescribeFieldStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFieldStatisticsResponse build() {
            return new DescribeFieldStatisticsResponse(this);
        } 

    } 

}
