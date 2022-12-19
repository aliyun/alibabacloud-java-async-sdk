// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulWhitelistTargetResponse} extends {@link TeaModel}
 *
 * <p>ModifyVulWhitelistTargetResponse</p>
 */
public class ModifyVulWhitelistTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVulWhitelistTargetResponseBody body;

    private ModifyVulWhitelistTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVulWhitelistTargetResponse create() {
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
    public ModifyVulWhitelistTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVulWhitelistTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVulWhitelistTargetResponseBody body);

        @Override
        ModifyVulWhitelistTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVulWhitelistTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVulWhitelistTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVulWhitelistTargetResponse response) {
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
        public Builder body(ModifyVulWhitelistTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVulWhitelistTargetResponse build() {
            return new ModifyVulWhitelistTargetResponse(this);
        } 

    } 

}
