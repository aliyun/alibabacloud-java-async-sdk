// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterVideoResourceResponse} extends {@link TeaModel}
 *
 * <p>ModifyCasterVideoResourceResponse</p>
 */
public class ModifyCasterVideoResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCasterVideoResourceResponseBody body;

    private ModifyCasterVideoResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCasterVideoResourceResponse create() {
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
    public ModifyCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCasterVideoResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCasterVideoResourceResponseBody body);

        @Override
        ModifyCasterVideoResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCasterVideoResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCasterVideoResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCasterVideoResourceResponse response) {
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
        public Builder body(ModifyCasterVideoResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCasterVideoResourceResponse build() {
            return new ModifyCasterVideoResourceResponse(this);
        } 

    } 

}
