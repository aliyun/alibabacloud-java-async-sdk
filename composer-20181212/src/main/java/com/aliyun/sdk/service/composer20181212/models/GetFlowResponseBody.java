// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowResponseBody</p>
 */
public class GetFlowResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CurrentVersionId")
    private String currentVersionId;

    @NameInMap("Definition")
    private String definition;

    @NameInMap("FlowDescription")
    private String flowDescription;

    @NameInMap("FlowEditMode")
    private String flowEditMode;

    @NameInMap("FlowId")
    private String flowId;

    @NameInMap("FlowName")
    private String flowName;

    @NameInMap("FlowSource")
    private String flowSource;

    @NameInMap("FlowStatus")
    private String flowStatus;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("UpdateTime")
    private String updateTime;

    private GetFlowResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.currentVersionId = builder.currentVersionId;
        this.definition = builder.definition;
        this.flowDescription = builder.flowDescription;
        this.flowEditMode = builder.flowEditMode;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.flowSource = builder.flowSource;
        this.flowStatus = builder.flowStatus;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.templateId = builder.templateId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return currentVersionId
     */
    public String getCurrentVersionId() {
        return this.currentVersionId;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return flowDescription
     */
    public String getFlowDescription() {
        return this.flowDescription;
    }

    /**
     * @return flowEditMode
     */
    public String getFlowEditMode() {
        return this.flowEditMode;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowSource
     */
    public String getFlowSource() {
        return this.flowSource;
    }

    /**
     * @return flowStatus
     */
    public String getFlowStatus() {
        return this.flowStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String currentVersionId; 
        private String definition; 
        private String flowDescription; 
        private String flowEditMode; 
        private String flowId; 
        private String flowName; 
        private String flowSource; 
        private String flowStatus; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String templateId; 
        private String updateTime; 

        /**
         * The time when the workflow was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The version ID of the workflow.
         */
        public Builder currentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }

        /**
         * The definition of the workflow.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * The description of the workflow.
         */
        public Builder flowDescription(String flowDescription) {
            this.flowDescription = flowDescription;
            return this;
        }

        /**
         * The edit mode of the workflow.
         */
        public Builder flowEditMode(String flowEditMode) {
            this.flowEditMode = flowEditMode;
            return this;
        }

        /**
         * The ID of the workflow.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * The source of the workflow.
         */
        public Builder flowSource(String flowSource) {
            this.flowSource = flowSource;
            return this;
        }

        /**
         * The status of the workflow. Valid values:
         * <p>
         * 
         * *   **Enabled**: The workflow is enabled.
         * *   **Disabled**: The workflow is disabled.
         */
        public Builder flowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }

        /**
         * The ID of the region where the workflow resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The template ID.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * The time when the workflow was last updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetFlowResponseBody build() {
            return new GetFlowResponseBody(this);
        } 

    } 

}
