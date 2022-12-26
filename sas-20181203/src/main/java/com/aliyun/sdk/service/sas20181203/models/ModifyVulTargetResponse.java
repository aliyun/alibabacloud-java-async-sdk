// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulTargetResponse} extends {@link TeaModel}
 *
 * <p>ModifyVulTargetResponse</p>
 */
public class ModifyVulTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVulTargetResponseBody body;

    private ModifyVulTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVulTargetResponse create() {
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
    public ModifyVulTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVulTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVulTargetResponseBody body);

        @Override
        ModifyVulTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVulTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVulTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVulTargetResponse response) {
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
        public Builder body(ModifyVulTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVulTargetResponse build() {
            return new ModifyVulTargetResponse(this);
        } 

    } 

}
