// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLaunchTemplateDefaultVersionResponse} extends {@link TeaModel}
 *
 * <p>ModifyLaunchTemplateDefaultVersionResponse</p>
 */
public class ModifyLaunchTemplateDefaultVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLaunchTemplateDefaultVersionResponseBody body;

    private ModifyLaunchTemplateDefaultVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLaunchTemplateDefaultVersionResponse create() {
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
    public ModifyLaunchTemplateDefaultVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLaunchTemplateDefaultVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLaunchTemplateDefaultVersionResponseBody body);

        @Override
        ModifyLaunchTemplateDefaultVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLaunchTemplateDefaultVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLaunchTemplateDefaultVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLaunchTemplateDefaultVersionResponse response) {
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
        public Builder body(ModifyLaunchTemplateDefaultVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLaunchTemplateDefaultVersionResponse build() {
            return new ModifyLaunchTemplateDefaultVersionResponse(this);
        } 

    } 

}
