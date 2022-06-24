// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiConfigurationResponse} extends {@link TeaModel}
 *
 * <p>ModifyApiConfigurationResponse</p>
 */
public class ModifyApiConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApiConfigurationResponseBody body;

    private ModifyApiConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApiConfigurationResponse create() {
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
    public ModifyApiConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApiConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApiConfigurationResponseBody body);

        @Override
        ModifyApiConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApiConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApiConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApiConfigurationResponse response) {
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
        public Builder body(ModifyApiConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApiConfigurationResponse build() {
            return new ModifyApiConfigurationResponse(this);
        } 

    } 

}
