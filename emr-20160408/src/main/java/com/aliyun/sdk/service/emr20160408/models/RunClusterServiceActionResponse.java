// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunClusterServiceActionResponse} extends {@link TeaModel}
 *
 * <p>RunClusterServiceActionResponse</p>
 */
public class RunClusterServiceActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunClusterServiceActionResponseBody body;

    private RunClusterServiceActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunClusterServiceActionResponse create() {
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
    public RunClusterServiceActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunClusterServiceActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunClusterServiceActionResponseBody body);

        @Override
        RunClusterServiceActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunClusterServiceActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunClusterServiceActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunClusterServiceActionResponse response) {
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
        public Builder body(RunClusterServiceActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunClusterServiceActionResponse build() {
            return new RunClusterServiceActionResponse(this);
        } 

    } 

}
