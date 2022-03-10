// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceUserRoleResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceUserRoleResponse</p>
 */
public class UpdateWorkspaceUserRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkspaceUserRoleResponseBody body;

    private UpdateWorkspaceUserRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkspaceUserRoleResponse create() {
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
    public UpdateWorkspaceUserRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkspaceUserRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkspaceUserRoleResponseBody body);

        @Override
        UpdateWorkspaceUserRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkspaceUserRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkspaceUserRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkspaceUserRoleResponse response) {
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
        public Builder body(UpdateWorkspaceUserRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkspaceUserRoleResponse build() {
            return new UpdateWorkspaceUserRoleResponse(this);
        } 

    } 

}
