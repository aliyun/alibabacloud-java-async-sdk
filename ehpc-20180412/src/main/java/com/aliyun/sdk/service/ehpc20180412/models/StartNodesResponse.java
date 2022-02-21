// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartNodesResponse} extends {@link TeaModel}
 *
 * <p>StartNodesResponse</p>
 */
public class StartNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartNodesResponseBody body;

    private StartNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartNodesResponse create() {
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
    public StartNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartNodesResponseBody body);

        @Override
        StartNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartNodesResponse response) {
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
        public Builder body(StartNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartNodesResponse build() {
            return new StartNodesResponse(this);
        } 

    } 

}
