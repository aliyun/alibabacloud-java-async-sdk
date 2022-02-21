// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnhanhcedNatGatewayAvailableZonesResponse} extends {@link TeaModel}
 *
 * <p>ListEnhanhcedNatGatewayAvailableZonesResponse</p>
 */
public class ListEnhanhcedNatGatewayAvailableZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEnhanhcedNatGatewayAvailableZonesResponseBody body;

    private ListEnhanhcedNatGatewayAvailableZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEnhanhcedNatGatewayAvailableZonesResponse create() {
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
    public ListEnhanhcedNatGatewayAvailableZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnhanhcedNatGatewayAvailableZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEnhanhcedNatGatewayAvailableZonesResponseBody body);

        @Override
        ListEnhanhcedNatGatewayAvailableZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnhanhcedNatGatewayAvailableZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEnhanhcedNatGatewayAvailableZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnhanhcedNatGatewayAvailableZonesResponse response) {
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
        public Builder body(ListEnhanhcedNatGatewayAvailableZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnhanhcedNatGatewayAvailableZonesResponse build() {
            return new ListEnhanhcedNatGatewayAvailableZonesResponse(this);
        } 

    } 

}
