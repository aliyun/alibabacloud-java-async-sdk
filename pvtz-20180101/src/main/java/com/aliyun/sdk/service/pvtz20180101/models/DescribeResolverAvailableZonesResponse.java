// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverAvailableZonesResponse} extends {@link TeaModel}
 *
 * <p>DescribeResolverAvailableZonesResponse</p>
 */
public class DescribeResolverAvailableZonesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeResolverAvailableZonesResponseBody body;

    private DescribeResolverAvailableZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeResolverAvailableZonesResponse create() {
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
    public DescribeResolverAvailableZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResolverAvailableZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeResolverAvailableZonesResponseBody body);

        @Override
        DescribeResolverAvailableZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResolverAvailableZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeResolverAvailableZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResolverAvailableZonesResponse response) {
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
        public Builder body(DescribeResolverAvailableZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResolverAvailableZonesResponse build() {
            return new DescribeResolverAvailableZonesResponse(this);
        } 

    } 

}
