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
 * {@link ListAlertHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertHistoriesResponseBody</p>
 */
public class ListAlertHistoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListAlertHistoriesResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertHistoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAlertHistoriesResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of alert histories that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;alertHistoryId&quot;:&quot;ah_123456&quot;,&quot;alertRuleId&quot;:&quot;rule_789&quot;,&quot;status&quot;:&quot;ALARM&quot;,&quot;startTime&quot;:1704067200000}]</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of alert history records that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlertHistoriesResponseBody build() {
            return new ListAlertHistoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertHistoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertHistoriesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertHistoryId")
        private String alertHistoryId;

        @com.aliyun.core.annotation.NameInMap("alertRuleId")
        private String alertRuleId;

        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.Map<String, String> annotations;

        @com.aliyun.core.annotation.NameInMap("bizSource")
        private String bizSource;

        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("instanceDetail")
        private java.util.Map<String, String> instanceDetail;

        @com.aliyun.core.annotation.NameInMap("instanceKey")
        private String instanceKey;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("latestLevel")
        private String latestLevel;

        @com.aliyun.core.annotation.NameInMap("maxLevel")
        private String maxLevel;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("observeResourceGlobalScope")
        private Boolean observeResourceGlobalScope;

        @com.aliyun.core.annotation.NameInMap("observeResourceList")
        private String observeResourceList;

        @com.aliyun.core.annotation.NameInMap("observeResourceType")
        private String observeResourceType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ruleDisplayName")
        private String ruleDisplayName;

