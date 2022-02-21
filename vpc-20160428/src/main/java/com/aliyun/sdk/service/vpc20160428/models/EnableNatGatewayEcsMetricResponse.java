// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableNatGatewayEcsMetricResponse} extends {@link TeaModel}
 *
 * <p>EnableNatGatewayEcsMetricResponse</p>
 */
public class EnableNatGatewayEcsMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableNatGatewayEcsMetricResponseBody body;

    private EnableNatGatewayEcsMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableNatGatewayEcsMetricResponse create() {
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
    public EnableNatGatewayEcsMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableNatGatewayEcsMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableNatGatewayEcsMetricResponseBody body);

        @Override
        EnableNatGatewayEcsMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableNatGatewayEcsMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableNatGatewayEcsMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableNatGatewayEcsMetricResponse response) {
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
        public Builder body(EnableNatGatewayEcsMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableNatGatewayEcsMetricResponse build() {
            return new EnableNatGatewayEcsMetricResponse(this);
        } 

    } 

}
