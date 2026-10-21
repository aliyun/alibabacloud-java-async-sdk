// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListIncidentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIncidentsResponseBody</p>
 */
public class ListIncidentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Incidents")
    private java.util.List<Incidents> incidents;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListIncidentsResponseBody(Builder builder) {
        this.incidents = builder.incidents;
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

    public static ListIncidentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidents
     */
    public java.util.List<Incidents> getIncidents() {
        return this.incidents;
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
        private java.util.List<Incidents> incidents; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListIncidentsResponseBody model) {
            this.incidents = model.incidents;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of incidents.</p>
         */
        public Builder incidents(java.util.List<Incidents> incidents) {
            this.incidents = incidents;
            return this;
        }

        /**
         * <p>The maximum number of entries to read in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve the next page of results. Leave this parameter empty for the first request or when there are no more pages. If more pages exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to display per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIncidentsResponseBody build() {
            return new ListIncidentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIncidentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIncidentsResponseBody</p>
     */
    public static class Incidents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInfos")
        private String alertInfos;

        @com.aliyun.core.annotation.NameInMap("AlertSources")
        private java.util.List<String> alertSources;

        @com.aliyun.core.annotation.NameInMap("AttckTactics")
        private String attckTactics;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleId")
        private String detectionRuleId;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleName")
        private String detectionRuleName;

        @com.aliyun.core.annotation.NameInMap("EntityInfos")
        private String entityInfos;

        @com.aliyun.core.annotation.NameInMap("IncidentDescription")
        private String incidentDescription;

        @com.aliyun.core.annotation.NameInMap("IncidentName")
        private String incidentName;

        @com.aliyun.core.annotation.NameInMap("IncidentRemark")
        private String incidentRemark;

        @com.aliyun.core.annotation.NameInMap("IncidentStatus")
        private Integer incidentStatus;

        @com.aliyun.core.annotation.NameInMap("IncidentTags")
        private String incidentTags;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("RelateAlertCount")
        private Integer relateAlertCount;

        @com.aliyun.core.annotation.NameInMap("RelateAssetCount")
        private Integer relateAssetCount;

        @com.aliyun.core.annotation.NameInMap("ResponseTime")
        private Long responseTime;

        @com.aliyun.core.annotation.NameInMap("ResponseTypes")
        private java.util.List<String> responseTypes;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Incidents(Builder builder) {
            this.alertInfos = builder.alertInfos;
            this.alertSources = builder.alertSources;
            this.attckTactics = builder.attckTactics;
            this.createTime = builder.createTime;
            this.detectionRuleId = builder.detectionRuleId;
            this.detectionRuleName = builder.detectionRuleName;
            this.entityInfos = builder.entityInfos;
            this.incidentDescription = builder.incidentDescription;
            this.incidentName = builder.incidentName;
            this.incidentRemark = builder.incidentRemark;
            this.incidentStatus = builder.incidentStatus;
            this.incidentTags = builder.incidentTags;
            this.incidentUuid = builder.incidentUuid;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.relateAlertCount = builder.relateAlertCount;
            this.relateAssetCount = builder.relateAssetCount;
            this.responseTime = builder.responseTime;
            this.responseTypes = builder.responseTypes;
            this.threatLevel = builder.threatLevel;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Incidents create() {
            return builder().build();
        }

        /**
         * @return alertInfos
         */
        public String getAlertInfos() {
            return this.alertInfos;
        }

        /**
         * @return alertSources
         */
        public java.util.List<String> getAlertSources() {
            return this.alertSources;
        }

        /**
         * @return attckTactics
         */
        public String getAttckTactics() {
            return this.attckTactics;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return detectionRuleId
         */
        public String getDetectionRuleId() {
            return this.detectionRuleId;
        }

        /**
         * @return detectionRuleName
         */
        public String getDetectionRuleName() {
            return this.detectionRuleName;
        }

        /**
         * @return entityInfos
         */
        public String getEntityInfos() {
            return this.entityInfos;
        }

        /**
         * @return incidentDescription
         */
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        /**
         * @return incidentName
         */
        public String getIncidentName() {
            return this.incidentName;
        }

        /**
         * @return incidentRemark
         */
        public String getIncidentRemark() {
            return this.incidentRemark;
        }

        /**
         * @return incidentStatus
         */
        public Integer getIncidentStatus() {
            return this.incidentStatus;
        }

        /**
         * @return incidentTags
         */
        public String getIncidentTags() {
            return this.incidentTags;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return relateAlertCount
         */
        public Integer getRelateAlertCount() {
            return this.relateAlertCount;
        }

        /**
         * @return relateAssetCount
         */
        public Integer getRelateAssetCount() {
            return this.relateAssetCount;
        }

        /**
         * @return responseTime
         */
        public Long getResponseTime() {
            return this.responseTime;
        }

        /**
         * @return responseTypes
         */
        public java.util.List<String> getResponseTypes() {
            return this.responseTypes;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String alertInfos; 
            private java.util.List<String> alertSources; 
            private String attckTactics; 
            private Long createTime; 
            private String detectionRuleId; 
            private String detectionRuleName; 
            private String entityInfos; 
            private String incidentDescription; 
            private String incidentName; 
            private String incidentRemark; 
            private Integer incidentStatus; 
            private String incidentTags; 
            private String incidentUuid; 
            private String owner; 
            private String ownerName; 
            private Integer relateAlertCount; 
            private Integer relateAssetCount; 
            private Long responseTime; 
            private java.util.List<String> responseTypes; 
            private String threatLevel; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Incidents model) {
                this.alertInfos = model.alertInfos;
                this.alertSources = model.alertSources;
                this.attckTactics = model.attckTactics;
                this.createTime = model.createTime;
                this.detectionRuleId = model.detectionRuleId;
                this.detectionRuleName = model.detectionRuleName;
                this.entityInfos = model.entityInfos;
                this.incidentDescription = model.incidentDescription;
                this.incidentName = model.incidentName;
                this.incidentRemark = model.incidentRemark;
                this.incidentStatus = model.incidentStatus;
                this.incidentTags = model.incidentTags;
                this.incidentUuid = model.incidentUuid;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.relateAlertCount = model.relateAlertCount;
                this.relateAssetCount = model.relateAssetCount;
                this.responseTime = model.responseTime;
                this.responseTypes = model.responseTypes;
                this.threatLevel = model.threatLevel;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The list of associated alert information.</p>
             */
            public Builder alertInfos(String alertInfos) {
                this.alertInfos = alertInfos;
                return this;
            }

            /**
             * <p>The list of alert source codes or modules.</p>
             */
            public Builder alertSources(java.util.List<String> alertSources) {
                this.alertSources = alertSources;
                return this;
            }

            /**
             * <p>The list of MITRE ATT&amp;CK tactics.</p>
             */
            public Builder attckTactics(String attckTactics) {
                this.attckTactics = attckTactics;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1603248483000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>dr-qo5ww6ux0uc28*****</p>
             */
            public Builder detectionRuleId(String detectionRuleId) {
                this.detectionRuleId = detectionRuleId;
                return this;
            }

            /**
             * <p>The name of the detection rule.</p>
             */
            public Builder detectionRuleName(String detectionRuleName) {
                this.detectionRuleName = detectionRuleName;
                return this;
            }

            /**
             * <p>The list of associated entity information.</p>
             */
            public Builder entityInfos(String entityInfos) {
                this.entityInfos = entityInfos;
                return this;
            }

            /**
             * <p>The description of the incident.</p>
             */
            public Builder incidentDescription(String incidentDescription) {
                this.incidentDescription = incidentDescription;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS unusual log in</p>
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * <p>The remark for the incident.</p>
             * 
             * <strong>example:</strong>
             * <p>remark</p>
             */
            public Builder incidentRemark(String incidentRemark) {
                this.incidentRemark = incidentRemark;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li>0: Unhandled.</li>
             * <li>1: Handling.</li>
             * <li>5: Handling failed.</li>
             * <li>10: Handled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder incidentStatus(Integer incidentStatus) {
                this.incidentStatus = incidentStatus;
                return this;
            }

            /**
             * <p>The event tags.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sys:data_source:siem&quot;,&quot;sys:trigger_type:auto&quot;]</p>
             */
            public Builder incidentTags(String incidentTags) {
                this.incidentTags = incidentTags;
                return this;
            }

            /**
             * <p>The UUID of the incident.</p>
             * 
             * <strong>example:</strong>
             * <p>dbb1d7211c9285c862aa89385098****</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * <p>The UID of the account responsible for the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890xxxxxx</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The display name of the incident owner.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The number of alerts associated with the incident.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder relateAlertCount(Integer relateAlertCount) {
                this.relateAlertCount = relateAlertCount;
                return this;
            }

            /**
             * <p>The number of assets associated with the incident.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder relateAssetCount(Integer relateAssetCount) {
                this.relateAssetCount = relateAssetCount;
                return this;
            }

            /**
             * <p>The response time, in milliseconds (ms).</p>
             * 
             * <strong>example:</strong>
             * <p>1603248483000</p>
             */
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * <p>The list of response types. Valid values: auto, manual, ai.</p>
             */
            public Builder responseTypes(java.util.List<String> responseTypes) {
                this.responseTypes = responseTypes;
                return this;
            }

            /**
             * <p>The threat level. Valid values:</p>
             * <ul>
             * <li>5: Critical.</li>
             * <li>4: High.</li>
             * <li>3: Medium.</li>
             * <li>2: Low.</li>
             * <li>1: Informational.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1603248483000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Incidents build() {
                return new Incidents(this);
            } 

        } 

    }
}
