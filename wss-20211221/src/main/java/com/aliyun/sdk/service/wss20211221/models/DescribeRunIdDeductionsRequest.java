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
 * {@link DescribeRunIdDeductionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRunIdDeductionsRequest</p>
 */
public class DescribeRunIdDeductionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTypes")
    private java.util.List<String> agentTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

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
    @com.aliyun.core.annotation.NameInMap("GroupByFields")
    private java.util.List<String> groupByFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupResourceTypes")
    private java.util.List<String> groupResourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupSeparator")
    private Boolean groupSeparator;

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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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

    private DescribeRunIdDeductionsRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.agentTypes = builder.agentTypes;
        this.aliUid = builder.aliUid;
        this.bizType = builder.bizType;
        this.consumeWyId = builder.consumeWyId;
        this.consumeWyIds = builder.consumeWyIds;
        this.deductionRequestId = builder.deductionRequestId;
        this.deductionTypes = builder.deductionTypes;
        this.endTime = builder.endTime;
        this.groupByFields = builder.groupByFields;
        this.groupResourceTypes = builder.groupResourceTypes;
        this.groupSeparator = builder.groupSeparator;
        this.instanceId = builder.instanceId;
        this.instanceIdType = builder.instanceIdType;
        this.instanceIds = builder.instanceIds;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
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

    public static DescribeRunIdDeductionsRequest create() {
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
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
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
     * @return groupByFields
     */
    public java.util.List<String> getGroupByFields() {
        return this.groupByFields;
    }

    /**
     * @return groupResourceTypes
     */
    public java.util.List<String> getGroupResourceTypes() {
        return this.groupResourceTypes;
    }

    /**
     * @return groupSeparator
     */
    public Boolean getGroupSeparator() {
        return this.groupSeparator;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder extends Request.Builder<DescribeRunIdDeductionsRequest, Builder> {
        private String agentType; 
        private java.util.List<String> agentTypes; 
        private Long aliUid; 
        private String bizType; 
        private String consumeWyId; 
        private java.util.List<String> consumeWyIds; 
        private String deductionRequestId; 
        private java.util.List<String> deductionTypes; 
        private Long endTime; 
        private java.util.List<String> groupByFields; 
        private java.util.List<String> groupResourceTypes; 
        private Boolean groupSeparator; 
        private String instanceId; 
        private String instanceIdType; 
        private java.util.List<String> instanceIds; 
        private Integer maxResults; 
        private String model; 
        private String nextToken; 
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

        private Builder(DescribeRunIdDeductionsRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.agentTypes = request.agentTypes;
            this.aliUid = request.aliUid;
            this.bizType = request.bizType;
            this.consumeWyId = request.consumeWyId;
            this.consumeWyIds = request.consumeWyIds;
            this.deductionRequestId = request.deductionRequestId;
            this.deductionTypes = request.deductionTypes;
            this.endTime = request.endTime;
            this.groupByFields = request.groupByFields;
            this.groupResourceTypes = request.groupResourceTypes;
            this.groupSeparator = request.groupSeparator;
            this.instanceId = request.instanceId;
            this.instanceIdType = request.instanceIdType;
            this.instanceIds = request.instanceIds;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
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
         * <p>The agent type. Valid values: CREDIT_PACKAGE, JVS_CLAW, OPEN_CLAW, and JVS_COPILOT.</p>
         * 
         * <strong>example:</strong>
         * <p>JVSCopilot、JVSClaw、OpenClaw</p>
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
         * <p>The Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1457450820614624</p>
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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
         * <p>The consumption WyId.</p>
         * 
         * <strong>example:</strong>
         * <p>2892766fb8521756</p>
         */
        public Builder consumeWyId(String consumeWyId) {
            this.putQueryParameter("ConsumeWyId", consumeWyId);
            this.consumeWyId = consumeWyId;
            return this;
        }

        /**
         * <p>The Wuying user IDs. You can obtain the IDs by calling the GetLoginToken logon operation. The returned parameter is WyId.</p>
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
         * <p>uuid</p>
         */
        public Builder deductionRequestId(String deductionRequestId) {
            this.putQueryParameter("DeductionRequestId", deductionRequestId);
            this.deductionRequestId = deductionRequestId;
            return this;
        }

        /**
         * <p>The deduction types. Do not specify this parameter for non-knowledge base scenarios.</p>
         */
        public Builder deductionTypes(java.util.List<String> deductionTypes) {
            this.putQueryParameter("DeductionTypes", deductionTypes);
            this.deductionTypes = deductionTypes;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785205179000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of additional grouping fields when aggregating by runId, such as model to distinguish between different models.</p>
         */
        public Builder groupByFields(java.util.List<String> groupByFields) {
            this.putQueryParameter("GroupByFields", groupByFields);
            this.groupByFields = groupByFields;
            return this;
        }

        /**
         * <p>The list of grouped resource types.</p>
         */
        public Builder groupResourceTypes(java.util.List<String> groupResourceTypes) {
            this.putQueryParameter("GroupResourceTypes", groupResourceTypes);
            this.groupResourceTypes = groupResourceTypes;
            return this;
        }

        /**
         * <p>Specifies whether to group the results by deduction type.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder groupSeparator(Boolean groupSeparator) {
            this.putQueryParameter("GroupSeparator", groupSeparator);
            this.groupSeparator = groupSeparator;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mdp-0c62ayep0nk4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance ID type. Do not specify this parameter for non-knowledge base scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeSpaceId、AgentId</p>
         */
        public Builder instanceIdType(String instanceIdType) {
            this.putQueryParameter("InstanceIdType", instanceIdType);
            this.instanceIdType = instanceIdType;
            return this;
        }

        /**
         * <p>The list of cloud computer IDs. If this field is specified, the PackageIds field is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-3.8</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the nextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * <p>The Settings for the number of entries per page during paging in a paged query.</p>
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
         * <p>Enterprise Edition: CreditPackage, Business Edition: BusinessCreditPackage</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of resource types in JSON array format.</p>
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
         * <p>The start time of the query. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785205179000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The globally unique ID of the Wuying user.</p>
         * 
         * <strong>example:</strong>
         * <p>wy-123456****</p>
         */
        public Builder wyId(String wyId) {
            this.putQueryParameter("WyId", wyId);
            this.wyId = wyId;
            return this;
        }

        @Override
        public DescribeRunIdDeductionsRequest build() {
            return new DescribeRunIdDeductionsRequest(this);
        } 

    } 

}
