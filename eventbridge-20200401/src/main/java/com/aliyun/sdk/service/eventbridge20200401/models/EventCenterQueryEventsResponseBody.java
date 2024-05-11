// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link EventCenterQueryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>EventCenterQueryEventsResponseBody</p>
 */
public class EventCenterQueryEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EventCenterQueryEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventCenterQueryEventsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EventCenterQueryEventsResponseBody build() {
            return new EventCenterQueryEventsResponseBody(this);
        } 

    } 

    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowData")
        private java.util.Map < String, ? > rowData;

        private Table(Builder builder) {
            this.rowData = builder.rowData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return rowData
         */
        public java.util.Map < String, ? > getRowData() {
            return this.rowData;
        }

        public static final class Builder {
            private java.util.Map < String, ? > rowData; 

            /**
             * RowData.
             */
            public Builder rowData(java.util.Map < String, ? > rowData) {
                this.rowData = rowData;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    public static class TimeSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowData")
        private java.util.Map < String, ? > rowData;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private TimeSeries(Builder builder) {
            this.rowData = builder.rowData;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSeries create() {
            return builder().build();
        }

        /**
         * @return rowData
         */
        public java.util.Map < String, ? > getRowData() {
            return this.rowData;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private java.util.Map < String, ? > rowData; 
            private String time; 

            /**
             * RowData.
             */
            public Builder rowData(java.util.Map < String, ? > rowData) {
                this.rowData = rowData;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public TimeSeries build() {
                return new TimeSeries(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List < Table> table;

        @com.aliyun.core.annotation.NameInMap("TimeSeries")
        private java.util.List < TimeSeries> timeSeries;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.table = builder.table;
            this.timeSeries = builder.timeSeries;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return table
         */
        public java.util.List < Table> getTable() {
            return this.table;
        }

        /**
         * @return timeSeries
         */
        public java.util.List < TimeSeries> getTimeSeries() {
            return this.timeSeries;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List < Table> table; 
            private java.util.List < TimeSeries> timeSeries; 
            private Integer totalCount; 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            /**
             * TimeSeries.
             */
            public Builder timeSeries(java.util.List < TimeSeries> timeSeries) {
                this.timeSeries = timeSeries;
                return this;
            }

            /**
             * TotalCount.
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
