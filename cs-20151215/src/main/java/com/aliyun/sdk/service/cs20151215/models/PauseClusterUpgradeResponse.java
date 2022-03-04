// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseClusterUpgradeResponse} extends {@link TeaModel}
 *
 * <p>PauseClusterUpgradeResponse</p>
 */
public class PauseClusterUpgradeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private PauseClusterUpgradeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static PauseClusterUpgradeResponse create() {
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

    public interface Builder extends Response.Builder<PauseClusterUpgradeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        PauseClusterUpgradeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PauseClusterUpgradeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PauseClusterUpgradeResponse response) {
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
        public PauseClusterUpgradeResponse build() {
            return new PauseClusterUpgradeResponse(this);
        } 

    } 

}
