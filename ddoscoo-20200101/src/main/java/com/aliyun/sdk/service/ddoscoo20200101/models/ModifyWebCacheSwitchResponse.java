// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCacheSwitchResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebCacheSwitchResponse</p>
 */
public class ModifyWebCacheSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebCacheSwitchResponseBody body;

    private ModifyWebCacheSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebCacheSwitchResponse create() {
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
    public ModifyWebCacheSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebCacheSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebCacheSwitchResponseBody body);

        @Override
        ModifyWebCacheSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebCacheSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebCacheSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebCacheSwitchResponse response) {
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
        public Builder body(ModifyWebCacheSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebCacheSwitchResponse build() {
            return new ModifyWebCacheSwitchResponse(this);
        } 

    } 

}
