// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeployMachineResponse} extends {@link TeaModel}
 *
 * <p>ModifyDeployMachineResponse</p>
 */
public class ModifyDeployMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDeployMachineResponseBody body;

    private ModifyDeployMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDeployMachineResponse create() {
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
    public ModifyDeployMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDeployMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDeployMachineResponseBody body);

        @Override
        ModifyDeployMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDeployMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDeployMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDeployMachineResponse response) {
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
        public Builder body(ModifyDeployMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDeployMachineResponse build() {
            return new ModifyDeployMachineResponse(this);
        } 

    } 

}
