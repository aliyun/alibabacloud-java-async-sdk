// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterComponentResponse} extends {@link TeaModel}
 *
 * <p>ModifyCasterComponentResponse</p>
 */
public class ModifyCasterComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCasterComponentResponseBody body;

    private ModifyCasterComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCasterComponentResponse create() {
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
    public ModifyCasterComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCasterComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCasterComponentResponseBody body);

        @Override
        ModifyCasterComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCasterComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCasterComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCasterComponentResponse response) {
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
        public Builder body(ModifyCasterComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCasterComponentResponse build() {
            return new ModifyCasterComponentResponse(this);
        } 

    } 

}
