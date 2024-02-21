// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteServicesInCenResponse} extends {@link TeaModel}
 *
 * <p>DescribeRouteServicesInCenResponse</p>
 */
public class DescribeRouteServicesInCenResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeRouteServicesInCenResponseBody body;

    private DescribeRouteServicesInCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeRouteServicesInCenResponse create() {
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
    public DescribeRouteServicesInCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRouteServicesInCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeRouteServicesInCenResponseBody body);

        @Override
        DescribeRouteServicesInCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRouteServicesInCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeRouteServicesInCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRouteServicesInCenResponse response) {
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
        public Builder body(DescribeRouteServicesInCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRouteServicesInCenResponse build() {
            return new DescribeRouteServicesInCenResponse(this);
        } 

    } 

}
