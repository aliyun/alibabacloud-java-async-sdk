// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunSmokeTestResponse} extends {@link TeaModel}
 *
 * <p>RunSmokeTestResponse</p>
 */
public class RunSmokeTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunSmokeTestResponseBody body;

    private RunSmokeTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunSmokeTestResponse create() {
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
    public RunSmokeTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunSmokeTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunSmokeTestResponseBody body);

        @Override
        RunSmokeTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunSmokeTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunSmokeTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunSmokeTestResponse response) {
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
        public Builder body(RunSmokeTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunSmokeTestResponse build() {
            return new RunSmokeTestResponse(this);
        } 

    } 

}
