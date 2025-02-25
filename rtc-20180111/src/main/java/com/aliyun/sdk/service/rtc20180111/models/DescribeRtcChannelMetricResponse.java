// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRtcChannelMetricResponse} extends {@link TeaModel}
 *
 * <p>DescribeRtcChannelMetricResponse</p>
 */
public class DescribeRtcChannelMetricResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeRtcChannelMetricResponseBody body;

    private DescribeRtcChannelMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeRtcChannelMetricResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public DescribeRtcChannelMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRtcChannelMetricResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeRtcChannelMetricResponseBody body);

        @Override
        DescribeRtcChannelMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRtcChannelMetricResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeRtcChannelMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRtcChannelMetricResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(DescribeRtcChannelMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRtcChannelMetricResponse build() {
            return new DescribeRtcChannelMetricResponse(this);
        } 

    } 

}
