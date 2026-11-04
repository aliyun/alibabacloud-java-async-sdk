// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribePackageDeductionsRequest} extends {@link RequestModel}
 *
 * <p>DescribePackageDeductionsRequest</p>
 */
public class DescribePackageDeductionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTypes")
    private java.util.List<String> agentTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumeWyId")
    private String consumeWyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumeWyIds")
    private java.util.List<String> consumeWyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeductionRequestId")
    private String deductionRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeductionTypes")
    private java.util.List<String> deductionTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupResourceTypes")
    private java.util.List<String> groupResourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdType")
    private String instanceIdType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<String> resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunIdList")
    private java.util.List<String> runIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WyId")
    private String wyId;

    private DescribePackageDeductionsRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.agentTypes = builder.agentTypes;
        this.bizType = builder.bizType;
        this.consumeWyId = builder.consumeWyId;
        this.consumeWyIds = builder.consumeWyIds;
        this.deductionRequestId = builder.deductionRequestId;
        this.deductionTypes = builder.deductionTypes;
        this.endTime = builder.endTime;
        this.groupResourceTypes = builder.groupResourceTypes;
        this.instanceId = builder.instanceId;
        this.instanceIdType = builder.instanceIdType;
        this.instanceIds = builder.instanceIds;
        this.model = builder.model;
        this.packageIds = builder.packageIds;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.resourceTypes = builder.resourceTypes;
        this.runId = builder.runId;
        this.runIdList = builder.runIdList;
        this.startTime = builder.startTime;
        this.wyId = builder.wyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageDeductionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return agentTypes
     */
    public java.util.List<String> getAgentTypes() {
        return this.agentTypes;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return consumeWyId
     */
    public String getConsumeWyId() {
        return this.consumeWyId;
    }

    /**
     * @return consumeWyIds
     */
    public java.util.List<String> getConsumeWyIds() {
        return this.consumeWyIds;
    }

    /**
     * @return deductionRequestId
     */
    public String getDeductionRequestId() {
        return this.deductionRequestId;
    }

    /**
     * @return deductionTypes
     */
    public java.util.List<String> getDeductionTypes() {
        return this.deductionTypes;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupResourceTypes
     */
    public java.util.List<String> getGroupResourceTypes() {
        return this.groupResourceTypes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIdType
     */
    public String getInstanceIdType() {
        return this.instanceIdType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return packageIds
     */
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return runIdList
     */
    public java.util.List<String> getRunIdList() {
        return this.runIdList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return wyId
     */
    public String getWyId() {
        return this.wyId;
    }

    public static final class Builder extends Request.Builder<DescribePackageDeductionsRequest, Builder> {
        private String agentType; 
        private java.util.List<String> agentTypes; 
        private String bizType; 
        private String consumeWyId; 
        private java.util.List<String> consumeWyIds; 
        private String deductionRequestId; 
        private java.util.List<String> deductionTypes; 
        private Long endTime; 
        private java.util.List<String> groupResourceTypes; 
        private String instanceId; 
        private String instanceIdType; 
        private java.util.List<String> instanceIds; 
        private String model; 
        private java.util.List<String> packageIds; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String resourceType; 
        private java.util.List<String> resourceTypes; 
        private String runId; 
        private java.util.List<String> runIdList; 
        private Long startTime; 
        private String wyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackageDeductionsRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.agentTypes = request.agentTypes;
            this.bizType = request.bizType;
            this.consumeWyId = request.consumeWyId;
            this.consumeWyIds = request.consumeWyIds;
            this.deductionRequestId = request.deductionRequestId;
            this.deductionTypes = request.deductionTypes;
            this.endTime = request.endTime;
            this.groupResourceTypes = request.groupResourceTypes;
            this.instanceId = request.instanceId;
            this.instanceIdType = request.instanceIdType;
            this.instanceIds = request.instanceIds;
            this.model = request.model;
            this.packageIds = request.packageIds;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.resourceTypes = request.resourceTypes;
            this.runId = request.runId;
            this.runIdList = request.runIdList;
            this.startTime = request.startTime;
            this.wyId = request.wyId;
        } 

        /**
         * <p>The agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The list of agent types.</p>
         */
        public Builder agentTypes(java.util.List<String> agentTypes) {
            this.putQueryParameter("AgentTypes", agentTypes);
            this.agentTypes = agentTypes;
            return this;
        }

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE、BUSINESS</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The WUYING user ID. You can obtain it by calling the GetLoginToken operation. The response parameter is WyId.</p>
         * 
         * <strong>example:</strong>
         * <p>fb4dc579c48ffbea</p>
         */
        public Builder consumeWyId(String consumeWyId) {
            this.putQueryParameter("ConsumeWyId", consumeWyId);
            this.consumeWyId = consumeWyId;
            return this;
        }

        /**
         * <p>The WUYING user ID. You can obtain it by calling the GetLoginToken operation. The response parameter is WyId.</p>
         */
        public Builder consumeWyIds(java.util.List<String> consumeWyIds) {
            this.putQueryParameter("ConsumeWyIds", consumeWyIds);
            this.consumeWyIds = consumeWyIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>UUID</p>
         */
        public Builder deductionRequestId(String deductionRequestId) {
            this.putQueryParameter("DeductionRequestId", deductionRequestId);
            this.deductionRequestId = deductionRequestId;
            return this;
        }

        /**
         * <p>The deduction types.</p>
         */
        public Builder deductionTypes(java.util.List<String> deductionTypes) {
            this.putQueryParameter("DeductionTypes", deductionTypes);
            this.deductionTypes = deductionTypes;
            return this;
        }

        /**
         * <p>The end time of the query. The time is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1709117383000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of resource group types.</p>
         */
        public Builder groupResourceTypes(java.util.List<String> groupResourceTypes) {
            this.putQueryParameter("GroupResourceTypes", groupResourceTypes);
            this.groupResourceTypes = groupResourceTypes;
            return this;
        }

        /**
         * <p>The instance ID, such as ecd-xxx.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance ID type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxx</p>
         */
        public Builder instanceIdType(String instanceIdType) {
            this.putQueryParameter("InstanceIdType", instanceIdType);
            this.instanceIdType = instanceIdType;
            return this;
        }

        /**
         * <p>The list of Cloud Desktop IDs. If this field is specified, the PackageIds field is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>happyhorse-1.1</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The list of core-hour package IDs in JSON format.</p>
         */
        public Builder packageIds(java.util.List<String> packageIds) {
            this.putQueryParameter("PackageIds", packageIds);
            this.packageIds = packageIds;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The paging Settings for the number of entries to return on each page in a paged query. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The array of resource types.</p>
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-xxx</p>
         */
        public Builder runId(String runId) {
            this.putQueryParameter("RunId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The list of run IDs.</p>
         */
        public Builder runIdList(java.util.List<String> runIdList) {
            this.putQueryParameter("RunIdList", runIdList);
            this.runIdList = runIdList;
            return this;
        }

        /**
         * <p>The start time of the query. The time is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1709117383000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The WUYING user ID. You can obtain it by calling the GetLoginToken operation. The response parameter is WyId.</p>
         * 
         * <strong>example:</strong>
         * <p>fb4dc579c48ffbea</p>
         */
        public Builder wyId(String wyId) {
            this.putQueryParameter("WyId", wyId);
            this.wyId = wyId;
            return this;
        }

        @Override
        public DescribePackageDeductionsRequest build() {
            return new DescribePackageDeductionsRequest(this);
        } 

    } 

}
