// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointTrafficPoliciesResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointTrafficPoliciesResponse</p>
 */
public class UpdateCustomRoutingEndpointTrafficPoliciesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body;

    private UpdateCustomRoutingEndpointTrafficPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateCustomRoutingEndpointTrafficPoliciesResponse create() {
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
    public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomRoutingEndpointTrafficPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body);

        @Override
        UpdateCustomRoutingEndpointTrafficPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomRoutingEndpointTrafficPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomRoutingEndpointTrafficPoliciesResponse response) {
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
        public Builder body(UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomRoutingEndpointTrafficPoliciesResponse build() {
            return new UpdateCustomRoutingEndpointTrafficPoliciesResponse(this);
        } 

    } 

}
