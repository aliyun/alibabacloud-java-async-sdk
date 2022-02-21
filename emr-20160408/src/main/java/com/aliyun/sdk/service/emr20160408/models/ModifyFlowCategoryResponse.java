// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowCategoryResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowCategoryResponse</p>
 */
public class ModifyFlowCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowCategoryResponseBody body;

    private ModifyFlowCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowCategoryResponse create() {
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
    public ModifyFlowCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowCategoryResponseBody body);

        @Override
        ModifyFlowCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowCategoryResponse response) {
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
        public Builder body(ModifyFlowCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowCategoryResponse build() {
            return new ModifyFlowCategoryResponse(this);
        } 

    } 

}
