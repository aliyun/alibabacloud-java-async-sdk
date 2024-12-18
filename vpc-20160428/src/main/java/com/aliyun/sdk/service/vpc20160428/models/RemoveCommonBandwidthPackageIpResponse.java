// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link RemoveCommonBandwidthPackageIpResponse} extends {@link TeaModel}
 *
 * <p>RemoveCommonBandwidthPackageIpResponse</p>
 */
public class RemoveCommonBandwidthPackageIpResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RemoveCommonBandwidthPackageIpResponseBody body;

    private RemoveCommonBandwidthPackageIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RemoveCommonBandwidthPackageIpResponse create() {
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
    public RemoveCommonBandwidthPackageIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveCommonBandwidthPackageIpResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RemoveCommonBandwidthPackageIpResponseBody body);

        @Override
        RemoveCommonBandwidthPackageIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveCommonBandwidthPackageIpResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RemoveCommonBandwidthPackageIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveCommonBandwidthPackageIpResponse response) {
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
        public Builder body(RemoveCommonBandwidthPackageIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveCommonBandwidthPackageIpResponse build() {
            return new RemoveCommonBandwidthPackageIpResponse(this);
        } 

    } 

}
