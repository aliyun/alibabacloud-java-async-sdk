// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRouteRulesResponseBody</p>
 */
public class ListRouteRulesResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSize")
    private Long pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
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
         * 规则列表
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 第几页
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页大小
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总条数
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
        @NameInMap("assignObjectId")
        private Long assignObjectId;

        @NameInMap("assignObjectType")
        private String assignObjectType;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("effection")
        private String effection;

        @NameInMap("enableStatus")
        private String enableStatus;

        @NameInMap("incidentLevel")
        private String incidentLevel;

        @NameInMap("matchCount")
        private Long matchCount;

        @NameInMap("monitorSourceNames")
        private String monitorSourceNames;

        @NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("routeRuleId")
        private Long routeRuleId;

        @NameInMap("routeType")
        private String routeType;

        @NameInMap("ruleName")
        private String ruleName;

        @NameInMap("tenantRamId")
        private Long tenantRamId;

        @NameInMap("timeWindow")
        private Long timeWindow;

        @NameInMap("timeWindowUnit")
        private Long timeWindowUnit;

        @NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.assignObjectId = builder.assignObjectId;
            this.assignObjectType = builder.assignObjectType;
            this.createTime = builder.createTime;
            this.effection = builder.effection;
            this.enableStatus = builder.enableStatus;
            this.incidentLevel = builder.incidentLevel;
            this.matchCount = builder.matchCount;
            this.monitorSourceNames = builder.monitorSourceNames;
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
            private Long matchCount; 
            private String monitorSourceNames; 
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
             * 事件分派对象ID（服务组ID 或用户ID）
             */
            public Builder assignObjectId(Long assignObjectId) {
                this.assignObjectId = assignObjectId;
                return this;
            }

            /**
             * 事件分派对象类型 SERVICEGROUP 服务组  USER 单个用户
             */
            public Builder assignObjectType(String assignObjectType) {
                this.assignObjectType = assignObjectType;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 影响程度 LOW-一般 HIGH-严重
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * 是否启用  DISABLE禁用. ENABLE 启用
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * 事件级别 P1 P2 P3 P4
             */
            public Builder incidentLevel(String incidentLevel) {
                this.incidentLevel = incidentLevel;
                return this;
            }

            /**
             * 命中次数
             */
            public Builder matchCount(Long matchCount) {
                this.matchCount = matchCount;
                return this;
            }

            /**
             * 监控源名称
             */
            public Builder monitorSourceNames(String monitorSourceNames) {
                this.monitorSourceNames = monitorSourceNames;
                return this;
            }

            /**
             * 关联服务ID
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * 服务名称
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * 规则ID
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            /**
             * 路由类型：INCIDENT 触发事件 ALERT 仅触发报警
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * 规则名称
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * 租户ID
             */
            public Builder tenantRamId(Long tenantRamId) {
                this.tenantRamId = tenantRamId;
                return this;
            }

            /**
             * 时间窗口
             */
            public Builder timeWindow(Long timeWindow) {
                this.timeWindow = timeWindow;
                return this;
            }

            /**
             * 时间窗口单位 MINUTE 分钟  SECOND 秒
             */
            public Builder timeWindowUnit(Long timeWindowUnit) {
                this.timeWindowUnit = timeWindowUnit;
                return this;
            }

            /**
             * 修改时间
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
