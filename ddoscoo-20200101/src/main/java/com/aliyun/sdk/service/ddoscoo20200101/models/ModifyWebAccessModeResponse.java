// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAccessModeResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebAccessModeResponse</p>
 */
public class ModifyWebAccessModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebAccessModeResponseBody body;

    private ModifyWebAccessModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebAccessModeResponse create() {
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
    public ModifyWebAccessModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebAccessModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebAccessModeResponseBody body);

        @Override
        ModifyWebAccessModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebAccessModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebAccessModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebAccessModeResponse response) {
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
        public Builder body(ModifyWebAccessModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebAccessModeResponse build() {
            return new ModifyWebAccessModeResponse(this);
        } 

    } 

}
