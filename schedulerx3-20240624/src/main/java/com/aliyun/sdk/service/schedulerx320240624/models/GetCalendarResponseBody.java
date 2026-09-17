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
 * {@link GetCalendarResponseBody} extends {@link TeaModel}
 *
 * <p>GetCalendarResponseBody</p>
 */
public class GetCalendarResponseBody extends TeaModel {
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

    private GetCalendarResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCalendarResponseBody create() {
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

        private Builder(GetCalendarResponseBody model) {
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
         * <li>The data returned.</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C3E52FF-CBE9-5C0E-8252-37ACFF1F5EFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
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

        public GetCalendarResponseBody build() {
            return new GetCalendarResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCalendarResponseBody} extends {@link TeaModel}
     *
     * <p>GetCalendarResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalendarName")
        private String calendarName;

        @com.aliyun.core.annotation.NameInMap("Months")
        private String months;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private Data(Builder builder) {
            this.calendarName = builder.calendarName;
            this.months = builder.months;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            private Builder(Data model) {
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
             * <p>A JSON string that represents an array of objects. Each object specifies the days for a particular month.</p>
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
             * <p>2030</p>
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
