// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppResponse} extends {@link TeaModel}
 *
 * <p>ModifyAppResponse</p>
 */
public class ModifyAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ModifyAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ModifyAppResponse create() {
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

    public interface Builder extends Response.Builder<ModifyAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ModifyAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAppResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public ModifyAppResponse build() {
            return new ModifyAppResponse(this);
        } 

    } 

}
