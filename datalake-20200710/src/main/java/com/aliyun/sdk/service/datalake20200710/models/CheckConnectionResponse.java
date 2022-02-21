// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConnectionResponse} extends {@link TeaModel}
 *
 * <p>CheckConnectionResponse</p>
 */
public class CheckConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckConnectionResponseBody body;

    private CheckConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckConnectionResponse create() {
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
    public CheckConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckConnectionResponseBody body);

        @Override
        CheckConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckConnectionResponse response) {
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
        public Builder body(CheckConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckConnectionResponse build() {
            return new CheckConnectionResponse(this);
        } 

    } 

}
