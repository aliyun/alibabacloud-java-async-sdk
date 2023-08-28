// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterDescResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterDescResponse</p>
 */
public class ModifyClusterDescResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterDescResponseBody body;

    private ModifyClusterDescResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterDescResponse create() {
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
    public ModifyClusterDescResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterDescResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterDescResponseBody body);

        @Override
        ModifyClusterDescResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterDescResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterDescResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterDescResponse response) {
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
        public Builder body(ModifyClusterDescResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterDescResponse build() {
            return new ModifyClusterDescResponse(this);
        } 

    } 

}
