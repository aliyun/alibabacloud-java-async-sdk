// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulFixStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulFixStatisticsResponseBody</p>
 */
public class DescribeVulFixStatisticsResponseBody extends TeaModel {
    @NameInMap("FixStat")
    private java.util.List < FixStat> fixStat;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVulFixStatisticsResponseBody(Builder builder) {
        this.fixStat = builder.fixStat;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FixStat> fixStat; 
        private String requestId; 

        /**
         * FixStat.
         */
        public Builder fixStat(java.util.List < FixStat> fixStat) {
            this.fixStat = fixStat;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("FixedTodayNum")
        private Integer fixedTodayNum;

        @NameInMap("FixedTotalNum")
        private Integer fixedTotalNum;

        @NameInMap("FixingNum")
        private Integer fixingNum;

        @NameInMap("NeedFixNum")
        private Integer needFixNum;

        @NameInMap("Type")
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
             * FixedTodayNum.
             */
            public Builder fixedTodayNum(Integer fixedTodayNum) {
                this.fixedTodayNum = fixedTodayNum;
                return this;
            }

            /**
             * FixedTotalNum.
             */
            public Builder fixedTotalNum(Integer fixedTotalNum) {
                this.fixedTotalNum = fixedTotalNum;
                return this;
            }

            /**
             * FixingNum.
             */
            public Builder fixingNum(Integer fixingNum) {
                this.fixingNum = fixingNum;
                return this;
            }

            /**
             * NeedFixNum.
             */
            public Builder needFixNum(Integer needFixNum) {
                this.needFixNum = needFixNum;
                return this;
            }

            /**
             * Type.
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
}
