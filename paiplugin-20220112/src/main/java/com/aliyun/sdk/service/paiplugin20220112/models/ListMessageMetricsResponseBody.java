// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageMetricsResponseBody</p>
 */
public class ListMessageMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private ListMessageMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMessageMetricsResponseBody build() {
            return new ListMessageMetricsResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Fail")
        private Integer fail;

        @NameInMap("Pending")
        private Integer pending;

        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Success")
        private Integer success;

        @NameInMap("Total")
        private Integer total;

        private Metrics(Builder builder) {
            this.date = builder.date;
            this.fail = builder.fail;
            this.pending = builder.pending;
            this.rate = builder.rate;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return fail
         */
        public Integer getFail() {
            return this.fail;
        }

        /**
         * @return pending
         */
        public Integer getPending() {
            return this.pending;
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return success
         */
        public Integer getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String date; 
            private Integer fail; 
            private Integer pending; 
            private Float rate; 
            private Integer success; 
            private Integer total; 

            /**
             * 发送日期。
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * 发送失败。
             */
            public Builder fail(Integer fail) {
                this.fail = fail;
                return this;
            }

            /**
             * 发送中。
             */
            public Builder pending(Integer pending) {
                this.pending = pending;
                return this;
            }

            /**
             * 发送成功率。
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * 发送成功。
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            /**
             * 总计短信数量。
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Metrics")
        private java.util.List < Metrics> metrics;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.metrics = builder.metrics;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public java.util.List < Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Metrics> metrics; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * 分页返回的统计数据条目列表。
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * 分页数，从1开始，默认为1。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 分页大小，默认为10。
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 总统计数据条目数量。
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
