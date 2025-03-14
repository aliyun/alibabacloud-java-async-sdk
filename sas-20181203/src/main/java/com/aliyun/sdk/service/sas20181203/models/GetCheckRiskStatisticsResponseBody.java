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
 * {@link GetCheckRiskStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckRiskStatisticsResponseBody</p>
 */
public class GetCheckRiskStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Summary summary;

    private GetCheckRiskStatisticsResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckRiskStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Summary summary; 

        private Builder() {
        } 

        private Builder(GetCheckRiskStatisticsResponseBody model) {
            this.count = model.count;
            this.data = model.data;
            this.requestId = model.requestId;
            this.summary = model.summary;
        } 

        /**
         * <p>The number of risk scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>An array consisting of the statistics on check items that are used in risk scenarios.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>2C455672-2490-5211-84EC-420C7818****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Historical check item statistics.</p>
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        public GetCheckRiskStatisticsResponseBody build() {
            return new GetCheckRiskStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckRiskStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckRiskStatisticsResponseBody</p>
     */
    public static class SubStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @com.aliyun.core.annotation.NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @com.aliyun.core.annotation.NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private SubStatistics(Builder builder) {
            this.alias = builder.alias;
            this.highWarningCount = builder.highWarningCount;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
            this.passCount = builder.passCount;
            this.totalCount = builder.totalCount;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubStatistics create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        /**
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String alias; 
            private Integer highWarningCount; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 
            private Integer passCount; 
            private Integer totalCount; 
            private String typeName; 

            private Builder() {
            } 

            private Builder(SubStatistics model) {
                this.alias = model.alias;
                this.highWarningCount = model.highWarningCount;
                this.lowWarningCount = model.lowWarningCount;
                this.mediumWarningCount = model.mediumWarningCount;
                this.passCount = model.passCount;
                this.totalCount = model.totalCount;
                this.typeName = model.typeName;
            } 

            /**
             * <p>The name of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>weak_password</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The number of high-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * <p>The number of low-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * <p>The number of medium-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * <p>The number of passed check items.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The total number of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>weak_password</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public SubStatistics build() {
                return new SubStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckRiskStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckRiskStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @com.aliyun.core.annotation.NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @com.aliyun.core.annotation.NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @com.aliyun.core.annotation.NameInMap("PassCount")
        private Integer passCount;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("SubStatistics")
        private java.util.List<SubStatistics> subStatistics;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.highWarningCount = builder.highWarningCount;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
            this.passCount = builder.passCount;
            this.sceneName = builder.sceneName;
            this.subStatistics = builder.subStatistics;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        /**
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return subStatistics
         */
        public java.util.List<SubStatistics> getSubStatistics() {
            return this.subStatistics;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer highWarningCount; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 
            private Integer passCount; 
            private String sceneName; 
            private java.util.List<SubStatistics> subStatistics; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.highWarningCount = model.highWarningCount;
                this.lowWarningCount = model.lowWarningCount;
                this.mediumWarningCount = model.mediumWarningCount;
                this.passCount = model.passCount;
                this.sceneName = model.sceneName;
                this.subStatistics = model.subStatistics;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of high-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * <p>The number of low-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * <p>The number of medium-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * <p>The number of passed check items.</p>
             * 
             * <strong>example:</strong>
             * <p>143</p>
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * <p>The name of the risk scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>SECURITY</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The statistics on check items that are used in the risk scenario by baseline type.</p>
             */
            public Builder subStatistics(java.util.List<SubStatistics> subStatistics) {
                this.subStatistics = subStatistics;
                return this;
            }

            /**
             * <p>The total number of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>219</p>
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
    /**
     * 
     * {@link GetCheckRiskStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckRiskStatisticsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HandledCheckToday")
        private Integer handledCheckToday;

        @com.aliyun.core.annotation.NameInMap("HandledCheckTotal")
        private Integer handledCheckTotal;

        @com.aliyun.core.annotation.NameInMap("HandledDays")
        private Integer handledDays;

        @com.aliyun.core.annotation.NameInMap("RiskCheckCnt")
        private Integer riskCheckCnt;

        @com.aliyun.core.annotation.NameInMap("RiskDays")
        private Integer riskDays;

        @com.aliyun.core.annotation.NameInMap("RiskWarningCnt")
        private Integer riskWarningCnt;

        private Summary(Builder builder) {
            this.handledCheckToday = builder.handledCheckToday;
            this.handledCheckTotal = builder.handledCheckTotal;
            this.handledDays = builder.handledDays;
            this.riskCheckCnt = builder.riskCheckCnt;
            this.riskDays = builder.riskDays;
            this.riskWarningCnt = builder.riskWarningCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return handledCheckToday
         */
        public Integer getHandledCheckToday() {
            return this.handledCheckToday;
        }

        /**
         * @return handledCheckTotal
         */
        public Integer getHandledCheckTotal() {
            return this.handledCheckTotal;
        }

        /**
         * @return handledDays
         */
        public Integer getHandledDays() {
            return this.handledDays;
        }

        /**
         * @return riskCheckCnt
         */
        public Integer getRiskCheckCnt() {
            return this.riskCheckCnt;
        }

        /**
         * @return riskDays
         */
        public Integer getRiskDays() {
            return this.riskDays;
        }

        /**
         * @return riskWarningCnt
         */
        public Integer getRiskWarningCnt() {
            return this.riskWarningCnt;
        }

        public static final class Builder {
            private Integer handledCheckToday; 
            private Integer handledCheckTotal; 
            private Integer handledDays; 
            private Integer riskCheckCnt; 
            private Integer riskDays; 
            private Integer riskWarningCnt; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.handledCheckToday = model.handledCheckToday;
                this.handledCheckTotal = model.handledCheckTotal;
                this.handledDays = model.handledDays;
                this.riskCheckCnt = model.riskCheckCnt;
                this.riskDays = model.riskDays;
                this.riskWarningCnt = model.riskWarningCnt;
            } 

            /**
             * <p>Check items handled today.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder handledCheckToday(Integer handledCheckToday) {
                this.handledCheckToday = handledCheckToday;
                return this;
            }

            /**
             * <p>A risk item exists.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder handledCheckTotal(Integer handledCheckTotal) {
                this.handledCheckTotal = handledCheckTotal;
                return this;
            }

            /**
             * <p>Total days since check items were handled.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder handledDays(Integer handledDays) {
                this.handledDays = handledDays;
                return this;
            }

            /**
             * <p>Check items that failed to pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskCheckCnt(Integer riskCheckCnt) {
                this.riskCheckCnt = riskCheckCnt;
                return this;
            }

            /**
             * <p>Days since check items failed.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder riskDays(Integer riskDays) {
                this.riskDays = riskDays;
                return this;
            }

            /**
             * <p>Risks to be handled.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder riskWarningCnt(Integer riskWarningCnt) {
                this.riskWarningCnt = riskWarningCnt;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
}
