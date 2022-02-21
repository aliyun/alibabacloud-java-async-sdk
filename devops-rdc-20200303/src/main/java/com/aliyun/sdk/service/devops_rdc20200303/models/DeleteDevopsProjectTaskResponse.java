// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsProjectTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteDevopsProjectTaskResponse</p>
 */
public class DeleteDevopsProjectTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDevopsProjectTaskResponseBody body;

    private DeleteDevopsProjectTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDevopsProjectTaskResponse create() {
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
    public DeleteDevopsProjectTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDevopsProjectTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDevopsProjectTaskResponseBody body);

        @Override
        DeleteDevopsProjectTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDevopsProjectTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDevopsProjectTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDevopsProjectTaskResponse response) {
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
        public Builder body(DeleteDevopsProjectTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDevopsProjectTaskResponse build() {
            return new DeleteDevopsProjectTaskResponse(this);
        } 

    } 

}