        @com.aliyun.core.annotation.NameInMap("send")
        private AlertRuleSend send;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Data(Builder builder) {
            this.alertHistoryId = builder.alertHistoryId;
            this.alertRuleId = builder.alertRuleId;
            this.annotations = builder.annotations;
            this.bizSource = builder.bizSource;
            this.count = builder.count;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceDetail = builder.instanceDetail;
            this.instanceKey = builder.instanceKey;
            this.labels = builder.labels;
            this.latestLevel = builder.latestLevel;
            this.maxLevel = builder.maxLevel;
            this.message = builder.message;
            this.observeResourceGlobalScope = builder.observeResourceGlobalScope;
            this.observeResourceList = builder.observeResourceList;
            this.observeResourceType = builder.observeResourceType;
            this.regionId = builder.regionId;
            this.ruleDisplayName = builder.ruleDisplayName;
            this.send = builder.send;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return annotations
         */
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return bizSource
         */
        public String getBizSource() {
            return this.bizSource;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceDetail
         */
        public java.util.Map<String, String> getInstanceDetail() {
            return this.instanceDetail;
        }

        /**
         * @return instanceKey
         */
        public String getInstanceKey() {
            return this.instanceKey;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return observeResourceGlobalScope
         */
        public Boolean getObserveResourceGlobalScope() {
            return this.observeResourceGlobalScope;
        }

        /**
         * @return observeResourceList
         */
        public String getObserveResourceList() {
            return this.observeResourceList;
        }

        /**
         * @return observeResourceType
         */
        public String getObserveResourceType() {
            return this.observeResourceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ruleDisplayName
         */
        public String getRuleDisplayName() {
            return this.ruleDisplayName;
        }

        /**
         * @return send
         */
        public AlertRuleSend getSend() {
            return this.send;
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
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String alertHistoryId; 
            private String alertRuleId; 
            private java.util.Map<String, String> annotations; 
            private String bizSource; 
            private Long count; 
            private Long endTime; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private java.util.Map<String, String> instanceDetail; 
            private String instanceKey; 
            private java.util.Map<String, String> labels; 
            private String latestLevel; 
            private String maxLevel; 
            private String message; 
            private Boolean observeResourceGlobalScope; 
            private String observeResourceList; 
            private String observeResourceType; 
            private String regionId; 
            private String ruleDisplayName; 
            private AlertRuleSend send; 
            private Long startTime; 
            private String status; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertHistoryId = model.alertHistoryId;
                this.alertRuleId = model.alertRuleId;
                this.annotations = model.annotations;
                this.bizSource = model.bizSource;
                this.count = model.count;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.instanceDetail = model.instanceDetail;
                this.instanceKey = model.instanceKey;
                this.labels = model.labels;
                this.latestLevel = model.latestLevel;
                this.maxLevel = model.maxLevel;
                this.message = model.message;
                this.observeResourceGlobalScope = model.observeResourceGlobalScope;
                this.observeResourceList = model.observeResourceList;
                this.observeResourceType = model.observeResourceType;
                this.regionId = model.regionId;
                this.ruleDisplayName = model.ruleDisplayName;
                this.send = model.send;
                this.startTime = model.startTime;
                this.status = model.status;
                this.workspace = model.workspace;
            } 

            /**
             * <p>The unique identifier of the alert history.</p>
             * 
             * <strong>example:</strong>
             * <p>u1oe4i7c197uucfmvscum4u797</p>
             */
            public Builder alertHistoryId(String alertHistoryId) {
                this.alertHistoryId = alertHistoryId;
                return this;
            }

            /**
             * <p>The unique identifier of the alert rule that generated the alert history.</p>
             * 
             * <strong>example:</strong>
             * <p>51d0da46-bb65-4a14-8d65-de73f41e495f</p>
             */
            public Builder alertRuleId(String alertRuleId) {
                this.alertRuleId = alertRuleId;
                return this;
            }

            /**
             * <p>The snapshot of the annotations of the alert rule. The annotations are stored as key-value pairs and copied from the rule when the alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;_cms_alert_explore_url&quot;:&quot;<a href="https://sls.console.aliyun.com/...%22%7D">https://sls.console.aliyun.com/...&quot;}</a></p>
             */
            public Builder annotations(java.util.Map<String, String> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The business source.</p>
             * 
             * <strong>example:</strong>
             * <p>managed_service_for_prometheus</p>
             */
            public Builder bizSource(String bizSource) {
                this.bizSource = bizSource;
                return this;
            }

            /**
             * <p>The cumulative number of alerts (alert events) during the alert duration.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The end time (recovery time) of the alert. This field has a value only when the alert history enters the OK state. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1740535517000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The creation time of the alert history record. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1751608363000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time of the alert history record. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1751608363000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The detailed information of the alert object. The information is stored as key-value pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;datasourceInfo&quot;:{&quot;type&quot;:&quot;SLS_MULTI_DS&quot;}}</p>
             */
            public Builder instanceDetail(java.util.Map<String, String> instanceDetail) {
                this.instanceDetail = instanceDetail;
                return this;
            }

            /**
             * <p>The unique key (instanceKey) used to identify the alert object instance.</p>
             * 
             * <strong>example:</strong>
             * <p>entity/apm/apm.service/6dc9e46fda6d012537b48c3250ff806b</p>
             */
            public Builder instanceKey(String instanceKey) {
                this.instanceKey = instanceKey;
                return this;
            }

            /**
             * <p>The snapshot of the labels of the alert rule. The labels are stored as key-value pairs and copied from the rule when the alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;_cms_rule_id&quot;:&quot;42c0f464-a3b0-4c4b-b426-6242289244f8&quot;,&quot;tenant_id&quot;:&quot;mygt&quot;}</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The level of the most recent alert during the alert duration, such as CRITICAL, WARN, or INFO.</p>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder latestLevel(String latestLevel) {
                this.latestLevel = latestLevel;
                return this;
            }

            /**
             * <p>The highest alert level reached during the alert duration.</p>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder maxLevel(String maxLevel) {
                this.maxLevel = maxLevel;
                return this;
            }

            /**
             * <p>The content of the latest alert message.</p>
             * 
             * <strong>example:</strong>
             * <p>The number of zombie child processes of the process {{$tags.comm}} running on the instance {{$tags.instanceId}} is greater than 128</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the observed object is in the global scope. The value is copied from the rule when the alert history is created.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder observeResourceGlobalScope(Boolean observeResourceGlobalScope) {
                this.observeResourceGlobalScope = observeResourceGlobalScope;
                return this;
            }

            /**
             * <p>The serialized string of the observed object list. The value is copied from the rule when the alert history is created.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;resourceId&quot;:&quot;i-bp1234567890abcdef&quot;,&quot;resourceType&quot;:&quot;ACS::ECS::Instance&quot;}]</p>
             */
            public Builder observeResourceList(String observeResourceList) {
                this.observeResourceList = observeResourceList;
                return this;
            }

            /**
             * <p>The type of the observed object, such as PROMETHEUS, APM, RUM, or cms_basic. The value is copied from the rule when the alert history is created.</p>
             * 
             * <strong>example:</strong>
             * <p>PROMETHEUS</p>
             */
            public Builder observeResourceType(String observeResourceType) {
                this.observeResourceType = observeResourceType;
                return this;
            }

            /**
             * <p>The ID of the region to which the alert history belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The display name of the corresponding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>myTestRule</p>
             */
            public Builder ruleDisplayName(String ruleDisplayName) {
                this.ruleDisplayName = ruleDisplayName;
                return this;
            }

            /**
             * <p>The notification sending configuration information corresponding to the alert history.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;notification&quot;:{&quot;contacts&quot;:[&quot;ops-team&quot;],&quot;silenceTime&quot;:3600}}</p>
             */
            public Builder send(AlertRuleSend send) {
                this.send = send;
                return this;
            }

            /**
             * <p>The start time of the alert history. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1751508233000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The current alert status of the rule. Valid values: OK (recovered) and ALARM (alerting).</p>
             * 
             * <strong>example:</strong>
             * <p>ALARM</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The identifier of the workspace to which the alert history belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default-cms-<userId>-cn-hangzhou</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
