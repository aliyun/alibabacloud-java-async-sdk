// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentResponseBody} extends {@link TeaModel}
 *
 * <p>GetIncidentResponseBody</p>
 */
public class GetIncidentResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetIncidentResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIncidentResponseBody build() {
            return new GetIncidentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("assignToWhoIsValid")
        private Integer assignToWhoIsValid;

        @NameInMap("assignUserId")
        private Long assignUserId;

        @NameInMap("assignUserName")
        private String assignUserName;

        @NameInMap("assignUserPhone")
        private String assignUserPhone;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("defaultAssignToWho")
        private Integer defaultAssignToWho;

        @NameInMap("defaultAssignToWhoIsValid")
        private Integer defaultAssignToWhoIsValid;

        @NameInMap("defaultAssignToWhoName")
        private String defaultAssignToWhoName;

        @NameInMap("durationTime")
        private Long durationTime;

        @NameInMap("effect")
        private String effect;

        @NameInMap("incidentDescription")
        private String incidentDescription;

        @NameInMap("incidentId")
        private Long incidentId;

        @NameInMap("incidentLevel")
        private String incidentLevel;

        @NameInMap("incidentNumber")
        private String incidentNumber;

        @NameInMap("incidentStatus")
        private String incidentStatus;

        @NameInMap("incidentTitle")
        private String incidentTitle;

        @NameInMap("isManual")
        private Boolean isManual;

        @NameInMap("isUpgrade")
        private Boolean isUpgrade;

        @NameInMap("notifyChannels")
        private java.util.List < String > notifyChannels;

        @NameInMap("problemId")
        private Long problemId;

        @NameInMap("problemNumber")
        private String problemNumber;

        @NameInMap("relRouteRuleDeleteType")
        private Integer relRouteRuleDeleteType;

        @NameInMap("relServiceDeleteType")
        private Integer relServiceDeleteType;

        @NameInMap("relServiceGroupIsValid")
        private Integer relServiceGroupIsValid;

        @NameInMap("relatedServiceDescription")
        private String relatedServiceDescription;

        @NameInMap("relatedServiceGroupId")
        private Long relatedServiceGroupId;

        @NameInMap("relatedServiceGroupName")
        private String relatedServiceGroupName;

        @NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("routeRuleId")
        private Long routeRuleId;

        @NameInMap("routeRuleName")
        private String routeRuleName;

