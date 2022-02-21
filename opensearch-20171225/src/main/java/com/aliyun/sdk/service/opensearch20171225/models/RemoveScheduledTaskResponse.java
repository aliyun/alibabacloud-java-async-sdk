// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveScheduledTaskResponse} extends {@link TeaModel}
 *
 * <p>RemoveScheduledTaskResponse</p>
 */
public class RemoveScheduledTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveScheduledTaskResponseBody body;

    private RemoveScheduledTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveScheduledTaskResponse create() {
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
    public RemoveScheduledTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveScheduledTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveScheduledTaskResponseBody body);

        @Override
        RemoveScheduledTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveScheduledTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveScheduledTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveScheduledTaskResponse response) {
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
        public Builder body(RemoveScheduledTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveScheduledTaskResponse build() {
            return new RemoveScheduledTaskResponse(this);
        } 

    } 

}
