// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecStatisticsResponseBody</p>
 */
public class DescribeApisecStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The check results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>221F0F14-54C6-59A1-9967-72***81B61A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecStatisticsResponseBody build() {
            return new DescribeApisecStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actioned")
        private Long actioned;

        @com.aliyun.core.annotation.NameInMap("Api")
        private Long api;

        @com.aliyun.core.annotation.NameInMap("Confirmed")
        private Long confirmed;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private Long domain;

        @com.aliyun.core.annotation.NameInMap("Fixed")
        private Long fixed;

        @com.aliyun.core.annotation.NameInMap("High")
        private Long high;

        @com.aliyun.core.annotation.NameInMap("Ignore")
        private Long ignore;

        @com.aliyun.core.annotation.NameInMap("Low")
        private Long low;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private Long medium;

        @com.aliyun.core.annotation.NameInMap("ToBeConfirmed")
        private Long toBeConfirmed;

        @com.aliyun.core.annotation.NameInMap("ToBeFixed")
        private Long toBeFixed;

        @com.aliyun.core.annotation.NameInMap("TodayHigh")
        private String todayHigh;

        @com.aliyun.core.annotation.NameInMap("TodayLow")
        private Long todayLow;

        @com.aliyun.core.annotation.NameInMap("TodayMedium")
        private String todayMedium;

        @com.aliyun.core.annotation.NameInMap("TodayTotal")
        private String todayTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.actioned = builder.actioned;
            this.api = builder.api;
            this.confirmed = builder.confirmed;
            this.domain = builder.domain;
            this.fixed = builder.fixed;
            this.high = builder.high;
            this.ignore = builder.ignore;
            this.low = builder.low;
            this.medium = builder.medium;
            this.toBeConfirmed = builder.toBeConfirmed;
            this.toBeFixed = builder.toBeFixed;
            this.todayHigh = builder.todayHigh;
            this.todayLow = builder.todayLow;
            this.todayMedium = builder.todayMedium;
            this.todayTotal = builder.todayTotal;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actioned
         */
        public Long getActioned() {
            return this.actioned;
        }

        /**
         * @return api
         */
        public Long getApi() {
            return this.api;
        }

        /**
         * @return confirmed
         */
        public Long getConfirmed() {
            return this.confirmed;
        }

        /**
         * @return domain
         */
        public Long getDomain() {
            return this.domain;
        }

        /**
         * @return fixed
         */
        public Long getFixed() {
            return this.fixed;
        }

        /**
         * @return high
         */
        public Long getHigh() {
            return this.high;
        }

        /**
         * @return ignore
         */
        public Long getIgnore() {
            return this.ignore;
        }

        /**
         * @return low
         */
        public Long getLow() {
            return this.low;
        }

        /**
         * @return medium
         */
        public Long getMedium() {
            return this.medium;
        }

        /**
         * @return toBeConfirmed
         */
        public Long getToBeConfirmed() {
            return this.toBeConfirmed;
        }

        /**
         * @return toBeFixed
         */
        public Long getToBeFixed() {
            return this.toBeFixed;
        }

        /**
         * @return todayHigh
         */
        public String getTodayHigh() {
            return this.todayHigh;
        }

        /**
         * @return todayLow
         */
        public Long getTodayLow() {
            return this.todayLow;
        }

        /**
         * @return todayMedium
         */
        public String getTodayMedium() {
            return this.todayMedium;
        }

        /**
         * @return todayTotal
         */
        public String getTodayTotal() {
            return this.todayTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long actioned; 
            private Long api; 
            private Long confirmed; 
            private Long domain; 
            private Long fixed; 
            private Long high; 
            private Long ignore; 
            private Long low; 
            private Long medium; 
            private Long toBeConfirmed; 
            private Long toBeFixed; 
            private String todayHigh; 
            private Long todayLow; 
            private String todayMedium; 
            private String todayTotal; 
            private Long total; 

            /**
             * <p>The number of handled events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder actioned(Long actioned) {
                this.actioned = actioned;
                return this;
            }

            /**
             * <p>The number of APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/v1/login</p>
             */
            public Builder api(Long api) {
                this.api = api;
                return this;
            }

            /**
             * <p>The number of confirmed events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder confirmed(Long confirmed) {
                this.confirmed = confirmed;
                return this;
            }

            /**
             * <p>The number of domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>a.aliyun.com</p>
             */
            public Builder domain(Long domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of fixed risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fixed(Long fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * <p>The number of high-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * <p>The number of ignored risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignore(Long ignore) {
                this.ignore = ignore;
                return this;
            }

            /**
             * <p>The number of low-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * <p>The number of moderate-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder medium(Long medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>The number of events to be confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder toBeConfirmed(Long toBeConfirmed) {
                this.toBeConfirmed = toBeConfirmed;
                return this;
            }

            /**
             * <p>The number of risks to be fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder toBeFixed(Long toBeFixed) {
                this.toBeFixed = toBeFixed;
                return this;
            }

            /**
             * <p>The number of new high-risk events today.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder todayHigh(String todayHigh) {
                this.todayHigh = todayHigh;
                return this;
            }

            /**
             * <p>The number of new low-risk events today.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder todayLow(Long todayLow) {
                this.todayLow = todayLow;
                return this;
            }

            /**
             * <p>The number of new moderate-risk events today.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder todayMedium(String todayMedium) {
                this.todayMedium = todayMedium;
                return this;
            }

            /**
             * <p>The total number of new events today.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder todayTotal(String todayTotal) {
                this.todayTotal = todayTotal;
                return this;
            }

            /**
             * <p>The total number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
