// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupConfigurationResponse} extends {@link TeaModel}
 *
 * <p>ModifySecurityGroupConfigurationResponse</p>
 */
public class ModifySecurityGroupConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySecurityGroupConfigurationResponseBody body;

    private ModifySecurityGroupConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySecurityGroupConfigurationResponse create() {
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
    public ModifySecurityGroupConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySecurityGroupConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySecurityGroupConfigurationResponseBody body);

        @Override
        ModifySecurityGroupConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySecurityGroupConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySecurityGroupConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySecurityGroupConfigurationResponse response) {
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
        public Builder body(ModifySecurityGroupConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySecurityGroupConfigurationResponse build() {
            return new ModifySecurityGroupConfigurationResponse(this);
        } 

    } 

}
