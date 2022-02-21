// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowResponse</p>
 */
public class ModifyFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowResponseBody body;

    private ModifyFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowResponse create() {
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
    public ModifyFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowResponseBody body);

        @Override
        ModifyFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowResponse response) {
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
        public Builder body(ModifyFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowResponse build() {
            return new ModifyFlowResponse(this);
        } 

    } 

}
