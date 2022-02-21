// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserCustomLogConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserCustomLogConfigResponse</p>
 */
public class ModifyUserCustomLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserCustomLogConfigResponseBody body;

    private ModifyUserCustomLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserCustomLogConfigResponse create() {
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
    public ModifyUserCustomLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserCustomLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserCustomLogConfigResponseBody body);

        @Override
        ModifyUserCustomLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserCustomLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserCustomLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserCustomLogConfigResponse response) {
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
        public Builder body(ModifyUserCustomLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserCustomLogConfigResponse build() {
            return new ModifyUserCustomLogConfigResponse(this);
        } 

    } 

}
