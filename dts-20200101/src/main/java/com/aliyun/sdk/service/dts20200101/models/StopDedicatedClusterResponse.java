// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDedicatedClusterResponse} extends {@link TeaModel}
 *
 * <p>StopDedicatedClusterResponse</p>
 */
public class StopDedicatedClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDedicatedClusterResponseBody body;

    private StopDedicatedClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDedicatedClusterResponse create() {
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
    public StopDedicatedClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDedicatedClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDedicatedClusterResponseBody body);

        @Override
        StopDedicatedClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDedicatedClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDedicatedClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDedicatedClusterResponse response) {
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
        public Builder body(StopDedicatedClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDedicatedClusterResponse build() {
            return new StopDedicatedClusterResponse(this);
        } 

    } 

}
