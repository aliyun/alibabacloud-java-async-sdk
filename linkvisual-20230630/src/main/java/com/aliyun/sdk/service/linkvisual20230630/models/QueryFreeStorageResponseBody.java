// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFreeStorageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFreeStorageResponseBody</p>
 */
public class QueryFreeStorageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryFreeStorageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFreeStorageResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryFreeStorageResponseBody build() {
            return new QueryFreeStorageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Consumed")
        private Integer consumed;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EndTimeUTC")
        private String endTimeUTC;

        @NameInMap("Expired")
        private Integer expired;

        @NameInMap("Lifecycle")
        private Integer lifecycle;

        @NameInMap("Months")
        private Integer months;

        @NameInMap("RemainQuota")
        private Integer remainQuota;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StartTimeUTC")
        private String startTimeUTC;

        @NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.consumed = builder.consumed;
            this.endTime = builder.endTime;
            this.endTimeUTC = builder.endTimeUTC;
            this.expired = builder.expired;
            this.lifecycle = builder.lifecycle;
            this.months = builder.months;
            this.remainQuota = builder.remainQuota;
            this.startTime = builder.startTime;
            this.startTimeUTC = builder.startTimeUTC;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumed
         */
        public Integer getConsumed() {
            return this.consumed;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimeUTC
         */
        public String getEndTimeUTC() {
            return this.endTimeUTC;
        }

        /**
         * @return expired
         */
        public Integer getExpired() {
            return this.expired;
        }

        /**
         * @return lifecycle
         */
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return months
         */
        public Integer getMonths() {
            return this.months;
        }

        /**
         * @return remainQuota
         */
        public Integer getRemainQuota() {
            return this.remainQuota;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimeUTC
         */
        public String getStartTimeUTC() {
            return this.startTimeUTC;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer consumed; 
            private String endTime; 
            private String endTimeUTC; 
            private Integer expired; 
            private Integer lifecycle; 
            private Integer months; 
            private Integer remainQuota; 
            private String startTime; 
            private String startTimeUTC; 
            private Integer type; 

            /**
             * Consumed.
             */
            public Builder consumed(Integer consumed) {
                this.consumed = consumed;
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
             * EndTimeUTC.
             */
            public Builder endTimeUTC(String endTimeUTC) {
                this.endTimeUTC = endTimeUTC;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Lifecycle.
             */
            public Builder lifecycle(Integer lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * Months.
             */
            public Builder months(Integer months) {
                this.months = months;
                return this;
            }

            /**
             * RemainQuota.
             */
            public Builder remainQuota(Integer remainQuota) {
                this.remainQuota = remainQuota;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartTimeUTC.
             */
            public Builder startTimeUTC(String startTimeUTC) {
                this.startTimeUTC = startTimeUTC;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
