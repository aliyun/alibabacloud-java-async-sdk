// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCheckRiskStatisticsResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckRiskStatisticsResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Data> data; 
        private String requestId; 

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
        public Builder data(java.util.List < Data> data) {
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
        private java.util.List < SubStatistics> subStatistics;

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
        public java.util.List < SubStatistics> getSubStatistics() {
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
            private java.util.List < SubStatistics> subStatistics; 
            private Integer totalCount; 

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
            public Builder subStatistics(java.util.List < SubStatistics> subStatistics) {
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
}
