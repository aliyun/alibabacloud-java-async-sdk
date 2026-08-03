// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link QueryCalendarAvailabilityResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCalendarAvailabilityResponseBody</p>
 */
public class QueryCalendarAvailabilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private QueryCalendarAvailabilityResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCalendarAvailabilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private String tracerId; 

        private Builder() {
        } 

        private Builder(QueryCalendarAvailabilityResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tracerId = model.tracerId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }

        public QueryCalendarAvailabilityResponseBody build() {
            return new QueryCalendarAvailabilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCalendarAvailabilityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCalendarAvailabilityResponseBody</p>
     */
    public static class FailedHotels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("StandardHotelId")
        private String standardHotelId;

        private FailedHotels(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.standardHotelId = builder.standardHotelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedHotels create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return standardHotelId
         */
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String standardHotelId; 

            private Builder() {
            } 

            private Builder(FailedHotels model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.standardHotelId = model.standardHotelId;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * StandardHotelId.
             */
            public Builder standardHotelId(String standardHotelId) {
                this.standardHotelId = standardHotelId;
                return this;
            }

            public FailedHotels build() {
                return new FailedHotels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCalendarAvailabilityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCalendarAvailabilityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedHotels")
        private java.util.List<FailedHotels> failedHotels;

        @com.aliyun.core.annotation.NameInMap("Hotels")
        private java.util.Map<String, java.util.List<DataHotelsValue>> hotels;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Data(Builder builder) {
            this.failedHotels = builder.failedHotels;
            this.hotels = builder.hotels;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedHotels
         */
        public java.util.List<FailedHotels> getFailedHotels() {
            return this.failedHotels;
        }

        /**
         * @return hotels
         */
        public java.util.Map<String, java.util.List<DataHotelsValue>> getHotels() {
            return this.hotels;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private java.util.List<FailedHotels> failedHotels; 
            private java.util.Map<String, java.util.List<DataHotelsValue>> hotels; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedHotels = model.failedHotels;
                this.hotels = model.hotels;
                this.tracerId = model.tracerId;
            } 

            /**
             * FailedHotels.
             */
            public Builder failedHotels(java.util.List<FailedHotels> failedHotels) {
                this.failedHotels = failedHotels;
                return this;
            }

            /**
             * Hotels.
             */
            public Builder hotels(java.util.Map<String, java.util.List<DataHotelsValue>> hotels) {
                this.hotels = hotels;
                return this;
            }

            /**
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
