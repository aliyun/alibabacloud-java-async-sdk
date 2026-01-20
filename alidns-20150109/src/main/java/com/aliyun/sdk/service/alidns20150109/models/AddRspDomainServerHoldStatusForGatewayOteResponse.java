// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link AddRspDomainServerHoldStatusForGatewayOteResponse} extends {@link TeaModel}
 *
 * <p>AddRspDomainServerHoldStatusForGatewayOteResponse</p>
 */
public class AddRspDomainServerHoldStatusForGatewayOteResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddRspDomainServerHoldStatusForGatewayOteResponseBody body;

    private AddRspDomainServerHoldStatusForGatewayOteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddRspDomainServerHoldStatusForGatewayOteResponse create() {
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
    public AddRspDomainServerHoldStatusForGatewayOteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRspDomainServerHoldStatusForGatewayOteResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddRspDomainServerHoldStatusForGatewayOteResponseBody body);

        @Override
        AddRspDomainServerHoldStatusForGatewayOteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRspDomainServerHoldStatusForGatewayOteResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AddRspDomainServerHoldStatusForGatewayOteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRspDomainServerHoldStatusForGatewayOteResponse response) {
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
        public Builder body(AddRspDomainServerHoldStatusForGatewayOteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRspDomainServerHoldStatusForGatewayOteResponse build() {
            return new AddRspDomainServerHoldStatusForGatewayOteResponse(this);
        } 

    } 

}
