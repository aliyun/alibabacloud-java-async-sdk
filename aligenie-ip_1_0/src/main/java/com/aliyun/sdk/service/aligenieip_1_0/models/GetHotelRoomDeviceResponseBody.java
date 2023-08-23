// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelRoomDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelRoomDeviceResponseBody</p>
 */
public class GetHotelRoomDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private GetHotelRoomDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelRoomDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public GetHotelRoomDeviceResponseBody build() {
            return new GetHotelRoomDeviceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("OnlineStatus")
        private Integer onlineStatus;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("Sn")
        private String sn;

        private Result(Builder builder) {
            this.firmwareVersion = builder.firmwareVersion;
            this.hotelId = builder.hotelId;
            this.mac = builder.mac;
            this.onlineStatus = builder.onlineStatus;
            this.roomNo = builder.roomNo;
            this.sn = builder.sn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return onlineStatus
         */
        public Integer getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private String firmwareVersion; 
            private String hotelId; 
            private String mac; 
            private Integer onlineStatus; 
            private String roomNo; 
            private String sn; 

            /**
             * FirmwareVersion.
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Integer onlineStatus) {
                this.onlineStatus = onlineStatus;
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
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
