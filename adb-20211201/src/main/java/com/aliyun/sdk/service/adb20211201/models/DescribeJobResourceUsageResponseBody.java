// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResourceUsageResponseBody</p>
 */
public class DescribeJobResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeJobResourceUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResourceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String requestId; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The queried resource usage.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobResourceUsageResponseBody build() {
            return new DescribeJobResourceUsageResponseBody(this);
        } 

    } 

    public static class AcuUsageDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticAcuNumber")
        private Float elasticAcuNumber;

        @com.aliyun.core.annotation.NameInMap("ReservedAcuNumber")
        private Float reservedAcuNumber;

        @com.aliyun.core.annotation.NameInMap("TotalAcuNumber")
        private Float totalAcuNumber;

        private AcuUsageDetail(Builder builder) {
            this.elasticAcuNumber = builder.elasticAcuNumber;
            this.reservedAcuNumber = builder.reservedAcuNumber;
            this.totalAcuNumber = builder.totalAcuNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcuUsageDetail create() {
            return builder().build();
        }

        /**
         * @return elasticAcuNumber
         */
        public Float getElasticAcuNumber() {
            return this.elasticAcuNumber;
        }

        /**
         * @return reservedAcuNumber
         */
        public Float getReservedAcuNumber() {
            return this.reservedAcuNumber;
        }

        /**
         * @return totalAcuNumber
         */
        public Float getTotalAcuNumber() {
            return this.totalAcuNumber;
        }

        public static final class Builder {
            private Float elasticAcuNumber; 
            private Float reservedAcuNumber; 
            private Float totalAcuNumber; 

            /**
             * The number of ACUs for the elastic resources.
             */
            public Builder elasticAcuNumber(Float elasticAcuNumber) {
                this.elasticAcuNumber = elasticAcuNumber;
                return this;
            }

            /**
             * The number of ACUs for the reserved resources.
             */
            public Builder reservedAcuNumber(Float reservedAcuNumber) {
                this.reservedAcuNumber = reservedAcuNumber;
                return this;
            }

            /**
             * The total number of ACUs.
             */
            public Builder totalAcuNumber(Float totalAcuNumber) {
                this.totalAcuNumber = totalAcuNumber;
                return this;
            }

            public AcuUsageDetail build() {
                return new AcuUsageDetail(this);
            } 

        } 

    }
    public static class JobAcuUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcuUsageDetail")
        private AcuUsageDetail acuUsageDetail;

        @com.aliyun.core.annotation.NameInMap("JobEndTime")
        private String jobEndTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobStartTime")
        private String jobStartTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        private JobAcuUsage(Builder builder) {
            this.acuUsageDetail = builder.acuUsageDetail;
            this.jobEndTime = builder.jobEndTime;
            this.jobId = builder.jobId;
            this.jobStartTime = builder.jobStartTime;
            this.resourceGroupName = builder.resourceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobAcuUsage create() {
            return builder().build();
        }

        /**
         * @return acuUsageDetail
         */
        public AcuUsageDetail getAcuUsageDetail() {
            return this.acuUsageDetail;
        }

        /**
         * @return jobEndTime
         */
        public String getJobEndTime() {
            return this.jobEndTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStartTime
         */
        public String getJobStartTime() {
            return this.jobStartTime;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public static final class Builder {
            private AcuUsageDetail acuUsageDetail; 
            private String jobEndTime; 
            private String jobId; 
            private String jobStartTime; 
            private String resourceGroupName; 

            /**
             * The ACU usage.
             */
            public Builder acuUsageDetail(AcuUsageDetail acuUsageDetail) {
                this.acuUsageDetail = acuUsageDetail;
                return this;
            }

            /**
             * The end time of the job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder jobEndTime(String jobEndTime) {
                this.jobEndTime = jobEndTime;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The start time of the job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder jobStartTime(String jobStartTime) {
                this.jobStartTime = jobStartTime;
                return this;
            }

            /**
             * The name of the job resource group.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            public JobAcuUsage build() {
                return new JobAcuUsage(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobAcuUsage")
        private java.util.List < JobAcuUsage> jobAcuUsage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.endTime = builder.endTime;
            this.jobAcuUsage = builder.jobAcuUsage;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobAcuUsage
         */
        public java.util.List < JobAcuUsage> getJobAcuUsage() {
            return this.jobAcuUsage;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String endTime; 
            private java.util.List < JobAcuUsage> jobAcuUsage; 
            private String startTime; 

            /**
             * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The end time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The AnalyticDB compute unit (ACU) usage of the job resource group.
             */
            public Builder jobAcuUsage(java.util.List < JobAcuUsage> jobAcuUsage) {
                this.jobAcuUsage = jobAcuUsage;
                return this;
            }

            /**
             * The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
