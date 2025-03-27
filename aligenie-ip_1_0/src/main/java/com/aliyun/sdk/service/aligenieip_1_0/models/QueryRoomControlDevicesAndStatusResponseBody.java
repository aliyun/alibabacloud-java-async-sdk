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
 * {@link QueryRoomControlDevicesAndStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRoomControlDevicesAndStatusResponseBody</p>
 */
public class QueryRoomControlDevicesAndStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private QueryRoomControlDevicesAndStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRoomControlDevicesAndStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(QueryRoomControlDevicesAndStatusResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

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

        public QueryRoomControlDevicesAndStatusResponseBody build() {
            return new QueryRoomControlDevicesAndStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRoomControlDevicesAndStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesAndStatusResponseBody</p>
     */
    public static class SwitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasList")
        private java.util.List<String> aliasList;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("ElementCode")
        private String elementCode;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Status")
        private java.util.Map<String, String> status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private SwitchList(Builder builder) {
            this.aliasList = builder.aliasList;
            this.category = builder.category;
            this.deviceIndex = builder.deviceIndex;
            this.deviceName = builder.deviceName;
            this.deviceStatus = builder.deviceStatus;
            this.elementCode = builder.elementCode;
            this.location = builder.location;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchList create() {
            return builder().build();
        }

        /**
         * @return aliasList
         */
        public java.util.List<String> getAliasList() {
            return this.aliasList;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deviceIndex
         */
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return elementCode
         */
        public String getElementCode() {
            return this.elementCode;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return status
         */
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> aliasList; 
            private String category; 
            private Integer deviceIndex; 
            private String deviceName; 
            private String deviceStatus; 
            private String elementCode; 
            private String location; 
            private java.util.Map<String, String> status; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(SwitchList model) {
                this.aliasList = model.aliasList;
                this.category = model.category;
                this.deviceIndex = model.deviceIndex;
                this.deviceName = model.deviceName;
                this.deviceStatus = model.deviceStatus;
                this.elementCode = model.elementCode;
                this.location = model.location;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * AliasList.
             */
            public Builder aliasList(java.util.List<String> aliasList) {
                this.aliasList = aliasList;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeviceIndex.
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * ElementCode.
             */
            public Builder elementCode(String elementCode) {
                this.elementCode = elementCode;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(java.util.Map<String, String> status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public SwitchList build() {
                return new SwitchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomControlDevicesAndStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesAndStatusResponseBody</p>
     */
    public static class MultiKeySwitchExt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SwitchList")
        private java.util.List<SwitchList> switchList;

        private MultiKeySwitchExt(Builder builder) {
            this.switchList = builder.switchList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiKeySwitchExt create() {
            return builder().build();
        }

        /**
         * @return switchList
         */
        public java.util.List<SwitchList> getSwitchList() {
            return this.switchList;
        }

        public static final class Builder {
            private java.util.List<SwitchList> switchList; 

            private Builder() {
            } 

            private Builder(MultiKeySwitchExt model) {
                this.switchList = model.switchList;
            } 

            /**
             * SwitchList.
             */
            public Builder switchList(java.util.List<SwitchList> switchList) {
                this.switchList = switchList;
                return this;
            }

            public MultiKeySwitchExt build() {
                return new MultiKeySwitchExt(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomControlDevicesAndStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesAndStatusResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasList")
        private java.util.List<String> aliasList;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("ConnectType")
        private String connectType;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("Dn")
        private String dn;

        @com.aliyun.core.annotation.NameInMap("InfraredId")
        private String infraredId;

        @com.aliyun.core.annotation.NameInMap("InfraredIndex")
        private String infraredIndex;

        @com.aliyun.core.annotation.NameInMap("InfraredVersion")
        private String infraredVersion;

        @com.aliyun.core.annotation.NameInMap("MultiKeySwitchExt")
        private MultiKeySwitchExt multiKeySwitchExt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("ServiceProvider")
        private String serviceProvider;

        @com.aliyun.core.annotation.NameInMap("Status")
        private java.util.Map<String, String> status;

        private Devices(Builder builder) {
            this.aliasList = builder.aliasList;
            this.brand = builder.brand;
            this.city = builder.city;
            this.connectType = builder.connectType;
            this.deviceName = builder.deviceName;
            this.deviceStatus = builder.deviceStatus;
            this.dn = builder.dn;
            this.infraredId = builder.infraredId;
            this.infraredIndex = builder.infraredIndex;
            this.infraredVersion = builder.infraredVersion;
            this.multiKeySwitchExt = builder.multiKeySwitchExt;
            this.name = builder.name;
            this.number = builder.number;
            this.pk = builder.pk;
            this.province = builder.province;
            this.serviceProvider = builder.serviceProvider;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return aliasList
         */
        public java.util.List<String> getAliasList() {
            return this.aliasList;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return connectType
         */
        public String getConnectType() {
            return this.connectType;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return dn
         */
        public String getDn() {
            return this.dn;
        }

        /**
         * @return infraredId
         */
        public String getInfraredId() {
            return this.infraredId;
        }

        /**
         * @return infraredIndex
         */
        public String getInfraredIndex() {
            return this.infraredIndex;
        }

        /**
         * @return infraredVersion
         */
        public String getInfraredVersion() {
            return this.infraredVersion;
        }

        /**
         * @return multiKeySwitchExt
         */
        public MultiKeySwitchExt getMultiKeySwitchExt() {
            return this.multiKeySwitchExt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return serviceProvider
         */
        public String getServiceProvider() {
            return this.serviceProvider;
        }

        /**
         * @return status
         */
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> aliasList; 
            private String brand; 
            private String city; 
            private String connectType; 
            private String deviceName; 
            private String deviceStatus; 
            private String dn; 
            private String infraredId; 
            private String infraredIndex; 
            private String infraredVersion; 
            private MultiKeySwitchExt multiKeySwitchExt; 
            private String name; 
            private String number; 
            private String pk; 
            private String province; 
            private String serviceProvider; 
            private java.util.Map<String, String> status; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.aliasList = model.aliasList;
                this.brand = model.brand;
                this.city = model.city;
                this.connectType = model.connectType;
                this.deviceName = model.deviceName;
                this.deviceStatus = model.deviceStatus;
                this.dn = model.dn;
                this.infraredId = model.infraredId;
                this.infraredIndex = model.infraredIndex;
                this.infraredVersion = model.infraredVersion;
                this.multiKeySwitchExt = model.multiKeySwitchExt;
                this.name = model.name;
                this.number = model.number;
                this.pk = model.pk;
                this.province = model.province;
                this.serviceProvider = model.serviceProvider;
                this.status = model.status;
            } 

            /**
             * AliasList.
             */
            public Builder aliasList(java.util.List<String> aliasList) {
                this.aliasList = aliasList;
                return this;
            }

            /**
             * Brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * ConnectType.
             */
            public Builder connectType(String connectType) {
                this.connectType = connectType;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * Dn.
             */
            public Builder dn(String dn) {
                this.dn = dn;
                return this;
            }

            /**
             * InfraredId.
             */
            public Builder infraredId(String infraredId) {
                this.infraredId = infraredId;
                return this;
            }

            /**
             * InfraredIndex.
             */
            public Builder infraredIndex(String infraredIndex) {
                this.infraredIndex = infraredIndex;
                return this;
            }

            /**
             * InfraredVersion.
             */
            public Builder infraredVersion(String infraredVersion) {
                this.infraredVersion = infraredVersion;
                return this;
            }

            /**
             * MultiKeySwitchExt.
             */
            public Builder multiKeySwitchExt(MultiKeySwitchExt multiKeySwitchExt) {
                this.multiKeySwitchExt = multiKeySwitchExt;
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
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * ServiceProvider.
             */
            public Builder serviceProvider(String serviceProvider) {
                this.serviceProvider = serviceProvider;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(java.util.Map<String, String> status) {
                this.status = status;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomControlDevicesAndStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesAndStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Devices")
        private java.util.List<Devices> devices;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("LocationName")
        private String locationName;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        private Result(Builder builder) {
            this.devices = builder.devices;
            this.location = builder.location;
            this.locationName = builder.locationName;
            this.roomNo = builder.roomNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return devices
         */
        public java.util.List<Devices> getDevices() {
            return this.devices;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return locationName
         */
        public String getLocationName() {
            return this.locationName;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        public static final class Builder {
            private java.util.List<Devices> devices; 
            private String location; 
            private String locationName; 
            private String roomNo; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.devices = model.devices;
                this.location = model.location;
                this.locationName = model.locationName;
                this.roomNo = model.roomNo;
            } 

            /**
             * Devices.
             */
            public Builder devices(java.util.List<Devices> devices) {
                this.devices = devices;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * LocationName.
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
