// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDialogueFlowResponse} extends {@link TeaModel}
 *
 * <p>ModifyDialogueFlowResponse</p>
 */
public class ModifyDialogueFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDialogueFlowResponseBody body;

    private ModifyDialogueFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDialogueFlowResponse create() {
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
    public ModifyDialogueFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDialogueFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDialogueFlowResponseBody body);

        @Override
        ModifyDialogueFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDialogueFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDialogueFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDialogueFlowResponse response) {
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
        public Builder body(ModifyDialogueFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDialogueFlowResponse build() {
            return new ModifyDialogueFlowResponse(this);
        } 

    } 

}
