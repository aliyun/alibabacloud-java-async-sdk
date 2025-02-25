// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSourceEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSourceEventsResponseBody</p>
 */
public class ListSourceEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("firstRowKey")
    private String firstRowKey;

    @com.aliyun.core.annotation.NameInMap("lastRowKey")
    private String lastRowKey;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
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

        public ListSourceEventsResponseBody build() {
            return new ListSourceEventsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventJson")
        private String eventJson;

        @com.aliyun.core.annotation.NameInMap("eventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @com.aliyun.core.annotation.NameInMap("monitorSourceName")
        private String monitorSourceName;

        @com.aliyun.core.annotation.NameInMap("routeRuleId")
        private Long routeRuleId;

        @com.aliyun.core.annotation.NameInMap("tenantRamId")
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
             * eventJson.
             */
            public Builder eventJson(String eventJson) {
                this.eventJson = eventJson;
                return this;
            }

            /**
             * eventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
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
             * routeRuleId.
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            /**
             * tenantRamId.
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
