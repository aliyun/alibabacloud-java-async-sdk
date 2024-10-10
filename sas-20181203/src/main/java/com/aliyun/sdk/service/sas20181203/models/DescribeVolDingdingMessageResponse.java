// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVolDingdingMessageResponse} extends {@link TeaModel}
 *
 * <p>DescribeVolDingdingMessageResponse</p>
 */
public class DescribeVolDingdingMessageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeVolDingdingMessageResponseBody body;

    private DescribeVolDingdingMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVolDingdingMessageResponse create() {
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
    public DescribeVolDingdingMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVolDingdingMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVolDingdingMessageResponseBody body);

        @Override
        DescribeVolDingdingMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVolDingdingMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeVolDingdingMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVolDingdingMessageResponse response) {
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
        public Builder body(DescribeVolDingdingMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVolDingdingMessageResponse build() {
            return new DescribeVolDingdingMessageResponse(this);
        } 

    } 

}
