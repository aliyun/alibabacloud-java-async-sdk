// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAiotDeviceResponseBody</p>
 */
public class UpdateAiotDeviceResponseBody extends TeaModel {
    @NameInMap("AiotDevice")
    private AiotDevice aiotDevice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAiotDeviceResponseBody(Builder builder) {
        this.aiotDevice = builder.aiotDevice;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiotDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return aiotDevice
     */
    public AiotDevice getAiotDevice() {
        return this.aiotDevice;
    }

    /**
     * @return code
     */
    public String getCode() {
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

    public static final class Builder {
        private AiotDevice aiotDevice; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * AiotDevice.
         */
        public Builder aiotDevice(AiotDevice aiotDevice) {
            this.aiotDevice = aiotDevice;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAiotDeviceResponseBody build() {
            return new UpdateAiotDeviceResponseBody(this);
        } 

    } 

    public static class AiotDevice extends TeaModel {
        @NameInMap("CapDirection")
        private String capDirection;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @NameInMap("IPAddr")
        private String IPAddr;

        @NameInMap("IPV6Addr")
        private String IPV6Addr;

        @NameInMap("IPv4Gateway")
        private String IPv4Gateway;

        @NameInMap("IPv4Netmask")
        private String IPv4Netmask;

        @NameInMap("IsOnline")
        private String isOnline;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("MAC")
        private String MAC;

        @NameInMap("Manufacturer")
        private String manufacturer;

        @NameInMap("Model")
        private String model;

        @NameInMap("MonitorAreaDesc")
        private String monitorAreaDesc;

        @NameInMap("MonitorDirection")
        private String monitorDirection;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrgCode")
        private String orgCode;

        @NameInMap("OwnerApsID")
        private String ownerApsID;

        @NameInMap("Password")
        private String password;

        @NameInMap("Place")
        private String place;

        @NameInMap("PlaceCode")
        private String placeCode;

        @NameInMap("Port")
        private Long port;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("UserId")
        private String userId;

        private AiotDevice(Builder builder) {
            this.capDirection = builder.capDirection;
            this.corpId = builder.corpId;
            this.deviceId = builder.deviceId;
            this.deviceType = builder.deviceType;
            this.firmwareVersion = builder.firmwareVersion;
            this.IPAddr = builder.IPAddr;
            this.IPV6Addr = builder.IPV6Addr;
            this.IPv4Gateway = builder.IPv4Gateway;
            this.IPv4Netmask = builder.IPv4Netmask;
            this.isOnline = builder.isOnline;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.MAC = builder.MAC;
            this.manufacturer = builder.manufacturer;
            this.model = builder.model;
            this.monitorAreaDesc = builder.monitorAreaDesc;
            this.monitorDirection = builder.monitorDirection;
            this.name = builder.name;
            this.orgCode = builder.orgCode;
            this.ownerApsID = builder.ownerApsID;
            this.password = builder.password;
            this.place = builder.place;
            this.placeCode = builder.placeCode;
            this.port = builder.port;
            this.serialNumber = builder.serialNumber;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiotDevice create() {
            return builder().build();
        }

        /**
         * @return capDirection
         */
        public String getCapDirection() {
            return this.capDirection;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return IPAddr
         */
        public String getIPAddr() {
            return this.IPAddr;
        }

        /**
         * @return IPV6Addr
         */
        public String getIPV6Addr() {
            return this.IPV6Addr;
        }

        /**
         * @return IPv4Gateway
         */
        public String getIPv4Gateway() {
            return this.IPv4Gateway;
        }

        /**
         * @return IPv4Netmask
         */
        public String getIPv4Netmask() {
            return this.IPv4Netmask;
        }

        /**
         * @return isOnline
         */
        public String getIsOnline() {
            return this.isOnline;
        }

        /**
         * @return latitude
         */
        public Float getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public Float getLongitude() {
            return this.longitude;
        }

        /**
         * @return MAC
         */
        public String getMAC() {
            return this.MAC;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return monitorAreaDesc
         */
        public String getMonitorAreaDesc() {
            return this.monitorAreaDesc;
        }

        /**
         * @return monitorDirection
         */
        public String getMonitorDirection() {
            return this.monitorDirection;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orgCode
         */
        public String getOrgCode() {
            return this.orgCode;
        }

        /**
         * @return ownerApsID
         */
        public String getOwnerApsID() {
            return this.ownerApsID;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return place
         */
        public String getPlace() {
            return this.place;
        }

        /**
         * @return placeCode
         */
        public String getPlaceCode() {
            return this.placeCode;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String capDirection; 
            private String corpId; 
            private String deviceId; 
            private String deviceType; 
            private String firmwareVersion; 
            private String IPAddr; 
            private String IPV6Addr; 
            private String IPv4Gateway; 
            private String IPv4Netmask; 
            private String isOnline; 
            private Float latitude; 
            private Float longitude; 
            private String MAC; 
            private String manufacturer; 
            private String model; 
            private String monitorAreaDesc; 
            private String monitorDirection; 
            private String name; 
            private String orgCode; 
            private String ownerApsID; 
            private String password; 
            private String place; 
            private String placeCode; 
            private Long port; 
            private String serialNumber; 
            private String userId; 

            /**
             * CapDirection.
             */
            public Builder capDirection(String capDirection) {
                this.capDirection = capDirection;
                return this;
            }

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * FirmwareVersion.
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * IPAddr.
             */
            public Builder IPAddr(String IPAddr) {
                this.IPAddr = IPAddr;
                return this;
            }

            /**
             * IPV6Addr.
             */
            public Builder IPV6Addr(String IPV6Addr) {
                this.IPV6Addr = IPV6Addr;
                return this;
            }

            /**
             * IPv4Gateway.
             */
            public Builder IPv4Gateway(String IPv4Gateway) {
                this.IPv4Gateway = IPv4Gateway;
                return this;
            }

            /**
             * IPv4Netmask.
             */
            public Builder IPv4Netmask(String IPv4Netmask) {
                this.IPv4Netmask = IPv4Netmask;
                return this;
            }

            /**
             * IsOnline.
             */
            public Builder isOnline(String isOnline) {
                this.isOnline = isOnline;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(Float latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(Float longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * MAC.
             */
            public Builder MAC(String MAC) {
                this.MAC = MAC;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * MonitorAreaDesc.
             */
            public Builder monitorAreaDesc(String monitorAreaDesc) {
                this.monitorAreaDesc = monitorAreaDesc;
                return this;
            }

            /**
             * MonitorDirection.
             */
            public Builder monitorDirection(String monitorDirection) {
                this.monitorDirection = monitorDirection;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrgCode.
             */
            public Builder orgCode(String orgCode) {
                this.orgCode = orgCode;
                return this;
            }

            /**
             * OwnerApsID.
             */
            public Builder ownerApsID(String ownerApsID) {
                this.ownerApsID = ownerApsID;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Place.
             */
            public Builder place(String place) {
                this.place = place;
                return this;
            }

            /**
             * PlaceCode.
             */
            public Builder placeCode(String placeCode) {
                this.placeCode = placeCode;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AiotDevice build() {
                return new AiotDevice(this);
            } 

        } 

    }
}
