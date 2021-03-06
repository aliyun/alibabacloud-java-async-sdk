// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterConfigResponse</p>
 */
public class ModifyDBClusterConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBClusterConfigResponseBody body;

    private ModifyDBClusterConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBClusterConfigResponse create() {
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
    public ModifyDBClusterConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBClusterConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBClusterConfigResponseBody body);

        @Override
        ModifyDBClusterConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBClusterConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBClusterConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBClusterConfigResponse response) {
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
        public Builder body(ModifyDBClusterConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBClusterConfigResponse build() {
            return new ModifyDBClusterConfigResponse(this);
        } 

    } 

}
