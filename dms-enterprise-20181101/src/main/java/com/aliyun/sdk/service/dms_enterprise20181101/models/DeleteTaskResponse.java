// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteTaskResponse</p>
 */
public class DeleteTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTaskResponseBody body;

    private DeleteTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTaskResponse create() {
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
    public DeleteTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTaskResponseBody body);

        @Override
        DeleteTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTaskResponse response) {
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
        public Builder body(DeleteTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTaskResponse build() {
            return new DeleteTaskResponse(this);
        } 

    } 

}
