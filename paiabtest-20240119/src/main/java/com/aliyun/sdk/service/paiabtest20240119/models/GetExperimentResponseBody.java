// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentResponseBody</p>
 */
public class GetExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketType")
    private String bucketType;

    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("CoreMetricId")
    private String coreMetricId;

    @com.aliyun.core.annotation.NameInMap("CrowdIds")
    private String crowdIds;

    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("Flow")
    private Integer flow;

    @com.aliyun.core.annotation.NameInMap("FocusMetricIds")
    private String focusMetricIds;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("LayerId")
    private String layerId;

    @com.aliyun.core.annotation.NameInMap("LayerName")
    private String layerName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetExperimentResponseBody(Builder builder) {
        this.bucketType = builder.bucketType;
        this.buckets = builder.buckets;
        this.condition = builder.condition;
        this.coreMetricId = builder.coreMetricId;
        this.crowdIds = builder.crowdIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.experimentId = builder.experimentId;
        this.flow = builder.flow;
        this.focusMetricIds = builder.focusMetricIds;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.layerId = builder.layerId;
        this.layerName = builder.layerName;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketType
     */
    public String getBucketType() {
        return this.bucketType;
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return coreMetricId
     */
    public String getCoreMetricId() {
        return this.coreMetricId;
    }

    /**
     * @return crowdIds
     */
    public String getCrowdIds() {
        return this.crowdIds;
    }

    /**
     * @return debugUsers
     */
    public String getDebugUsers() {
        return this.debugUsers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return flow
     */
    public Integer getFlow() {
        return this.flow;
    }

    /**
     * @return focusMetricIds
     */
    public String getFocusMetricIds() {
        return this.focusMetricIds;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String bucketType; 
        private String buckets; 
        private String condition; 
        private String coreMetricId; 
        private String crowdIds; 
        private String debugUsers; 
        private String description; 
        private String domainName; 
        private String endTime; 
        private String experimentId; 
        private Integer flow; 
        private String focusMetricIds; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String layerId; 
        private String layerName; 
        private String name; 
        private String owner; 
        private String projectName; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private String workspaceId; 

        /**
         * BucketType.
         */
        public Builder bucketType(String bucketType) {
            this.bucketType = bucketType;
            return this;
        }

        /**
         * Buckets.
         */
        public Builder buckets(String buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * CoreMetricId.
         */
        public Builder coreMetricId(String coreMetricId) {
            this.coreMetricId = coreMetricId;
            return this;
        }

        /**
         * CrowdIds.
         */
        public Builder crowdIds(String crowdIds) {
            this.crowdIds = crowdIds;
            return this;
        }

        /**
         * DebugUsers.
         */
        public Builder debugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Flow.
         */
        public Builder flow(Integer flow) {
            this.flow = flow;
            return this;
        }

        /**
         * FocusMetricIds.
         */
        public Builder focusMetricIds(String focusMetricIds) {
            this.focusMetricIds = focusMetricIds;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.layerId = layerId;
            return this;
        }

        /**
         * LayerName.
         */
        public Builder layerName(String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetExperimentResponseBody build() {
            return new GetExperimentResponseBody(this);
        } 

    } 

}
