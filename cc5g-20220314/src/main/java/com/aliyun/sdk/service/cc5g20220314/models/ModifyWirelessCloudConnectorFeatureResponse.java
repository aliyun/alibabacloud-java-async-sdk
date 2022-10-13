// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWirelessCloudConnectorFeatureResponse} extends {@link TeaModel}
 *
 * <p>ModifyWirelessCloudConnectorFeatureResponse</p>
 */
public class ModifyWirelessCloudConnectorFeatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWirelessCloudConnectorFeatureResponseBody body;

    private ModifyWirelessCloudConnectorFeatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWirelessCloudConnectorFeatureResponse create() {
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
    public ModifyWirelessCloudConnectorFeatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWirelessCloudConnectorFeatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWirelessCloudConnectorFeatureResponseBody body);

        @Override
        ModifyWirelessCloudConnectorFeatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWirelessCloudConnectorFeatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWirelessCloudConnectorFeatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWirelessCloudConnectorFeatureResponse response) {
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
        public Builder body(ModifyWirelessCloudConnectorFeatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWirelessCloudConnectorFeatureResponse build() {
            return new ModifyWirelessCloudConnectorFeatureResponse(this);
        } 

    } 

}
