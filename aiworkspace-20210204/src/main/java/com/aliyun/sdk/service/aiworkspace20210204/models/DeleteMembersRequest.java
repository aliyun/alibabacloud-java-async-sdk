// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteMembersRequest</p>
 */
public class DeleteMembersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberIds;

    private DeleteMembersRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memberIds = builder.memberIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMembersRequest create() {
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
     * @return memberIds
     */
    public String getMemberIds() {
        return this.memberIds;
    }

    public static final class Builder extends Request.Builder<DeleteMembersRequest, Builder> {
        private String workspaceId; 
        private String memberIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMembersRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memberIds = request.memberIds;
        } 

        /**
         * <p>The workspace ID. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>A list of member IDs. Separate multiple member IDs with commas (,). For more information about how to obtain member IDs, see <a href="https://help.aliyun.com/document_detail/449135.html">ListMembers</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883-21513926<strong><strong><strong>88039,145883-2769726</strong></strong></strong>87513</p>
         */
        public Builder memberIds(String memberIds) {
            this.putQueryParameter("MemberIds", memberIds);
            this.memberIds = memberIds;
            return this;
        }

        @Override
        public DeleteMembersRequest build() {
            return new DeleteMembersRequest(this);
        } 

    } 

}
