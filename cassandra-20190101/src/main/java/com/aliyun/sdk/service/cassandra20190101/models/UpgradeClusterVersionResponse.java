// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterVersionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeClusterVersionResponse</p>
 */
public class UpgradeClusterVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeClusterVersionResponseBody body;

    private UpgradeClusterVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeClusterVersionResponse create() {
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
    public UpgradeClusterVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeClusterVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeClusterVersionResponseBody body);

        @Override
        UpgradeClusterVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeClusterVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeClusterVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeClusterVersionResponse response) {
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
        public Builder body(UpgradeClusterVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeClusterVersionResponse build() {
            return new UpgradeClusterVersionResponse(this);
        } 

    } 

}
