// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListWarehouseScheduleEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListWarehouseScheduleEventResponseBody</p>
 */
public class ListWarehouseScheduleEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventList")
    private java.util.List<EventList> eventList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWarehouseScheduleEventResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarehouseScheduleEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventList
     */
    public java.util.List<EventList> getEventList() {
        return this.eventList;
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
        private java.util.List<EventList> eventList; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWarehouseScheduleEventResponseBody model) {
            this.eventList = model.eventList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EventList.
         */
        public Builder eventList(java.util.List<EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>E16D32D4-DF86-1180-8220-0D39770A5AF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWarehouseScheduleEventResponseBody build() {
            return new ListWarehouseScheduleEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWarehouseScheduleEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListWarehouseScheduleEventResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Long clusterCount;

        @com.aliyun.core.annotation.NameInMap("ClusterCpu")
        private Long clusterCpu;

        @com.aliyun.core.annotation.NameInMap("ElasticCpu")
        private Long elasticCpu;

        @com.aliyun.core.annotation.NameInMap("ElasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("InitClusterCount")
        private Long initClusterCount;

        @com.aliyun.core.annotation.NameInMap("OriginalElasticCpu")
        private Long originalElasticCpu;

        @com.aliyun.core.annotation.NameInMap("ReservedCpu")
        private Long reservedCpu;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("WarehouseName")
        private String warehouseName;

        private EventList(Builder builder) {
            this.clusterCount = builder.clusterCount;
            this.clusterCpu = builder.clusterCpu;
            this.elasticCpu = builder.elasticCpu;
            this.elasticType = builder.elasticType;
            this.eventName = builder.eventName;
            this.eventTime = builder.eventTime;
            this.failedReason = builder.failedReason;
            this.initClusterCount = builder.initClusterCount;
            this.originalElasticCpu = builder.originalElasticCpu;
            this.reservedCpu = builder.reservedCpu;
            this.result = builder.result;
            this.warehouseName = builder.warehouseName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return clusterCount
         */
        public Long getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return clusterCpu
         */
        public Long getClusterCpu() {
            return this.clusterCpu;
        }

        /**
         * @return elasticCpu
         */
        public Long getElasticCpu() {
            return this.elasticCpu;
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return initClusterCount
         */
        public Long getInitClusterCount() {
            return this.initClusterCount;
        }

        /**
         * @return originalElasticCpu
         */
        public Long getOriginalElasticCpu() {
            return this.originalElasticCpu;
        }

        /**
         * @return reservedCpu
         */
        public Long getReservedCpu() {
            return this.reservedCpu;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return warehouseName
         */
        public String getWarehouseName() {
            return this.warehouseName;
        }

        public static final class Builder {
            private Long clusterCount; 
            private Long clusterCpu; 
            private Long elasticCpu; 
            private String elasticType; 
            private String eventName; 
            private String eventTime; 
            private String failedReason; 
            private Long initClusterCount; 
            private Long originalElasticCpu; 
            private Long reservedCpu; 
            private String result; 
            private String warehouseName; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.clusterCount = model.clusterCount;
                this.clusterCpu = model.clusterCpu;
                this.elasticCpu = model.elasticCpu;
                this.elasticType = model.elasticType;
                this.eventName = model.eventName;
                this.eventTime = model.eventTime;
                this.failedReason = model.failedReason;
                this.initClusterCount = model.initClusterCount;
                this.originalElasticCpu = model.originalElasticCpu;
                this.reservedCpu = model.reservedCpu;
                this.result = model.result;
                this.warehouseName = model.warehouseName;
            } 

            /**
             * ClusterCount.
             */
            public Builder clusterCount(Long clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * ClusterCpu.
             */
            public Builder clusterCpu(Long clusterCpu) {
                this.clusterCpu = clusterCpu;
                return this;
            }

            /**
             * ElasticCpu.
             */
            public Builder elasticCpu(Long elasticCpu) {
                this.elasticCpu = elasticCpu;
                return this;
            }

            /**
             * ElasticType.
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * InitClusterCount.
             */
            public Builder initClusterCount(Long initClusterCount) {
                this.initClusterCount = initClusterCount;
                return this;
            }

            /**
             * OriginalElasticCpu.
             */
            public Builder originalElasticCpu(Long originalElasticCpu) {
                this.originalElasticCpu = originalElasticCpu;
                return this;
            }

            /**
             * ReservedCpu.
             */
            public Builder reservedCpu(Long reservedCpu) {
                this.reservedCpu = reservedCpu;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * WarehouseName.
             */
            public Builder warehouseName(String warehouseName) {
                this.warehouseName = warehouseName;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
}
