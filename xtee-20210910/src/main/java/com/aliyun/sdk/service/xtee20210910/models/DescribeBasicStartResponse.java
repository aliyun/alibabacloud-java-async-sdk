// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBasicStartResponse} extends {@link TeaModel}
 *
 * <p>DescribeBasicStartResponse</p>
 */
public class DescribeBasicStartResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeBasicStartResponseBody body;

    private DescribeBasicStartResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeBasicStartResponse create() {
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
    public DescribeBasicStartResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBasicStartResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeBasicStartResponseBody body);

        @Override
        DescribeBasicStartResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBasicStartResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeBasicStartResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBasicStartResponse response) {
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
        public Builder body(DescribeBasicStartResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBasicStartResponse build() {
            return new DescribeBasicStartResponse(this);
        } 

    } 

}
