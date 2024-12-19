// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link AddZoneToVpcEndpointResponse} extends {@link TeaModel}
 *
 * <p>AddZoneToVpcEndpointResponse</p>
 */
public class AddZoneToVpcEndpointResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddZoneToVpcEndpointResponseBody body;

    private AddZoneToVpcEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddZoneToVpcEndpointResponse create() {
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
    public AddZoneToVpcEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddZoneToVpcEndpointResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddZoneToVpcEndpointResponseBody body);

        @Override
        AddZoneToVpcEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddZoneToVpcEndpointResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AddZoneToVpcEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddZoneToVpcEndpointResponse response) {
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
        public Builder body(AddZoneToVpcEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddZoneToVpcEndpointResponse build() {
            return new AddZoneToVpcEndpointResponse(this);
        } 

    } 

}
