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
         * Incidents.
         */
        public Builder incidents(java.util.List<Incidents> incidents) {
            this.incidents = incidents;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("IncidentName")
        private String incidentName;

        @com.aliyun.core.annotation.NameInMap("IncidentRemark")
        private String incidentRemark;

        @com.aliyun.core.annotation.NameInMap("IncidentStatus")
        private Integer incidentStatus;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("RelateAlertCount")
        private Integer relateAlertCount;

        @com.aliyun.core.annotation.NameInMap("RelateAssetCount")
        private Integer relateAssetCount;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Incidents(Builder builder) {
            this.createTime = builder.createTime;
            this.incidentName = builder.incidentName;
            this.incidentRemark = builder.incidentRemark;
            this.incidentStatus = builder.incidentStatus;
            this.incidentUuid = builder.incidentUuid;
            this.relateAlertCount = builder.relateAlertCount;
            this.relateAssetCount = builder.relateAssetCount;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
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
            private Long createTime; 
            private String incidentName; 
            private String incidentRemark; 
            private Integer incidentStatus; 
            private String incidentUuid; 
            private Integer relateAlertCount; 
            private Integer relateAssetCount; 
            private String threatLevel; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Incidents model) {
                this.createTime = model.createTime;
                this.incidentName = model.incidentName;
                this.incidentRemark = model.incidentRemark;
                this.incidentStatus = model.incidentStatus;
                this.incidentUuid = model.incidentUuid;
                this.relateAlertCount = model.relateAlertCount;
                this.relateAssetCount = model.relateAssetCount;
                this.threatLevel = model.threatLevel;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IncidentName.
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * IncidentRemark.
             */
            public Builder incidentRemark(String incidentRemark) {
                this.incidentRemark = incidentRemark;
                return this;
            }

            /**
             * IncidentStatus.
             */
            public Builder incidentStatus(Integer incidentStatus) {
                this.incidentStatus = incidentStatus;
                return this;
            }

            /**
             * IncidentUuid.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * RelateAlertCount.
             */
            public Builder relateAlertCount(Integer relateAlertCount) {
                this.relateAlertCount = relateAlertCount;
                return this;
            }

            /**
             * RelateAssetCount.
             */
            public Builder relateAssetCount(Integer relateAssetCount) {
                this.relateAssetCount = relateAssetCount;
                return this;
            }

            /**
             * ThreatLevel.
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * UpdateTime.
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
