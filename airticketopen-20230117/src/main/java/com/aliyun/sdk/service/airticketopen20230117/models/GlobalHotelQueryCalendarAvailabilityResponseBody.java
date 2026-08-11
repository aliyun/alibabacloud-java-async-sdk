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
 * {@link GlobalHotelQueryCalendarAvailabilityResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelQueryCalendarAvailabilityResponseBody</p>
 */
public class GlobalHotelQueryCalendarAvailabilityResponseBody extends TeaModel {
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

    private GlobalHotelQueryCalendarAvailabilityResponseBody(Builder builder) {
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

    public static GlobalHotelQueryCalendarAvailabilityResponseBody create() {
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

        private Builder(GlobalHotelQueryCalendarAvailabilityResponseBody model) {
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

        public GlobalHotelQueryCalendarAvailabilityResponseBody build() {
            return new GlobalHotelQueryCalendarAvailabilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelQueryCalendarAvailabilityResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryCalendarAvailabilityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hotels")
        private java.util.Map<String, java.util.List<DataHotelsValue>> hotels;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Data(Builder builder) {
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
            private java.util.Map<String, java.util.List<DataHotelsValue>> hotels; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hotels = model.hotels;
                this.tracerId = model.tracerId;
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
