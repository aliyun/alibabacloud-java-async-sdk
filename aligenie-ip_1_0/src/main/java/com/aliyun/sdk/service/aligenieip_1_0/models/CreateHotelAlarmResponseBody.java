// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link CreateHotelAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHotelAlarmResponseBody</p>
 */
public class CreateHotelAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extentions")
    private java.util.Map<String, ?> extentions;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private CreateHotelAlarmResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotelAlarmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extentions
     */
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map<String, ?> extentions; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(CreateHotelAlarmResponseBody model) {
            this.extentions = model.extentions;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map<String, ?> extentions) {
            this.extentions = extentions;
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
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public CreateHotelAlarmResponseBody build() {
            return new CreateHotelAlarmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateHotelAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHotelAlarmResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("FailMsg")
        private String failMsg;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        private String userOpenId;

        private Result(Builder builder) {
            this.alarmId = builder.alarmId;
            this.deviceOpenId = builder.deviceOpenId;
            this.failMsg = builder.failMsg;
            this.roomNo = builder.roomNo;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return failMsg
         */
        public String getFailMsg() {
            return this.failMsg;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public static final class Builder {
            private Long alarmId; 
            private String deviceOpenId; 
            private String failMsg; 
            private String roomNo; 
            private String userOpenId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.alarmId = model.alarmId;
                this.deviceOpenId = model.deviceOpenId;
                this.failMsg = model.failMsg;
                this.roomNo = model.roomNo;
                this.userOpenId = model.userOpenId;
            } 

            /**
             * AlarmId.
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * DeviceOpenId.
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * FailMsg.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * UserOpenId.
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
