// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGateVerifyStatisticPublicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGateVerifyStatisticPublicResponseBody</p>
 */
public class QueryGateVerifyStatisticPublicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryGateVerifyStatisticPublicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyStatisticPublicResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the calls of Phone Number Verification Service, including the total calls, the successful calls, failed calls, unknown calls, and daily calls within the statistical date range.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGateVerifyStatisticPublicResponseBody build() {
            return new QueryGateVerifyStatisticPublicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGateVerifyStatisticPublicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGateVerifyStatisticPublicResponseBody</p>
     */
    public static class DayStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatisticDateStr")
        private String statisticDateStr;

        @com.aliyun.core.annotation.NameInMap("TotalFail")
        private Long totalFail;

        @com.aliyun.core.annotation.NameInMap("TotalSuccess")
        private Long totalSuccess;

        @com.aliyun.core.annotation.NameInMap("TotalUnknown")
        private Long totalUnknown;

        private DayStatistic(Builder builder) {
            this.statisticDateStr = builder.statisticDateStr;
            this.totalFail = builder.totalFail;
            this.totalSuccess = builder.totalSuccess;
            this.totalUnknown = builder.totalUnknown;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DayStatistic create() {
            return builder().build();
        }

        /**
         * @return statisticDateStr
         */
        public String getStatisticDateStr() {
            return this.statisticDateStr;
        }

        /**
         * @return totalFail
         */
        public Long getTotalFail() {
            return this.totalFail;
        }

        /**
         * @return totalSuccess
         */
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

        /**
         * @return totalUnknown
         */
        public Long getTotalUnknown() {
            return this.totalUnknown;
        }

        public static final class Builder {
            private String statisticDateStr; 
            private Long totalFail; 
            private Long totalSuccess; 
            private Long totalUnknown; 

            /**
             * <p>The date. This field is accurate to the day. The value of this field is in the YYYYMMDD format. Example: 20220103.</p>
             * 
             * <strong>example:</strong>
             * <p>20220103</p>
             */
            public Builder statisticDateStr(String statisticDateStr) {
                this.statisticDateStr = statisticDateStr;
                return this;
            }

            /**
             * <p>The failed calls on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalFail(Long totalFail) {
                this.totalFail = totalFail;
                return this;
            }

            /**
             * <p>The successful calls on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalSuccess(Long totalSuccess) {
                this.totalSuccess = totalSuccess;
                return this;
            }

            /**
             * <p>The unknown calls on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalUnknown(Long totalUnknown) {
                this.totalUnknown = totalUnknown;
                return this;
            }

            public DayStatistic build() {
                return new DayStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryGateVerifyStatisticPublicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGateVerifyStatisticPublicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DayStatistic")
        private java.util.List < DayStatistic> dayStatistic;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("TotalFail")
        private Long totalFail;

        @com.aliyun.core.annotation.NameInMap("TotalSuccess")
        private Long totalSuccess;

        @com.aliyun.core.annotation.NameInMap("TotalUnknown")
        private Long totalUnknown;

        private Data(Builder builder) {
            this.dayStatistic = builder.dayStatistic;
            this.total = builder.total;
            this.totalFail = builder.totalFail;
            this.totalSuccess = builder.totalSuccess;
            this.totalUnknown = builder.totalUnknown;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dayStatistic
         */
        public java.util.List < DayStatistic> getDayStatistic() {
            return this.dayStatistic;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return totalFail
         */
        public Long getTotalFail() {
            return this.totalFail;
        }

        /**
         * @return totalSuccess
         */
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

        /**
         * @return totalUnknown
         */
        public Long getTotalUnknown() {
            return this.totalUnknown;
        }

        public static final class Builder {
            private java.util.List < DayStatistic> dayStatistic; 
            private Long total; 
            private Long totalFail; 
            private Long totalSuccess; 
            private Long totalUnknown; 

            /**
             * <p>The information about the daily calls.</p>
             */
            public Builder dayStatistic(java.util.List < DayStatistic> dayStatistic) {
                this.dayStatistic = dayStatistic;
                return this;
            }

            /**
             * <p>The total calls.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The failed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalFail(Long totalFail) {
                this.totalFail = totalFail;
                return this;
            }

            /**
             * <p>The successful calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalSuccess(Long totalSuccess) {
                this.totalSuccess = totalSuccess;
                return this;
            }

            /**
             * <p>The unknown calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalUnknown(Long totalUnknown) {
                this.totalUnknown = totalUnknown;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
