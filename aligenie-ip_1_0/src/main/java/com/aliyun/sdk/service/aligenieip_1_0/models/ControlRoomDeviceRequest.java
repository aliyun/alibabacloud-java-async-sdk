// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlRoomDeviceRequest} extends {@link RequestModel}
 *
 * <p>ControlRoomDeviceRequest</p>
 */
public class ControlRoomDeviceRequest extends Request {
    @Body
    @NameInMap("Cmd")
    @Validation(required = true)
    private String cmd;

    @Body
    @NameInMap("DeviceIndex")
    private Integer deviceIndex;

    @Body
    @NameInMap("DeviceNumber")
    @Validation(required = true)
    private String deviceNumber;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("Properties")
    @Validation(required = true)
    private java.util.Map < String, String > properties;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
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
    public java.util.Map < String, String > getProperties() {
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
        private java.util.Map < String, String > properties; 
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
         * Cmd.
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
         * DeviceNumber.
         */
        public Builder deviceNumber(String deviceNumber) {
            this.putBodyParameter("DeviceNumber", deviceNumber);
            this.deviceNumber = deviceNumber;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map < String, String > properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putBodyParameter("Properties", propertiesShrink);
            this.properties = properties;
            return this;
        }

        /**
         * RoomNo.
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
