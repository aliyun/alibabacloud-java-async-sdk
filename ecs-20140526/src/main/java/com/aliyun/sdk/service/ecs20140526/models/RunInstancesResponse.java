// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunInstancesResponse} extends {@link TeaModel}
 *
 * <p>RunInstancesResponse</p>
 */
public class RunInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunInstancesResponseBody body;

    private RunInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunInstancesResponse create() {
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
    public RunInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunInstancesResponseBody body);

        @Override
        RunInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunInstancesResponse response) {
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
        public Builder body(RunInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunInstancesResponse build() {
            return new RunInstancesResponse(this);
        } 

    } 

}
