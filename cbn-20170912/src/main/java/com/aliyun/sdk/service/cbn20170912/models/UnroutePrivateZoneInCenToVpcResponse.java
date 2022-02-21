// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnroutePrivateZoneInCenToVpcResponse} extends {@link TeaModel}
 *
 * <p>UnroutePrivateZoneInCenToVpcResponse</p>
 */
public class UnroutePrivateZoneInCenToVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnroutePrivateZoneInCenToVpcResponseBody body;

    private UnroutePrivateZoneInCenToVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnroutePrivateZoneInCenToVpcResponse create() {
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
    public UnroutePrivateZoneInCenToVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnroutePrivateZoneInCenToVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnroutePrivateZoneInCenToVpcResponseBody body);

        @Override
        UnroutePrivateZoneInCenToVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnroutePrivateZoneInCenToVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnroutePrivateZoneInCenToVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnroutePrivateZoneInCenToVpcResponse response) {
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
        public Builder body(UnroutePrivateZoneInCenToVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnroutePrivateZoneInCenToVpcResponse build() {
            return new UnroutePrivateZoneInCenToVpcResponse(this);
        } 

    } 

}
