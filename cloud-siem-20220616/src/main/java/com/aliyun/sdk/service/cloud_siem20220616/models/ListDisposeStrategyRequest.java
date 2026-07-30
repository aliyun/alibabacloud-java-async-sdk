// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListDisposeStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListDisposeStrategyRequest</p>
 */
public class ListDisposeStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUuid")
    private String alertUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EffectiveStatus")
    private Integer effectiveStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityIdentity")
    private String entityIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityUuidList")
    private java.util.List<String> entityUuidList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupKey")
    private String groupKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookName")
    private String playbookName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookTypes")
    private String playbookTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleId")
    private String responseRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SophonTaskId")
    private String sophonTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    private ListDisposeStrategyRequest(Builder builder) {
        super(builder);
        this.alertUuid = builder.alertUuid;
        this.currentPage = builder.currentPage;
        this.effectiveStatus = builder.effectiveStatus;
        this.endTime = builder.endTime;
        this.entityIdentity = builder.entityIdentity;
        this.entityType = builder.entityType;
        this.entityUuidList = builder.entityUuidList;
        this.groupBy = builder.groupBy;
        this.groupKey = builder.groupKey;
        this.incidentUuid = builder.incidentUuid;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageSize = builder.pageSize;
        this.playbookName = builder.playbookName;
        this.playbookTypes = builder.playbookTypes;
        this.playbookUuid = builder.playbookUuid;
        this.queryMode = builder.queryMode;
        this.regionId = builder.regionId;
        this.responseRuleId = builder.responseRuleId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.sophonTaskId = builder.sophonTaskId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDisposeStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertUuid
     */
    public String getAlertUuid() {
        return this.alertUuid;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return effectiveStatus
     */
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entityIdentity
     */
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return entityUuidList
     */
    public java.util.List<String> getEntityUuidList() {
        return this.entityUuidList;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return groupKey
     */
    public String getGroupKey() {
        return this.groupKey;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return playbookTypes
     */
    public String getPlaybookTypes() {
        return this.playbookTypes;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return responseRuleId
     */
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return sophonTaskId
     */
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<ListDisposeStrategyRequest, Builder> {
        private String alertUuid; 
        private Integer currentPage; 
        private Integer effectiveStatus; 
        private Long endTime; 
        private String entityIdentity; 
        private String entityType; 
        private java.util.List<String> entityUuidList; 
        private String groupBy; 
        private String groupKey; 
        private String incidentUuid; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String orderField; 
        private Integer pageSize; 
        private String playbookName; 
        private String playbookTypes; 
        private String playbookUuid; 
        private String queryMode; 
        private String regionId; 
        private String responseRuleId; 
        private Long roleFor; 
        private Integer roleType; 
        private String sophonTaskId; 
        private Long startTime; 
        private Integer status; 
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(ListDisposeStrategyRequest request) {
            super(request);
            this.alertUuid = request.alertUuid;
            this.currentPage = request.currentPage;
            this.effectiveStatus = request.effectiveStatus;
            this.endTime = request.endTime;
            this.entityIdentity = request.entityIdentity;
            this.entityType = request.entityType;
            this.entityUuidList = request.entityUuidList;
            this.groupBy = request.groupBy;
            this.groupKey = request.groupKey;
            this.incidentUuid = request.incidentUuid;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageSize = request.pageSize;
            this.playbookName = request.playbookName;
            this.playbookTypes = request.playbookTypes;
            this.playbookUuid = request.playbookUuid;
            this.queryMode = request.queryMode;
            this.regionId = request.regionId;
            this.responseRuleId = request.responseRuleId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.sophonTaskId = request.sophonTaskId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.strategyId = request.strategyId;
        } 

        /**
         * AlertUuid.
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li>0: invalid</li>
         * <li>1: valid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder effectiveStatus(Integer effectiveStatus) {
            this.putBodyParameter("EffectiveStatus", effectiveStatus);
            this.effectiveStatus = effectiveStatus;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The feature value of the entity. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test22.php</p>
         */
        public Builder entityIdentity(String entityIdentity) {
            this.putBodyParameter("EntityIdentity", entityIdentity);
            this.entityIdentity = entityIdentity;
            return this;
        }

        /**
         * <p>The entity type of the playbook. Valid values:</p>
         * <ul>
         * <li>ip</li>
         * <li>process</li>
         * <li>file</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * EntityUuidList.
         */
        public Builder entityUuidList(java.util.List<String> entityUuidList) {
            String entityUuidListShrink = shrink(entityUuidList, "EntityUuidList", "json");
            this.putBodyParameter("EntityUuidList", entityUuidListShrink);
            this.entityUuidList = entityUuidList;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putBodyParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * GroupKey.
         */
        public Builder groupKey(String groupKey) {
            this.putBodyParameter("GroupKey", groupKey);
            this.groupKey = groupKey;
            return this;
        }

        /**
         * IncidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li>GmtModified: sorts the policies by update time.</li>
         * <li>GmtCreate: sorts the policies by creation time.</li>
         * <li>FinishTime: sorts the policies by end time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtModified</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the playbook, which is the unique identifier of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>WafBlockIP</p>
         */
        public Builder playbookName(String playbookName) {
            this.putBodyParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <ul>
         * <li>system: user-triggered playbook</li>
         * <li>custom: event-triggered playbook</li>
         * <li>custom_alert: alert-triggered playbook</li>
         * <li>soar-manual: user-run playbook</li>
         * <li>soar-mdr: MDR-run playbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder playbookTypes(String playbookTypes) {
            this.putBodyParameter("PlaybookTypes", playbookTypes);
            this.playbookTypes = playbookTypes;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_clb_process_book</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * QueryMode.
         */
        public Builder queryMode(String queryMode) {
            this.putBodyParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResponseRuleId.
         */
        public Builder responseRuleId(String responseRuleId) {
            this.putBodyParameter("ResponseRuleId", responseRuleId);
            this.responseRuleId = responseRuleId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The ID of the SOAR handling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>a50a49b7-6044-4593-ab15-2b46567caadd</p>
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putBodyParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * StrategyId.
         */
        public Builder strategyId(String strategyId) {
            this.putBodyParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public ListDisposeStrategyRequest build() {
            return new ListDisposeStrategyRequest(this);
        } 

    } 

}
