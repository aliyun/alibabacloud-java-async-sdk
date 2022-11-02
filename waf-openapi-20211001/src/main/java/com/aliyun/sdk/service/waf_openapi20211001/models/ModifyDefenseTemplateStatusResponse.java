// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseTemplateStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyDefenseTemplateStatusResponse</p>
 */
public class ModifyDefenseTemplateStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDefenseTemplateStatusResponseBody body;

    private ModifyDefenseTemplateStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDefenseTemplateStatusResponse create() {
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
    public ModifyDefenseTemplateStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDefenseTemplateStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDefenseTemplateStatusResponseBody body);

        @Override
        ModifyDefenseTemplateStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDefenseTemplateStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDefenseTemplateStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDefenseTemplateStatusResponse response) {
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
        public Builder body(ModifyDefenseTemplateStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDefenseTemplateStatusResponse build() {
            return new ModifyDefenseTemplateStatusResponse(this);
        } 

    } 

}
