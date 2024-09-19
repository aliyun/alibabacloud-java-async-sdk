// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CreateDeploymentRequest</p>
 */
public class CreateDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > objectIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateDeploymentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.objectIds = builder.objectIds;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return objectIds
     */
    public java.util.List < String > getObjectIds() {
        return this.objectIds;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateDeploymentRequest, Builder> {
        private String regionId; 
        private String description; 
        private java.util.List < String > objectIds; 
        private String projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeploymentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.objectIds = request.objectIds;
            this.projectId = request.projectId;
            this.type = request.type;
        } 

        /**
         * 区域id
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ObjectIds.
         */
        public Builder objectIds(java.util.List < String > objectIds) {
            String objectIdsShrink = shrink(objectIds, "ObjectIds", "json");
            this.putBodyParameter("ObjectIds", objectIdsShrink);
            this.objectIds = objectIds;
            return this;
        }

        /**
         * 项目Id
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDeploymentRequest build() {
            return new CreateDeploymentRequest(this);
        } 

    } 

}
