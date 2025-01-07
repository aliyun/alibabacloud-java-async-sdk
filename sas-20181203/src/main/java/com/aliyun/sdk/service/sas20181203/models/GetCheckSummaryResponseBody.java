// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckSummaryResponseBody</p>
 */
public class GetCheckSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OverallItemStatistic")
    private OverallItemStatistic overallItemStatistic;

    @com.aliyun.core.annotation.NameInMap("OverallStatistic")
    private OverallStatistic overallStatistic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Summarys")
    private java.util.List<Summarys> summarys;

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
    public java.util.List<Summarys> getSummarys() {
        return this.summarys;
    }

    public static final class Builder {
        private OverallItemStatistic overallItemStatistic; 
        private OverallStatistic overallStatistic; 
        private String requestId; 
        private java.util.List<Summarys> summarys; 

        /**
         * <p>The statistics about the number of check items.</p>
         */
        public Builder overallItemStatistic(OverallItemStatistic overallItemStatistic) {
            this.overallItemStatistic = overallItemStatistic;
            return this;
        }

        /**
         * <p>The overall risk statistics.</p>
         */
        public Builder overallStatistic(OverallStatistic overallStatistic) {
            this.overallStatistic = overallStatistic;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>843E4805-****-7EE12FA8DBFD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The summary information about the configuration checks on cloud services.</p>
         */
        public Builder summarys(java.util.List<Summarys> summarys) {
            this.summarys = summarys;
            return this;
        }

        public GetCheckSummaryResponseBody build() {
            return new GetCheckSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSummaryResponseBody</p>
     */
    public static class OverallItemStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseCount")
        private Integer releaseCount;

        @com.aliyun.core.annotation.NameInMap("ResultCount")
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
             * <p>The number of check items supported by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>620</p>
             */
            public Builder releaseCount(Integer releaseCount) {
                this.releaseCount = releaseCount;
                return this;
            }

            /**
             * <p>The number of check items available to you.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
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
    /**
     * 
     * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSummaryResponseBody</p>
     */
    public static class OverallStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotCheckCount")
        private Integer notCheckCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckHighCount")
        private Integer notCheckHighCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckLowCount")
        private Integer notCheckLowCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckMediumCount")
        private Integer notCheckMediumCount;

        @com.aliyun.core.annotation.NameInMap("NotPassCount")
        private Integer notPassCount;

        @com.aliyun.core.annotation.NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @com.aliyun.core.annotation.NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @com.aliyun.core.annotation.NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("PassHighCount")
        private Integer passHighCount;

        @com.aliyun.core.annotation.NameInMap("PassLowCount")
        private Integer passLowCount;

        @com.aliyun.core.annotation.NameInMap("PassMediumCount")
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
             * <p>The number of unchecked check items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notCheckCount(Integer notCheckCount) {
                this.notCheckCount = notCheckCount;
                return this;
            }

            /**
             * <p>The number of unchecked high-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckHighCount(Integer notCheckHighCount) {
                this.notCheckHighCount = notCheckHighCount;
                return this;
            }

            /**
             * <p>The number of unchecked low-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckLowCount(Integer notCheckLowCount) {
                this.notCheckLowCount = notCheckLowCount;
                return this;
            }

            /**
             * <p>The number of unchecked medium-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckMediumCount(Integer notCheckMediumCount) {
                this.notCheckMediumCount = notCheckMediumCount;
                return this;
            }

            /**
             * <p>The number of check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * <p>The number of high-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            /**
             * <p>The number of check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The number of high-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passHighCount(Integer passHighCount) {
                this.passHighCount = passHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passLowCount(Integer passLowCount) {
                this.passLowCount = passLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSummaryResponseBody</p>
     */
    public static class StandardStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotCheckCount")
        private Integer notCheckCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckHighCount")
        private Integer notCheckHighCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckLowCount")
        private Integer notCheckLowCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckMediumCount")
        private Integer notCheckMediumCount;

        @com.aliyun.core.annotation.NameInMap("NotPassCount")
        private Integer notPassCount;

        @com.aliyun.core.annotation.NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @com.aliyun.core.annotation.NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @com.aliyun.core.annotation.NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("PassHighCount")
        private Integer passHighCount;

        @com.aliyun.core.annotation.NameInMap("PassLowCount")
        private Integer passLowCount;

        @com.aliyun.core.annotation.NameInMap("PassMediumCount")
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
             * <p>The number of unchecked check items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notCheckCount(Integer notCheckCount) {
                this.notCheckCount = notCheckCount;
                return this;
            }

            /**
             * <p>The number of unchecked high-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckHighCount(Integer notCheckHighCount) {
                this.notCheckHighCount = notCheckHighCount;
                return this;
            }

            /**
             * <p>The number of unchecked low-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckLowCount(Integer notCheckLowCount) {
                this.notCheckLowCount = notCheckLowCount;
                return this;
            }

            /**
             * <p>The number of unchecked medium-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckMediumCount(Integer notCheckMediumCount) {
                this.notCheckMediumCount = notCheckMediumCount;
                return this;
            }

            /**
             * <p>The number of check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * <p>The number of high-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            /**
             * <p>The number of check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The number of high-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passHighCount(Integer passHighCount) {
                this.passHighCount = passHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passLowCount(Integer passLowCount) {
                this.passLowCount = passLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSummaryResponseBody</p>
     */
    public static class Standards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevelHighCount")
        private Integer riskLevelHighCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevelLowCount")
        private Integer riskLevelLowCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevelMediumCount")
        private Integer riskLevelMediumCount;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("StandardStatistic")
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
             * <p>The number of check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The number of <strong>high-risk</strong> items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevelHighCount(Integer riskLevelHighCount) {
                this.riskLevelHighCount = riskLevelHighCount;
                return this;
            }

            /**
             * <p>The number of <strong>low-risk</strong> items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevelLowCount(Integer riskLevelLowCount) {
                this.riskLevelLowCount = riskLevelLowCount;
                return this;
            }

            /**
             * <p>The number of <strong>medium-risk</strong> items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevelMediumCount(Integer riskLevelMediumCount) {
                this.riskLevelMediumCount = riskLevelMediumCount;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Identity and permission management</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The standard statistics of the check items.</p>
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
    /**
     * 
     * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSummaryResponseBody</p>
     */
    public static class TypeStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotCheckCount")
        private Integer notCheckCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckHighCount")
        private Integer notCheckHighCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckLowCount")
        private Integer notCheckLowCount;

        @com.aliyun.core.annotation.NameInMap("NotCheckMediumCount")
        private Integer notCheckMediumCount;

        @com.aliyun.core.annotation.NameInMap("NotPassCount")
        private Integer notPassCount;

        @com.aliyun.core.annotation.NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @com.aliyun.core.annotation.NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @com.aliyun.core.annotation.NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("PassHighCount")
        private Integer passHighCount;

        @com.aliyun.core.annotation.NameInMap("PassLowCount")
        private Integer passLowCount;

        @com.aliyun.core.annotation.NameInMap("PassMediumCount")
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
             * <p>The number of unchecked check items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notCheckCount(Integer notCheckCount) {
                this.notCheckCount = notCheckCount;
                return this;
            }

            /**
             * <p>The number of unchecked high-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckHighCount(Integer notCheckHighCount) {
                this.notCheckHighCount = notCheckHighCount;
                return this;
            }

            /**
             * <p>The number of unchecked low-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckLowCount(Integer notCheckLowCount) {
                this.notCheckLowCount = notCheckLowCount;
                return this;
            }

            /**
             * <p>The number of unchecked medium-risk check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notCheckMediumCount(Integer notCheckMediumCount) {
                this.notCheckMediumCount = notCheckMediumCount;
                return this;
            }

            /**
             * <p>The number of check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * <p>The number of high-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            /**
             * <p>The number of check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The number of high-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passHighCount(Integer passHighCount) {
                this.passHighCount = passHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passLowCount(Integer passLowCount) {
                this.passLowCount = passLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSummaryResponseBody</p>
     */
    public static class Summarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Long passCount;

        @com.aliyun.core.annotation.NameInMap("Standards")
        private java.util.List<Standards> standards;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeStatistic")
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
        public java.util.List<Standards> getStandards() {
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
            private java.util.List<Standards> standards; 
            private String type; 
            private TypeStatistic typeStatistic; 

            /**
             * <p>The number of detected risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The number of check items that pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder passCount(Long passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The information about the check items.</p>
             */
            public Builder standards(java.util.List<Standards> standards) {
                this.standards = standards;
                return this;
            }

            /**
             * <p>The type of the check item. Valid values:</p>
             * <ul>
             * <li><strong>COMPLIANCE</strong></li>
             * <li><strong>RISK</strong></li>
             * <li><strong>IDENTITY_PERMISSION</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IDENTITY_PERMISSION</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The risk statistics by type.</p>
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
