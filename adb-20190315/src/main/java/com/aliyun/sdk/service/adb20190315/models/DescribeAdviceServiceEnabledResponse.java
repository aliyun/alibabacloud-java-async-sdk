// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAdviceServiceEnabledResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdviceServiceEnabledResponse</p>
 */
public class DescribeAdviceServiceEnabledResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAdviceServiceEnabledResponseBody body;

    private DescribeAdviceServiceEnabledResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAdviceServiceEnabledResponse create() {
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
    public DescribeAdviceServiceEnabledResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdviceServiceEnabledResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAdviceServiceEnabledResponseBody body);

        @Override
        DescribeAdviceServiceEnabledResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdviceServiceEnabledResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAdviceServiceEnabledResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdviceServiceEnabledResponse response) {
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
        public Builder body(DescribeAdviceServiceEnabledResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdviceServiceEnabledResponse build() {
            return new DescribeAdviceServiceEnabledResponse(this);
        } 

    } 

}
