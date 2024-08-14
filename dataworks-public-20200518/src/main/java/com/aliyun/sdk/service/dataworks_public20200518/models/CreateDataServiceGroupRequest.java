// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceGroupRequest</p>
 */
public class CreateDataServiceGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiGatewayGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiGatewayGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tenantId;

    private CreateDataServiceGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiGatewayGroupId = builder.apiGatewayGroupId;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.projectId = builder.projectId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiGatewayGroupId
     */
    public String getApiGatewayGroupId() {
        return this.apiGatewayGroupId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateDataServiceGroupRequest, Builder> {
        private String regionId; 
        private String apiGatewayGroupId; 
        private String description; 
        private String groupName; 
        private Long projectId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiGatewayGroupId = request.apiGatewayGroupId;
            this.description = request.description;
            this.groupName = request.groupName;
            this.projectId = request.projectId;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the API group that is associated with the business process in the API Gateway console. You can log on to the API Gateway console and go to the Group Details page to view the ID.
         */
        public Builder apiGatewayGroupId(String apiGatewayGroupId) {
            this.putBodyParameter("ApiGatewayGroupId", apiGatewayGroupId);
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }

        /**
         * The description of the business process.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the business process.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The tenant ID. This parameter is deprecated.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateDataServiceGroupRequest build() {
            return new CreateDataServiceGroupRequest(this);
        } 

    } 

}
