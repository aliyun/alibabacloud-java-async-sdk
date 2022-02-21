// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataFlowResponse} extends {@link TeaModel}
 *
 * <p>ModifyDataFlowResponse</p>
 */
public class ModifyDataFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDataFlowResponseBody body;

    private ModifyDataFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDataFlowResponse create() {
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
    public ModifyDataFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDataFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDataFlowResponseBody body);

        @Override
        ModifyDataFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDataFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDataFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDataFlowResponse response) {
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
        public Builder body(ModifyDataFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDataFlowResponse build() {
            return new ModifyDataFlowResponse(this);
        } 

    } 

}
