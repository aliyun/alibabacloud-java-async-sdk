// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListComputeMetricsByInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListComputeMetricsByInstanceResponseBody</p>
 */
public class ListComputeMetricsByInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListComputeMetricsByInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeMetricsByInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListComputeMetricsByInstanceResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li><p>1xx: Informational - The request has been received and is being processed.</p>
         * </li>
         * <li><p>2xx: Success - The request was successfully received, understood, and accepted.</p>
         * </li>
         * <li><p>3xx: Redirection - Further action is required to complete the request.</p>
         * </li>
         * <li><p>4xx: Client Error - The request contains invalid syntax or cannot be fulfilled.</p>
         * </li>
         * <li><p>5xx: Server Error - The server failed to fulfill a valid request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc059b717363029839908920ea631</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListComputeMetricsByInstanceResponseBody build() {
            return new ListComputeMetricsByInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeMetricsByInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeMetricsByInstanceResponseBody</p>
     */
    public static class InstanceComputeMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("jobOwner")
        private String jobOwner;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("specCode")
        private String specCode;

        @com.aliyun.core.annotation.NameInMap("submitTime")
        private Long submitTime;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Double usage;

        private InstanceComputeMetrics(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.jobOwner = builder.jobOwner;
            this.projectName = builder.projectName;
            this.signature = builder.signature;
            this.specCode = builder.specCode;
            this.submitTime = builder.submitTime;
            this.type = builder.type;
            this.unit = builder.unit;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceComputeMetrics create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobOwner
         */
        public String getJobOwner() {
            return this.jobOwner;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return specCode
         */
        public String getSpecCode() {
            return this.specCode;
        }

        /**
         * @return submitTime
         */
        public Long getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return usage
         */
        public Double getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceId; 
            private String jobOwner; 
            private String projectName; 
            private String signature; 
            private String specCode; 
            private Long submitTime; 
            private String type; 
            private String unit; 
            private Double usage; 

            private Builder() {
            } 

            private Builder(InstanceComputeMetrics model) {
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.jobOwner = model.jobOwner;
                this.projectName = model.projectName;
                this.signature = model.signature;
                this.specCode = model.specCode;
                this.submitTime = model.submitTime;
                this.type = model.type;
                this.unit = model.unit;
                this.usage = model.usage;
            } 

            /**
             * <p>The job completion time, as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1710432000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20240730****ddlr</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The owner of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$7632***@aliyun.com</p>
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_porject</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The signature of the SQL job.</p>
             * 
             * <strong>example:</strong>
             * <p>pqrs12345tuv</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The specification type.</p>
             * <ul>
             * <li><p><code>OdpsStandard</code>: Standard pay-as-you-go specification.</p>
             * </li>
             * <li><p><code>OdpsSpot</code>: Spot pay-as-you-go specification.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OdpsStandard</p>
             */
            public Builder specCode(String specCode) {
                this.specCode = specCode;
                return this;
            }

            /**
             * <p>The job submission time, as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610432000000</p>
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The metering type.</p>
             * <ul>
             * <li><p><code>ComputationSql</code>: Metrics for SQL jobs on internal tables.</p>
             * </li>
             * <li><p><code>ComputationSqlOTS</code>: Metrics for SQL jobs on Tablestore external tables.</p>
             * </li>
             * <li><p><code>ComputationSqlOSS</code>: Metrics for SQL jobs on OSS external tables.</p>
             * </li>
             * <li><p><code>MapReduce</code>: Metrics for MapReduce jobs.</p>
             * </li>
             * <li><p><code>spark</code>: Metrics for Spark jobs.</p>
             * </li>
             * <li><p><code>mars</code>: Metrics for Mars jobs.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ComputationSql</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unit of compute usage.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The compute usage.</p>
             * <ul>
             * <li><p>For jobs billed by the amount of data scanned, such as <code>ComputationSql</code>, <code>ComputationSqlOTS</code>, and <code>ComputationSqlOSS</code> jobs, the unit is GB. The usage is calculated as: Amount of scanned data × Complexity. The complexity factor for <code>ComputationSqlOTS</code> and <code>ComputationSqlOSS</code> jobs is 1.</p>
             * </li>
             * <li><p>For jobs billed by CU-hours (such as <code>MapReduce</code>, <code>spark</code>, and <code>mars</code> jobs), the unit is CU-hour.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder usage(Double usage) {
                this.usage = usage;
                return this;
            }

            public InstanceComputeMetrics build() {
                return new InstanceComputeMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComputeMetricsByInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeMetricsByInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceComputeMetrics")
        private java.util.List<InstanceComputeMetrics> instanceComputeMetrics;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.instanceComputeMetrics = builder.instanceComputeMetrics;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceComputeMetrics
         */
        public java.util.List<InstanceComputeMetrics> getInstanceComputeMetrics() {
            return this.instanceComputeMetrics;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<InstanceComputeMetrics> instanceComputeMetrics; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instanceComputeMetrics = model.instanceComputeMetrics;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Usage metrics for pay-as-you-go jobs.</p>
             */
            public Builder instanceComputeMetrics(java.util.List<InstanceComputeMetrics> instanceComputeMetrics) {
                this.instanceComputeMetrics = instanceComputeMetrics;
                return this;
            }

            /**
             * <p>The returned page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
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
