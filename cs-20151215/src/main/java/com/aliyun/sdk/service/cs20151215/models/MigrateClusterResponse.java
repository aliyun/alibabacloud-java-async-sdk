// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateClusterResponse} extends {@link TeaModel}
 *
 * <p>MigrateClusterResponse</p>
 */
public class MigrateClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateClusterResponseBody body;

    private MigrateClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateClusterResponse create() {
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
    public MigrateClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateClusterResponseBody body);

        @Override
        MigrateClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateClusterResponse response) {
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
        public Builder body(MigrateClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateClusterResponse build() {
            return new MigrateClusterResponse(this);
        } 

    } 

}
