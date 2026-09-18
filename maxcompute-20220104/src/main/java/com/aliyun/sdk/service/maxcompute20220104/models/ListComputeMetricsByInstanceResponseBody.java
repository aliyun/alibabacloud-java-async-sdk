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
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li>1xx: Informational response. The request has been received and is being processed.</li>
         * <li>2xx: Success. The request has been successfully received, understood, and accepted by the server.</li>
         * <li>3xx: Redirection. The request is redirected, and further action is required to complete the request.</li>
         * <li>4xx: Client error. The request contains invalid parameters, bad syntax, or specific request conditions cannot be fulfilled.</li>
         * <li>5xx: Server error. The server cannot fulfill the request due to other reasons.</li>
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
             * <p>The job end time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1710432000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20240730****ddlr</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The job owner.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$7632***@aliyun.com</p>
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_porject</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The SQL job signature.</p>
             * 
             * <strong>example:</strong>
             * <p>pqrs12345tuv</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The specification type. Valid values:</p>
             * <ul>
             * <li>OdpsStandard: the pay-as-you-go billing method Standard Edition.</li>
             * <li>OdpsSpot: the pay-as-you-go billing method Off-peak Edition.</li>
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
             * <p>The job submit time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610432000000</p>
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The metering type. Valid values:</p>
             * <ul>
             * <li><p>ComputationSql: metering data of SQL jobs that operate on internal tables.</p>
             * </li>
             * <li><p>ComputationSqlOTS: metering data of SQL jobs that operate on OTS external tables.</p>
             * </li>
             * <li><p>ComputationSqlOSS: metering data of SQL jobs that operate on OSS external tables.</p>
             * </li>
             * <li><p>MapReduce: metering data of MapReduce jobs.</p>
             * </li>
             * <li><p>spark: metering data of Spark jobs.</p>
             * </li>
             * <li><p>mars: metering data of Mars jobs.</p>
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
             * <li><p>For scan-based billing types, the unit is GB. This includes the ComputationSql, ComputationSqlOTS, and ComputationSqlOSS billing types, which are billed based on the amount of data scanned. The compute usage is calculated as the scan volume × complexity for each job. The complexity for ComputationSqlOTS and ComputationSqlOSS types is fixed at 1.</p>
             * </li>
             * <li><p>For CU-hour-based billing types, the unit is CU-hours. This includes the MapReduce, spark, and mars billing types, which are billed based on CU-hours.</p>
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
             * <p>The list of pay-as-you-go job compute usage.</p>
             */
            public Builder instanceComputeMetrics(java.util.List<InstanceComputeMetrics> instanceComputeMetrics) {
                this.instanceComputeMetrics = instanceComputeMetrics;
                return this;
            }

            /**
             * <p>The current page number.</p>
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
