// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertsResponseBody</p>
 */
public class ListAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListAlertsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
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
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
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

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("alertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("alertNumber")
        private String alertNumber;

        @com.aliyun.core.annotation.NameInMap("alertSourceName")
        private String alertSourceName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("firstEventTime")
        private String firstEventTime;

        @com.aliyun.core.annotation.NameInMap("monitorSourceName")
        private String monitorSourceName;

        @com.aliyun.core.annotation.NameInMap("relServiceDeleteType")
        private Integer relServiceDeleteType;

        @com.aliyun.core.annotation.NameInMap("relatedServiceName")
        private String relatedServiceName;

        @com.aliyun.core.annotation.NameInMap("routeRuleDeleteType")
        private Integer routeRuleDeleteType;

        @com.aliyun.core.annotation.NameInMap("routeRuleId")
        private Long routeRuleId;

        @com.aliyun.core.annotation.NameInMap("routeRuleName")
        private String routeRuleName;

        @com.aliyun.core.annotation.NameInMap("sourceEventCount")
        private Long sourceEventCount;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Data(Builder builder) {
            this.alertId = builder.alertId;
            this.alertLevel = builder.alertLevel;
            this.alertNumber = builder.alertNumber;
            this.alertSourceName = builder.alertSourceName;
            this.createTime = builder.createTime;
            this.firstEventTime = builder.firstEventTime;
            this.monitorSourceName = builder.monitorSourceName;
            this.relServiceDeleteType = builder.relServiceDeleteType;
            this.relatedServiceName = builder.relatedServiceName;
            this.routeRuleDeleteType = builder.routeRuleDeleteType;
            this.routeRuleId = builder.routeRuleId;
            this.routeRuleName = builder.routeRuleName;
            this.sourceEventCount = builder.sourceEventCount;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertLevel
         */
        public String getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return alertNumber
         */
        public String getAlertNumber() {
            return this.alertNumber;
        }

        /**
         * @return alertSourceName
         */
        public String getAlertSourceName() {
            return this.alertSourceName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return firstEventTime
         */
        public String getFirstEventTime() {
            return this.firstEventTime;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        /**
         * @return relServiceDeleteType
         */
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        /**
         * @return relatedServiceName
         */
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        /**
         * @return routeRuleDeleteType
         */
        public Integer getRouteRuleDeleteType() {
            return this.routeRuleDeleteType;
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

        /**
         * @return sourceEventCount
         */
        public Long getSourceEventCount() {
            return this.sourceEventCount;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long alertId; 
            private String alertLevel; 
            private String alertNumber; 
            private String alertSourceName; 
            private String createTime; 
            private String firstEventTime; 
            private String monitorSourceName; 
            private Integer relServiceDeleteType; 
            private String relatedServiceName; 
            private Integer routeRuleDeleteType; 
            private Long routeRuleId; 
            private String routeRuleName; 
            private Long sourceEventCount; 
            private String title; 

            /**
             * alertId.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * alertLevel.
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * alertNumber.
             */
            public Builder alertNumber(String alertNumber) {
                this.alertNumber = alertNumber;
                return this;
            }

            /**
             * alertSourceName.
             */
            public Builder alertSourceName(String alertSourceName) {
                this.alertSourceName = alertSourceName;
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
             * firstEventTime.
             */
            public Builder firstEventTime(String firstEventTime) {
                this.firstEventTime = firstEventTime;
                return this;
            }

            /**
             * monitorSourceName.
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
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
             * relatedServiceName.
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * routeRuleDeleteType.
             */
            public Builder routeRuleDeleteType(Integer routeRuleDeleteType) {
                this.routeRuleDeleteType = routeRuleDeleteType;
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

            /**
             * sourceEventCount.
             */
            public Builder sourceEventCount(Long sourceEventCount) {
                this.sourceEventCount = sourceEventCount;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
