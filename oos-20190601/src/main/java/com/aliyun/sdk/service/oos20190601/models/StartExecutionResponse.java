// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartExecutionResponse} extends {@link TeaModel}
 *
 * <p>StartExecutionResponse</p>
 */
public class StartExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartExecutionResponseBody body;

    private StartExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartExecutionResponse create() {
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
    public StartExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartExecutionResponseBody body);

        @Override
        StartExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartExecutionResponse response) {
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
        public Builder body(StartExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartExecutionResponse build() {
            return new StartExecutionResponse(this);
        } 

    } 

}
