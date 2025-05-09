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
 * {@link SyncDeviceStatusWithAkRequest} extends {@link RequestModel}
 *
 * <p>SyncDeviceStatusWithAkRequest</p>
 */
public class SyncDeviceStatusWithAkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryCnName")
    private String categoryCnName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryEnName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryEnName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocationCnName")
    private String locationCnName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roomNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Switch")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer _switch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fanSpeed")
    private String fanSpeed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roomTemperature")
    private String roomTemperature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("temperature")
    private String temperature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("value")
    private Integer value;

    private SyncDeviceStatusWithAkRequest(Builder builder) {
        super(builder);
        this.categoryCnName = builder.categoryCnName;
        this.categoryEnName = builder.categoryEnName;
        this.deviceName = builder.deviceName;
        this.hotelId = builder.hotelId;
        this.location = builder.location;
        this.locationCnName = builder.locationCnName;
        this.number = builder.number;
        this.roomNo = builder.roomNo;
        this._switch = builder._switch;
        this.fanSpeed = builder.fanSpeed;
        this.mode = builder.mode;
        this.roomTemperature = builder.roomTemperature;
        this.temperature = builder.temperature;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDeviceStatusWithAkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryCnName
     */
    public String getCategoryCnName() {
        return this.categoryCnName;
    }

    /**
     * @return categoryEnName
     */
    public String getCategoryEnName() {
        return this.categoryEnName;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return locationCnName
     */
    public String getLocationCnName() {
        return this.locationCnName;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    /**
     * @return _switch
     */
    public Integer get_switch() {
        return this._switch;
    }

    /**
     * @return fanSpeed
     */
    public String getFanSpeed() {
        return this.fanSpeed;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return roomTemperature
     */
    public String getRoomTemperature() {
        return this.roomTemperature;
    }

    /**
     * @return temperature
     */
    public String getTemperature() {
        return this.temperature;
    }

    /**
     * @return value
     */
    public Integer getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SyncDeviceStatusWithAkRequest, Builder> {
        private String categoryCnName; 
        private String categoryEnName; 
        private String deviceName; 
        private String hotelId; 
        private String location; 
        private String locationCnName; 
        private String number; 
        private String roomNo; 
        private Integer _switch; 
        private String fanSpeed; 
        private String mode; 
        private String roomTemperature; 
        private String temperature; 
        private Integer value; 

        private Builder() {
            super();
        } 

        private Builder(SyncDeviceStatusWithAkRequest request) {
            super(request);
            this.categoryCnName = request.categoryCnName;
            this.categoryEnName = request.categoryEnName;
            this.deviceName = request.deviceName;
            this.hotelId = request.hotelId;
            this.location = request.location;
            this.locationCnName = request.locationCnName;
            this.number = request.number;
            this.roomNo = request.roomNo;
            this._switch = request._switch;
            this.fanSpeed = request.fanSpeed;
            this.mode = request.mode;
            this.roomTemperature = request.roomTemperature;
            this.temperature = request.temperature;
            this.value = request.value;
        } 

        /**
         * CategoryCnName.
         */
        public Builder categoryCnName(String categoryCnName) {
            this.putBodyParameter("CategoryCnName", categoryCnName);
            this.categoryCnName = categoryCnName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder categoryEnName(String categoryEnName) {
            this.putBodyParameter("CategoryEnName", categoryEnName);
            this.categoryEnName = categoryEnName;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>room</p>
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * LocationCnName.
         */
        public Builder locationCnName(String locationCnName) {
            this.putBodyParameter("LocationCnName", locationCnName);
            this.locationCnName = locationCnName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bedLight</p>
         */
        public Builder number(String number) {
            this.putBodyParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1211</p>
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder _switch(Integer _switch) {
            this.putBodyParameter("Switch", _switch);
            this._switch = _switch;
            return this;
        }

        /**
         * fanSpeed.
         */
        public Builder fanSpeed(String fanSpeed) {
            this.putBodyParameter("fanSpeed", fanSpeed);
            this.fanSpeed = fanSpeed;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * roomTemperature.
         */
        public Builder roomTemperature(String roomTemperature) {
            this.putBodyParameter("roomTemperature", roomTemperature);
            this.roomTemperature = roomTemperature;
            return this;
        }

        /**
         * temperature.
         */
        public Builder temperature(String temperature) {
            this.putBodyParameter("temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Integer value) {
            this.putBodyParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public SyncDeviceStatusWithAkRequest build() {
            return new SyncDeviceStatusWithAkRequest(this);
        } 

    } 

}
