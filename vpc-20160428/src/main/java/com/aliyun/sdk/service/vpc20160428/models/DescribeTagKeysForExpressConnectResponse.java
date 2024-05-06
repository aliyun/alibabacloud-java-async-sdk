// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeysForExpressConnectResponse} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysForExpressConnectResponse</p>
 */
public class DescribeTagKeysForExpressConnectResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeTagKeysForExpressConnectResponseBody body;

    private DescribeTagKeysForExpressConnectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeTagKeysForExpressConnectResponse create() {
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
    public DescribeTagKeysForExpressConnectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTagKeysForExpressConnectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeTagKeysForExpressConnectResponseBody body);

        @Override
        DescribeTagKeysForExpressConnectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTagKeysForExpressConnectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeTagKeysForExpressConnectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTagKeysForExpressConnectResponse response) {
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
        public Builder body(DescribeTagKeysForExpressConnectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTagKeysForExpressConnectResponse build() {
            return new DescribeTagKeysForExpressConnectResponse(this);
        } 

    } 

}
