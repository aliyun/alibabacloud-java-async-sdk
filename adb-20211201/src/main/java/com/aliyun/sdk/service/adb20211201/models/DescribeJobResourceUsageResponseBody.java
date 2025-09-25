// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeJobResourceUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried resource usage.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobResourceUsageResponseBody build() {
            return new DescribeJobResourceUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResourceUsageResponseBody</p>
     */
    public static class AcuUsageDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticAcuNumber")
        private Float elasticAcuNumber;

        @com.aliyun.core.annotation.NameInMap("ReservedAcuNumber")
        private Float reservedAcuNumber;

        @com.aliyun.core.annotation.NameInMap("SpotAcuNumber")
        private Float spotAcuNumber;

        @com.aliyun.core.annotation.NameInMap("SpotAcuPercentage")
        private Float spotAcuPercentage;

        @com.aliyun.core.annotation.NameInMap("TotalAcuNumber")
        private Float totalAcuNumber;

        private AcuUsageDetail(Builder builder) {
            this.elasticAcuNumber = builder.elasticAcuNumber;
            this.reservedAcuNumber = builder.reservedAcuNumber;
            this.spotAcuNumber = builder.spotAcuNumber;
            this.spotAcuPercentage = builder.spotAcuPercentage;
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
         * @return spotAcuNumber
         */
        public Float getSpotAcuNumber() {
            return this.spotAcuNumber;
        }

        /**
         * @return spotAcuPercentage
         */
        public Float getSpotAcuPercentage() {
            return this.spotAcuPercentage;
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
            private Float spotAcuNumber; 
            private Float spotAcuPercentage; 
            private Float totalAcuNumber; 

            private Builder() {
            } 

            private Builder(AcuUsageDetail model) {
                this.elasticAcuNumber = model.elasticAcuNumber;
                this.reservedAcuNumber = model.reservedAcuNumber;
                this.spotAcuNumber = model.spotAcuNumber;
                this.spotAcuPercentage = model.spotAcuPercentage;
                this.totalAcuNumber = model.totalAcuNumber;
            } 

            /**
             * <p>The number of ACUs for the elastic resources.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder elasticAcuNumber(Float elasticAcuNumber) {
                this.elasticAcuNumber = elasticAcuNumber;
                return this;
            }

            /**
             * <p>The number of ACUs for the reserved resources.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder reservedAcuNumber(Float reservedAcuNumber) {
                this.reservedAcuNumber = reservedAcuNumber;
                return this;
            }

            /**
             * <p>The number of spot ACUs.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder spotAcuNumber(Float spotAcuNumber) {
                this.spotAcuNumber = spotAcuNumber;
                return this;
            }

            /**
             * <p>The percent of spot ACUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder spotAcuPercentage(Float spotAcuPercentage) {
                this.spotAcuPercentage = spotAcuPercentage;
                return this;
            }

            /**
             * <p>The total number of ACUs.</p>
             * 
             * <strong>example:</strong>
             * <p>32ACU</p>
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
    /**
     * 
     * {@link DescribeJobResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResourceUsageResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("UseCachePool")
        private Boolean useCachePool;

        private JobAcuUsage(Builder builder) {
            this.acuUsageDetail = builder.acuUsageDetail;
            this.jobEndTime = builder.jobEndTime;
            this.jobId = builder.jobId;
            this.jobStartTime = builder.jobStartTime;
            this.resourceGroupName = builder.resourceGroupName;
            this.useCachePool = builder.useCachePool;
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

        /**
         * @return useCachePool
         */
        public Boolean getUseCachePool() {
            return this.useCachePool;
        }

        public static final class Builder {
            private AcuUsageDetail acuUsageDetail; 
            private String jobEndTime; 
            private String jobId; 
            private String jobStartTime; 
            private String resourceGroupName; 
            private Boolean useCachePool; 

            private Builder() {
            } 

            private Builder(JobAcuUsage model) {
                this.acuUsageDetail = model.acuUsageDetail;
                this.jobEndTime = model.jobEndTime;
                this.jobId = model.jobId;
                this.jobStartTime = model.jobStartTime;
                this.resourceGroupName = model.resourceGroupName;
                this.useCachePool = model.useCachePool;
            } 

            /**
             * <p>The ACU usage.</p>
             */
            public Builder acuUsageDetail(AcuUsageDetail acuUsageDetail) {
                this.acuUsageDetail = acuUsageDetail;
                return this;
            }

            /**
             * <p>The end time of the job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-23T16:00:00Z</p>
             */
            public Builder jobEndTime(String jobEndTime) {
                this.jobEndTime = jobEndTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1592</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The start time of the job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-22T16:00:00Z</p>
             */
            public Builder jobStartTime(String jobStartTime) {
                this.jobStartTime = jobStartTime;
                return this;
            }

            /**
             * <p>The name of the job resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>job_default</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * UseCachePool.
             */
            public Builder useCachePool(Boolean useCachePool) {
                this.useCachePool = useCachePool;
                return this;
            }

            public JobAcuUsage build() {
                return new JobAcuUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResourceUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobAcuUsage")
        private java.util.List<JobAcuUsage> jobAcuUsage;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.endTime = builder.endTime;
            this.jobAcuUsage = builder.jobAcuUsage;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.startTime = builder.startTime;
            this.totalCount = builder.totalCount;
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
        public java.util.List<JobAcuUsage> getJobAcuUsage() {
            return this.jobAcuUsage;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String endTime; 
            private java.util.List<JobAcuUsage> jobAcuUsage; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String startTime; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.DBClusterId = model.DBClusterId;
                this.endTime = model.endTime;
                this.jobAcuUsage = model.jobAcuUsage;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.startTime = model.startTime;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-clusterxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The end time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-23T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The AnalyticDB compute unit (ACU) usage of the job resource group.</p>
             */
            public Builder jobAcuUsage(java.util.List<JobAcuUsage> jobAcuUsage) {
                this.jobAcuUsage = jobAcuUsage;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-22T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
