// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRouteRulesResponseBody</p>
 */
public class ListRouteRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListRouteRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRouteRulesResponseBody build() {
            return new ListRouteRulesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignObjectId")
        private Long assignObjectId;

        @com.aliyun.core.annotation.NameInMap("assignObjectType")
        private String assignObjectType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("effection")
        private String effection;

        @com.aliyun.core.annotation.NameInMap("enableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("incidentLevel")
        private String incidentLevel;

        @com.aliyun.core.annotation.NameInMap("isValid")
        private Integer isValid;

        @com.aliyun.core.annotation.NameInMap("matchCount")
        private Long matchCount;

        @com.aliyun.core.annotation.NameInMap("monitorSourceNames")
        private String monitorSourceNames;

        @com.aliyun.core.annotation.NameInMap("relServiceDeleteType")
        private Integer relServiceDeleteType;

        @com.aliyun.core.annotation.NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @com.aliyun.core.annotation.NameInMap("relatedServiceName")
        private String relatedServiceName;

        @com.aliyun.core.annotation.NameInMap("routeRuleId")
        private Long routeRuleId;

        @com.aliyun.core.annotation.NameInMap("routeType")
        private String routeType;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("tenantRamId")
        private Long tenantRamId;

        @com.aliyun.core.annotation.NameInMap("timeWindow")
        private Long timeWindow;

        @com.aliyun.core.annotation.NameInMap("timeWindowUnit")
        private Long timeWindowUnit;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.assignObjectId = builder.assignObjectId;
            this.assignObjectType = builder.assignObjectType;
            this.createTime = builder.createTime;
            this.effection = builder.effection;
            this.enableStatus = builder.enableStatus;
            this.incidentLevel = builder.incidentLevel;
            this.isValid = builder.isValid;
            this.matchCount = builder.matchCount;
            this.monitorSourceNames = builder.monitorSourceNames;
            this.relServiceDeleteType = builder.relServiceDeleteType;
            this.relatedServiceId = builder.relatedServiceId;
            this.relatedServiceName = builder.relatedServiceName;
            this.routeRuleId = builder.routeRuleId;
            this.routeType = builder.routeType;
            this.ruleName = builder.ruleName;
            this.tenantRamId = builder.tenantRamId;
            this.timeWindow = builder.timeWindow;
            this.timeWindowUnit = builder.timeWindowUnit;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assignObjectId
         */
        public Long getAssignObjectId() {
            return this.assignObjectId;
        }

        /**
         * @return assignObjectType
         */
        public String getAssignObjectType() {
            return this.assignObjectType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return effection
         */
        public String getEffection() {
            return this.effection;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return incidentLevel
         */
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        /**
         * @return isValid
         */
        public Integer getIsValid() {
            return this.isValid;
        }

        /**
         * @return matchCount
         */
        public Long getMatchCount() {
            return this.matchCount;
        }

        /**
         * @return monitorSourceNames
         */
        public String getMonitorSourceNames() {
            return this.monitorSourceNames;
        }

        /**
         * @return relServiceDeleteType
         */
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
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
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return tenantRamId
         */
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

        /**
         * @return timeWindow
         */
        public Long getTimeWindow() {
            return this.timeWindow;
        }

        /**
         * @return timeWindowUnit
         */
        public Long getTimeWindowUnit() {
            return this.timeWindowUnit;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long assignObjectId; 
            private String assignObjectType; 
            private String createTime; 
            private String effection; 
            private String enableStatus; 
            private String incidentLevel; 
            private Integer isValid; 
            private Long matchCount; 
            private String monitorSourceNames; 
            private Integer relServiceDeleteType; 
            private Long relatedServiceId; 
            private String relatedServiceName; 
            private Long routeRuleId; 
            private String routeType; 
            private String ruleName; 
            private Long tenantRamId; 
            private Long timeWindow; 
            private Long timeWindowUnit; 
            private String updateTime; 

            /**
             * assignObjectId.
             */
            public Builder assignObjectId(Long assignObjectId) {
                this.assignObjectId = assignObjectId;
                return this;
            }

            /**
             * assignObjectType.
             */
            public Builder assignObjectType(String assignObjectType) {
                this.assignObjectType = assignObjectType;
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
             * effection.
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * enableStatus.
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
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
             * isValid.
             */
            public Builder isValid(Integer isValid) {
                this.isValid = isValid;
                return this;
            }

            /**
             * matchCount.
             */
            public Builder matchCount(Long matchCount) {
                this.matchCount = matchCount;
                return this;
            }

            /**
             * monitorSourceNames.
             */
            public Builder monitorSourceNames(String monitorSourceNames) {
                this.monitorSourceNames = monitorSourceNames;
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
             * routeType.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * tenantRamId.
             */
            public Builder tenantRamId(Long tenantRamId) {
                this.tenantRamId = tenantRamId;
                return this;
            }

            /**
             * timeWindow.
             */
            public Builder timeWindow(Long timeWindow) {
                this.timeWindow = timeWindow;
                return this;
            }

            /**
             * timeWindowUnit.
             */
            public Builder timeWindowUnit(Long timeWindowUnit) {
                this.timeWindowUnit = timeWindowUnit;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
