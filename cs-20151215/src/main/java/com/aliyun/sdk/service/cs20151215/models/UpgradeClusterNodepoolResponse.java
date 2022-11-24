// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterNodepoolResponse} extends {@link TeaModel}
 *
 * <p>UpgradeClusterNodepoolResponse</p>
 */
public class UpgradeClusterNodepoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeClusterNodepoolResponseBody body;

    private UpgradeClusterNodepoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeClusterNodepoolResponse create() {
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
    public UpgradeClusterNodepoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeClusterNodepoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeClusterNodepoolResponseBody body);

        @Override
        UpgradeClusterNodepoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeClusterNodepoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeClusterNodepoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeClusterNodepoolResponse response) {
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
        public Builder body(UpgradeClusterNodepoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeClusterNodepoolResponse build() {
            return new UpgradeClusterNodepoolResponse(this);
        } 

    } 

}
