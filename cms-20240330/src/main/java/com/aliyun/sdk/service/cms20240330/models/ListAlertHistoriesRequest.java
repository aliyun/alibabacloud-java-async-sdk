// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAlertHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListAlertHistoriesRequest</p>
 */
public class ListAlertHistoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertHistoryId")
    private String alertHistoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertRuleId")
    private String alertRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizSource")
    private String bizSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cmsNamespace")
    private String cmsNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cmsProductCategory")
    private String cmsProductCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("displayNameKeyWord")
    private String displayNameKeyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceKey")
    private String instanceKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelFilter")
    private AlertRuleLabelFilter labelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("latestLevel")
    private String latestLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxLevel")
    private String maxLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("migrationStatus")
    private Integer migrationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("notificationFilter")
    private AlertRuleNotificationFilter notificationFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("observeRelationType")
    private String observeRelationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("observeResourceDomain")
    private String observeResourceDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("observeResourceGlobalScope")
    private Boolean observeResourceGlobalScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("observeResourceInstanceId")
    private String observeResourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("observeResourceType")
    private String observeResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partitionKey")
    private String partitionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTimeFrom")
    private Long startTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTimeTo")
    private Long startTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListAlertHistoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertHistoryId = builder.alertHistoryId;
        this.alertRuleId = builder.alertRuleId;
        this.bizSource = builder.bizSource;
        this.cmsNamespace = builder.cmsNamespace;
        this.cmsProductCategory = builder.cmsProductCategory;
        this.displayNameKeyWord = builder.displayNameKeyWord;
        this.instanceKey = builder.instanceKey;
        this.labelFilter = builder.labelFilter;
        this.latestLevel = builder.latestLevel;
        this.maxLevel = builder.maxLevel;
        this.maxResults = builder.maxResults;
        this.migrationStatus = builder.migrationStatus;
        this.nextToken = builder.nextToken;
        this.notificationFilter = builder.notificationFilter;
        this.observeRelationType = builder.observeRelationType;
        this.observeResourceDomain = builder.observeResourceDomain;
        this.observeResourceGlobalScope = builder.observeResourceGlobalScope;
        this.observeResourceInstanceId = builder.observeResourceInstanceId;
        this.observeResourceType = builder.observeResourceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.partitionKey = builder.partitionKey;
        this.startTimeFrom = builder.startTimeFrom;
        this.startTimeTo = builder.startTimeTo;
        this.status = builder.status;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertHistoriesRequest create() {
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
     * @return alertHistoryId
     */
    public String getAlertHistoryId() {
        return this.alertHistoryId;
    }

    /**
     * @return alertRuleId
     */
    public String getAlertRuleId() {
        return this.alertRuleId;
    }

    /**
     * @return bizSource
     */
    public String getBizSource() {
        return this.bizSource;
    }

    /**
     * @return cmsNamespace
     */
    public String getCmsNamespace() {
        return this.cmsNamespace;
    }

    /**
     * @return cmsProductCategory
     */
    public String getCmsProductCategory() {
        return this.cmsProductCategory;
    }

    /**
     * @return displayNameKeyWord
     */
    public String getDisplayNameKeyWord() {
        return this.displayNameKeyWord;
    }

    /**
     * @return instanceKey
     */
    public String getInstanceKey() {
        return this.instanceKey;
    }

    /**
     * @return labelFilter
     */
    public AlertRuleLabelFilter getLabelFilter() {
        return this.labelFilter;
    }

    /**
     * @return latestLevel
     */
    public String getLatestLevel() {
        return this.latestLevel;
    }

    /**
     * @return maxLevel
     */
    public String getMaxLevel() {
        return this.maxLevel;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return migrationStatus
     */
    public Integer getMigrationStatus() {
        return this.migrationStatus;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return notificationFilter
     */
    public AlertRuleNotificationFilter getNotificationFilter() {
        return this.notificationFilter;
    }

    /**
     * @return observeRelationType
     */
    public String getObserveRelationType() {
        return this.observeRelationType;
    }

    /**
     * @return observeResourceDomain
     */
    public String getObserveResourceDomain() {
        return this.observeResourceDomain;
    }

    /**
     * @return observeResourceGlobalScope
     */
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    /**
     * @return observeResourceInstanceId
     */
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    /**
     * @return observeResourceType
     */
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return partitionKey
     */
    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return startTimeFrom
     */
    public Long getStartTimeFrom() {
        return this.startTimeFrom;
    }

    /**
     * @return startTimeTo
     */
    public Long getStartTimeTo() {
        return this.startTimeTo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListAlertHistoriesRequest, Builder> {
        private String regionId; 
        private String alertHistoryId; 
        private String alertRuleId; 
        private String bizSource; 
        private String cmsNamespace; 
        private String cmsProductCategory; 
        private String displayNameKeyWord; 
        private String instanceKey; 
        private AlertRuleLabelFilter labelFilter; 
        private String latestLevel; 
        private String maxLevel; 
        private Integer maxResults; 
        private Integer migrationStatus; 
        private String nextToken; 
        private AlertRuleNotificationFilter notificationFilter; 
        private String observeRelationType; 
        private String observeResourceDomain; 
        private Boolean observeResourceGlobalScope; 
        private String observeResourceInstanceId; 
        private String observeResourceType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String partitionKey; 
        private Long startTimeFrom; 
        private Long startTimeTo; 
        private String status; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertHistoriesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertHistoryId = request.alertHistoryId;
            this.alertRuleId = request.alertRuleId;
            this.bizSource = request.bizSource;
            this.cmsNamespace = request.cmsNamespace;
            this.cmsProductCategory = request.cmsProductCategory;
            this.displayNameKeyWord = request.displayNameKeyWord;
            this.instanceKey = request.instanceKey;
            this.labelFilter = request.labelFilter;
            this.latestLevel = request.latestLevel;
            this.maxLevel = request.maxLevel;
            this.maxResults = request.maxResults;
            this.migrationStatus = request.migrationStatus;
            this.nextToken = request.nextToken;
            this.notificationFilter = request.notificationFilter;
            this.observeRelationType = request.observeRelationType;
            this.observeResourceDomain = request.observeResourceDomain;
            this.observeResourceGlobalScope = request.observeResourceGlobalScope;
            this.observeResourceInstanceId = request.observeResourceInstanceId;
            this.observeResourceType = request.observeResourceType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.partitionKey = request.partitionKey;
            this.startTimeFrom = request.startTimeFrom;
            this.startTimeTo = request.startTimeTo;
            this.status = request.status;
            this.workspace = request.workspace;
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
         * <p>The unique identifier (transId) of an alert history record.</p>
         * 
         * <strong>example:</strong>
         * <p>lme6hk5qih5o769m379jjuo5i1</p>
         */
        public Builder alertHistoryId(String alertHistoryId) {
            this.putQueryParameter("alertHistoryId", alertHistoryId);
            this.alertHistoryId = alertHistoryId;
            return this;
        }

        /**
         * <p>Filters the history records by a specific alert rule. Specify the unique identifier (ruleUuid) of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>mig_prom_v2_11308451</p>
         */
        public Builder alertRuleId(String alertRuleId) {
            this.putQueryParameter("alertRuleId", alertRuleId);
            this.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * <p>The business source of the alert history. For example, <code>managed_service_for_prometheus</code> indicates the managed type of the Prometheus integration center. The default value is empty. Leave this parameter empty if you are unsure about the value.</p>
         * 
         * <strong>example:</strong>
         * <p>managed_service_for_prometheus</p>
         */
        public Builder bizSource(String bizSource) {
            this.putQueryParameter("bizSource", bizSource);
            this.bizSource = bizSource;
            return this;
        }

        /**
         * <p>The namespace of CloudMonitor. Examples: acs_rds_dashboard and acs_ecs_dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_rds_dashboard</p>
         */
        public Builder cmsNamespace(String cmsNamespace) {
            this.putQueryParameter("cmsNamespace", cmsNamespace);
            this.cmsNamespace = cmsNamespace;
            return this;
        }

        /**
         * <p>The product category of CloudMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder cmsProductCategory(String cmsProductCategory) {
            this.putQueryParameter("cmsProductCategory", cmsProductCategory);
            this.cmsProductCategory = cmsProductCategory;
            return this;
        }

        /**
         * <p>The keyword used for fuzzy matching and filtering based on the display name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        public Builder displayNameKeyWord(String displayNameKeyWord) {
            this.putQueryParameter("displayNameKeyWord", displayNameKeyWord);
            this.displayNameKeyWord = displayNameKeyWord;
            return this;
        }

        /**
         * <p>The unique key (instanceKey) used to identify the alert object instance.</p>
         * 
         * <strong>example:</strong>
         * <p>entity/apm/apm.service/6dc9e46fda6d012537b48c3250ff806b</p>
         */
        public Builder instanceKey(String instanceKey) {
            this.putQueryParameter("instanceKey", instanceKey);
            this.instanceKey = instanceKey;
            return this;
        }

        /**
         * <p>The filter condition for rule labels. The value is a JSON-formatted string that supports filtering by label key-value pairs.</p>
         */
        public Builder labelFilter(AlertRuleLabelFilter labelFilter) {
            String labelFilterShrink = shrink(labelFilter, "labelFilter", "json");
            this.putQueryParameter("labelFilter", labelFilterShrink);
            this.labelFilter = labelFilter;
            return this;
        }

        /**
         * <p>The level of the most recent alert during the alert duration. Valid values: CRITICAL, WARN, and INFO.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        public Builder latestLevel(String latestLevel) {
            this.putQueryParameter("latestLevel", latestLevel);
            this.latestLevel = latestLevel;
            return this;
        }

        /**
         * <p>The highest alert level reached during the alert duration. Valid values: CRITICAL, WARN, and INFO.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        public Builder maxLevel(String maxLevel) {
            this.putQueryParameter("maxLevel", maxLevel);
            this.maxLevel = maxLevel;
            return this;
        }

        /**
         * <p>The maximum number of results to return on each page. This parameter is not supported. Use pageSize and pageNumber for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The migration status of the alert history.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder migrationStatus(Integer migrationStatus) {
            this.putQueryParameter("migrationStatus", migrationStatus);
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * <p>The pagination token used for the next query. This parameter is not supported. Use pageSize and pageNumber for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters alert rules that contain specific notification recipients. Only rules that contain at least one of the notification recipients specified in notifyTargets are returned in the result list.</p>
         */
        public Builder notificationFilter(AlertRuleNotificationFilter notificationFilter) {
            String notificationFilterShrink = shrink(notificationFilter, "notificationFilter", "json");
            this.putQueryParameter("notificationFilter", notificationFilterShrink);
            this.notificationFilter = notificationFilter;
            return this;
        }

        /**
         * <p>The relation type of the observed object. Examples: GROUP, INSTANCE, and TAG.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder observeRelationType(String observeRelationType) {
            this.putQueryParameter("observeRelationType", observeRelationType);
            this.observeRelationType = observeRelationType;
            return this;
        }

        /**
         * <p>The dimension column (domain) of the observed object.</p>
         * 
         * <strong>example:</strong>
         * <p>acs</p>
         */
        public Builder observeResourceDomain(String observeResourceDomain) {
            this.putQueryParameter("observeResourceDomain", observeResourceDomain);
            this.observeResourceDomain = observeResourceDomain;
            return this;
        }

        /**
         * <p>Specifies whether the observed object is in the global scope.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder observeResourceGlobalScope(Boolean observeResourceGlobalScope) {
            this.putQueryParameter("observeResourceGlobalScope", observeResourceGlobalScope);
            this.observeResourceGlobalScope = observeResourceGlobalScope;
            return this;
        }

        /**
         * <p>Filters the alert history by resource instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1234567890abcdef</p>
         */
        public Builder observeResourceInstanceId(String observeResourceInstanceId) {
            this.putQueryParameter("observeResourceInstanceId", observeResourceInstanceId);
            this.observeResourceInstanceId = observeResourceInstanceId;
            return this;
        }

        /**
         * <p>The type of the observed object. Examples: PROMETHEUS, APM, RUM, and cms_basic.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS</p>
         */
        public Builder observeResourceType(String observeResourceType) {
            this.putQueryParameter("observeResourceType", observeResourceType);
            this.observeResourceType = observeResourceType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of alert history records to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The key used for data partitioning. Typically, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder partitionKey(String partitionKey) {
            this.putQueryParameter("partitionKey", partitionKey);
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * <p>The start timestamp of the time range for the alert start time. The value is a UNIX timestamp in milliseconds. If not specified, the default value is the time 30 days ago.</p>
         * 
         * <strong>example:</strong>
         * <p>1739866071668</p>
         */
        public Builder startTimeFrom(Long startTimeFrom) {
            this.putQueryParameter("startTimeFrom", startTimeFrom);
            this.startTimeFrom = startTimeFrom;
            return this;
        }

        /**
         * <p>The end timestamp of the time range for the alert start time. The value is a UNIX timestamp in milliseconds. If not specified, the default value is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1739866071668</p>
         */
        public Builder startTimeTo(Long startTimeTo) {
            this.putQueryParameter("startTimeTo", startTimeTo);
            this.startTimeTo = startTimeTo;
            return this;
        }

        /**
         * <p>The current status of the alert history. Valid values: OK and ALARM.</p>
         * 
         * <strong>example:</strong>
         * <p>ALARM</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The identifier of the workspace to which the alert history belongs. If not specified, the default workspace is used.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-<userId>-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListAlertHistoriesRequest build() {
            return new ListAlertHistoriesRequest(this);
        } 

    } 

}
