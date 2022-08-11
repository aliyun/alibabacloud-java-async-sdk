// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunManualDagNodesResponse} extends {@link TeaModel}
 *
 * <p>RunManualDagNodesResponse</p>
 */
public class RunManualDagNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunManualDagNodesResponseBody body;

    private RunManualDagNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunManualDagNodesResponse create() {
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
    public RunManualDagNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunManualDagNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunManualDagNodesResponseBody body);

        @Override
        RunManualDagNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunManualDagNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunManualDagNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunManualDagNodesResponse response) {
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
        public Builder body(RunManualDagNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunManualDagNodesResponse build() {
            return new RunManualDagNodesResponse(this);
        } 

    } 

}
