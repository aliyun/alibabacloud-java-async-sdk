// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterTransitRouterMulticastGroupMembersResponse} extends {@link TeaModel}
 *
 * <p>RegisterTransitRouterMulticastGroupMembersResponse</p>
 */
public class RegisterTransitRouterMulticastGroupMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterTransitRouterMulticastGroupMembersResponseBody body;

    private RegisterTransitRouterMulticastGroupMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public RegisterTransitRouterMulticastGroupMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterTransitRouterMulticastGroupMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterTransitRouterMulticastGroupMembersResponseBody body);

        @Override
        RegisterTransitRouterMulticastGroupMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterTransitRouterMulticastGroupMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterTransitRouterMulticastGroupMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterTransitRouterMulticastGroupMembersResponse response) {
            super(response);
            this.headers = response.headers;
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
