// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListCalendarsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalendarsResponseBody</p>
 */
public class ListCalendarsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCalendarsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalendarsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCalendarsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li>The returned data.</li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error: content is null.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCalendarsResponseBody build() {
            return new ListCalendarsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCalendarsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalendarName")
        private String calendarName;

        @com.aliyun.core.annotation.NameInMap("Months")
        private String months;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private Records(Builder builder) {
            this.calendarName = builder.calendarName;
            this.months = builder.months;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return calendarName
         */
        public String getCalendarName() {
            return this.calendarName;
        }

        /**
         * @return months
         */
        public String getMonths() {
            return this.months;
        }

        /**
         * @return year
         */
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private String calendarName; 
            private String months; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.calendarName = model.calendarName;
                this.months = model.months;
                this.year = model.year;
            } 

            /**
             * <p>The name of the calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>workday</p>
             */
            public Builder calendarName(String calendarName) {
                this.calendarName = calendarName;
                return this;
            }

            /**
             * <p>A JSON string that represents an array of months and their corresponding days.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {&quot;month&quot;:1,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
             *   {&quot;month&quot;:2,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28]},
             *   {&quot;month&quot;:3,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
             *   {&quot;month&quot;:4,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30]},
             *   {&quot;month&quot;:5,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,22,23,26,27,28,29,30]},
             *   {&quot;month&quot;:6,&quot;days&quot;:[2,3,4,5,6,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30]},
             *   {&quot;month&quot;:7,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
             *   {&quot;month&quot;:8,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]},
             *   {&quot;month&quot;:9,&quot;days&quot;:[1,2,3,4,5,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30]},
             *   {&quot;month&quot;:10,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
             *   {&quot;month&quot;:11,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28]},
             *   {&quot;month&quot;:12,&quot;days&quot;:[1,2,3,4,5,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]}
             * ]</p>
             */
            public Builder months(String months) {
                this.months = months;
                return this;
            }

            /**
             * <p>The year.</p>
             * 
             * <strong>example:</strong>
             * <p>2025</p>
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCalendarsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.records = builder.records;
            this.total = builder.total;
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
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<Records> records; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.records = model.records;
                this.total = model.total;
            } 

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next page of results. If this parameter is not returned, all results have been retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>A list of calendars.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
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
