// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceInstanceCertsResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceInstanceCertsResponse</p>
 */
public class DescribeResourceInstanceCertsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeResourceInstanceCertsResponseBody body;

    private DescribeResourceInstanceCertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeResourceInstanceCertsResponse create() {
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
    public DescribeResourceInstanceCertsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceInstanceCertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeResourceInstanceCertsResponseBody body);

        @Override
        DescribeResourceInstanceCertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceInstanceCertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeResourceInstanceCertsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceInstanceCertsResponse response) {
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
        public Builder body(DescribeResourceInstanceCertsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceInstanceCertsResponse build() {
            return new DescribeResourceInstanceCertsResponse(this);
        } 

    } 

}
