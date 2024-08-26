// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNisInspectionReportSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNisInspectionReportSummaryResponseBody</p>
 */
public class DescribeNisInspectionReportSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    private String inspectionReportId;

    @com.aliyun.core.annotation.NameInMap("InspectionTaskId")
    private String inspectionTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Summary summary;

    private DescribeNisInspectionReportSummaryResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.inspectionReportId = builder.inspectionReportId;
        this.inspectionTaskId = builder.inspectionTaskId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionReportSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return inspectionReportId
     */
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    /**
     * @return inspectionTaskId
     */
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private String endTime; 
        private String inspectionReportId; 
        private String inspectionTaskId; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private Summary summary; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * InspectionReportId.
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        /**
         * InspectionTaskId.
         */
        public Builder inspectionTaskId(String inspectionTaskId) {
            this.inspectionTaskId = inspectionTaskId;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        public DescribeNisInspectionReportSummaryResponseBody build() {
            return new DescribeNisInspectionReportSummaryResponseBody(this);
        } 

    } 

    public static class PassRateSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PassRate")
        private Double passRate;

        @com.aliyun.core.annotation.NameInMap("PassRateScope")
        private String passRateScope;

        private PassRateSummary(Builder builder) {
            this.passRate = builder.passRate;
            this.passRateScope = builder.passRateScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassRateSummary create() {
            return builder().build();
        }

        /**
         * @return passRate
         */
        public Double getPassRate() {
            return this.passRate;
        }

        /**
         * @return passRateScope
         */
        public String getPassRateScope() {
            return this.passRateScope;
        }

        public static final class Builder {
            private Double passRate; 
            private String passRateScope; 

            /**
             * PassRate.
             */
            public Builder passRate(Double passRate) {
                this.passRate = passRate;
                return this;
            }

            /**
             * PassRateScope.
             */
            public Builder passRateScope(String passRateScope) {
                this.passRateScope = passRateScope;
                return this;
            }

            public PassRateSummary build() {
                return new PassRateSummary(this);
            } 

        } 

    }
    public static class RiskSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Integer resourceCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        private RiskSummary(Builder builder) {
            this.resourceCount = builder.resourceCount;
            this.riskCount = builder.riskCount;
            this.riskLevel = builder.riskLevel;
            this.riskType = builder.riskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskSummary create() {
            return builder().build();
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        public static final class Builder {
            private Integer resourceCount; 
            private Integer riskCount; 
            private String riskLevel; 
            private String riskType; 

            /**
             * ResourceCount.
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RiskType.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            public RiskSummary build() {
                return new RiskSummary(this);
            } 

        } 

    }
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItemCount")
        private Integer checkItemCount;

        @com.aliyun.core.annotation.NameInMap("CheckResourceCount")
        private Integer checkResourceCount;

        @com.aliyun.core.annotation.NameInMap("PassRateSummary")
        private java.util.List < PassRateSummary> passRateSummary;

        @com.aliyun.core.annotation.NameInMap("RiskSummary")
        private java.util.List < RiskSummary> riskSummary;

        private Summary(Builder builder) {
            this.checkItemCount = builder.checkItemCount;
            this.checkResourceCount = builder.checkResourceCount;
            this.passRateSummary = builder.passRateSummary;
            this.riskSummary = builder.riskSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return checkItemCount
         */
        public Integer getCheckItemCount() {
            return this.checkItemCount;
        }

        /**
         * @return checkResourceCount
         */
        public Integer getCheckResourceCount() {
            return this.checkResourceCount;
        }

        /**
         * @return passRateSummary
         */
        public java.util.List < PassRateSummary> getPassRateSummary() {
            return this.passRateSummary;
        }

        /**
         * @return riskSummary
         */
        public java.util.List < RiskSummary> getRiskSummary() {
            return this.riskSummary;
        }

        public static final class Builder {
            private Integer checkItemCount; 
            private Integer checkResourceCount; 
            private java.util.List < PassRateSummary> passRateSummary; 
            private java.util.List < RiskSummary> riskSummary; 

            /**
             * CheckItemCount.
             */
            public Builder checkItemCount(Integer checkItemCount) {
                this.checkItemCount = checkItemCount;
                return this;
            }

            /**
             * CheckResourceCount.
             */
            public Builder checkResourceCount(Integer checkResourceCount) {
                this.checkResourceCount = checkResourceCount;
                return this;
            }

            /**
             * PassRateSummary.
             */
            public Builder passRateSummary(java.util.List < PassRateSummary> passRateSummary) {
                this.passRateSummary = passRateSummary;
                return this;
            }

            /**
             * RiskSummary.
             */
            public Builder riskSummary(java.util.List < RiskSummary> riskSummary) {
                this.riskSummary = riskSummary;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
}
