// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWatchTasksResponse} extends {@link TeaModel}
 *
 * <p>DeleteWatchTasksResponse</p>
 */
public class DeleteWatchTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWatchTasksResponseBody body;

    private DeleteWatchTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWatchTasksResponse create() {
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
    public DeleteWatchTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWatchTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWatchTasksResponseBody body);

        @Override
        DeleteWatchTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWatchTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWatchTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWatchTasksResponse response) {
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
        public Builder body(DeleteWatchTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWatchTasksResponse build() {
            return new DeleteWatchTasksResponse(this);
        } 

    } 

}
