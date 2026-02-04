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
 * {@link GetIncidentResponseBody} extends {@link TeaModel}
 *
 * <p>GetIncidentResponseBody</p>
 */
public class GetIncidentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Incident")
    private Incident incident;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIncidentResponseBody(Builder builder) {
        this.incident = builder.incident;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incident
     */
    public Incident getIncident() {
        return this.incident;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Incident incident; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIncidentResponseBody model) {
            this.incident = model.incident;
            this.requestId = model.requestId;
        } 

        /**
         * Incident.
         */
        public Builder incident(Incident incident) {
            this.incident = incident;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIncidentResponseBody build() {
            return new GetIncidentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIncidentResponseBody} extends {@link TeaModel}
     *
     * <p>GetIncidentResponseBody</p>
     */
    public static class Incident extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttckTactics")
        private Object attckTactics;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleId")
        private String detectionRuleId;

        @com.aliyun.core.annotation.NameInMap("IncidentAggregationType")
        private String incidentAggregationType;

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

        @com.aliyun.core.annotation.NameInMap("RelateAlertCount")
        private Integer relateAlertCount;

        @com.aliyun.core.annotation.NameInMap("RelateAssetCount")
        private Integer relateAssetCount;

        @com.aliyun.core.annotation.NameInMap("RelateDataSourceIds")
        private Object relateDataSourceIds;

        @com.aliyun.core.annotation.NameInMap("RelateUserIds")
        private Object relateUserIds;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatScore")
        private String threatScore;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Incident(Builder builder) {
            this.attckTactics = builder.attckTactics;
            this.createTime = builder.createTime;
            this.detectionRuleId = builder.detectionRuleId;
            this.incidentAggregationType = builder.incidentAggregationType;
            this.incidentDescription = builder.incidentDescription;
            this.incidentName = builder.incidentName;
            this.incidentRemark = builder.incidentRemark;
            this.incidentStatus = builder.incidentStatus;
            this.incidentTags = builder.incidentTags;
            this.incidentUuid = builder.incidentUuid;
            this.owner = builder.owner;
            this.relateAlertCount = builder.relateAlertCount;
            this.relateAssetCount = builder.relateAssetCount;
            this.relateDataSourceIds = builder.relateDataSourceIds;
            this.relateUserIds = builder.relateUserIds;
            this.threatLevel = builder.threatLevel;
            this.threatScore = builder.threatScore;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Incident create() {
            return builder().build();
        }

        /**
         * @return attckTactics
         */
        public Object getAttckTactics() {
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
         * @return incidentAggregationType
         */
        public String getIncidentAggregationType() {
            return this.incidentAggregationType;
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
         * @return relateDataSourceIds
         */
        public Object getRelateDataSourceIds() {
            return this.relateDataSourceIds;
        }

        /**
         * @return relateUserIds
         */
        public Object getRelateUserIds() {
            return this.relateUserIds;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatScore
         */
        public String getThreatScore() {
            return this.threatScore;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Object attckTactics; 
            private Long createTime; 
            private String detectionRuleId; 
            private String incidentAggregationType; 
            private String incidentDescription; 
            private String incidentName; 
            private String incidentRemark; 
            private Integer incidentStatus; 
            private String incidentTags; 
            private String incidentUuid; 
            private String owner; 
            private Integer relateAlertCount; 
            private Integer relateAssetCount; 
            private Object relateDataSourceIds; 
            private Object relateUserIds; 
            private String threatLevel; 
            private String threatScore; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Incident model) {
                this.attckTactics = model.attckTactics;
                this.createTime = model.createTime;
                this.detectionRuleId = model.detectionRuleId;
                this.incidentAggregationType = model.incidentAggregationType;
                this.incidentDescription = model.incidentDescription;
                this.incidentName = model.incidentName;
                this.incidentRemark = model.incidentRemark;
                this.incidentStatus = model.incidentStatus;
                this.incidentTags = model.incidentTags;
                this.incidentUuid = model.incidentUuid;
                this.owner = model.owner;
                this.relateAlertCount = model.relateAlertCount;
                this.relateAssetCount = model.relateAssetCount;
                this.relateDataSourceIds = model.relateDataSourceIds;
                this.relateUserIds = model.relateUserIds;
                this.threatLevel = model.threatLevel;
                this.threatScore = model.threatScore;
                this.updateTime = model.updateTime;
            } 

            /**
             * AttckTactics.
             */
            public Builder attckTactics(Object attckTactics) {
                this.attckTactics = attckTactics;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DetectionRuleId.
             */
            public Builder detectionRuleId(String detectionRuleId) {
                this.detectionRuleId = detectionRuleId;
                return this;
            }

            /**
             * IncidentAggregationType.
             */
            public Builder incidentAggregationType(String incidentAggregationType) {
                this.incidentAggregationType = incidentAggregationType;
                return this;
            }

            /**
             * IncidentDescription.
             */
            public Builder incidentDescription(String incidentDescription) {
                this.incidentDescription = incidentDescription;
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
             * IncidentTags.
             */
            public Builder incidentTags(String incidentTags) {
                this.incidentTags = incidentTags;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
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
             * RelateDataSourceIds.
             */
            public Builder relateDataSourceIds(Object relateDataSourceIds) {
                this.relateDataSourceIds = relateDataSourceIds;
                return this;
            }

            /**
             * RelateUserIds.
             */
            public Builder relateUserIds(Object relateUserIds) {
                this.relateUserIds = relateUserIds;
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
             * ThreatScore.
             */
            public Builder threatScore(String threatScore) {
                this.threatScore = threatScore;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Incident build() {
                return new Incident(this);
            } 

        } 

    }
}
