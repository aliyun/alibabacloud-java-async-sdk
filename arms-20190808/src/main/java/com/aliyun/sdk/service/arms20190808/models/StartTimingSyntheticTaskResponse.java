// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTimingSyntheticTaskResponse} extends {@link TeaModel}
 *
 * <p>StartTimingSyntheticTaskResponse</p>
 */
public class StartTimingSyntheticTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartTimingSyntheticTaskResponseBody body;

    private StartTimingSyntheticTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartTimingSyntheticTaskResponse create() {
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
    public StartTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartTimingSyntheticTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartTimingSyntheticTaskResponseBody body);

        @Override
        StartTimingSyntheticTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartTimingSyntheticTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartTimingSyntheticTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartTimingSyntheticTaskResponse response) {
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
        public Builder body(StartTimingSyntheticTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartTimingSyntheticTaskResponse build() {
            return new StartTimingSyntheticTaskResponse(this);
        } 

    } 

}
