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
 * {@link UpdateBasicInfoQARequest} extends {@link RequestModel}
 *
 * <p>UpdateBasicInfoQARequest</p>
 */
public class UpdateBasicInfoQARequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckInTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkInTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckOutTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkOutTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelIntroduction")
    private String hotelIntroduction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelMember")
    private String hotelMember;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelService")
    private String hotelService;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParkingExpenses")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parkingExpenses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParkingPosition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parkingPosition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WifiName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wifiName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WifiPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wifiPassword;

    private UpdateBasicInfoQARequest(Builder builder) {
        super(builder);
        this.checkInTime = builder.checkInTime;
        this.checkOutTime = builder.checkOutTime;
        this.hotelAddress = builder.hotelAddress;
        this.hotelId = builder.hotelId;
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

    public static UpdateBasicInfoQARequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
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

    public static final class Builder extends Request.Builder<UpdateBasicInfoQARequest, Builder> {
        private String checkInTime; 
        private String checkOutTime; 
        private String hotelAddress; 
        private String hotelId; 
        private String hotelIntroduction; 
        private String hotelMember; 
        private String hotelService; 
        private String parkingExpenses; 
        private String parkingPosition; 
        private String phoneNumber; 
        private String wifiName; 
        private String wifiPassword; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBasicInfoQARequest request) {
            super(request);
            this.checkInTime = request.checkInTime;
            this.checkOutTime = request.checkOutTime;
            this.hotelAddress = request.hotelAddress;
            this.hotelId = request.hotelId;
            this.hotelIntroduction = request.hotelIntroduction;
            this.hotelMember = request.hotelMember;
            this.hotelService = request.hotelService;
            this.parkingExpenses = request.parkingExpenses;
            this.parkingPosition = request.parkingPosition;
            this.phoneNumber = request.phoneNumber;
            this.wifiName = request.wifiName;
            this.wifiPassword = request.wifiPassword;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11:11</p>
         */
        public Builder checkInTime(String checkInTime) {
            this.putBodyParameter("CheckInTime", checkInTime);
            this.checkInTime = checkInTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11:11</p>
         */
        public Builder checkOutTime(String checkOutTime) {
            this.putBodyParameter("CheckOutTime", checkOutTime);
            this.checkOutTime = checkOutTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hotelAddress(String hotelAddress) {
            this.putBodyParameter("HotelAddress", hotelAddress);
            this.hotelAddress = hotelAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af7***536</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * HotelIntroduction.
         */
        public Builder hotelIntroduction(String hotelIntroduction) {
            this.putBodyParameter("HotelIntroduction", hotelIntroduction);
            this.hotelIntroduction = hotelIntroduction;
            return this;
        }

        /**
         * HotelMember.
         */
        public Builder hotelMember(String hotelMember) {
            this.putBodyParameter("HotelMember", hotelMember);
            this.hotelMember = hotelMember;
            return this;
        }

        /**
         * HotelService.
         */
        public Builder hotelService(String hotelService) {
            this.putBodyParameter("HotelService", hotelService);
            this.hotelService = hotelService;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parkingExpenses(String parkingExpenses) {
            this.putBodyParameter("ParkingExpenses", parkingExpenses);
            this.parkingExpenses = parkingExpenses;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parkingPosition(String parkingPosition) {
            this.putBodyParameter("ParkingPosition", parkingPosition);
            this.parkingPosition = parkingPosition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder wifiName(String wifiName) {
            this.putBodyParameter("WifiName", wifiName);
            this.wifiName = wifiName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder wifiPassword(String wifiPassword) {
            this.putBodyParameter("WifiPassword", wifiPassword);
            this.wifiPassword = wifiPassword;
            return this;
        }

        @Override
        public UpdateBasicInfoQARequest build() {
            return new UpdateBasicInfoQARequest(this);
        } 

    } 

}
