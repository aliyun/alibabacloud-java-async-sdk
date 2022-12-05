// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterServerlessConfResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterServerlessConfResponse</p>
 */
public class ModifyDBClusterServerlessConfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBClusterServerlessConfResponseBody body;

    private ModifyDBClusterServerlessConfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBClusterServerlessConfResponse create() {
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
    public ModifyDBClusterServerlessConfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBClusterServerlessConfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBClusterServerlessConfResponseBody body);

        @Override
        ModifyDBClusterServerlessConfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBClusterServerlessConfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBClusterServerlessConfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBClusterServerlessConfResponse response) {
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
        public Builder body(ModifyDBClusterServerlessConfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBClusterServerlessConfResponse build() {
            return new ModifyDBClusterServerlessConfResponse(this);
        } 

    } 

}
