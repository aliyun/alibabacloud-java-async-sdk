// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertsResponseBody</p>
 */
public class ListAlertsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Integer pageNumber;

    @NameInMap("pageSize")
    private Integer pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
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
         * 报警列表
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 当前页
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页的大小
         */
        public Builder pageSize(Integer pageSize) {
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

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("alertId")
        private Long alertId;

        @NameInMap("alertLevel")
        private String alertLevel;

        @NameInMap("alertNumber")
        private String alertNumber;

        @NameInMap("alertSourceName")
        private String alertSourceName;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("firstEventTime")
        private String firstEventTime;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("routeRuleId")
        private Long routeRuleId;

        @NameInMap("routeRuleName")
        private String routeRuleName;

        @NameInMap("sourceEventCount")
        private Long sourceEventCount;

        @NameInMap("title")
        private String title;

        private Data(Builder builder) {
            this.alertId = builder.alertId;
            this.alertLevel = builder.alertLevel;
            this.alertNumber = builder.alertNumber;
            this.alertSourceName = builder.alertSourceName;
            this.createTime = builder.createTime;
            this.firstEventTime = builder.firstEventTime;
            this.relatedServiceName = builder.relatedServiceName;
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
            private String relatedServiceName; 
            private Long routeRuleId; 
            private String routeRuleName; 
            private Long sourceEventCount; 
            private String title; 

            /**
             * 报警ID
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * 告警优先级  1，2，3，4  对应 p1,p2,p3,p4
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * 报警编号
             */
            public Builder alertNumber(String alertNumber) {
                this.alertNumber = alertNumber;
                return this;
            }

            /**
             * 报警源
             */
            public Builder alertSourceName(String alertSourceName) {
                this.alertSourceName = alertSourceName;
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
             * 第一次告警上报时间
             */
            public Builder firstEventTime(String firstEventTime) {
                this.firstEventTime = firstEventTime;
                return this;
            }

            /**
             * 关联服务名称
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * 关联流转规则ID
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            /**
             * 流转规则名字
             */
            public Builder routeRuleName(String routeRuleName) {
                this.routeRuleName = routeRuleName;
                return this;
            }

            /**
             * 收敛量
             */
            public Builder sourceEventCount(Long sourceEventCount) {
                this.sourceEventCount = sourceEventCount;
                return this;
            }

            /**
             * 报警标题
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
