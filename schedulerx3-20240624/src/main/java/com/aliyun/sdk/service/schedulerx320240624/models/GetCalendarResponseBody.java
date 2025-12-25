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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2C3E52FF-CBE9-5C0E-8252-37ACFF1F5EFF</p>
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
             * CalendarName.
             */
            public Builder calendarName(String calendarName) {
                this.calendarName = calendarName;
                return this;
            }

            /**
             * Months.
             */
            public Builder months(String months) {
                this.months = months;
                return this;
            }

            /**
             * Year.
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
