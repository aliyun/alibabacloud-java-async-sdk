// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindDirectoriesResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindDirectoriesResponse</p>
 */
public class BatchUnbindDirectoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUnbindDirectoriesResponseBody body;

    private BatchUnbindDirectoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUnbindDirectoriesResponse create() {
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
    public BatchUnbindDirectoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindDirectoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUnbindDirectoriesResponseBody body);

        @Override
        BatchUnbindDirectoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindDirectoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUnbindDirectoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindDirectoriesResponse response) {
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
        public Builder body(BatchUnbindDirectoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindDirectoriesResponse build() {
            return new BatchUnbindDirectoriesResponse(this);
        } 

    } 

}
