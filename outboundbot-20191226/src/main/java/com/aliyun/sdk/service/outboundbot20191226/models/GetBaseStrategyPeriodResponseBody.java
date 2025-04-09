// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetBaseStrategyPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaseStrategyPeriodResponseBody</p>
 */
public class GetBaseStrategyPeriodResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OnlyWeekdays")
    private Boolean onlyWeekdays;

    @com.aliyun.core.annotation.NameInMap("OnlyWorkdays")
    private Boolean onlyWorkdays;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WorkingTime")
    private java.util.List<WorkingTime> workingTime;

    private GetBaseStrategyPeriodResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.onlyWeekdays = builder.onlyWeekdays;
        this.onlyWorkdays = builder.onlyWorkdays;
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
     * @return onlyWorkdays
     */
    public Boolean getOnlyWorkdays() {
        return this.onlyWorkdays;
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
    public java.util.List<WorkingTime> getWorkingTime() {
        return this.workingTime;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Boolean onlyWeekdays; 
        private Boolean onlyWorkdays; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<WorkingTime> workingTime; 

        private Builder() {
        } 

        private Builder(GetBaseStrategyPeriodResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.onlyWeekdays = model.onlyWeekdays;
            this.onlyWorkdays = model.onlyWorkdays;
            this.requestId = model.requestId;
            this.success = model.success;
            this.workingTime = model.workingTime;
        } 

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
         * OnlyWorkdays.
         */
        public Builder onlyWorkdays(Boolean onlyWorkdays) {
            this.onlyWorkdays = onlyWorkdays;
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
        public Builder workingTime(java.util.List<WorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }

        public GetBaseStrategyPeriodResponseBody build() {
            return new GetBaseStrategyPeriodResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBaseStrategyPeriodResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaseStrategyPeriodResponseBody</p>
     */
    public static class WorkingTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("BeginTimeMillis")
        private Long beginTimeMillis;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EndTimeMillis")
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

            private Builder() {
            } 

            private Builder(WorkingTime model) {
                this.beginTime = model.beginTime;
                this.beginTimeMillis = model.beginTimeMillis;
                this.endTime = model.endTime;
                this.endTimeMillis = model.endTimeMillis;
            } 

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
