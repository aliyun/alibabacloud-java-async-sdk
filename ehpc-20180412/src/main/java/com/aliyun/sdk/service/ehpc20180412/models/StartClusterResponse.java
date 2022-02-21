// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartClusterResponse} extends {@link TeaModel}
 *
 * <p>StartClusterResponse</p>
 */
public class StartClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartClusterResponseBody body;

    private StartClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartClusterResponse create() {
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
    public StartClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartClusterResponseBody body);

        @Override
        StartClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartClusterResponse response) {
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
        public Builder body(StartClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartClusterResponse build() {
            return new StartClusterResponse(this);
        } 

    } 

}
