// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DeregisterTransitRouterMulticastGroupSourcesResponse} extends {@link TeaModel}
 *
 * <p>DeregisterTransitRouterMulticastGroupSourcesResponse</p>
 */
public class DeregisterTransitRouterMulticastGroupSourcesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeregisterTransitRouterMulticastGroupSourcesResponseBody body;

    private DeregisterTransitRouterMulticastGroupSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeregisterTransitRouterMulticastGroupSourcesResponse create() {
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
    public DeregisterTransitRouterMulticastGroupSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterTransitRouterMulticastGroupSourcesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeregisterTransitRouterMulticastGroupSourcesResponseBody body);

        @Override
        DeregisterTransitRouterMulticastGroupSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterTransitRouterMulticastGroupSourcesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeregisterTransitRouterMulticastGroupSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterTransitRouterMulticastGroupSourcesResponse response) {
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
        public Builder body(DeregisterTransitRouterMulticastGroupSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterTransitRouterMulticastGroupSourcesResponse build() {
            return new DeregisterTransitRouterMulticastGroupSourcesResponse(this);
        } 

    } 

}
