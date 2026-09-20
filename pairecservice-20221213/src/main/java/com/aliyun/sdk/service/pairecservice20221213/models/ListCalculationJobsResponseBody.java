// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListCalculationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalculationJobsResponseBody</p>
 */
public class ListCalculationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CalculationJobs")
    private java.util.List<CalculationJobs> calculationJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCalculationJobsResponseBody(Builder builder) {
        this.calculationJobs = builder.calculationJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalculationJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calculationJobs
     */
    public java.util.List<CalculationJobs> getCalculationJobs() {
        return this.calculationJobs;
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
        private java.util.List<CalculationJobs> calculationJobs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCalculationJobsResponseBody model) {
            this.calculationJobs = model.calculationJobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of calculation jobs.</p>
         */
        public Builder calculationJobs(java.util.List<CalculationJobs> calculationJobs) {
            this.calculationJobs = calculationJobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCalculationJobsResponseBody build() {
            return new ListCalculationJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCalculationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalculationJobsResponseBody</p>
     */
    public static class CalculationJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ABMetricName")
        private String ABMetricName;

        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("CalculationJobId")
        private String calculationJobId;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("GmtRanTime")
        private String gmtRanTime;

        @com.aliyun.core.annotation.NameInMap("JobMessage")
        private java.util.List<String> jobMessage;

        @com.aliyun.core.annotation.NameInMap("JobSource")
        private String jobSource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CalculationJobs(Builder builder) {
            this.ABMetricName = builder.ABMetricName;
            this.bizDate = builder.bizDate;
            this.calculationJobId = builder.calculationJobId;
            this.config = builder.config;
            this.gmtRanTime = builder.gmtRanTime;
            this.jobMessage = builder.jobMessage;
            this.jobSource = builder.jobSource;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalculationJobs create() {
            return builder().build();
        }

        /**
         * @return ABMetricName
         */
        public String getABMetricName() {
            return this.ABMetricName;
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return calculationJobId
         */
        public String getCalculationJobId() {
            return this.calculationJobId;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return gmtRanTime
         */
        public String getGmtRanTime() {
            return this.gmtRanTime;
        }

        /**
         * @return jobMessage
         */
        public java.util.List<String> getJobMessage() {
            return this.jobMessage;
        }

        /**
         * @return jobSource
         */
        public String getJobSource() {
            return this.jobSource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ABMetricName; 
            private String bizDate; 
            private String calculationJobId; 
            private String config; 
            private String gmtRanTime; 
            private java.util.List<String> jobMessage; 
            private String jobSource; 
            private String status; 

            private Builder() {
            } 

            private Builder(CalculationJobs model) {
                this.ABMetricName = model.ABMetricName;
                this.bizDate = model.bizDate;
                this.calculationJobId = model.calculationJobId;
                this.config = model.config;
                this.gmtRanTime = model.gmtRanTime;
                this.jobMessage = model.jobMessage;
                this.jobSource = model.jobSource;
                this.status = model.status;
            } 

            /**
             * <p>The name of the A/B metric.</p>
             * 
             * <strong>example:</strong>
             * <p>pv</p>
             */
            public Builder ABMetricName(String ABMetricName) {
                this.ABMetricName = ABMetricName;
                return this;
            }

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The calculation job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder calculationJobId(String calculationJobId) {
                this.calculationJobId = calculationJobId;
                return this;
            }

            /**
             * <p>The job configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the job was run.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtRanTime(String gmtRanTime) {
                this.gmtRanTime = gmtRanTime;
                return this;
            }

            /**
             * <p>The job messages.</p>
             */
            public Builder jobMessage(java.util.List<String> jobMessage) {
                this.jobMessage = jobMessage;
                return this;
            }

            /**
             * <p>The source of the job. Valid values:</p>
             * <ul>
             * <li><p>CronOffline: The job is an offline scheduled task.</p>
             * </li>
             * <li><p>DataRerun: The job is a data rerun task.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CronOffline</p>
             */
            public Builder jobSource(String jobSource) {
                this.jobSource = jobSource;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><p>Success</p>
             * </li>
             * <li><p>Failure</p>
             * </li>
             * <li><p>Initializing</p>
             * </li>
             * <li><p>Running</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CalculationJobs build() {
                return new CalculationJobs(this);
            } 

        } 

    }
}