        private Data(Builder builder) {
            this.assignToWhoIsValid = builder.assignToWhoIsValid;
            this.assignUserId = builder.assignUserId;
            this.assignUserName = builder.assignUserName;
            this.assignUserPhone = builder.assignUserPhone;
            this.createTime = builder.createTime;
            this.defaultAssignToWho = builder.defaultAssignToWho;
            this.defaultAssignToWhoIsValid = builder.defaultAssignToWhoIsValid;
            this.defaultAssignToWhoName = builder.defaultAssignToWhoName;
            this.durationTime = builder.durationTime;
            this.effect = builder.effect;
            this.incidentDescription = builder.incidentDescription;
            this.incidentId = builder.incidentId;
            this.incidentLevel = builder.incidentLevel;
            this.incidentNumber = builder.incidentNumber;
            this.incidentStatus = builder.incidentStatus;
            this.incidentTitle = builder.incidentTitle;
            this.isManual = builder.isManual;
            this.isUpgrade = builder.isUpgrade;
            this.notifyChannels = builder.notifyChannels;
            this.problemId = builder.problemId;
            this.problemNumber = builder.problemNumber;
            this.relRouteRuleDeleteType = builder.relRouteRuleDeleteType;
            this.relServiceDeleteType = builder.relServiceDeleteType;
            this.relServiceGroupIsValid = builder.relServiceGroupIsValid;
            this.relatedServiceDescription = builder.relatedServiceDescription;
            this.relatedServiceGroupId = builder.relatedServiceGroupId;
            this.relatedServiceGroupName = builder.relatedServiceGroupName;
            this.relatedServiceId = builder.relatedServiceId;
            this.relatedServiceName = builder.relatedServiceName;
            this.routeRuleId = builder.routeRuleId;
            this.routeRuleName = builder.routeRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assignToWhoIsValid
         */
        public Integer getAssignToWhoIsValid() {
            return this.assignToWhoIsValid;
        }

        /**
         * @return assignUserId
         */
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        /**
         * @return assignUserName
         */
        public String getAssignUserName() {
            return this.assignUserName;
        }

        /**
         * @return assignUserPhone
         */
        public String getAssignUserPhone() {
            return this.assignUserPhone;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultAssignToWho
         */
        public Integer getDefaultAssignToWho() {
            return this.defaultAssignToWho;
        }

        /**
         * @return defaultAssignToWhoIsValid
         */
        public Integer getDefaultAssignToWhoIsValid() {
            return this.defaultAssignToWhoIsValid;
        }

        /**
         * @return defaultAssignToWhoName
         */
        public String getDefaultAssignToWhoName() {
            return this.defaultAssignToWhoName;
        }

        /**
         * @return durationTime
         */
        public Long getDurationTime() {
            return this.durationTime;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return incidentDescription
         */
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return incidentLevel
         */
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        /**
         * @return incidentNumber
         */
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        /**
         * @return incidentStatus
         */
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        /**
         * @return incidentTitle
         */
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        /**
         * @return isManual
         */
        public Boolean getIsManual() {
            return this.isManual;
        }

        /**
         * @return isUpgrade
         */
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        /**
         * @return notifyChannels
         */
        public java.util.List < String > getNotifyChannels() {
            return this.notifyChannels;
        }

        /**
         * @return problemId
         */
        public Long getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemNumber
         */
        public String getProblemNumber() {
            return this.problemNumber;
        }

        /**
         * @return relRouteRuleDeleteType
         */
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        /**
         * @return relServiceDeleteType
         */
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        /**
         * @return relServiceGroupIsValid
         */
        public Integer getRelServiceGroupIsValid() {
            return this.relServiceGroupIsValid;
        }

        /**
         * @return relatedServiceDescription
         */
        public String getRelatedServiceDescription() {
            return this.relatedServiceDescription;
        }

        /**
         * @return relatedServiceGroupId
         */
        public Long getRelatedServiceGroupId() {
            return this.relatedServiceGroupId;
        }

        /**
         * @return relatedServiceGroupName
         */
        public String getRelatedServiceGroupName() {
            return this.relatedServiceGroupName;
        }

        /**
         * @return relatedServiceId
         */
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        /**
         * @return relatedServiceName
         */
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        /**
         * @return routeRuleId
         */
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        /**
         * @return routeRuleName
         */
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

        public static final class Builder {
            private Integer assignToWhoIsValid; 
            private Long assignUserId; 
            private String assignUserName; 
            private String assignUserPhone; 
            private String createTime; 
            private Integer defaultAssignToWho; 
            private Integer defaultAssignToWhoIsValid; 
            private String defaultAssignToWhoName; 
            private Long durationTime; 
            private String effect; 
            private String incidentDescription; 
            private Long incidentId; 
            private String incidentLevel; 
            private String incidentNumber; 
            private String incidentStatus; 
            private String incidentTitle; 
            private Boolean isManual; 
            private Boolean isUpgrade; 
            private java.util.List < String > notifyChannels; 
            private Long problemId; 
            private String problemNumber; 
            private Integer relRouteRuleDeleteType; 
            private Integer relServiceDeleteType; 
            private Integer relServiceGroupIsValid; 
            private String relatedServiceDescription; 
            private Long relatedServiceGroupId; 
            private String relatedServiceGroupName; 
            private Long relatedServiceId; 
            private String relatedServiceName; 
            private Long routeRuleId; 
            private String routeRuleName; 

            /**
             * assignToWhoIsValid.
             */
            public Builder assignToWhoIsValid(Integer assignToWhoIsValid) {
                this.assignToWhoIsValid = assignToWhoIsValid;
                return this;
            }

            /**
             * assignUserId.
             */
            public Builder assignUserId(Long assignUserId) {
                this.assignUserId = assignUserId;
                return this;
            }

            /**
             * assignUserName.
             */
            public Builder assignUserName(String assignUserName) {
                this.assignUserName = assignUserName;
                return this;
            }

            /**
             * assignUserPhone.
             */
            public Builder assignUserPhone(String assignUserPhone) {
                this.assignUserPhone = assignUserPhone;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * defaultAssignToWho.
             */
            public Builder defaultAssignToWho(Integer defaultAssignToWho) {
                this.defaultAssignToWho = defaultAssignToWho;
                return this;
            }

            /**
             * defaultAssignToWhoIsValid.
             */
            public Builder defaultAssignToWhoIsValid(Integer defaultAssignToWhoIsValid) {
                this.defaultAssignToWhoIsValid = defaultAssignToWhoIsValid;
                return this;
            }

            /**
             * defaultAssignToWhoName.
             */
            public Builder defaultAssignToWhoName(String defaultAssignToWhoName) {
                this.defaultAssignToWhoName = defaultAssignToWhoName;
                return this;
            }

            /**
             * durationTime.
             */
            public Builder durationTime(Long durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * incidentDescription.
             */
            public Builder incidentDescription(String incidentDescription) {
                this.incidentDescription = incidentDescription;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * incidentLevel.
             */
            public Builder incidentLevel(String incidentLevel) {
                this.incidentLevel = incidentLevel;
                return this;
            }

            /**
             * incidentNumber.
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * incidentStatus.
             */
            public Builder incidentStatus(String incidentStatus) {
                this.incidentStatus = incidentStatus;
                return this;
            }

            /**
             * incidentTitle.
             */
            public Builder incidentTitle(String incidentTitle) {
                this.incidentTitle = incidentTitle;
                return this;
            }

            /**
             * isManual.
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * isUpgrade.
             */
            public Builder isUpgrade(Boolean isUpgrade) {
                this.isUpgrade = isUpgrade;
                return this;
            }

            /**
             * notifyChannels.
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * problemId.
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * problemNumber.
             */
            public Builder problemNumber(String problemNumber) {
                this.problemNumber = problemNumber;
                return this;
            }

            /**
             * relRouteRuleDeleteType.
             */
            public Builder relRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
                this.relRouteRuleDeleteType = relRouteRuleDeleteType;
                return this;
            }

            /**
             * relServiceDeleteType.
             */
            public Builder relServiceDeleteType(Integer relServiceDeleteType) {
                this.relServiceDeleteType = relServiceDeleteType;
                return this;
            }

            /**
             * relServiceGroupIsValid.
             */
            public Builder relServiceGroupIsValid(Integer relServiceGroupIsValid) {
                this.relServiceGroupIsValid = relServiceGroupIsValid;
                return this;
            }

            /**
             * relatedServiceDescription.
             */
            public Builder relatedServiceDescription(String relatedServiceDescription) {
                this.relatedServiceDescription = relatedServiceDescription;
                return this;
            }

            /**
             * relatedServiceGroupId.
             */
            public Builder relatedServiceGroupId(Long relatedServiceGroupId) {
                this.relatedServiceGroupId = relatedServiceGroupId;
                return this;
            }

            /**
             * relatedServiceGroupName.
             */
            public Builder relatedServiceGroupName(String relatedServiceGroupName) {
                this.relatedServiceGroupName = relatedServiceGroupName;
                return this;
            }

            /**
             * relatedServiceId.
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * relatedServiceName.
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * routeRuleId.
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            /**
             * routeRuleName.
             */
            public Builder routeRuleName(String routeRuleName) {
                this.routeRuleName = routeRuleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
