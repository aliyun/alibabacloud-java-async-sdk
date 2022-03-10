// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserGroupMembersResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserGroupMembersResponse</p>
 */
public class DeleteUserGroupMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserGroupMembersResponseBody body;

    private DeleteUserGroupMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserGroupMembersResponse create() {
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
    public DeleteUserGroupMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserGroupMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserGroupMembersResponseBody body);

        @Override
        DeleteUserGroupMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserGroupMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserGroupMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserGroupMembersResponse response) {
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
        public Builder body(DeleteUserGroupMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserGroupMembersResponse build() {
            return new DeleteUserGroupMembersResponse(this);
        } 

    } 

}
