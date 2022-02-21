// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommonGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteCommonGroupRequest</p>
 */
public class DeleteCommonGroupRequest extends Request {
    @Body
    @NameInMap("CommonGroupId")
    @Validation(required = true)
    private String commonGroupId;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private DeleteCommonGroupRequest(Builder builder) {
        super(builder);
        this.commonGroupId = builder.commonGroupId;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCommonGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commonGroupId
     */
    public String getCommonGroupId() {
        return this.commonGroupId;
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

    public static final class Builder extends Request.Builder<DeleteCommonGroupRequest, Builder> {
        private String commonGroupId; 
        private String orgId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCommonGroupRequest response) {
            super(response);
            this.commonGroupId = response.commonGroupId;
            this.orgId = response.orgId;
            this.projectId = response.projectId;
        } 

        /**
         * CommonGroupId.
         */
        public Builder commonGroupId(String commonGroupId) {
            this.putBodyParameter("CommonGroupId", commonGroupId);
            this.commonGroupId = commonGroupId;
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
        public DeleteCommonGroupRequest build() {
            return new DeleteCommonGroupRequest(this);
        } 

    } 

}
