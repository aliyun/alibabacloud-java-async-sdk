// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspaceUsersRequest} extends {@link RequestModel}
 *
 * <p>ListWorkspaceUsersRequest</p>
 */
public class ListWorkspaceUsersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListWorkspaceUsersRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspaceUsersRequest create() {
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

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListWorkspaceUsersRequest, Builder> {
        private String workspaceId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkspaceUsersRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.userName = request.userName;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListWorkspaceUsersRequest build() {
            return new ListWorkspaceUsersRequest(this);
        } 

    } 

}
