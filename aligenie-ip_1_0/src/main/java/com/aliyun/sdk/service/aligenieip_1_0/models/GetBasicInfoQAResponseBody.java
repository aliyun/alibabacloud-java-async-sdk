// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicInfoQAResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicInfoQAResponseBody</p>
 */
public class GetBasicInfoQAResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private GetBasicInfoQAResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicInfoQAResponseBody create() {
        return builder().build();
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

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
        public Builder result(Result result) {
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

        public GetBasicInfoQAResponseBody build() {
            return new GetBasicInfoQAResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CheckInTime")
        private String checkInTime;

        @NameInMap("CheckOutTime")
        private String checkOutTime;

        @NameInMap("HotelAddress")
        private String hotelAddress;

        @NameInMap("HotelIntroduction")
        private String hotelIntroduction;

        @NameInMap("HotelMember")
        private String hotelMember;

        @NameInMap("HotelService")
        private String hotelService;

        @NameInMap("ParkingExpenses")
        private String parkingExpenses;

        @NameInMap("ParkingPosition")
        private String parkingPosition;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("WifiName")
        private String wifiName;

        @NameInMap("WifiPassword")
        private String wifiPassword;

        private Result(Builder builder) {
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.hotelAddress = builder.hotelAddress;
            this.hotelIntroduction = builder.hotelIntroduction;
            this.hotelMember = builder.hotelMember;
            this.hotelService = builder.hotelService;
            this.parkingExpenses = builder.parkingExpenses;
            this.parkingPosition = builder.parkingPosition;
            this.phoneNumber = builder.phoneNumber;
            this.wifiName = builder.wifiName;
            this.wifiPassword = builder.wifiPassword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return checkInTime
         */
        public String getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return hotelAddress
         */
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        /**
         * @return hotelIntroduction
         */
        public String getHotelIntroduction() {
            return this.hotelIntroduction;
        }

        /**
         * @return hotelMember
         */
        public String getHotelMember() {
            return this.hotelMember;
        }

        /**
         * @return hotelService
         */
        public String getHotelService() {
            return this.hotelService;
        }

        /**
         * @return parkingExpenses
         */
        public String getParkingExpenses() {
            return this.parkingExpenses;
        }

        /**
         * @return parkingPosition
         */
        public String getParkingPosition() {
            return this.parkingPosition;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return wifiName
         */
        public String getWifiName() {
            return this.wifiName;
        }

        /**
         * @return wifiPassword
         */
        public String getWifiPassword() {
            return this.wifiPassword;
        }

        public static final class Builder {
            private String checkInTime; 
            private String checkOutTime; 
            private String hotelAddress; 
            private String hotelIntroduction; 
            private String hotelMember; 
            private String hotelService; 
            private String parkingExpenses; 
            private String parkingPosition; 
            private String phoneNumber; 
            private String wifiName; 
            private String wifiPassword; 

            /**
             * CheckInTime.
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * CheckOutTime.
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * HotelAddress.
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * HotelIntroduction.
             */
            public Builder hotelIntroduction(String hotelIntroduction) {
                this.hotelIntroduction = hotelIntroduction;
                return this;
            }

            /**
             * HotelMember.
             */
            public Builder hotelMember(String hotelMember) {
                this.hotelMember = hotelMember;
                return this;
            }

            /**
             * HotelService.
             */
            public Builder hotelService(String hotelService) {
                this.hotelService = hotelService;
                return this;
            }

            /**
             * ParkingExpenses.
             */
            public Builder parkingExpenses(String parkingExpenses) {
                this.parkingExpenses = parkingExpenses;
                return this;
            }

            /**
             * ParkingPosition.
             */
            public Builder parkingPosition(String parkingPosition) {
                this.parkingPosition = parkingPosition;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * WifiName.
             */
            public Builder wifiName(String wifiName) {
                this.wifiName = wifiName;
                return this;
            }

            /**
             * WifiPassword.
             */
            public Builder wifiPassword(String wifiPassword) {
                this.wifiPassword = wifiPassword;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
