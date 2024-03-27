// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckSummaryResponseBody</p>
 */
public class GetCheckSummaryResponseBody extends TeaModel {
    @NameInMap("OverallItemStatistic")
    private OverallItemStatistic overallItemStatistic;

    @NameInMap("OverallStatistic")
    private OverallStatistic overallStatistic;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Summarys")
    private java.util.List < Summarys> summarys;

    private GetCheckSummaryResponseBody(Builder builder) {
        this.overallItemStatistic = builder.overallItemStatistic;
        this.overallStatistic = builder.overallStatistic;
        this.requestId = builder.requestId;
        this.summarys = builder.summarys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return overallItemStatistic
     */
    public OverallItemStatistic getOverallItemStatistic() {
        return this.overallItemStatistic;
    }

    /**
     * @return overallStatistic
     */
    public OverallStatistic getOverallStatistic() {
        return this.overallStatistic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summarys
     */
    public java.util.List < Summarys> getSummarys() {
        return this.summarys;
    }

    public static final class Builder {
        private OverallItemStatistic overallItemStatistic; 
        private OverallStatistic overallStatistic; 
        private String requestId; 
        private java.util.List < Summarys> summarys; 

        /**
         * The statistics of the check items.
         */
        public Builder overallItemStatistic(OverallItemStatistic overallItemStatistic) {
            this.overallItemStatistic = overallItemStatistic;
            return this;
        }

        /**
         * The overall risk statistics.
         */
        public Builder overallStatistic(OverallStatistic overallStatistic) {
            this.overallStatistic = overallStatistic;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The summary information about the configuration checks on cloud services.
         */
        public Builder summarys(java.util.List < Summarys> summarys) {
            this.summarys = summarys;
            return this;
        }

        public GetCheckSummaryResponseBody build() {
            return new GetCheckSummaryResponseBody(this);
        } 

    } 

    public static class OverallItemStatistic extends TeaModel {
        @NameInMap("ReleaseCount")
        private Integer releaseCount;

        @NameInMap("ResultCount")
        private Integer resultCount;

        private OverallItemStatistic(Builder builder) {
            this.releaseCount = builder.releaseCount;
            this.resultCount = builder.resultCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallItemStatistic create() {
            return builder().build();
        }

        /**
         * @return releaseCount
         */
        public Integer getReleaseCount() {
            return this.releaseCount;
        }

        /**
         * @return resultCount
         */
        public Integer getResultCount() {
            return this.resultCount;
        }

        public static final class Builder {
            private Integer releaseCount; 
            private Integer resultCount; 

            /**
             * The number of check items supported by the system.
             */
            public Builder releaseCount(Integer releaseCount) {
                this.releaseCount = releaseCount;
                return this;
            }

            /**
             * The number of check items available to you.
             */
            public Builder resultCount(Integer resultCount) {
                this.resultCount = resultCount;
                return this;
            }

            public OverallItemStatistic build() {
                return new OverallItemStatistic(this);
            } 

        } 

    }
    public static class OverallStatistic extends TeaModel {
        @NameInMap("NotCheckCount")
        private Integer notCheckCount;

        @NameInMap("NotCheckHighCount")
        private Integer notCheckHighCount;

        @NameInMap("NotCheckLowCount")
        private Integer notCheckLowCount;

        @NameInMap("NotCheckMediumCount")
        private Integer notCheckMediumCount;

        @NameInMap("NotPassCount")
        private Integer notPassCount;

        @NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("PassHighCount")
        private Integer passHighCount;

        @NameInMap("PassLowCount")
        private Integer passLowCount;

        @NameInMap("PassMediumCount")
        private Integer passMediumCount;

        private OverallStatistic(Builder builder) {
            this.notCheckCount = builder.notCheckCount;
            this.notCheckHighCount = builder.notCheckHighCount;
            this.notCheckLowCount = builder.notCheckLowCount;
            this.notCheckMediumCount = builder.notCheckMediumCount;
            this.notPassCount = builder.notPassCount;
            this.notPassHighCount = builder.notPassHighCount;
            this.notPassLowCount = builder.notPassLowCount;
            this.notPassMediumCount = builder.notPassMediumCount;
            this.passCount = builder.passCount;
            this.passHighCount = builder.passHighCount;
            this.passLowCount = builder.passLowCount;
            this.passMediumCount = builder.passMediumCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallStatistic create() {
            return builder().build();
        }

        /**
         * @return notCheckCount
         */
        public Integer getNotCheckCount() {
            return this.notCheckCount;
        }

        /**
         * @return notCheckHighCount
         */
        public Integer getNotCheckHighCount() {
            return this.notCheckHighCount;
        }

        /**
         * @return notCheckLowCount
         */
        public Integer getNotCheckLowCount() {
            return this.notCheckLowCount;
        }

        /**
         * @return notCheckMediumCount
         */
        public Integer getNotCheckMediumCount() {
            return this.notCheckMediumCount;
        }

        /**
         * @return notPassCount
         */
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        /**
         * @return notPassHighCount
         */
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        /**
         * @return notPassLowCount
         */
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        /**
         * @return notPassMediumCount
         */
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return passHighCount
         */
        public Integer getPassHighCount() {
            return this.passHighCount;
        }

        /**
         * @return passLowCount
         */
        public Integer getPassLowCount() {
            return this.passLowCount;
        }

        /**
         * @return passMediumCount
         */
        public Integer getPassMediumCount() {
            return this.passMediumCount;
        }

        public static final class Builder {
            private Integer notCheckCount; 
            private Integer notCheckHighCount; 
            private Integer notCheckLowCount; 
            private Integer notCheckMediumCount; 
            private Integer notPassCount; 
            private Integer notPassHighCount; 
            private Integer notPassLowCount; 
            private Integer notPassMediumCount; 
            private Integer passCount; 
            private Integer passHighCount; 
            private Integer passLowCount; 
            private Integer passMediumCount; 

            /**
             * The number of unchecked check items.
             */
            public Builder notCheckCount(Integer notCheckCount) {
                this.notCheckCount = notCheckCount;
                return this;
            }

            /**
             * The number of unchecked high-risk check items.
             */
            public Builder notCheckHighCount(Integer notCheckHighCount) {
                this.notCheckHighCount = notCheckHighCount;
                return this;
            }

            /**
             * The number of unchecked low-risk check items.
             */
            public Builder notCheckLowCount(Integer notCheckLowCount) {
                this.notCheckLowCount = notCheckLowCount;
                return this;
            }

            /**
             * The number of unchecked medium-risk check items.
             */
            public Builder notCheckMediumCount(Integer notCheckMediumCount) {
                this.notCheckMediumCount = notCheckMediumCount;
                return this;
            }

            /**
             * The number of check items that failed to pass the check.
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * The number of high-risk check items that failed to pass the check.
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * The number of low-risk check items that failed to pass the check.
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * The number of medium-risk check items that failed to pass the check.
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            /**
             * The number of check items that pass the check.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * The number of high-risk check items that pass the check.
             */
            public Builder passHighCount(Integer passHighCount) {
                this.passHighCount = passHighCount;
                return this;
            }

            /**
             * The number of low-risk check items that pass the check.
             */
            public Builder passLowCount(Integer passLowCount) {
                this.passLowCount = passLowCount;
                return this;
            }

            /**
             * The number of medium-risk check items that pass the check.
             */
            public Builder passMediumCount(Integer passMediumCount) {
                this.passMediumCount = passMediumCount;
                return this;
            }

            public OverallStatistic build() {
                return new OverallStatistic(this);
            } 

        } 

    }
    public static class StandardStatistic extends TeaModel {
        @NameInMap("NotCheckCount")
        private Integer notCheckCount;

        @NameInMap("NotCheckHighCount")
        private Integer notCheckHighCount;

        @NameInMap("NotCheckLowCount")
        private Integer notCheckLowCount;

        @NameInMap("NotCheckMediumCount")
        private Integer notCheckMediumCount;

        @NameInMap("NotPassCount")
        private Integer notPassCount;

        @NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("PassHighCount")
        private Integer passHighCount;

        @NameInMap("PassLowCount")
        private Integer passLowCount;

        @NameInMap("PassMediumCount")
        private Integer passMediumCount;

        private StandardStatistic(Builder builder) {
            this.notCheckCount = builder.notCheckCount;
            this.notCheckHighCount = builder.notCheckHighCount;
            this.notCheckLowCount = builder.notCheckLowCount;
            this.notCheckMediumCount = builder.notCheckMediumCount;
            this.notPassCount = builder.notPassCount;
            this.notPassHighCount = builder.notPassHighCount;
            this.notPassLowCount = builder.notPassLowCount;
            this.notPassMediumCount = builder.notPassMediumCount;
            this.passCount = builder.passCount;
            this.passHighCount = builder.passHighCount;
            this.passLowCount = builder.passLowCount;
            this.passMediumCount = builder.passMediumCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardStatistic create() {
            return builder().build();
        }

        /**
         * @return notCheckCount
         */
        public Integer getNotCheckCount() {
            return this.notCheckCount;
        }

        /**
         * @return notCheckHighCount
         */
        public Integer getNotCheckHighCount() {
            return this.notCheckHighCount;
        }

        /**
         * @return notCheckLowCount
         */
        public Integer getNotCheckLowCount() {
            return this.notCheckLowCount;
        }

        /**
         * @return notCheckMediumCount
         */
        public Integer getNotCheckMediumCount() {
            return this.notCheckMediumCount;
        }

        /**
         * @return notPassCount
         */
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        /**
         * @return notPassHighCount
         */
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        /**
         * @return notPassLowCount
         */
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        /**
         * @return notPassMediumCount
         */
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return passHighCount
         */
        public Integer getPassHighCount() {
            return this.passHighCount;
        }

        /**
         * @return passLowCount
         */
        public Integer getPassLowCount() {
            return this.passLowCount;
        }

        /**
         * @return passMediumCount
         */
        public Integer getPassMediumCount() {
            return this.passMediumCount;
        }

        public static final class Builder {
            private Integer notCheckCount; 
            private Integer notCheckHighCount; 
            private Integer notCheckLowCount; 
            private Integer notCheckMediumCount; 
            private Integer notPassCount; 
            private Integer notPassHighCount; 
            private Integer notPassLowCount; 
            private Integer notPassMediumCount; 
            private Integer passCount; 
            private Integer passHighCount; 
            private Integer passLowCount; 
            private Integer passMediumCount; 

            /**
             * The number of unchecked check items.
             */
            public Builder notCheckCount(Integer notCheckCount) {
                this.notCheckCount = notCheckCount;
                return this;
            }

            /**
             * The number of unchecked high-risk check items.
             */
            public Builder notCheckHighCount(Integer notCheckHighCount) {
                this.notCheckHighCount = notCheckHighCount;
                return this;
            }

            /**
             * The number of unchecked low-risk check items.
             */
            public Builder notCheckLowCount(Integer notCheckLowCount) {
                this.notCheckLowCount = notCheckLowCount;
                return this;
            }

            /**
             * The number of unchecked medium-risk check items.
             */
            public Builder notCheckMediumCount(Integer notCheckMediumCount) {
                this.notCheckMediumCount = notCheckMediumCount;
                return this;
            }

            /**
             * The number of check items that failed to pass the check.
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * The number of high-risk check items that failed to pass the check.
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * The number of low-risk check items that failed to pass the check.
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * The number of medium-risk check items that failed to pass the check.
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            /**
             * The number of check items that pass the check.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * The number of high-risk check items that pass the check.
             */
            public Builder passHighCount(Integer passHighCount) {
                this.passHighCount = passHighCount;
                return this;
            }

            /**
             * The number of low-risk check items that pass the check.
             */
            public Builder passLowCount(Integer passLowCount) {
                this.passLowCount = passLowCount;
                return this;
            }

            /**
             * The number of medium-risk check items that pass the check.
             */
            public Builder passMediumCount(Integer passMediumCount) {
                this.passMediumCount = passMediumCount;
                return this;
            }

            public StandardStatistic build() {
                return new StandardStatistic(this);
            } 

        } 

    }
    public static class Standards extends TeaModel {
        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("RiskLevelHighCount")
        private Integer riskLevelHighCount;

        @NameInMap("RiskLevelLowCount")
        private Integer riskLevelLowCount;

        @NameInMap("RiskLevelMediumCount")
        private Integer riskLevelMediumCount;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("StandardStatistic")
        private StandardStatistic standardStatistic;

        private Standards(Builder builder) {
            this.failCount = builder.failCount;
            this.id = builder.id;
            this.passCount = builder.passCount;
            this.riskLevelHighCount = builder.riskLevelHighCount;
            this.riskLevelLowCount = builder.riskLevelLowCount;
            this.riskLevelMediumCount = builder.riskLevelMediumCount;
            this.showName = builder.showName;
            this.standardStatistic = builder.standardStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standards create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return riskLevelHighCount
         */
        public Integer getRiskLevelHighCount() {
            return this.riskLevelHighCount;
        }

        /**
         * @return riskLevelLowCount
         */
        public Integer getRiskLevelLowCount() {
            return this.riskLevelLowCount;
        }

        /**
         * @return riskLevelMediumCount
         */
        public Integer getRiskLevelMediumCount() {
            return this.riskLevelMediumCount;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return standardStatistic
         */
        public StandardStatistic getStandardStatistic() {
            return this.standardStatistic;
        }

        public static final class Builder {
            private Integer failCount; 
            private Long id; 
            private Integer passCount; 
            private Integer riskLevelHighCount; 
            private Integer riskLevelLowCount; 
            private Integer riskLevelMediumCount; 
            private String showName; 
            private StandardStatistic standardStatistic; 

            /**
             * The number of check items that failed to pass the check.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * The ID of the check item.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of check items that pass the check.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * The number of **high-risk** items.
             */
            public Builder riskLevelHighCount(Integer riskLevelHighCount) {
                this.riskLevelHighCount = riskLevelHighCount;
                return this;
            }

            /**
             * The number of **low-risk** items.
             */
            public Builder riskLevelLowCount(Integer riskLevelLowCount) {
                this.riskLevelLowCount = riskLevelLowCount;
                return this;
            }

            /**
             * The number of **medium-risk** items.
             */
            public Builder riskLevelMediumCount(Integer riskLevelMediumCount) {
                this.riskLevelMediumCount = riskLevelMediumCount;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The standard statistics of the check items.
             */
            public Builder standardStatistic(StandardStatistic standardStatistic) {
                this.standardStatistic = standardStatistic;
                return this;
            }

            public Standards build() {
                return new Standards(this);
            } 

        } 

    }
    public static class TypeStatistic extends TeaModel {
        @NameInMap("NotCheckCount")
        private Integer notCheckCount;

        @NameInMap("NotCheckHighCount")
        private Integer notCheckHighCount;

        @NameInMap("NotCheckLowCount")
        private Integer notCheckLowCount;

        @NameInMap("NotCheckMediumCount")
        private Integer notCheckMediumCount;

        @NameInMap("NotPassCount")
        private Integer notPassCount;

        @NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("PassHighCount")
        private Integer passHighCount;

        @NameInMap("PassLowCount")
        private Integer passLowCount;

        @NameInMap("PassMediumCount")
        private Integer passMediumCount;

        private TypeStatistic(Builder builder) {
            this.notCheckCount = builder.notCheckCount;
            this.notCheckHighCount = builder.notCheckHighCount;
            this.notCheckLowCount = builder.notCheckLowCount;
            this.notCheckMediumCount = builder.notCheckMediumCount;
            this.notPassCount = builder.notPassCount;
            this.notPassHighCount = builder.notPassHighCount;
            this.notPassLowCount = builder.notPassLowCount;
            this.notPassMediumCount = builder.notPassMediumCount;
            this.passCount = builder.passCount;
            this.passHighCount = builder.passHighCount;
            this.passLowCount = builder.passLowCount;
            this.passMediumCount = builder.passMediumCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeStatistic create() {
            return builder().build();
        }

        /**
         * @return notCheckCount
         */
        public Integer getNotCheckCount() {
            return this.notCheckCount;
        }

        /**
         * @return notCheckHighCount
         */
        public Integer getNotCheckHighCount() {
            return this.notCheckHighCount;
        }

        /**
         * @return notCheckLowCount
         */
        public Integer getNotCheckLowCount() {
            return this.notCheckLowCount;
        }

        /**
         * @return notCheckMediumCount
         */
        public Integer getNotCheckMediumCount() {
            return this.notCheckMediumCount;
        }

        /**
         * @return notPassCount
         */
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        /**
         * @return notPassHighCount
         */
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        /**
         * @return notPassLowCount
         */
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        /**
         * @return notPassMediumCount
         */
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return passHighCount
         */
        public Integer getPassHighCount() {
            return this.passHighCount;
        }

        /**
         * @return passLowCount
         */
        public Integer getPassLowCount() {
            return this.passLowCount;
        }

        /**
         * @return passMediumCount
         */
        public Integer getPassMediumCount() {
            return this.passMediumCount;
        }

        public static final class Builder {
            private Integer notCheckCount; 
            private Integer notCheckHighCount; 
            private Integer notCheckLowCount; 
            private Integer notCheckMediumCount; 
            private Integer notPassCount; 
            private Integer notPassHighCount; 
            private Integer notPassLowCount; 
            private Integer notPassMediumCount; 
            private Integer passCount; 
            private Integer passHighCount; 
            private Integer passLowCount; 
            private Integer passMediumCount; 

            /**
             * The number of unchecked check items.
             */
            public Builder notCheckCount(Integer notCheckCount) {
                this.notCheckCount = notCheckCount;
                return this;
            }

            /**
             * The number of unchecked high-risk check items.
             */
            public Builder notCheckHighCount(Integer notCheckHighCount) {
                this.notCheckHighCount = notCheckHighCount;
                return this;
            }

            /**
             * The number of unchecked low-risk check items.
             */
            public Builder notCheckLowCount(Integer notCheckLowCount) {
                this.notCheckLowCount = notCheckLowCount;
                return this;
            }

            /**
             * The number of unchecked medium-risk check items.
             */
            public Builder notCheckMediumCount(Integer notCheckMediumCount) {
                this.notCheckMediumCount = notCheckMediumCount;
                return this;
            }

            /**
             * The number of check items that failed to pass the check.
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * The number of high-risk check items that failed to pass the check.
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * The number of low-risk check items that failed to pass the check.
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * The number of medium-risk check items that failed to pass the check.
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            /**
             * The number of check items that passed the check.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * The number of high-risk check items that pass the check.
             */
            public Builder passHighCount(Integer passHighCount) {
                this.passHighCount = passHighCount;
                return this;
            }

            /**
             * The number of low-risk check items that pass the check.
             */
            public Builder passLowCount(Integer passLowCount) {
                this.passLowCount = passLowCount;
                return this;
            }

            /**
             * The number of medium-risk check items that pass the check.
             */
            public Builder passMediumCount(Integer passMediumCount) {
                this.passMediumCount = passMediumCount;
                return this;
            }

            public TypeStatistic build() {
                return new TypeStatistic(this);
            } 

        } 

    }
    public static class Summarys extends TeaModel {
        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("PassCount")
        private Long passCount;

        @NameInMap("Standards")
        private java.util.List < Standards> standards;

        @NameInMap("Type")
        private String type;

        @NameInMap("TypeStatistic")
        private TypeStatistic typeStatistic;

        private Summarys(Builder builder) {
            this.failCount = builder.failCount;
            this.passCount = builder.passCount;
            this.standards = builder.standards;
            this.type = builder.type;
            this.typeStatistic = builder.typeStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summarys create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return passCount
         */
        public Long getPassCount() {
            return this.passCount;
        }

        /**
         * @return standards
         */
        public java.util.List < Standards> getStandards() {
            return this.standards;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeStatistic
         */
        public TypeStatistic getTypeStatistic() {
            return this.typeStatistic;
        }

        public static final class Builder {
            private Integer failCount; 
            private Long passCount; 
            private java.util.List < Standards> standards; 
            private String type; 
            private TypeStatistic typeStatistic; 

            /**
             * The number of detected risk items.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * The number of check items that pass the check.
             */
            public Builder passCount(Long passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * The information about the check items.
             */
            public Builder standards(java.util.List < Standards> standards) {
                this.standards = standards;
                return this;
            }

            /**
             * The type of the check item. Valid values:
             * <p>
             * 
             * *   **COMPLIANCE**: compliance
             * *   **RISK**: security risk
             * *   **IDENTITY_PERMISSION**: identity and permission
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The risk statistics by type.
             */
            public Builder typeStatistic(TypeStatistic typeStatistic) {
                this.typeStatistic = typeStatistic;
                return this;
            }

            public Summarys build() {
                return new Summarys(this);
            } 

        } 

    }
}
