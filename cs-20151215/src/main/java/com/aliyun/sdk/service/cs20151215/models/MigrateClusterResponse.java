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

    private MigrateClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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

    public interface Builder extends Response.Builder<MigrateClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        MigrateClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateClusterResponse response) {
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
        public MigrateClusterResponse build() {
            return new MigrateClusterResponse(this);
        } 

    } 

}
