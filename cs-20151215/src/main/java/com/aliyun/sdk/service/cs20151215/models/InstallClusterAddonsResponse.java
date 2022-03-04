// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallClusterAddonsResponse} extends {@link TeaModel}
 *
 * <p>InstallClusterAddonsResponse</p>
 */
public class InstallClusterAddonsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private InstallClusterAddonsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static InstallClusterAddonsResponse create() {
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

    public interface Builder extends Response.Builder<InstallClusterAddonsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        InstallClusterAddonsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallClusterAddonsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallClusterAddonsResponse response) {
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
        public InstallClusterAddonsResponse build() {
            return new InstallClusterAddonsResponse(this);
        } 

    } 

}
