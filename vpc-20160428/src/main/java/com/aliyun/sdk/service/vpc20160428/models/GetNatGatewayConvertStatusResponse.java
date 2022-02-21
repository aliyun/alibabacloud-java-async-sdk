// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatGatewayConvertStatusResponse} extends {@link TeaModel}
 *
 * <p>GetNatGatewayConvertStatusResponse</p>
 */
public class GetNatGatewayConvertStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNatGatewayConvertStatusResponseBody body;

    private GetNatGatewayConvertStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNatGatewayConvertStatusResponse create() {
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
    public GetNatGatewayConvertStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNatGatewayConvertStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNatGatewayConvertStatusResponseBody body);

        @Override
        GetNatGatewayConvertStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNatGatewayConvertStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNatGatewayConvertStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNatGatewayConvertStatusResponse response) {
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
        public Builder body(GetNatGatewayConvertStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNatGatewayConvertStatusResponse build() {
            return new GetNatGatewayConvertStatusResponse(this);
        } 

    } 

}
