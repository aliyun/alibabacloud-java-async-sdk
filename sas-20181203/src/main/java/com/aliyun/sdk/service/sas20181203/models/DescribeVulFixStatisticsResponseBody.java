// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>An array that consists of the statistics of vulnerability fixes by vulnerability type.</p>
         */
        public Builder fixStat(java.util.List < FixStat> fixStat) {
            this.fixStat = fixStat;
            return this;
        }

        /**
         * <p>The total statistics of vulnerability fixes.</p>
         */
        public Builder fixTotal(FixTotal fixTotal) {
            this.fixTotal = fixTotal;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulFixStatisticsResponseBody build() {
            return new DescribeVulFixStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulFixStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulFixStatisticsResponseBody</p>
     */
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
             * <p>The number of vulnerabilities that are fixed on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fixedTodayNum(Integer fixedTodayNum) {
                this.fixedTodayNum = fixedTodayNum;
                return this;
            }

            /**
             * <p>The total number of fixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder fixedTotalNum(Integer fixedTotalNum) {
                this.fixedTotalNum = fixedTotalNum;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that are being fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder fixingNum(Integer fixingNum) {
                this.fixingNum = fixingNum;
                return this;
            }

            /**
             * <p>The number of unfixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder needFixNum(Integer needFixNum) {
                this.needFixNum = needFixNum;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability</li>
             * <li><strong>sys</strong>: Windows system vulnerability</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability</li>
             * <li><strong>app</strong>: application vulnerability</li>
             * <li><strong>emg</strong>: urgent vulnerability</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
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
    /**
     * 
     * {@link DescribeVulFixStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulFixStatisticsResponseBody</p>
     */
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
             * <p>The number of vulnerabilities that are fixed on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder fixedTodayNum(Integer fixedTodayNum) {
                this.fixedTodayNum = fixedTodayNum;
                return this;
            }

            /**
             * <p>The total number of fixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder fixedTotalNum(Integer fixedTotalNum) {
                this.fixedTotalNum = fixedTotalNum;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that are being fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder fixingNum(Integer fixingNum) {
                this.fixingNum = fixingNum;
                return this;
            }

            /**
             * <p>The number of unfixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>62</p>
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
