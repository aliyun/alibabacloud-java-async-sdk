// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowProjectResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowProjectResponse</p>
 */
public class ModifyFlowProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowProjectResponseBody body;

    private ModifyFlowProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowProjectResponse create() {
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
    public ModifyFlowProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowProjectResponseBody body);

        @Override
        ModifyFlowProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowProjectResponse response) {
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
        public Builder body(ModifyFlowProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowProjectResponse build() {
            return new ModifyFlowProjectResponse(this);
        } 

    } 

}
