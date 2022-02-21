// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSourceEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSourceEventsResponseBody</p>
 */
public class ListSourceEventsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("firstRowKey")
    private String firstRowKey;

    @NameInMap("lastRowKey")
    private String lastRowKey;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSize")
    private Long pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListSourceEventsResponseBody(Builder builder) {
        this.data = builder.data;
        this.firstRowKey = builder.firstRowKey;
        this.lastRowKey = builder.lastRowKey;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return firstRowKey
     */
    public String getFirstRowKey() {
        return this.firstRowKey;
    }

    /**
     * @return lastRowKey
     */
    public String getLastRowKey() {
        return this.lastRowKey;
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
        private String firstRowKey; 
        private String lastRowKey; 
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
         * firstRowKey
         */
        public Builder firstRowKey(String firstRowKey) {
            this.firstRowKey = firstRowKey;
            return this;
        }

        /**
         * lastRowKey
         */
        public Builder lastRowKey(String lastRowKey) {
            this.lastRowKey = lastRowKey;
            return this;
        }

        /**
         * 当前页
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小
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

        public ListSourceEventsResponseBody build() {
            return new ListSourceEventsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("eventJson")
        private String eventJson;

        @NameInMap("eventTime")
        private String eventTime;

        @NameInMap("instanceId")
        private Long instanceId;

        @NameInMap("instanceType")
        private String instanceType;

        @NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @NameInMap("monitorSourceName")
        private String monitorSourceName;

        @NameInMap("routeRuleId")
        private Long routeRuleId;

        @NameInMap("tenantRamId")
        private Long tenantRamId;

        private Data(Builder builder) {
            this.eventJson = builder.eventJson;
            this.eventTime = builder.eventTime;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
            this.routeRuleId = builder.routeRuleId;
            this.tenantRamId = builder.tenantRamId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventJson
         */
        public String getEventJson() {
            return this.eventJson;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        /**
         * @return routeRuleId
         */
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        /**
         * @return tenantRamId
         */
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

        public static final class Builder {
            private String eventJson; 
            private String eventTime; 
            private Long instanceId; 
            private String instanceType; 
            private Long monitorSourceId; 
            private String monitorSourceName; 
            private Long routeRuleId; 
            private Long tenantRamId; 

            /**
             * 告警内容json
             */
            public Builder eventJson(String eventJson) {
                this.eventJson = eventJson;
                return this;
            }

            /**
             * 告警上报时间
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * 关联对象ID
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * INCIDENT 事件、ALERT 报警、PROBLEM 故障
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 监控告警源ID
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * 监控告警源名称
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
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
             * 租户ID
             */
            public Builder tenantRamId(Long tenantRamId) {
                this.tenantRamId = tenantRamId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
