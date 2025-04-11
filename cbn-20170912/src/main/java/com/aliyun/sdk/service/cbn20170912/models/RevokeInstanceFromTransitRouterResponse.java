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
 * {@link RevokeInstanceFromTransitRouterResponse} extends {@link TeaModel}
 *
 * <p>RevokeInstanceFromTransitRouterResponse</p>
 */
public class RevokeInstanceFromTransitRouterResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeInstanceFromTransitRouterResponseBody body;

    private RevokeInstanceFromTransitRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokeInstanceFromTransitRouterResponse create() {
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
    public RevokeInstanceFromTransitRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeInstanceFromTransitRouterResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokeInstanceFromTransitRouterResponseBody body);

        @Override
        RevokeInstanceFromTransitRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeInstanceFromTransitRouterResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RevokeInstanceFromTransitRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeInstanceFromTransitRouterResponse response) {
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
        public Builder body(RevokeInstanceFromTransitRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeInstanceFromTransitRouterResponse build() {
            return new RevokeInstanceFromTransitRouterResponse(this);
        } 

    } 

}
