// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserRoleInfoInWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>QueryUserRoleInfoInWorkspaceRequest</p>
 */
public class QueryUserRoleInfoInWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private QueryUserRoleInfoInWorkspaceRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserRoleInfoInWorkspaceRequest create() {
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

    public static final class Builder extends Request.Builder<QueryUserRoleInfoInWorkspaceRequest, Builder> {
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserRoleInfoInWorkspaceRequest request) {
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
        public QueryUserRoleInfoInWorkspaceRequest build() {
            return new QueryUserRoleInfoInWorkspaceRequest(this);
        } 

    } 

}
