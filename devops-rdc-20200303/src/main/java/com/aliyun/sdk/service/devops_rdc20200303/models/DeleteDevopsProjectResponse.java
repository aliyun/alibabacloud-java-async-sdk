// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsProjectResponse} extends {@link TeaModel}
 *
 * <p>DeleteDevopsProjectResponse</p>
 */
public class DeleteDevopsProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDevopsProjectResponseBody body;

    private DeleteDevopsProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDevopsProjectResponse create() {
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
    public DeleteDevopsProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDevopsProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDevopsProjectResponseBody body);

        @Override
        DeleteDevopsProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDevopsProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDevopsProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDevopsProjectResponse response) {
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
        public Builder body(DeleteDevopsProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDevopsProjectResponse build() {
            return new DeleteDevopsProjectResponse(this);
        } 

    } 

}
