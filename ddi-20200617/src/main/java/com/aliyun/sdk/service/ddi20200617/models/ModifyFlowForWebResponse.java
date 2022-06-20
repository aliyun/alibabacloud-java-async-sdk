// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowForWebResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowForWebResponse</p>
 */
public class ModifyFlowForWebResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowForWebResponseBody body;

    private ModifyFlowForWebResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowForWebResponse create() {
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
    public ModifyFlowForWebResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowForWebResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowForWebResponseBody body);

        @Override
        ModifyFlowForWebResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowForWebResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowForWebResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowForWebResponse response) {
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
        public Builder body(ModifyFlowForWebResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowForWebResponse build() {
            return new ModifyFlowForWebResponse(this);
        } 

    } 

}
