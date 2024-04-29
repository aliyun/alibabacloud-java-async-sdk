// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulFixStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulFixStatisticsResponseBody</p>
 */
public class DescribeVulFixStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FixStat")
    private java.util.List < FixStat> fixStat;

    @com.aliyun.core.annotation.NameInMap("FixTotal")
    private FixTotal fixTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVulFixStatisticsResponseBody(Builder builder) {
        this.fixStat = builder.fixStat;
        this.fixTotal = builder.fixTotal;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulFixStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fixStat
     */
    public java.util.List < FixStat> getFixStat() {
        return this.fixStat;
    }

    /**
     * @return fixTotal
     */
    public FixTotal getFixTotal() {
        return this.fixTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FixStat> fixStat; 
        private FixTotal fixTotal; 
        private String requestId; 

        /**
         * An array that consists of the statistics of vulnerability fixes by vulnerability type.
         */
        public Builder fixStat(java.util.List < FixStat> fixStat) {
            this.fixStat = fixStat;
            return this;
        }

        /**
         * The total statistics of vulnerability fixes.
         */
        public Builder fixTotal(FixTotal fixTotal) {
            this.fixTotal = fixTotal;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulFixStatisticsResponseBody build() {
            return new DescribeVulFixStatisticsResponseBody(this);
        } 

    } 

    public static class FixStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedTodayNum")
        private Integer fixedTodayNum;

        @com.aliyun.core.annotation.NameInMap("FixedTotalNum")
        private Integer fixedTotalNum;

        @com.aliyun.core.annotation.NameInMap("FixingNum")
        private Integer fixingNum;

        @com.aliyun.core.annotation.NameInMap("NeedFixNum")
        private Integer needFixNum;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FixStat(Builder builder) {
            this.fixedTodayNum = builder.fixedTodayNum;
            this.fixedTotalNum = builder.fixedTotalNum;
            this.fixingNum = builder.fixingNum;
            this.needFixNum = builder.needFixNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixStat create() {
            return builder().build();
        }

        /**
         * @return fixedTodayNum
         */
        public Integer getFixedTodayNum() {
            return this.fixedTodayNum;
        }

        /**
         * @return fixedTotalNum
         */
        public Integer getFixedTotalNum() {
            return this.fixedTotalNum;
        }

        /**
         * @return fixingNum
         */
        public Integer getFixingNum() {
            return this.fixingNum;
        }

        /**
         * @return needFixNum
         */
        public Integer getNeedFixNum() {
            return this.needFixNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer fixedTodayNum; 
            private Integer fixedTotalNum; 
            private Integer fixingNum; 
            private Integer needFixNum; 
            private String type; 

            /**
             * The number of vulnerabilities that are fixed on the current day.
             */
            public Builder fixedTodayNum(Integer fixedTodayNum) {
                this.fixedTodayNum = fixedTodayNum;
                return this;
            }

            /**
             * The total number of fixed vulnerabilities.
             */
            public Builder fixedTotalNum(Integer fixedTotalNum) {
                this.fixedTotalNum = fixedTotalNum;
                return this;
            }

            /**
             * The number of vulnerabilities that are being fixed.
             */
            public Builder fixingNum(Integer fixingNum) {
                this.fixingNum = fixingNum;
                return this;
            }

            /**
             * The number of unfixed vulnerabilities.
             */
            public Builder needFixNum(Integer needFixNum) {
                this.needFixNum = needFixNum;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: Linux software vulnerability
             * *   **sys**: Windows system vulnerability
             * *   **cms**: Web-CMS vulnerability
             * *   **app**: application vulnerability
             * *   **emg**: urgent vulnerability
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FixStat build() {
                return new FixStat(this);
            } 

        } 

    }
    public static class FixTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedTodayNum")
        private Integer fixedTodayNum;

        @com.aliyun.core.annotation.NameInMap("FixedTotalNum")
        private Integer fixedTotalNum;

        @com.aliyun.core.annotation.NameInMap("FixingNum")
        private Integer fixingNum;

        @com.aliyun.core.annotation.NameInMap("NeedFixNum")
        private Integer needFixNum;

        private FixTotal(Builder builder) {
            this.fixedTodayNum = builder.fixedTodayNum;
            this.fixedTotalNum = builder.fixedTotalNum;
            this.fixingNum = builder.fixingNum;
            this.needFixNum = builder.needFixNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixTotal create() {
            return builder().build();
        }

        /**
         * @return fixedTodayNum
         */
        public Integer getFixedTodayNum() {
            return this.fixedTodayNum;
        }

        /**
         * @return fixedTotalNum
         */
        public Integer getFixedTotalNum() {
            return this.fixedTotalNum;
        }

        /**
         * @return fixingNum
         */
        public Integer getFixingNum() {
            return this.fixingNum;
        }

        /**
         * @return needFixNum
         */
        public Integer getNeedFixNum() {
            return this.needFixNum;
        }

        public static final class Builder {
            private Integer fixedTodayNum; 
            private Integer fixedTotalNum; 
            private Integer fixingNum; 
            private Integer needFixNum; 

            /**
             * The number of vulnerabilities that are fixed on the current day.
             */
            public Builder fixedTodayNum(Integer fixedTodayNum) {
                this.fixedTodayNum = fixedTodayNum;
                return this;
            }

            /**
             * The total number of fixed vulnerabilities.
             */
            public Builder fixedTotalNum(Integer fixedTotalNum) {
                this.fixedTotalNum = fixedTotalNum;
                return this;
            }

            /**
             * The number of vulnerabilities that are being fixed.
             */
            public Builder fixingNum(Integer fixingNum) {
                this.fixingNum = fixingNum;
                return this;
            }

            /**
             * The number of unfixed vulnerabilities.
             */
            public Builder needFixNum(Integer needFixNum) {
                this.needFixNum = needFixNum;
                return this;
            }

            public FixTotal build() {
                return new FixTotal(this);
            } 

        } 

    }
}
