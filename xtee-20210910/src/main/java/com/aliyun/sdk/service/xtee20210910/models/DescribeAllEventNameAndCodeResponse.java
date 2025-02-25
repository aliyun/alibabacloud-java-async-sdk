// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEventNameAndCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeAllEventNameAndCodeResponse</p>
 */
public class DescribeAllEventNameAndCodeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAllEventNameAndCodeResponseBody body;

    private DescribeAllEventNameAndCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAllEventNameAndCodeResponse create() {
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
    public DescribeAllEventNameAndCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAllEventNameAndCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAllEventNameAndCodeResponseBody body);

        @Override
        DescribeAllEventNameAndCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAllEventNameAndCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAllEventNameAndCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAllEventNameAndCodeResponse response) {
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
        public Builder body(DescribeAllEventNameAndCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAllEventNameAndCodeResponse build() {
            return new DescribeAllEventNameAndCodeResponse(this);
        } 

    } 

}
