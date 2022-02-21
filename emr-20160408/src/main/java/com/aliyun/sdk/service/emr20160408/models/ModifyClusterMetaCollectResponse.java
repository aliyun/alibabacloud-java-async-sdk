// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterMetaCollectResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterMetaCollectResponse</p>
 */
public class ModifyClusterMetaCollectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterMetaCollectResponseBody body;

    private ModifyClusterMetaCollectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterMetaCollectResponse create() {
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
    public ModifyClusterMetaCollectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterMetaCollectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterMetaCollectResponseBody body);

        @Override
        ModifyClusterMetaCollectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterMetaCollectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterMetaCollectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterMetaCollectResponse response) {
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
        public Builder body(ModifyClusterMetaCollectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterMetaCollectResponse build() {
            return new ModifyClusterMetaCollectResponse(this);
        } 

    } 

}
