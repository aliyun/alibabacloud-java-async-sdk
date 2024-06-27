// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorTaskLimitResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitorTaskLimitResponse</p>
 */
public class DescribeMonitorTaskLimitResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeMonitorTaskLimitResponseBody body;

    private DescribeMonitorTaskLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeMonitorTaskLimitResponse create() {
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
    public DescribeMonitorTaskLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitorTaskLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeMonitorTaskLimitResponseBody body);

        @Override
        DescribeMonitorTaskLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitorTaskLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeMonitorTaskLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitorTaskLimitResponse response) {
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
        public Builder body(DescribeMonitorTaskLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitorTaskLimitResponse build() {
            return new DescribeMonitorTaskLimitResponse(this);
        } 

    } 

}
