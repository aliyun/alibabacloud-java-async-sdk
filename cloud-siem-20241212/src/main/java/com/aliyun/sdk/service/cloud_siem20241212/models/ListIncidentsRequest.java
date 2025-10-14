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
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncidentName")
    private String incidentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentStatus")
    private Integer incidentStatus;

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
        this.endTime = builder.endTime;
        this.incidentName = builder.incidentName;
        this.incidentStatus = builder.incidentStatus;
        this.incidentTags = builder.incidentTags;
        this.incidentUuids = builder.incidentUuids;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderDirection = builder.orderDirection;
        this.orderFieldName = builder.orderFieldName;
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
        private Long endTime; 
        private String incidentName; 
        private Integer incidentStatus; 
        private String incidentTags; 
        private java.util.List<String> incidentUuids; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderDirection; 
        private String orderFieldName; 
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
            this.endTime = request.endTime;
            this.incidentName = request.incidentName;
            this.incidentStatus = request.incidentStatus;
            this.incidentTags = request.incidentTags;
            this.incidentUuids = request.incidentUuids;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderDirection = request.orderDirection;
            this.orderFieldName = request.orderFieldName;
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
         * AlertUuid.
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IncidentName.
         */
        public Builder incidentName(String incidentName) {
            this.putQueryParameter("IncidentName", incidentName);
            this.incidentName = incidentName;
            return this;
        }

        /**
         * IncidentStatus.
         */
        public Builder incidentStatus(Integer incidentStatus) {
            this.putBodyParameter("IncidentStatus", incidentStatus);
            this.incidentStatus = incidentStatus;
            return this;
        }

        /**
         * IncidentTags.
         */
        public Builder incidentTags(String incidentTags) {
            this.putBodyParameter("IncidentTags", incidentTags);
            this.incidentTags = incidentTags;
            return this;
        }

        /**
         * IncidentUuids.
         */
        public Builder incidentUuids(java.util.List<String> incidentUuids) {
            String incidentUuidsShrink = shrink(incidentUuids, "IncidentUuids", "simple");
            this.putQueryParameter("IncidentUuids", incidentUuidsShrink);
            this.incidentUuids = incidentUuids;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * OrderFieldName.
         */
        public Builder orderFieldName(String orderFieldName) {
            this.putBodyParameter("OrderFieldName", orderFieldName);
            this.orderFieldName = orderFieldName;
            return this;
        }

        /**
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RelateAssetId.
         */
        public Builder relateAssetId(String relateAssetId) {
            this.putBodyParameter("RelateAssetId", relateAssetId);
            this.relateAssetId = relateAssetId;
            return this;
        }

        /**
         * RelateEntityId.
         */
        public Builder relateEntityId(String relateEntityId) {
            this.putBodyParameter("RelateEntityId", relateEntityId);
            this.relateEntityId = relateEntityId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * ThreatLevel.
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
