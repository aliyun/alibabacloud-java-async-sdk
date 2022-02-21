// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevopsProjectMembersRequest</p>
 */
public class DeleteDevopsProjectMembersRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("UserIds")
    @Validation(required = true)
    private String userIds;

    private DeleteDevopsProjectMembersRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevopsProjectMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<DeleteDevopsProjectMembersRequest, Builder> {
        private String orgId; 
        private String projectId; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevopsProjectMembersRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.projectId = response.projectId;
            this.userIds = response.userIds;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * UserIds.
         */
        public Builder userIds(String userIds) {
            this.putBodyParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public DeleteDevopsProjectMembersRequest build() {
            return new DeleteDevopsProjectMembersRequest(this);
        } 

    } 

}
