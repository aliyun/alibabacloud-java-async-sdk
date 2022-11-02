// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateResourcesResponse} extends {@link TeaModel}
 *
 * <p>ModifyTemplateResourcesResponse</p>
 */
public class ModifyTemplateResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTemplateResourcesResponseBody body;

    private ModifyTemplateResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTemplateResourcesResponse create() {
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
    public ModifyTemplateResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTemplateResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTemplateResourcesResponseBody body);

        @Override
        ModifyTemplateResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTemplateResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTemplateResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTemplateResourcesResponse response) {
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
        public Builder body(ModifyTemplateResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTemplateResourcesResponse build() {
            return new ModifyTemplateResourcesResponse(this);
        } 

    } 

}
