// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>CheckServiceStatusResponse</p>
 */
public class CheckServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckServiceStatusResponseBody body;

    private CheckServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckServiceStatusResponse create() {
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
    public CheckServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckServiceStatusResponseBody body);

        @Override
        CheckServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckServiceStatusResponse response) {
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
        public Builder body(CheckServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckServiceStatusResponse build() {
            return new CheckServiceStatusResponse(this);
        } 

    } 

}
