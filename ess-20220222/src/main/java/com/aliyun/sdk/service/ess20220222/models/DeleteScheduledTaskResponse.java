// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScheduledTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteScheduledTaskResponse</p>
 */
public class DeleteScheduledTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScheduledTaskResponseBody body;

    private DeleteScheduledTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScheduledTaskResponse create() {
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
    public DeleteScheduledTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScheduledTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScheduledTaskResponseBody body);

        @Override
        DeleteScheduledTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScheduledTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScheduledTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScheduledTaskResponse response) {
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
        public Builder body(DeleteScheduledTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScheduledTaskResponse build() {
            return new DeleteScheduledTaskResponse(this);
        } 

    } 

}
