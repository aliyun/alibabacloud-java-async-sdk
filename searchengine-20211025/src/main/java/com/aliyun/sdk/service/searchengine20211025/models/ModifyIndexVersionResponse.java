// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIndexVersionResponse} extends {@link TeaModel}
 *
 * <p>ModifyIndexVersionResponse</p>
 */
public class ModifyIndexVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIndexVersionResponseBody body;

    private ModifyIndexVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIndexVersionResponse create() {
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
    public ModifyIndexVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIndexVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIndexVersionResponseBody body);

        @Override
        ModifyIndexVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIndexVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIndexVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIndexVersionResponse response) {
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
        public Builder body(ModifyIndexVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIndexVersionResponse build() {
            return new ModifyIndexVersionResponse(this);
        } 

    } 

}
