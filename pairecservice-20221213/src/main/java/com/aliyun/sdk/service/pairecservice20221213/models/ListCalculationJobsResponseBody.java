// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCalculationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalculationJobsResponseBody</p>
 */
public class ListCalculationJobsResponseBody extends TeaModel {
    @NameInMap("CalculationJobs")
    private java.util.List < CalculationJobs> calculationJobs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return calculationJobs
     */
    public java.util.List < CalculationJobs> getCalculationJobs() {
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
        private java.util.List < CalculationJobs> calculationJobs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * CalculationJobs.
         */
        public Builder calculationJobs(java.util.List < CalculationJobs> calculationJobs) {
            this.calculationJobs = calculationJobs;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCalculationJobsResponseBody build() {
            return new ListCalculationJobsResponseBody(this);
        } 

    } 

    public static class CalculationJobs extends TeaModel {
        @NameInMap("ABMetricName")
        private String ABMetricName;

        @NameInMap("BizDate")
        private String bizDate;

        @NameInMap("CalculationJobId")
        private String calculationJobId;

        @NameInMap("Config")
        private String config;

        @NameInMap("GmtRanTime")
        private String gmtRanTime;

        @NameInMap("JobMessage")
        private java.util.List < String > jobMessage;

        @NameInMap("JobSource")
        private String jobSource;

        @NameInMap("Status")
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
        public java.util.List < String > getJobMessage() {
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
            private java.util.List < String > jobMessage; 
            private String jobSource; 
            private String status; 

            /**
             * ABMetricName.
             */
            public Builder ABMetricName(String ABMetricName) {
                this.ABMetricName = ABMetricName;
                return this;
            }

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * CalculationJobId.
             */
            public Builder calculationJobId(String calculationJobId) {
                this.calculationJobId = calculationJobId;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * GmtRanTime.
             */
            public Builder gmtRanTime(String gmtRanTime) {
                this.gmtRanTime = gmtRanTime;
                return this;
            }

            /**
             * JobMessage.
             */
            public Builder jobMessage(java.util.List < String > jobMessage) {
                this.jobMessage = jobMessage;
                return this;
            }

            /**
             * JobSource.
             */
            public Builder jobSource(String jobSource) {
                this.jobSource = jobSource;
                return this;
            }

            /**
             * Status.
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
