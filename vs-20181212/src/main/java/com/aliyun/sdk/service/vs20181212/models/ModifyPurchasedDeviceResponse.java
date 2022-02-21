// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPurchasedDeviceResponse} extends {@link TeaModel}
 *
 * <p>ModifyPurchasedDeviceResponse</p>
 */
public class ModifyPurchasedDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPurchasedDeviceResponseBody body;

    private ModifyPurchasedDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPurchasedDeviceResponse create() {
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
    public ModifyPurchasedDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPurchasedDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPurchasedDeviceResponseBody body);

        @Override
        ModifyPurchasedDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPurchasedDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPurchasedDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPurchasedDeviceResponse response) {
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
        public Builder body(ModifyPurchasedDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPurchasedDeviceResponse build() {
            return new ModifyPurchasedDeviceResponse(this);
        } 

    } 

}
