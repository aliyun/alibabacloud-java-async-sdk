// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreatePipelineRunRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineRunRequest</p>
 */
public class CreatePipelineRunRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreatePipelineRunRequest(Builder builder) {
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

    public static CreatePipelineRunRequest create() {
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
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePipelineRunRequest, Builder> {
        private String regionId; 
        private String description; 
        private java.util.List<String> objectIds; 
        private Long projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.objectIds = request.objectIds;
            this.projectId = request.projectId;
            this.type = request.type;
        } 

        /**
         * <p>区域id</p>
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a OdpsSQL-node publishing process. The function is XXXX.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The IDs of entities to which you want to apply the process.</p>
         * <blockquote>
         * <p> A process can be applied to only a single entity and its child entities. If you specify multiple entities in the array, the process is applied only to the first entity in the array and its child entities. Make sure that the array in your request contains only one element. Extra elements will be ignored.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder objectIds(java.util.List<String> objectIds) {
            String objectIdsShrink = shrink(objectIds, "ObjectIds", "json");
            this.putBodyParameter("ObjectIds", objectIdsShrink);
            this.objectIds = objectIds;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID. You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Specifies whether to deploy or undeploy the entity. Valid values:</p>
         * <ul>
         * <li>Online: deploys the entity.</li>
         * <li>Offline: undeploys the entity.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePipelineRunRequest build() {
            return new CreatePipelineRunRequest(this);
        } 

    } 

}
