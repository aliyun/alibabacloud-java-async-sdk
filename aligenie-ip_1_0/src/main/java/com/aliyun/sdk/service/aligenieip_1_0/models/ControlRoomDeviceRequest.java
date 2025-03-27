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
 * {@link ControlRoomDeviceRequest} extends {@link RequestModel}
 *
 * <p>ControlRoomDeviceRequest</p>
 */
public class ControlRoomDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cmd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cmd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceIndex")
    private Integer deviceIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Properties")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, String> properties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roomNo;

    private ControlRoomDeviceRequest(Builder builder) {
        super(builder);
        this.cmd = builder.cmd;
        this.deviceIndex = builder.deviceIndex;
        this.deviceNumber = builder.deviceNumber;
        this.hotelId = builder.hotelId;
        this.properties = builder.properties;
        this.roomNo = builder.roomNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ControlRoomDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cmd
     */
    public String getCmd() {
        return this.cmd;
    }

    /**
     * @return deviceIndex
     */
    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * @return deviceNumber
     */
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    public static final class Builder extends Request.Builder<ControlRoomDeviceRequest, Builder> {
        private String cmd; 
        private Integer deviceIndex; 
        private String deviceNumber; 
        private String hotelId; 
        private java.util.Map<String, String> properties; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(ControlRoomDeviceRequest request) {
            super(request);
            this.cmd = request.cmd;
            this.deviceIndex = request.deviceIndex;
            this.deviceNumber = request.deviceNumber;
            this.hotelId = request.hotelId;
            this.properties = request.properties;
            this.roomNo = request.roomNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>thing.attribute.set
         * thing.attribute.adjust</p>
         */
        public Builder cmd(String cmd) {
            this.putBodyParameter("Cmd", cmd);
            this.cmd = cmd;
            return this;
        }

        /**
         * DeviceIndex.
         */
        public Builder deviceIndex(Integer deviceIndex) {
            this.putBodyParameter("DeviceIndex", deviceIndex);
            this.deviceIndex = deviceIndex;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INFRARED49122575595</p>
         */
        public Builder deviceNumber(String deviceNumber) {
            this.putBodyParameter("DeviceNumber", deviceNumber);
            this.deviceNumber = deviceNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7***83</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder properties(java.util.Map<String, String> properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putBodyParameter("Properties", propertiesShrink);
            this.properties = properties;
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

        @Override
        public ControlRoomDeviceRequest build() {
            return new ControlRoomDeviceRequest(this);
        } 

    } 

}
