// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserFromWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserFromWorkspaceRequest</p>
 */
public class DeleteUserFromWorkspaceRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DeleteUserFromWorkspaceRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserFromWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteUserFromWorkspaceRequest, Builder> {
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserFromWorkspaceRequest request) {
            super(request);
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteUserFromWorkspaceRequest build() {
            return new DeleteUserFromWorkspaceRequest(this);
        } 

    } 

}
