// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowsResponseBody</p>
 */
public class ListFlowsResponseBody extends TeaModel {
    @NameInMap("Flows")
    private java.util.List < Flows> flows;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListFlowsResponseBody(Builder builder) {
        this.flows = builder.flows;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return flows
     */
    public java.util.List < Flows> getFlows() {
        return this.flows;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Flows> flows; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * A list of workflows.
         */
        public Builder flows(java.util.List < Flows> flows) {
            this.flows = flows;
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
         * The total number of workflows in the current region.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFlowsResponseBody build() {
            return new ListFlowsResponseBody(this);
        } 

    } 

    public static class Flows extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

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

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VersionId")
        private String versionId;

        private Flows(Builder builder) {
            this.createTime = builder.createTime;
            this.flowDescription = builder.flowDescription;
            this.flowEditMode = builder.flowEditMode;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.flowSource = builder.flowSource;
            this.flowStatus = builder.flowStatus;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.templateId = builder.templateId;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createTime; 
            private String flowDescription; 
            private String flowEditMode; 
            private String flowId; 
            private String flowName; 
            private String flowSource; 
            private String flowStatus; 
            private String regionId; 
            private String resourceGroupId; 
            private String templateId; 
            private String updateTime; 
            private String versionId; 

            /**
             * The time when the workflow was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * The region to which the workflow belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The template ID. You can call the ListTemplates operation to obtain the template ID.
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

            /**
             * The latest version of the workflow.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
}
