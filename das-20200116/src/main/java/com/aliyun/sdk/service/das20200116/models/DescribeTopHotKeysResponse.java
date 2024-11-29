// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTopHotKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeTopHotKeysResponse</p>
 */
public class DescribeTopHotKeysResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeTopHotKeysResponseBody body;

    private DescribeTopHotKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeTopHotKeysResponse create() {
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
    public DescribeTopHotKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTopHotKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeTopHotKeysResponseBody body);

        @Override
        DescribeTopHotKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTopHotKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeTopHotKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTopHotKeysResponse response) {
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
        public Builder body(DescribeTopHotKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTopHotKeysResponse build() {
            return new DescribeTopHotKeysResponse(this);
        } 

    } 

}
