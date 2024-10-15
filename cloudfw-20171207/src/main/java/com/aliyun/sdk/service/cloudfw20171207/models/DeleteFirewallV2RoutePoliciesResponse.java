// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFirewallV2RoutePoliciesResponse} extends {@link TeaModel}
 *
 * <p>DeleteFirewallV2RoutePoliciesResponse</p>
 */
public class DeleteFirewallV2RoutePoliciesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteFirewallV2RoutePoliciesResponseBody body;

    private DeleteFirewallV2RoutePoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteFirewallV2RoutePoliciesResponse create() {
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
    public DeleteFirewallV2RoutePoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFirewallV2RoutePoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteFirewallV2RoutePoliciesResponseBody body);

        @Override
        DeleteFirewallV2RoutePoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFirewallV2RoutePoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteFirewallV2RoutePoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFirewallV2RoutePoliciesResponse response) {
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
        public Builder body(DeleteFirewallV2RoutePoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFirewallV2RoutePoliciesResponse build() {
            return new DeleteFirewallV2RoutePoliciesResponse(this);
        } 

    } 

}
