// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterOnlineConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterOnlineConfigResponse</p>
 */
public class ModifyClusterOnlineConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterOnlineConfigResponseBody body;

    private ModifyClusterOnlineConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterOnlineConfigResponse create() {
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
    public ModifyClusterOnlineConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterOnlineConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterOnlineConfigResponseBody body);

        @Override
        ModifyClusterOnlineConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterOnlineConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterOnlineConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterOnlineConfigResponse response) {
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
        public Builder body(ModifyClusterOnlineConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterOnlineConfigResponse build() {
            return new ModifyClusterOnlineConfigResponse(this);
        } 

    } 

}
