// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeAutoScalingHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoScalingHistoryResponseBody</p>
 */
public class DescribeAutoScalingHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAutoScalingHistoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The history of auto scaling.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request was successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeAutoScalingHistoryResponseBody build() {
            return new DescribeAutoScalingHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoScalingHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingHistoryResponseBody</p>
     */
    public static class SpecHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("OriginCore")
        private Integer originCore;

        @com.aliyun.core.annotation.NameInMap("OriginInstanceClass")
        private String originInstanceClass;

        @com.aliyun.core.annotation.NameInMap("OriginMemory")
        private Double originMemory;

        @com.aliyun.core.annotation.NameInMap("ScaleType")
        private String scaleType;

        @com.aliyun.core.annotation.NameInMap("TargetCore")
        private Integer targetCore;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceClass")
        private String targetInstanceClass;

        @com.aliyun.core.annotation.NameInMap("TargetMemory")
        private Double targetMemory;

        @com.aliyun.core.annotation.NameInMap("TaskExcuteStatus")
        private Boolean taskExcuteStatus;

        @com.aliyun.core.annotation.NameInMap("TaskTime")
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

            private Builder() {
            } 

            private Builder(SpecHistory model) {
                this.errorCode = model.errorCode;
                this.originCore = model.originCore;
                this.originInstanceClass = model.originInstanceClass;
                this.originMemory = model.originMemory;
                this.scaleType = model.scaleType;
                this.targetCore = model.targetCore;
                this.targetInstanceClass = model.targetInstanceClass;
                this.targetMemory = model.targetMemory;
                this.taskExcuteStatus = model.taskExcuteStatus;
                this.taskTime = model.taskTime;
            } 

            /**
             * <p>The error code returned by the scaling task. Valid values:</p>
             * <ul>
             * <li><strong>Insufficient_Balance</strong>: The account has insufficient balance or an unpaid order.</li>
             * <li><strong>REACH_SPEC_UPPERBOUND</strong>: The instance type reaches the upper limit.</li>
             * <li><strong>Control_Error_Timeout_Msg</strong>: The management task timed out.</li>
             * <li><strong>Invoke_Rds_Api_Error_Msg</strong>: Failed to call the ApsaraDB RDS API.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Insufficient_Balance</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The original number of CPU cores of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder originCore(Integer originCore) {
                this.originCore = originCore;
                return this;
            }

            /**
             * <p>The original instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n2.large.2c</p>
             */
            public Builder originInstanceClass(String originInstanceClass) {
                this.originInstanceClass = originInstanceClass;
                return this;
            }

            /**
             * <p>The original memory size of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder originMemory(Double originMemory) {
                this.originMemory = originMemory;
                return this;
            }

            /**
             * <p>The type of the automatic performance scaling task. Valid values:</p>
             * <ul>
             * <li><strong>SCALE_UP</strong>: automatic instance type scale-up task.</li>
             * <li><strong>SCALE_DOWN</strong>: automatic instance type scale-down task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SCALE_UP</p>
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * <p>The destination number of CPU cores of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder targetCore(Integer targetCore) {
                this.targetCore = targetCore;
                return this;
            }

            /**
             * <p>The destination instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n2.xlarge.2c</p>
             */
            public Builder targetInstanceClass(String targetInstanceClass) {
                this.targetInstanceClass = targetInstanceClass;
                return this;
            }

            /**
             * <p>The destination memory size of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder targetMemory(Double targetMemory) {
                this.targetMemory = targetMemory;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The task was successful.</li>
             * <li><strong>false</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder taskExcuteStatus(Boolean taskExcuteStatus) {
                this.taskExcuteStatus = taskExcuteStatus;
                return this;
            }

            /**
             * <p>The time when the task was run. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1684830763000</p>
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
    /**
     * 
     * {@link DescribeAutoScalingHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private java.util.List<java.util.Map<String, ?>> bandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<java.util.Map<String, ?>> resource;

        @com.aliyun.core.annotation.NameInMap("Shard")
        private java.util.List<java.util.Map<String, ?>> shard;

        @com.aliyun.core.annotation.NameInMap("SpecHistory")
        private java.util.List<SpecHistory> specHistory;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private java.util.List<java.util.Map<String, ?>> storage;

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
        public java.util.List<java.util.Map<String, ?>> getBandwidth() {
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
        public java.util.List<java.util.Map<String, ?>> getResource() {
            return this.resource;
        }

        /**
         * @return shard
         */
        public java.util.List<java.util.Map<String, ?>> getShard() {
            return this.shard;
        }

        /**
         * @return specHistory
         */
        public java.util.List<SpecHistory> getSpecHistory() {
            return this.specHistory;
        }

        /**
         * @return storage
         */
        public java.util.List<java.util.Map<String, ?>> getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> bandwidth; 
            private String instanceId; 
            private java.util.List<java.util.Map<String, ?>> resource; 
            private java.util.List<java.util.Map<String, ?>> shard; 
            private java.util.List<SpecHistory> specHistory; 
            private java.util.List<java.util.Map<String, ?>> storage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bandwidth = model.bandwidth;
                this.instanceId = model.instanceId;
                this.resource = model.resource;
                this.shard = model.shard;
                this.specHistory = model.specHistory;
                this.storage = model.storage;
            } 

            /**
             * <p>The history of automatic bandwidth scaling of ApsaraDB for Redis instances. This feature is not supported.</p>
             */
            public Builder bandwidth(java.util.List<java.util.Map<String, ?>> bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1jdv45i7l6****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The history of resource scale-out of ApsaraDB for Redis instances. This feature is not supported.</p>
             */
            public Builder resource(java.util.List<java.util.Map<String, ?>> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The history of automatic shard scale-out of ApsaraDB for Redis instances. This feature is not supported.</p>
             */
            public Builder shard(java.util.List<java.util.Map<String, ?>> shard) {
                this.shard = shard;
                return this;
            }

            /**
             * <p>The history of automatic performance scaling.</p>
             */
            public Builder specHistory(java.util.List<SpecHistory> specHistory) {
                this.specHistory = specHistory;
                return this;
            }

            /**
             * <p>The history of storage expansion. This feature is not supported.</p>
             */
            public Builder storage(java.util.List<java.util.Map<String, ?>> storage) {
                this.storage = storage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
