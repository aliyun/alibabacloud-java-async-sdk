// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceRequest</p>
 */
public class DeleteWorkspaceRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DeleteWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteWorkspaceRequest, Builder> {
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteWorkspaceRequest build() {
            return new DeleteWorkspaceRequest(this);
        } 

    } 

}
