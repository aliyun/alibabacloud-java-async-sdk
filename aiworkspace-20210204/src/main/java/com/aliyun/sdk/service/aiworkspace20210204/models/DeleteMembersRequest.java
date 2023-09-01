// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteMembersRequest</p>
 */
public class DeleteMembersRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Query
    @NameInMap("MemberIds")
    @Validation(required = true)
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * MemberIds.
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
