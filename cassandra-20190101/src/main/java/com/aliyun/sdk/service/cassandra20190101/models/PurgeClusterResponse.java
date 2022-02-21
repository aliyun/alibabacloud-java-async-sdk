// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurgeClusterResponse} extends {@link TeaModel}
 *
 * <p>PurgeClusterResponse</p>
 */
public class PurgeClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurgeClusterResponseBody body;

    private PurgeClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurgeClusterResponse create() {
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
    public PurgeClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurgeClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurgeClusterResponseBody body);

        @Override
        PurgeClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurgeClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurgeClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurgeClusterResponse response) {
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
        public Builder body(PurgeClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurgeClusterResponse build() {
            return new PurgeClusterResponse(this);
        } 

    } 

}
