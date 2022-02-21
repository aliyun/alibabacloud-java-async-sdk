// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRestoreResponse} extends {@link TeaModel}
 *
 * <p>StartRestoreResponse</p>
 */
public class StartRestoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartRestoreResponseBody body;

    private StartRestoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartRestoreResponse create() {
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
    public StartRestoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartRestoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartRestoreResponseBody body);

        @Override
        StartRestoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartRestoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartRestoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartRestoreResponse response) {
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
        public Builder body(StartRestoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartRestoreResponse build() {
            return new StartRestoreResponse(this);
        } 

    } 

}
