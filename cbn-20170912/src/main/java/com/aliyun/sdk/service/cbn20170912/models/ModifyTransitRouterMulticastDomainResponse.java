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
 * {@link ModifyTransitRouterMulticastDomainResponse} extends {@link TeaModel}
 *
 * <p>ModifyTransitRouterMulticastDomainResponse</p>
 */
public class ModifyTransitRouterMulticastDomainResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyTransitRouterMulticastDomainResponseBody body;

    private ModifyTransitRouterMulticastDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyTransitRouterMulticastDomainResponse create() {
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
    public ModifyTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTransitRouterMulticastDomainResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyTransitRouterMulticastDomainResponseBody body);

        @Override
        ModifyTransitRouterMulticastDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTransitRouterMulticastDomainResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyTransitRouterMulticastDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTransitRouterMulticastDomainResponse response) {
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
        public Builder body(ModifyTransitRouterMulticastDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTransitRouterMulticastDomainResponse build() {
            return new ModifyTransitRouterMulticastDomainResponse(this);
        } 

    } 

}
