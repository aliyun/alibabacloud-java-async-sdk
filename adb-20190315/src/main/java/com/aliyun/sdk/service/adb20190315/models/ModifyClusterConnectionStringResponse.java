// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterConnectionStringResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterConnectionStringResponse</p>
 */
public class ModifyClusterConnectionStringResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterConnectionStringResponseBody body;

    private ModifyClusterConnectionStringResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterConnectionStringResponse create() {
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
    public ModifyClusterConnectionStringResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterConnectionStringResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterConnectionStringResponseBody body);

        @Override
        ModifyClusterConnectionStringResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterConnectionStringResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterConnectionStringResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterConnectionStringResponse response) {
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
        public Builder body(ModifyClusterConnectionStringResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterConnectionStringResponse build() {
            return new ModifyClusterConnectionStringResponse(this);
        } 

    } 

}
