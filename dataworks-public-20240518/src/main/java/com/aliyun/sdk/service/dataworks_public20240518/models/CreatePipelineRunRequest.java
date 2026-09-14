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
    @com.aliyun.core.annotation.NameInMap("AutoRunUntilStage")
    private String autoRunUntilStage;

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
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreatePipelineRunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRunUntilStage = builder.autoRunUntilStage;
        this.description = builder.description;
        this.objectIds = builder.objectIds;
        this.projectId = builder.projectId;
        this.runMode = builder.runMode;
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
     * @return autoRunUntilStage
     */
    public String getAutoRunUntilStage() {
        return this.autoRunUntilStage;
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
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePipelineRunRequest, Builder> {
        private String regionId; 
        private String autoRunUntilStage; 
        private String description; 
        private java.util.List<String> objectIds; 
        private Long projectId; 
        private String runMode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRunUntilStage = request.autoRunUntilStage;
            this.description = request.description;
            this.objectIds = request.objectIds;
            this.projectId = request.projectId;
            this.runMode = request.runMode;
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
         * <p>The code of the stage in the publish process. This parameter takes effect only when RunMode is set to Auto. After the publish process is created, it automatically runs to the specified stage.</p>
         * <blockquote>
         * <p>Notice: The specified stage is automatically completed. For example, if you set this parameter to DEV, the automatic run stops after the DEV stage reaches the desired state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        public Builder autoRunUntilStage(String autoRunUntilStage) {
            this.putBodyParameter("AutoRunUntilStage", autoRunUntilStage);
            this.autoRunUntilStage = autoRunUntilStage;
            return this;
        }

        /**
         * <p>The description of the publish process.</p>
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
         * <p>The list of entity IDs that you want to publish in this publish process.</p>
         * <blockquote>
         * <p>Notice: Only a single entity and its child entities can be published at a time. Only the first entity in this array and its child entities are published. Make sure that the length of this array is 1. Entities beyond the first one are ignored.</p>
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
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.
         * This parameter specifies the DataWorks workspace for this API call.</p>
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
         * <p>The run mode of the publish process. Default value: Normal. If you set this parameter to Auto, the publish process is automatically driven to the specified stage. This parameter is used together with the AutoRunUntilStage parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Auto</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder runMode(String runMode) {
            this.putBodyParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * <p>Specifies whether the publish process is used to bring an entity online or offline.</p>
         * <ul>
         * <li><p>Online: online</p>
         * </li>
         * <li><p>Offline: offline</p>
         * </li>
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
