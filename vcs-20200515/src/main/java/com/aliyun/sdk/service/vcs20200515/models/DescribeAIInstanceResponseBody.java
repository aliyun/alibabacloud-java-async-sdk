// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIInstanceResponseBody</p>
 */
public class DescribeAIInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAIInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIInstanceResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * 返回错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回数据
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIInstanceResponseBody build() {
            return new DescribeAIInstanceResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("AcuUsed")
        private Long acuUsed;

        @NameInMap("AlgorithmId")
        private String algorithmId;

        @NameInMap("AlgorithmName")
        private String algorithmName;

        @NameInMap("CameraNumber")
        private Long cameraNumber;

        @NameInMap("ComputeType")
        private String computeType;

        @NameInMap("CreateDateTime")
        private String createDateTime;

        @NameInMap("DataSource")
        private String dataSource;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("ScheduleCycleDates")
        private String scheduleCycleDates;

        @NameInMap("ScheduleTimes")
        private String scheduleTimes;

        @NameInMap("ScheduleType")
        private String scheduleType;

        @NameInMap("Spf")
        private Long spf;

        @NameInMap("Status")
        private String status;

        @NameInMap("Storage")
        private Double storage;

        private Records(Builder builder) {
            this.acuUsed = builder.acuUsed;
            this.algorithmId = builder.algorithmId;
            this.algorithmName = builder.algorithmName;
            this.cameraNumber = builder.cameraNumber;
            this.computeType = builder.computeType;
            this.createDateTime = builder.createDateTime;
            this.dataSource = builder.dataSource;
            this.dataType = builder.dataType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.scheduleCycleDates = builder.scheduleCycleDates;
            this.scheduleTimes = builder.scheduleTimes;
            this.scheduleType = builder.scheduleType;
            this.spf = builder.spf;
            this.status = builder.status;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return acuUsed
         */
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        /**
         * @return algorithmId
         */
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        /**
         * @return algorithmName
         */
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        /**
         * @return cameraNumber
         */
        public Long getCameraNumber() {
            return this.cameraNumber;
        }

        /**
         * @return computeType
         */
        public String getComputeType() {
            return this.computeType;
        }

        /**
         * @return createDateTime
         */
        public String getCreateDateTime() {
            return this.createDateTime;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return scheduleCycleDates
         */
        public String getScheduleCycleDates() {
            return this.scheduleCycleDates;
        }

        /**
         * @return scheduleTimes
         */
        public String getScheduleTimes() {
            return this.scheduleTimes;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return spf
         */
        public Long getSpf() {
            return this.spf;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storage
         */
        public Double getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private Long acuUsed; 
            private String algorithmId; 
            private String algorithmName; 
            private Long cameraNumber; 
            private String computeType; 
            private String createDateTime; 
            private String dataSource; 
            private String dataType; 
            private String instanceId; 
            private String instanceName; 
            private String scheduleCycleDates; 
            private String scheduleTimes; 
            private String scheduleType; 
            private Long spf; 
            private String status; 
            private Double storage; 

            /**
             * ACU使用数量
             */
            public Builder acuUsed(Long acuUsed) {
                this.acuUsed = acuUsed;
                return this;
            }

            /**
             * 算子ID
             */
            public Builder algorithmId(String algorithmId) {
                this.algorithmId = algorithmId;
                return this;
            }

            /**
             * 算子名称
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * 实例中计算的摄像机数量。 仅当DataSource是Camera时返回。
             */
            public Builder cameraNumber(Long cameraNumber) {
                this.cameraNumber = cameraNumber;
                return this;
            }

            /**
             * 计算类型
             */
            public Builder computeType(String computeType) {
                this.computeType = computeType;
                return this;
            }

            /**
             * 实例创建时间
             */
            public Builder createDateTime(String createDateTime) {
                this.createDateTime = createDateTime;
                return this;
            }

            /**
             * 数据来源
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * 数据类型
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * 实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 实例名称
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * 含义随ScheduleType取值不同
             */
            public Builder scheduleCycleDates(String scheduleCycleDates) {
                this.scheduleCycleDates = scheduleCycleDates;
                return this;
            }

            /**
             * 执行时间段
             */
            public Builder scheduleTimes(String scheduleTimes) {
                this.scheduleTimes = scheduleTimes;
                return this;
            }

            /**
             * 调度类型
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
             */
            public Builder spf(Long spf) {
                this.spf = spf;
                return this;
            }

            /**
             * 实力状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 预计存储量
             */
            public Builder storage(Double storage) {
                this.storage = storage;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * 当前页序号
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 每页显示多少条
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 返回数据条目
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * 总数据数
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
