// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiLatencyResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiLatencyResponse</p>
 */
public class DescribeApiLatencyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiLatencyResponseBody body;

    private DescribeApiLatencyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeApiLatencyResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeApiLatencyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiLatencyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeApiLatencyResponseBody body);

        @Override
        DescribeApiLatencyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiLatencyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeApiLatencyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiLatencyResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeApiLatencyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiLatencyResponse build() {
            return new DescribeApiLatencyResponse(this);
        } 

    } 

}
