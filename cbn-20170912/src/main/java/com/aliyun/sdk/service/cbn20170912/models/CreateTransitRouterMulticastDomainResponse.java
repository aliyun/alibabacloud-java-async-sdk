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
 * {@link CreateTransitRouterMulticastDomainResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterMulticastDomainResponse</p>
 */
public class CreateTransitRouterMulticastDomainResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateTransitRouterMulticastDomainResponseBody body;

    private CreateTransitRouterMulticastDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateTransitRouterMulticastDomainResponse create() {
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
    public CreateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTransitRouterMulticastDomainResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateTransitRouterMulticastDomainResponseBody body);

        @Override
        CreateTransitRouterMulticastDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTransitRouterMulticastDomainResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateTransitRouterMulticastDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTransitRouterMulticastDomainResponse response) {
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
        public Builder body(CreateTransitRouterMulticastDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTransitRouterMulticastDomainResponse build() {
            return new CreateTransitRouterMulticastDomainResponse(this);
        } 

    } 

}
