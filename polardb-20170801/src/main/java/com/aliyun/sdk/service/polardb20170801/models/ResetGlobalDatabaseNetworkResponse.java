// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetGlobalDatabaseNetworkResponse} extends {@link TeaModel}
 *
 * <p>ResetGlobalDatabaseNetworkResponse</p>
 */
public class ResetGlobalDatabaseNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetGlobalDatabaseNetworkResponseBody body;

    private ResetGlobalDatabaseNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetGlobalDatabaseNetworkResponse create() {
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
    public ResetGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetGlobalDatabaseNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetGlobalDatabaseNetworkResponseBody body);

        @Override
        ResetGlobalDatabaseNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetGlobalDatabaseNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetGlobalDatabaseNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetGlobalDatabaseNetworkResponse response) {
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
        public Builder body(ResetGlobalDatabaseNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetGlobalDatabaseNetworkResponse build() {
            return new ResetGlobalDatabaseNetworkResponse(this);
        } 

    } 

}
