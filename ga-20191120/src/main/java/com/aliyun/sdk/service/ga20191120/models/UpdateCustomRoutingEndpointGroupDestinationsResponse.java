// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointGroupDestinationsResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointGroupDestinationsResponse</p>
 */
public class UpdateCustomRoutingEndpointGroupDestinationsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCustomRoutingEndpointGroupDestinationsResponseBody body;

    private UpdateCustomRoutingEndpointGroupDestinationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateCustomRoutingEndpointGroupDestinationsResponse create() {
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
    public UpdateCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomRoutingEndpointGroupDestinationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateCustomRoutingEndpointGroupDestinationsResponseBody body);

        @Override
        UpdateCustomRoutingEndpointGroupDestinationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomRoutingEndpointGroupDestinationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateCustomRoutingEndpointGroupDestinationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomRoutingEndpointGroupDestinationsResponse response) {
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
        public Builder body(UpdateCustomRoutingEndpointGroupDestinationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomRoutingEndpointGroupDestinationsResponse build() {
            return new UpdateCustomRoutingEndpointGroupDestinationsResponse(this);
        } 

    } 

}
