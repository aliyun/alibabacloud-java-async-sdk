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
 * {@link ListIncidentsRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentsRequest</p>
 */
public class ListIncidentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUuid")
    private String alertUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleIds")
    private java.util.List<String> detectionRuleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncidentName")
    private String incidentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentStatus")
    private Integer incidentStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentStatusList")
    private java.util.List<String> incidentStatusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentTags")
    private String incidentTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncidentUuids")
    private java.util.List<String> incidentUuids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderFieldName")
    private String orderFieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owners")
    private java.util.List<String> owners;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelateAssetId")
    private String relateAssetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelateEntityId")
    private String relateEntityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThreatLevel")
    private java.util.List<String> threatLevel;

    private ListIncidentsRequest(Builder builder) {
        super(builder);
        this.alertUuid = builder.alertUuid;
        this.detectionRuleIds = builder.detectionRuleIds;
        this.endTime = builder.endTime;
        this.incidentName = builder.incidentName;
        this.incidentStatus = builder.incidentStatus;
        this.incidentStatusList = builder.incidentStatusList;
        this.incidentTags = builder.incidentTags;
        this.incidentUuids = builder.incidentUuids;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderDirection = builder.orderDirection;
        this.orderFieldName = builder.orderFieldName;
        this.owners = builder.owners;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.relateAssetId = builder.relateAssetId;
        this.relateEntityId = builder.relateEntityId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.startTime = builder.startTime;
        this.threatLevel = builder.threatLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentsRequest create() {
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
     * @return detectionRuleIds
     */
    public java.util.List<String> getDetectionRuleIds() {
        return this.detectionRuleIds;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return incidentName
     */
    public String getIncidentName() {
        return this.incidentName;
    }

    /**
     * @return incidentStatus
     */
    public Integer getIncidentStatus() {
        return this.incidentStatus;
    }

    /**
     * @return incidentStatusList
     */
    public java.util.List<String> getIncidentStatusList() {
        return this.incidentStatusList;
    }

    /**
     * @return incidentTags
     */
    public String getIncidentTags() {
        return this.incidentTags;
    }

    /**
     * @return incidentUuids
     */
    public java.util.List<String> getIncidentUuids() {
        return this.incidentUuids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return orderFieldName
     */
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    /**
     * @return owners
     */
    public java.util.List<String> getOwners() {
        return this.owners;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relateAssetId
     */
    public String getRelateAssetId() {
        return this.relateAssetId;
    }

    /**
     * @return relateEntityId
     */
    public String getRelateEntityId() {
        return this.relateEntityId;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return threatLevel
     */
    public java.util.List<String> getThreatLevel() {
        return this.threatLevel;
    }

    public static final class Builder extends Request.Builder<ListIncidentsRequest, Builder> {
        private String alertUuid; 
        private java.util.List<String> detectionRuleIds; 
        private Long endTime; 
        private String incidentName; 
        private Integer incidentStatus; 
        private java.util.List<String> incidentStatusList; 
        private String incidentTags; 
        private java.util.List<String> incidentUuids; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderDirection; 
        private String orderFieldName; 
        private java.util.List<String> owners; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String relateAssetId; 
        private String relateEntityId; 
        private Long roleFor; 
        private Integer roleType; 
        private Long startTime; 
        private java.util.List<String> threatLevel; 

        private Builder() {
            super();
        } 

        private Builder(ListIncidentsRequest request) {
            super(request);
            this.alertUuid = request.alertUuid;
            this.detectionRuleIds = request.detectionRuleIds;
            this.endTime = request.endTime;
            this.incidentName = request.incidentName;
            this.incidentStatus = request.incidentStatus;
            this.incidentStatusList = request.incidentStatusList;
            this.incidentTags = request.incidentTags;
            this.incidentUuids = request.incidentUuids;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderDirection = request.orderDirection;
            this.orderFieldName = request.orderFieldName;
            this.owners = request.owners;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.relateAssetId = request.relateAssetId;
            this.relateEntityId = request.relateEntityId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.startTime = request.startTime;
            this.threatLevel = request.threatLevel;
        } 

        /**
         * <p>The alert ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * <p>The list of detection rule IDs.</p>
         */
        public Builder detectionRuleIds(java.util.List<String> detectionRuleIds) {
            this.putBodyParameter("DetectionRuleIds", detectionRuleIds);
            this.detectionRuleIds = detectionRuleIds;
            return this;
        }

        /**
         * <p>The end time timestamp, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1749090526055</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS unusual log in</p>
         */
        public Builder incidentName(String incidentName) {
            this.putQueryParameter("IncidentName", incidentName);
            this.incidentName = incidentName;
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
            this.putBodyParameter("IncidentStatus", incidentStatus);
            this.incidentStatus = incidentStatus;
            return this;
        }

        /**
         * <p>The list of event statuses.</p>
         * 
         * <strong>example:</strong>
         * <p>[0,1,5]</p>
         */
        public Builder incidentStatusList(java.util.List<String> incidentStatusList) {
            this.putBodyParameter("IncidentStatusList", incidentStatusList);
            this.incidentStatusList = incidentStatusList;
            return this;
        }

        /**
         * <p>The event tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;data_source\&quot;:[\&quot;sas\&quot;]}]</p>
         */
        public Builder incidentTags(String incidentTags) {
            this.putBodyParameter("IncidentTags", incidentTags);
            this.incidentTags = incidentTags;
            return this;
        }

        /**
         * <p>The list of event UUIDs, separated by commas (half-width).</p>
         */
        public Builder incidentUuids(java.util.List<String> incidentUuids) {
            String incidentUuidsShrink = shrink(incidentUuids, "IncidentUuids", "simple");
            this.putQueryParameter("IncidentUuids", incidentUuidsShrink);
            this.incidentUuids = incidentUuids;
            return this;
        }

        /**
         * <p>The language of the response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Pass the language code explicitly.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of entries to read in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve the next page of results. Leave this parameter empty for the first request or when there are no more pages. If more pages exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort direction. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong> (default): Descending order.</li>
         * <li><strong>asc</strong>: Ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The field used to sort the list. Valid values:</p>
         * <ul>
         * <li>GmtModified: The event update time (default).</li>
         * <li>ThreatScore: The threat score.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtModified</p>
         */
        public Builder orderFieldName(String orderFieldName) {
            this.putBodyParameter("OrderFieldName", orderFieldName);
            this.orderFieldName = orderFieldName;
            return this;
        }

        /**
         * <p>The UID of the account responsible for the event.</p>
         */
        public Builder owners(java.util.List<String> owners) {
            this.putBodyParameter("Owners", owners);
            this.owners = owners;
            return this;
        }

        /**
         * <p>The current page number for pagination.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to display per page.</p>
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
         * <p>The location of the data management center for Cloud Threat Detection and Response (CTDR). Select the management center location based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Assets are located outside China.</li>
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
         * <p>The ID of the asset associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>6c740667-80b2-476d-8924-2e706feb****</p>
         */
        public Builder relateAssetId(String relateAssetId) {
            this.putBodyParameter("RelateAssetId", relateAssetId);
            this.relateAssetId = relateAssetId;
            return this;
        }

        /**
         * <p>The ID of the entity associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>b920ed22259f5412099e97dfda96****</p>
         */
        public Builder relateEntityId(String relateEntityId) {
            this.putBodyParameter("RelateEntityId", relateEntityId);
            this.relateEntityId = relateEntityId;
            return this;
        }

        /**
         * <p>The user ID that the administrator uses to switch to another member\&quot;s view.</p>
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
         * <p>The view type. Valid values:</p>
         * <ul>
         * <li>0: The current Alibaba Cloud account view.</li>
         * <li>1: The view of all accounts in the enterprise.</li>
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
         * <p>The start time timestamp, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1690102943000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
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
         * <p>5</p>
         */
        public Builder threatLevel(java.util.List<String> threatLevel) {
            this.putBodyParameter("ThreatLevel", threatLevel);
            this.threatLevel = threatLevel;
            return this;
        }

        @Override
        public ListIncidentsRequest build() {
            return new ListIncidentsRequest(this);
        } 

    } 

}
