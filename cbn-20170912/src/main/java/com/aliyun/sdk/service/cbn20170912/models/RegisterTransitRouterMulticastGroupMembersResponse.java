// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegisterTransitRouterMulticastGroupMembersResponse} extends {@link TeaModel}
 *
 * <p>RegisterTransitRouterMulticastGroupMembersResponse</p>
 */
public class RegisterTransitRouterMulticastGroupMembersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RegisterTransitRouterMulticastGroupMembersResponseBody body;

    private RegisterTransitRouterMulticastGroupMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RegisterTransitRouterMulticastGroupMembersResponse create() {
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
    public RegisterTransitRouterMulticastGroupMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterTransitRouterMulticastGroupMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RegisterTransitRouterMulticastGroupMembersResponseBody body);

        @Override
        RegisterTransitRouterMulticastGroupMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterTransitRouterMulticastGroupMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RegisterTransitRouterMulticastGroupMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterTransitRouterMulticastGroupMembersResponse response) {
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
        public Builder body(RegisterTransitRouterMulticastGroupMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterTransitRouterMulticastGroupMembersResponse build() {
            return new RegisterTransitRouterMulticastGroupMembersResponse(this);
        } 

    } 

}
