// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableNatGatewayEcsMetricResponse} extends {@link TeaModel}
 *
 * <p>DisableNatGatewayEcsMetricResponse</p>
 */
public class DisableNatGatewayEcsMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableNatGatewayEcsMetricResponseBody body;

    private DisableNatGatewayEcsMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableNatGatewayEcsMetricResponse create() {
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
    public DisableNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableNatGatewayEcsMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableNatGatewayEcsMetricResponseBody body);

        @Override
        DisableNatGatewayEcsMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableNatGatewayEcsMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableNatGatewayEcsMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableNatGatewayEcsMetricResponse response) {
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
        public Builder body(DisableNatGatewayEcsMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableNatGatewayEcsMetricResponse build() {
            return new DisableNatGatewayEcsMetricResponse(this);
        } 

    } 

}
