// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoScalingHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoScalingHistoryResponseBody</p>
 */
public class DescribeAutoScalingHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeAutoScalingHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoScalingHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned. The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The history of auto scaling.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * > If the request was successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeAutoScalingHistoryResponseBody build() {
            return new DescribeAutoScalingHistoryResponseBody(this);
        } 

    } 

    public static class SpecHistory extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("OriginCore")
        private Integer originCore;

        @NameInMap("OriginInstanceClass")
        private String originInstanceClass;

        @NameInMap("OriginMemory")
        private Double originMemory;

        @NameInMap("ScaleType")
        private String scaleType;

        @NameInMap("TargetCore")
        private Integer targetCore;

        @NameInMap("TargetInstanceClass")
        private String targetInstanceClass;

        @NameInMap("TargetMemory")
        private Double targetMemory;

        @NameInMap("TaskExcuteStatus")
        private Boolean taskExcuteStatus;

        @NameInMap("TaskTime")
        private Long taskTime;

        private SpecHistory(Builder builder) {
            this.errorCode = builder.errorCode;
            this.originCore = builder.originCore;
            this.originInstanceClass = builder.originInstanceClass;
            this.originMemory = builder.originMemory;
            this.scaleType = builder.scaleType;
            this.targetCore = builder.targetCore;
            this.targetInstanceClass = builder.targetInstanceClass;
            this.targetMemory = builder.targetMemory;
            this.taskExcuteStatus = builder.taskExcuteStatus;
            this.taskTime = builder.taskTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecHistory create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return originCore
         */
        public Integer getOriginCore() {
            return this.originCore;
        }

        /**
         * @return originInstanceClass
         */
        public String getOriginInstanceClass() {
            return this.originInstanceClass;
        }

        /**
         * @return originMemory
         */
        public Double getOriginMemory() {
            return this.originMemory;
        }

        /**
         * @return scaleType
         */
        public String getScaleType() {
            return this.scaleType;
        }

        /**
         * @return targetCore
         */
        public Integer getTargetCore() {
            return this.targetCore;
        }

        /**
         * @return targetInstanceClass
         */
        public String getTargetInstanceClass() {
            return this.targetInstanceClass;
        }

        /**
         * @return targetMemory
         */
        public Double getTargetMemory() {
            return this.targetMemory;
        }

        /**
         * @return taskExcuteStatus
         */
        public Boolean getTaskExcuteStatus() {
            return this.taskExcuteStatus;
        }

        /**
         * @return taskTime
         */
        public Long getTaskTime() {
            return this.taskTime;
        }

        public static final class Builder {
            private String errorCode; 
            private Integer originCore; 
            private String originInstanceClass; 
            private Double originMemory; 
            private String scaleType; 
            private Integer targetCore; 
            private String targetInstanceClass; 
            private Double targetMemory; 
            private Boolean taskExcuteStatus; 
            private Long taskTime; 

            /**
             * The error code returned by the scaling task. Valid values:
             * <p>
             * 
             * *   **Insufficient_Balance**: The account has insufficient balance or an unpaid order.
             * *   **REACH_SPEC_UPPERBOUND**: The instance type reaches the upper limit.
             * *   **Control_Error_Timeout_Msg**: The management task timed out.
             * *   **Invoke_Rds_Api_Error_Msg**: Failed to call the ApsaraDB RDS API.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The original number of CPU cores of the instance.
             */
            public Builder originCore(Integer originCore) {
                this.originCore = originCore;
                return this;
            }

            /**
             * The original instance type.
             */
            public Builder originInstanceClass(String originInstanceClass) {
                this.originInstanceClass = originInstanceClass;
                return this;
            }

            /**
             * The original memory size of the instance. Unit: GB.
             */
            public Builder originMemory(Double originMemory) {
                this.originMemory = originMemory;
                return this;
            }

            /**
             * The type of the automatic performance scaling task. Valid values:
             * <p>
             * 
             * *   **SCALE_UP**: automatic instance type scale-up task.
             * *   **SCALE_DOWN**: automatic instance type scale-down task.
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * The destination number of CPU cores of the instance.
             */
            public Builder targetCore(Integer targetCore) {
                this.targetCore = targetCore;
                return this;
            }

            /**
             * The destination instance type.
             */
            public Builder targetInstanceClass(String targetInstanceClass) {
                this.targetInstanceClass = targetInstanceClass;
                return this;
            }

            /**
             * The destination memory size of the instance. Unit: GB.
             */
            public Builder targetMemory(Double targetMemory) {
                this.targetMemory = targetMemory;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **true**: The task was successful.
             * *   **false**: The task failed.
             */
            public Builder taskExcuteStatus(Boolean taskExcuteStatus) {
                this.taskExcuteStatus = taskExcuteStatus;
                return this;
            }

            /**
             * The time when the task was run. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder taskTime(Long taskTime) {
                this.taskTime = taskTime;
                return this;
            }

            public SpecHistory build() {
                return new SpecHistory(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Bandwidth")
        private java.util.List < java.util.Map<String, ?>> bandwidth;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Resource")
        private java.util.List < java.util.Map<String, ?>> resource;

        @NameInMap("Shard")
        private java.util.List < java.util.Map<String, ?>> shard;

        @NameInMap("SpecHistory")
        private java.util.List < SpecHistory> specHistory;

        @NameInMap("Storage")
        private java.util.List < java.util.Map<String, ?>> storage;

        private Data(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
            this.resource = builder.resource;
            this.shard = builder.shard;
            this.specHistory = builder.specHistory;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public java.util.List < java.util.Map<String, ?>> getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resource
         */
        public java.util.List < java.util.Map<String, ?>> getResource() {
            return this.resource;
        }

        /**
         * @return shard
         */
        public java.util.List < java.util.Map<String, ?>> getShard() {
            return this.shard;
        }

        /**
         * @return specHistory
         */
        public java.util.List < SpecHistory> getSpecHistory() {
            return this.specHistory;
        }

        /**
         * @return storage
         */
        public java.util.List < java.util.Map<String, ?>> getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> bandwidth; 
            private String instanceId; 
            private java.util.List < java.util.Map<String, ?>> resource; 
            private java.util.List < java.util.Map<String, ?>> shard; 
            private java.util.List < SpecHistory> specHistory; 
            private java.util.List < java.util.Map<String, ?>> storage; 

            /**
             * The history of automatic bandwidth scaling of ApsaraDB for Redis instances. This feature is not supported.
             */
            public Builder bandwidth(java.util.List < java.util.Map<String, ?>> bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The history of resource scale-out of ApsaraDB for Redis instances. This feature is not supported.
             */
            public Builder resource(java.util.List < java.util.Map<String, ?>> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The history of automatic shard scale-out of ApsaraDB for Redis instances. This feature is not supported.
             */
            public Builder shard(java.util.List < java.util.Map<String, ?>> shard) {
                this.shard = shard;
                return this;
            }

            /**
             * The history of automatic performance scaling.
             */
            public Builder specHistory(java.util.List < SpecHistory> specHistory) {
                this.specHistory = specHistory;
                return this;
            }

            /**
             * The history of storage expansion. This feature is not supported.
             */
            public Builder storage(java.util.List < java.util.Map<String, ?>> storage) {
                this.storage = storage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
