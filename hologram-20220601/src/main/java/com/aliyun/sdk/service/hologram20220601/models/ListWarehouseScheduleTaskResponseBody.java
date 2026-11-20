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
 * {@link ListWarehouseScheduleTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListWarehouseScheduleTaskResponseBody</p>
 */
public class ListWarehouseScheduleTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScheduleTaskList")
    private java.util.List<ScheduleTaskList> scheduleTaskList;

    private ListWarehouseScheduleTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scheduleTaskList = builder.scheduleTaskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarehouseScheduleTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleTaskList
     */
    public java.util.List<ScheduleTaskList> getScheduleTaskList() {
        return this.scheduleTaskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ScheduleTaskList> scheduleTaskList; 

        private Builder() {
        } 

        private Builder(ListWarehouseScheduleTaskResponseBody model) {
            this.requestId = model.requestId;
            this.scheduleTaskList = model.scheduleTaskList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A0A16C46-5B56-1F9B-AA37-4C3EAD95AAA8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of time-based elastic plans.</p>
         */
        public Builder scheduleTaskList(java.util.List<ScheduleTaskList> scheduleTaskList) {
            this.scheduleTaskList = scheduleTaskList;
            return this;
        }

        public ListWarehouseScheduleTaskResponseBody build() {
            return new ListWarehouseScheduleTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWarehouseScheduleTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListWarehouseScheduleTaskResponseBody</p>
     */
    public static class Plans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ElasticCu")
        private Long elasticCu;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Plans(Builder builder) {
            this.description = builder.description;
            this.elasticCu = builder.elasticCu;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plans create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticCu
         */
        public Long getElasticCu() {
            return this.elasticCu;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String description; 
            private Long elasticCu; 
            private String endTime; 
            private String id; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Plans model) {
                this.description = model.description;
                this.elasticCu = model.elasticCu;
                this.endTime = model.endTime;
                this.id = model.id;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The description of the elastic plan.</p>
             * 
             * <strong>example:</strong>
             * <p>bill stat</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The elastic resources. The value must be a multiple of 16, greater than or equal to 16, and less than or equal to the compute group specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder elasticCu(Long elasticCu) {
                this.elasticCu = elasticCu;
                return this;
            }

            /**
             * <p>The end time. Only full hours and half hours are supported. The format is HHmm (four digits, 24-hour clock).</p>
             * 
             * <strong>example:</strong>
             * <p>0400</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The elastic plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1802985780260052993</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The start time. Only full hours and half hours are supported, such as 0100 for 1:00 AM. The format is HHmm (four digits, 24-hour clock).</p>
             * 
             * <strong>example:</strong>
             * <p>0100</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Plans build() {
                return new Plans(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWarehouseScheduleTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListWarehouseScheduleTaskResponseBody</p>
     */
    public static class ScheduleTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("Plans")
        private java.util.List<Plans> plans;

        @com.aliyun.core.annotation.NameInMap("ReservedCpu")
        private Long reservedCpu;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WarehouseId")
        private String warehouseId;

        @com.aliyun.core.annotation.NameInMap("WarehouseName")
        private String warehouseName;

        private ScheduleTaskList(Builder builder) {
            this.elasticType = builder.elasticType;
            this.plans = builder.plans;
            this.reservedCpu = builder.reservedCpu;
            this.status = builder.status;
            this.warehouseId = builder.warehouseId;
            this.warehouseName = builder.warehouseName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleTaskList create() {
            return builder().build();
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return plans
         */
        public java.util.List<Plans> getPlans() {
            return this.plans;
        }

        /**
         * @return reservedCpu
         */
        public Long getReservedCpu() {
            return this.reservedCpu;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return warehouseId
         */
        public String getWarehouseId() {
            return this.warehouseId;
        }

        /**
         * @return warehouseName
         */
        public String getWarehouseName() {
            return this.warehouseName;
        }

        public static final class Builder {
            private String elasticType; 
            private java.util.List<Plans> plans; 
            private Long reservedCpu; 
            private String status; 
            private String warehouseId; 
            private String warehouseName; 

            private Builder() {
            } 

            private Builder(ScheduleTaskList model) {
                this.elasticType = model.elasticType;
                this.plans = model.plans;
                this.reservedCpu = model.reservedCpu;
                this.status = model.status;
                this.warehouseId = model.warehouseId;
                this.warehouseName = model.warehouseName;
            } 

            /**
             * <p>The elastic type.</p>
             * 
             * <strong>example:</strong>
             * <p>timed</p>
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The list of elastic plans for a single compute group.</p>
             */
            public Builder plans(java.util.List<Plans> plans) {
                this.plans = plans;
                return this;
            }

            /**
             * <p>The reserved resources of the compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder reservedCpu(Long reservedCpu) {
                this.reservedCpu = reservedCpu;
                return this;
            }

            /**
             * <p>The status of the compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>kRunning</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The compute group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder warehouseId(String warehouseId) {
                this.warehouseId = warehouseId;
                return this;
            }

            /**
             * <p>The compute group name.</p>
             * 
             * <strong>example:</strong>
             * <p>init_warehouse</p>
             */
            public Builder warehouseName(String warehouseName) {
                this.warehouseName = warehouseName;
                return this;
            }

            public ScheduleTaskList build() {
                return new ScheduleTaskList(this);
            } 

        } 

    }
}
