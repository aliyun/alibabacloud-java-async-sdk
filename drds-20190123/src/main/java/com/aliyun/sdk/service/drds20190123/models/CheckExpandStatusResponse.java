// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckExpandStatusResponse} extends {@link TeaModel}
 *
 * <p>CheckExpandStatusResponse</p>
 */
public class CheckExpandStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckExpandStatusResponseBody body;

    private CheckExpandStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckExpandStatusResponse create() {
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
    public CheckExpandStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckExpandStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckExpandStatusResponseBody body);

        @Override
        CheckExpandStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckExpandStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckExpandStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckExpandStatusResponse response) {
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
        public Builder body(CheckExpandStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckExpandStatusResponse build() {
            return new CheckExpandStatusResponse(this);
        } 

    } 

}
