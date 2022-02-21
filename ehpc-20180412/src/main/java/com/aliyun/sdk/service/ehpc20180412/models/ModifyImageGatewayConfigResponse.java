// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageGatewayConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyImageGatewayConfigResponse</p>
 */
public class ModifyImageGatewayConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyImageGatewayConfigResponseBody body;

    private ModifyImageGatewayConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyImageGatewayConfigResponse create() {
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
    public ModifyImageGatewayConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyImageGatewayConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyImageGatewayConfigResponseBody body);

        @Override
        ModifyImageGatewayConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyImageGatewayConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyImageGatewayConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyImageGatewayConfigResponse response) {
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
        public Builder body(ModifyImageGatewayConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyImageGatewayConfigResponse build() {
            return new ModifyImageGatewayConfigResponse(this);
        } 

    } 

}
