// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterAddonResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterAddonResponse</p>
 */
public class ModifyClusterAddonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ModifyClusterAddonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ModifyClusterAddonResponse create() {
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

    public interface Builder extends Response.Builder<ModifyClusterAddonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ModifyClusterAddonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterAddonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterAddonResponse response) {
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
        public ModifyClusterAddonResponse build() {
            return new ModifyClusterAddonResponse(this);
        } 

    } 

}
