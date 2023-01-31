// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaseStrategyPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaseStrategyPeriodResponseBody</p>
 */
public class GetBaseStrategyPeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("OnlyWeekdays")
    private Boolean onlyWeekdays;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("WorkingTime")
    private java.util.List < WorkingTime> workingTime;

    private GetBaseStrategyPeriodResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.onlyWeekdays = builder.onlyWeekdays;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workingTime = builder.workingTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaseStrategyPeriodResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return onlyWeekdays
     */
    public Boolean getOnlyWeekdays() {
        return this.onlyWeekdays;
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

    /**
     * @return workingTime
     */
    public java.util.List < WorkingTime> getWorkingTime() {
        return this.workingTime;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Boolean onlyWeekdays; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < WorkingTime> workingTime; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * OnlyWeekdays.
         */
        public Builder onlyWeekdays(Boolean onlyWeekdays) {
            this.onlyWeekdays = onlyWeekdays;
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

        /**
         * WorkingTime.
         */
        public Builder workingTime(java.util.List < WorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }

        public GetBaseStrategyPeriodResponseBody build() {
            return new GetBaseStrategyPeriodResponseBody(this);
        } 

    } 

    public static class WorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("BeginTimeMillis")
        private Long beginTimeMillis;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EndTimeMillis")
        private Long endTimeMillis;

        private WorkingTime(Builder builder) {
            this.beginTime = builder.beginTime;
            this.beginTimeMillis = builder.beginTimeMillis;
            this.endTime = builder.endTime;
            this.endTimeMillis = builder.endTimeMillis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkingTime create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return beginTimeMillis
         */
        public Long getBeginTimeMillis() {
            return this.beginTimeMillis;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimeMillis
         */
        public Long getEndTimeMillis() {
            return this.endTimeMillis;
        }

        public static final class Builder {
            private String beginTime; 
            private Long beginTimeMillis; 
            private String endTime; 
            private Long endTimeMillis; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * BeginTimeMillis.
             */
            public Builder beginTimeMillis(Long beginTimeMillis) {
                this.beginTimeMillis = beginTimeMillis;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndTimeMillis.
             */
            public Builder endTimeMillis(Long endTimeMillis) {
                this.endTimeMillis = endTimeMillis;
                return this;
            }

            public WorkingTime build() {
                return new WorkingTime(this);
            } 

        } 

    }
}
