// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryOperationResponse} extends {@link TeaModel}
 *
 * <p>RetryOperationResponse</p>
 */
public class RetryOperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryOperationResponseBody body;

    private RetryOperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryOperationResponse create() {
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
    public RetryOperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryOperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryOperationResponseBody body);

        @Override
        RetryOperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryOperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryOperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryOperationResponse response) {
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
        public Builder body(RetryOperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryOperationResponse build() {
            return new RetryOperationResponse(this);
        } 

    } 

}
