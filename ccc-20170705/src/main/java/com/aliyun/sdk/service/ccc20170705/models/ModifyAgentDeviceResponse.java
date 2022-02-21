// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAgentDeviceResponse} extends {@link TeaModel}
 *
 * <p>ModifyAgentDeviceResponse</p>
 */
public class ModifyAgentDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAgentDeviceResponseBody body;

    private ModifyAgentDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAgentDeviceResponse create() {
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
    public ModifyAgentDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAgentDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAgentDeviceResponseBody body);

        @Override
        ModifyAgentDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAgentDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAgentDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAgentDeviceResponse response) {
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
        public Builder body(ModifyAgentDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAgentDeviceResponse build() {
            return new ModifyAgentDeviceResponse(this);
        } 

    } 

}
