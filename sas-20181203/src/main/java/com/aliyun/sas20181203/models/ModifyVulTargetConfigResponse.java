// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulTargetConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyVulTargetConfigResponse</p>
 */
public class ModifyVulTargetConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVulTargetConfigResponseBody body;

    private ModifyVulTargetConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVulTargetConfigResponse create() {
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
    public ModifyVulTargetConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVulTargetConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVulTargetConfigResponseBody body);

        @Override
        ModifyVulTargetConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVulTargetConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVulTargetConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVulTargetConfigResponse response) {
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
        public Builder body(ModifyVulTargetConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVulTargetConfigResponse build() {
            return new ModifyVulTargetConfigResponse(this);
        } 

    } 

}
