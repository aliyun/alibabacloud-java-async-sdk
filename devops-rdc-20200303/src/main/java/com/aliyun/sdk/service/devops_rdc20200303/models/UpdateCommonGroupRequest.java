// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommonGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommonGroupRequest</p>
 */
public class UpdateCommonGroupRequest extends Request {
    @Body
    @NameInMap("CommonGroupId")
    @Validation(required = true)
    private String commonGroupId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("SmartGroupId")
    @Validation(required = true)
    private String smartGroupId;

    private UpdateCommonGroupRequest(Builder builder) {
        super(builder);
        this.commonGroupId = builder.commonGroupId;
        this.description = builder.description;
        this.name = builder.name;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.smartGroupId = builder.smartGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCommonGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return smartGroupId
     */
    public String getSmartGroupId() {
        return this.smartGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateCommonGroupRequest, Builder> {
        private String commonGroupId; 
        private String description; 
        private String name; 
        private String orgId; 
        private String projectId; 
        private String smartGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCommonGroupRequest response) {
            super(response);
            this.commonGroupId = response.commonGroupId;
            this.description = response.description;
            this.name = response.name;
            this.orgId = response.orgId;
            this.projectId = response.projectId;
            this.smartGroupId = response.smartGroupId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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

        /**
         * SmartGroupId.
         */
        public Builder smartGroupId(String smartGroupId) {
            this.putBodyParameter("SmartGroupId", smartGroupId);
            this.smartGroupId = smartGroupId;
            return this;
        }

        @Override
        public UpdateCommonGroupRequest build() {
            return new UpdateCommonGroupRequest(this);
        } 

    } 

}
