// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsRegionIdIpv6InfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoResponse</p>
 */
public class DescribeEnsRegionIdIpv6InfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeEnsRegionIdIpv6InfoResponseBody body;

    private DescribeEnsRegionIdIpv6InfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeEnsRegionIdIpv6InfoResponse create() {
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
    public DescribeEnsRegionIdIpv6InfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsRegionIdIpv6InfoResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeEnsRegionIdIpv6InfoResponseBody body);

        @Override
        DescribeEnsRegionIdIpv6InfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsRegionIdIpv6InfoResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeEnsRegionIdIpv6InfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsRegionIdIpv6InfoResponse response) {
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
        public Builder body(DescribeEnsRegionIdIpv6InfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsRegionIdIpv6InfoResponse build() {
            return new DescribeEnsRegionIdIpv6InfoResponse(this);
        } 

    } 

}
