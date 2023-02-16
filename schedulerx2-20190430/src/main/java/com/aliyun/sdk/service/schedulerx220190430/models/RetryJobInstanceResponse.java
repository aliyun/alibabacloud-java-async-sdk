// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryJobInstanceResponse} extends {@link TeaModel}
 *
 * <p>RetryJobInstanceResponse</p>
 */
public class RetryJobInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryJobInstanceResponseBody body;

    private RetryJobInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryJobInstanceResponse create() {
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
    public RetryJobInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryJobInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryJobInstanceResponseBody body);

        @Override
        RetryJobInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryJobInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryJobInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryJobInstanceResponse response) {
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
        public Builder body(RetryJobInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryJobInstanceResponse build() {
            return new RetryJobInstanceResponse(this);
        } 

    } 

}
