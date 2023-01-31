// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpnGatewayDiagnoseResultResponse} extends {@link TeaModel}
 *
 * <p>GetVpnGatewayDiagnoseResultResponse</p>
 */
public class GetVpnGatewayDiagnoseResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVpnGatewayDiagnoseResultResponseBody body;

    private GetVpnGatewayDiagnoseResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVpnGatewayDiagnoseResultResponse create() {
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
    public GetVpnGatewayDiagnoseResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVpnGatewayDiagnoseResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVpnGatewayDiagnoseResultResponseBody body);

        @Override
        GetVpnGatewayDiagnoseResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVpnGatewayDiagnoseResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVpnGatewayDiagnoseResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVpnGatewayDiagnoseResultResponse response) {
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
        public Builder body(GetVpnGatewayDiagnoseResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVpnGatewayDiagnoseResultResponse build() {
            return new GetVpnGatewayDiagnoseResultResponse(this);
        } 

    } 

}
