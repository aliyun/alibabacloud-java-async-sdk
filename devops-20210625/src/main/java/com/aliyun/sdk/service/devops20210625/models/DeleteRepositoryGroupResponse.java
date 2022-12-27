// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepositoryGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteRepositoryGroupResponse</p>
 */
public class DeleteRepositoryGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRepositoryGroupResponseBody body;

    private DeleteRepositoryGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRepositoryGroupResponse create() {
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
    public DeleteRepositoryGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRepositoryGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRepositoryGroupResponseBody body);

        @Override
        DeleteRepositoryGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRepositoryGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRepositoryGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRepositoryGroupResponse response) {
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
        public Builder body(DeleteRepositoryGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRepositoryGroupResponse build() {
            return new DeleteRepositoryGroupResponse(this);
        } 

    } 

}
