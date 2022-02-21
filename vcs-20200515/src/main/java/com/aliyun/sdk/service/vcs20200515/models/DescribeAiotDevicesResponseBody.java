// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiotDevicesResponseBody</p>
 */
public class DescribeAiotDevicesResponseBody extends TeaModel {
    @NameInMap("AiotDevices")
    private AiotDevices aiotDevices;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAiotDevicesResponseBody(Builder builder) {
        this.aiotDevices = builder.aiotDevices;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aiotDevices
     */
    public AiotDevices getAiotDevices() {
        return this.aiotDevices;
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
        private AiotDevices aiotDevices; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * AiotDevices.
         */
        public Builder aiotDevices(AiotDevices aiotDevices) {
            this.aiotDevices = aiotDevices;
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

        public DescribeAiotDevicesResponseBody build() {
            return new DescribeAiotDevicesResponseBody(this);
        } 

    } 

    public static class AiotDeviceList extends TeaModel {
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

        @NameInMap("Id")
        private String id;

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

        @NameInMap("SerialNuber")
        private String serialNuber;

        @NameInMap("UserId")
        private String userId;

        private AiotDeviceList(Builder builder) {
            this.capDirection = builder.capDirection;
            this.corpId = builder.corpId;
            this.deviceId = builder.deviceId;
            this.deviceType = builder.deviceType;
            this.firmwareVersion = builder.firmwareVersion;
            this.IPAddr = builder.IPAddr;
            this.IPV6Addr = builder.IPV6Addr;
            this.IPv4Gateway = builder.IPv4Gateway;
            this.IPv4Netmask = builder.IPv4Netmask;
            this.id = builder.id;
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
            this.serialNuber = builder.serialNuber;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiotDeviceList create() {
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
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return serialNuber
         */
        public String getSerialNuber() {
            return this.serialNuber;
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
            private String id; 
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
            private String serialNuber; 
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * SerialNuber.
             */
            public Builder serialNuber(String serialNuber) {
                this.serialNuber = serialNuber;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AiotDeviceList build() {
                return new AiotDeviceList(this);
            } 

        } 

    }
    public static class AiotDevices extends TeaModel {
        @NameInMap("AiotDeviceList")
        private java.util.List < AiotDeviceList> aiotDeviceList;

        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalNum")
        private Long totalNum;

        private AiotDevices(Builder builder) {
            this.aiotDeviceList = builder.aiotDeviceList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiotDevices create() {
            return builder().build();
        }

        /**
         * @return aiotDeviceList
         */
        public java.util.List < AiotDeviceList> getAiotDeviceList() {
            return this.aiotDeviceList;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List < AiotDeviceList> aiotDeviceList; 
            private Long pageNum; 
            private Long pageSize; 
            private Long totalNum; 

            /**
             * AiotDeviceList.
             */
            public Builder aiotDeviceList(java.util.List < AiotDeviceList> aiotDeviceList) {
                this.aiotDeviceList = aiotDeviceList;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public AiotDevices build() {
                return new AiotDevices(this);
            } 

        } 

    }
}
