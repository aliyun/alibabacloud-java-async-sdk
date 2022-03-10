// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceUsersRoleResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceUsersRoleResponse</p>
 */
public class UpdateWorkspaceUsersRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkspaceUsersRoleResponseBody body;

    private UpdateWorkspaceUsersRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkspaceUsersRoleResponse create() {
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
    public UpdateWorkspaceUsersRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkspaceUsersRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkspaceUsersRoleResponseBody body);

        @Override
        UpdateWorkspaceUsersRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkspaceUsersRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkspaceUsersRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkspaceUsersRoleResponse response) {
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
        public Builder body(UpdateWorkspaceUsersRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkspaceUsersRoleResponse build() {
            return new UpdateWorkspaceUsersRoleResponse(this);
        } 

    } 

}
