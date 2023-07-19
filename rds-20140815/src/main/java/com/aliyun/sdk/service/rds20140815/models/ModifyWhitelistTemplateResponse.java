// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWhitelistTemplateResponse} extends {@link TeaModel}
 *
 * <p>ModifyWhitelistTemplateResponse</p>
 */
public class ModifyWhitelistTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWhitelistTemplateResponseBody body;

    private ModifyWhitelistTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWhitelistTemplateResponse create() {
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
    public ModifyWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWhitelistTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWhitelistTemplateResponseBody body);

        @Override
        ModifyWhitelistTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWhitelistTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWhitelistTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWhitelistTemplateResponse response) {
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
        public Builder body(ModifyWhitelistTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWhitelistTemplateResponse build() {
            return new ModifyWhitelistTemplateResponse(this);
        } 

    } 

}
