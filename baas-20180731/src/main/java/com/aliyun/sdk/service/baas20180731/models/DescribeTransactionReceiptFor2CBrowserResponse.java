// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransactionReceiptFor2CBrowserResponse} extends {@link TeaModel}
 *
 * <p>DescribeTransactionReceiptFor2CBrowserResponse</p>
 */
public class DescribeTransactionReceiptFor2CBrowserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeTransactionReceiptFor2CBrowserResponseBody body;

    private DescribeTransactionReceiptFor2CBrowserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeTransactionReceiptFor2CBrowserResponse create() {
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
    public DescribeTransactionReceiptFor2CBrowserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTransactionReceiptFor2CBrowserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeTransactionReceiptFor2CBrowserResponseBody body);

        @Override
        DescribeTransactionReceiptFor2CBrowserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTransactionReceiptFor2CBrowserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeTransactionReceiptFor2CBrowserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTransactionReceiptFor2CBrowserResponse response) {
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
        public Builder body(DescribeTransactionReceiptFor2CBrowserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTransactionReceiptFor2CBrowserResponse build() {
            return new DescribeTransactionReceiptFor2CBrowserResponse(this);
        } 

    } 

}
