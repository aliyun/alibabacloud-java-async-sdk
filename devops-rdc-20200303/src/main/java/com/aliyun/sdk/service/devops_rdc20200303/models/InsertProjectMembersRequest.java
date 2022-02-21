// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>InsertProjectMembersRequest</p>
 */
public class InsertProjectMembersRequest extends Request {
    @Body
    @NameInMap("Members")
    @Validation(required = true)
    private String members;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private InsertProjectMembersRequest(Builder builder) {
        super(builder);
        this.members = builder.members;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertProjectMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return members
     */
    public String getMembers() {
        return this.members;
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

    public static final class Builder extends Request.Builder<InsertProjectMembersRequest, Builder> {
        private String members; 
        private String orgId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(InsertProjectMembersRequest response) {
            super(response);
            this.members = response.members;
            this.orgId = response.orgId;
            this.projectId = response.projectId;
        } 

        /**
         * Members.
         */
        public Builder members(String members) {
            this.putBodyParameter("Members", members);
            this.members = members;
            return this;
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

        @Override
        public InsertProjectMembersRequest build() {
            return new InsertProjectMembersRequest(this);
        } 

    } 

}
