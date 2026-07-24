// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link ListComputeJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComputeJobsResponseBody</p>
 */
public class ListComputeJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListComputeJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListComputeJobsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListComputeJobsResponseBody build() {
            return new ListComputeJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CuLimit")
        private Double cuLimit;

        @com.aliyun.core.annotation.NameInMap("CuReserved")
        private Double cuReserved;

        @com.aliyun.core.annotation.NameInMap("CuUsed")
        private Double cuUsed;

        @com.aliyun.core.annotation.NameInMap("DebugMode")
        private Integer debugMode;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.cuLimit = builder.cuLimit;
            this.cuReserved = builder.cuReserved;
            this.cuUsed = builder.cuUsed;
            this.debugMode = builder.debugMode;
            this.instanceId = builder.instanceId;
            this.jobName = builder.jobName;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cuLimit
         */
        public Double getCuLimit() {
            return this.cuLimit;
        }

        /**
         * @return cuReserved
         */
        public Double getCuReserved() {
            return this.cuReserved;
        }

        /**
         * @return cuUsed
         */
        public Double getCuUsed() {
            return this.cuUsed;
        }

        /**
         * @return debugMode
         */
        public Integer getDebugMode() {
            return this.debugMode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private Double cuLimit; 
            private Double cuReserved; 
            private Double cuUsed; 
            private Integer debugMode; 
            private String instanceId; 
            private String jobName; 
            private String owner; 
            private String regionId; 
            private String remark; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.cuLimit = model.cuLimit;
                this.cuReserved = model.cuReserved;
                this.cuUsed = model.cuUsed;
                this.debugMode = model.debugMode;
                this.instanceId = model.instanceId;
                this.jobName = model.jobName;
                this.owner = model.owner;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CuLimit.
             */
            public Builder cuLimit(Double cuLimit) {
                this.cuLimit = cuLimit;
                return this;
            }

            /**
             * CuReserved.
             */
            public Builder cuReserved(Double cuReserved) {
                this.cuReserved = cuReserved;
                return this;
            }

            /**
             * CuUsed.
             */
            public Builder cuUsed(Double cuUsed) {
                this.cuUsed = cuUsed;
                return this;
            }

            /**
             * DebugMode.
             */
            public Builder debugMode(Integer debugMode) {
                this.debugMode = debugMode;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
