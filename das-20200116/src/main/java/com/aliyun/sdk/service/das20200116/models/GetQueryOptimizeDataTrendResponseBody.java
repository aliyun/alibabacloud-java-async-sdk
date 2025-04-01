// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetQueryOptimizeDataTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeDataTrendResponseBody</p>
 */
public class GetQueryOptimizeDataTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetQueryOptimizeDataTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetQueryOptimizeDataTrendResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetQueryOptimizeDataTrendResponseBody build() {
            return new GetQueryOptimizeDataTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQueryOptimizeDataTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeDataTrendResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Kpi")
        private String kpi;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private List(Builder builder) {
            this.kpi = builder.kpi;
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return kpi
         */
        public String getKpi() {
            return this.kpi;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String kpi; 
            private Long timestamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(List model) {
                this.kpi = model.kpi;
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>The name of the metric. Valid values:</p>
             * <ul>
             * <li><strong>sqlExecuteCount</strong>: the number of executions of slow SQL queries.</li>
             * <li><strong>sqlExecuteCountDiff</strong>: the difference in the number of executions of slow SQL queries compared to the previous day.</li>
             * <li><strong>sqlCount</strong>: the number of slow SQL templates.</li>
             * <li><strong>sqlCountDiff</strong>: the difference in the number of slow SQL templates compared to the previous day.</li>
             * <li><strong>optimizedSqlExecuteCount</strong>: the number of optimizable executions of slow SQL queries.</li>
             * <li><strong>optimizedSqlExecuteCountDiff</strong>: the difference in the number of optimizable executions of slow SQL queries compared to the previous day.</li>
             * <li><strong>optimizedSqlCount</strong>: the number of optimizable slow SQL templates.</li>
             * <li><strong>optimizedSqlCountDiff</strong>: the difference in the number of optimizable slow SQL templates compared to the previous day.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sqlExecuteCount</p>
             */
            public Builder kpi(String kpi) {
                this.kpi = kpi;
                return this;
            }

            /**
             * <p>The data timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1643040000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueryOptimizeDataTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeDataTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String extra; 
            private java.util.List<List> list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.extra = model.extra;
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The details of the trend data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
