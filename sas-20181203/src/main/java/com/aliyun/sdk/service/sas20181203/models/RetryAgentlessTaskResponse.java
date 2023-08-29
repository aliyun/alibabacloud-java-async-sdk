// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryAgentlessTaskResponse} extends {@link TeaModel}
 *
 * <p>RetryAgentlessTaskResponse</p>
 */
public class RetryAgentlessTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryAgentlessTaskResponseBody body;

    private RetryAgentlessTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryAgentlessTaskResponse create() {
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
    public RetryAgentlessTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryAgentlessTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryAgentlessTaskResponseBody body);

        @Override
        RetryAgentlessTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryAgentlessTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryAgentlessTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryAgentlessTaskResponse response) {
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
        public Builder body(RetryAgentlessTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryAgentlessTaskResponse build() {
            return new RetryAgentlessTaskResponse(this);
        } 

    } 

}
