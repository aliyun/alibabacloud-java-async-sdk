// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterOfflineConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterOfflineConfigResponse</p>
 */
public class ModifyClusterOfflineConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterOfflineConfigResponseBody body;

    private ModifyClusterOfflineConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterOfflineConfigResponse create() {
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
    public ModifyClusterOfflineConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterOfflineConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterOfflineConfigResponseBody body);

        @Override
        ModifyClusterOfflineConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterOfflineConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterOfflineConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterOfflineConfigResponse response) {
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
        public Builder body(ModifyClusterOfflineConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterOfflineConfigResponse build() {
            return new ModifyClusterOfflineConfigResponse(this);
        } 

    } 

}
