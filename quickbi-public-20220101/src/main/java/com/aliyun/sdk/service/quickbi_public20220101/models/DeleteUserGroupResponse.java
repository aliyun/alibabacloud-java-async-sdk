// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserGroupResponse</p>
 */
public class DeleteUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserGroupResponseBody body;

    private DeleteUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserGroupResponse create() {
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
    public DeleteUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserGroupResponseBody body);

        @Override
        DeleteUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserGroupResponse response) {
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
        public Builder body(DeleteUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserGroupResponse build() {
            return new DeleteUserGroupResponse(this);
        } 

    } 

}
