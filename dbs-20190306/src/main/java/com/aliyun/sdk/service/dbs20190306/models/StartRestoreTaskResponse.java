// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRestoreTaskResponse} extends {@link TeaModel}
 *
 * <p>StartRestoreTaskResponse</p>
 */
public class StartRestoreTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartRestoreTaskResponseBody body;

    private StartRestoreTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartRestoreTaskResponse create() {
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
    public StartRestoreTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartRestoreTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartRestoreTaskResponseBody body);

        @Override
        StartRestoreTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartRestoreTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartRestoreTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartRestoreTaskResponse response) {
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
        public Builder body(StartRestoreTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartRestoreTaskResponse build() {
            return new StartRestoreTaskResponse(this);
        } 

    } 

}
