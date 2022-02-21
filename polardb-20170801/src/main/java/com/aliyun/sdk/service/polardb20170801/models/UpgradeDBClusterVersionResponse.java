// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBClusterVersionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeDBClusterVersionResponse</p>
 */
public class UpgradeDBClusterVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeDBClusterVersionResponseBody body;

    private UpgradeDBClusterVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeDBClusterVersionResponse create() {
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
    public UpgradeDBClusterVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeDBClusterVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeDBClusterVersionResponseBody body);

        @Override
        UpgradeDBClusterVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeDBClusterVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeDBClusterVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeDBClusterVersionResponse response) {
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
        public Builder body(UpgradeDBClusterVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeDBClusterVersionResponse build() {
            return new UpgradeDBClusterVersionResponse(this);
        } 

    } 

}
