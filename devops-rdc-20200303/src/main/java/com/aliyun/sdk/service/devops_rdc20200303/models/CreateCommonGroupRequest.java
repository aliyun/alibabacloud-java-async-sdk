// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommonGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateCommonGroupRequest</p>
 */
public class CreateCommonGroupRequest extends Request {
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

    private CreateCommonGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.smartGroupId = builder.smartGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommonGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateCommonGroupRequest, Builder> {
        private String description; 
        private String name; 
        private String orgId; 
        private String projectId; 
        private String smartGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommonGroupRequest response) {
            super(response);
            this.description = response.description;
            this.name = response.name;
            this.orgId = response.orgId;
            this.projectId = response.projectId;
            this.smartGroupId = response.smartGroupId;
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
        public CreateCommonGroupRequest build() {
            return new CreateCommonGroupRequest(this);
        } 

    } 

}
