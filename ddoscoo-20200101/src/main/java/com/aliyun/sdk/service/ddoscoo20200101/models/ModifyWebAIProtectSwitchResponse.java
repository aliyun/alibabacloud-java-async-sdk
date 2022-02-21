// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAIProtectSwitchResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebAIProtectSwitchResponse</p>
 */
public class ModifyWebAIProtectSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebAIProtectSwitchResponseBody body;

    private ModifyWebAIProtectSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebAIProtectSwitchResponse create() {
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
    public ModifyWebAIProtectSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebAIProtectSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebAIProtectSwitchResponseBody body);

        @Override
        ModifyWebAIProtectSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebAIProtectSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebAIProtectSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebAIProtectSwitchResponse response) {
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
        public Builder body(ModifyWebAIProtectSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebAIProtectSwitchResponse build() {
            return new ModifyWebAIProtectSwitchResponse(this);
        } 

    } 

}
