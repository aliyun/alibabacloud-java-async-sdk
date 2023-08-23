// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportRoomControlDevicesRequest} extends {@link RequestModel}
 *
 * <p>ImportRoomControlDevicesRequest</p>
 */
public class ImportRoomControlDevicesRequest extends Request {
    @Body
    @NameInMap("EnableInfraredDeviceImport")
    private String enableInfraredDeviceImport;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("LocationDevices")
    @Validation(required = true)
    private java.util.List < LocationDevices> locationDevices;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    private ImportRoomControlDevicesRequest(Builder builder) {
        super(builder);
        this.enableInfraredDeviceImport = builder.enableInfraredDeviceImport;
        this.hotelId = builder.hotelId;
        this.locationDevices = builder.locationDevices;
        this.roomNo = builder.roomNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportRoomControlDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableInfraredDeviceImport
     */
    public String getEnableInfraredDeviceImport() {
        return this.enableInfraredDeviceImport;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return locationDevices
     */
    public java.util.List < LocationDevices> getLocationDevices() {
        return this.locationDevices;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    public static final class Builder extends Request.Builder<ImportRoomControlDevicesRequest, Builder> {
        private String enableInfraredDeviceImport; 
        private String hotelId; 
        private java.util.List < LocationDevices> locationDevices; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(ImportRoomControlDevicesRequest request) {
            super(request);
            this.enableInfraredDeviceImport = request.enableInfraredDeviceImport;
            this.hotelId = request.hotelId;
            this.locationDevices = request.locationDevices;
            this.roomNo = request.roomNo;
        } 

        /**
         * EnableInfraredDeviceImport.
         */
        public Builder enableInfraredDeviceImport(String enableInfraredDeviceImport) {
            this.putBodyParameter("EnableInfraredDeviceImport", enableInfraredDeviceImport);
            this.enableInfraredDeviceImport = enableInfraredDeviceImport;
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
         * LocationDevices.
         */
        public Builder locationDevices(java.util.List < LocationDevices> locationDevices) {
            String locationDevicesShrink = shrink(locationDevices, "LocationDevices", "json");
            this.putBodyParameter("LocationDevices", locationDevicesShrink);
            this.locationDevices = locationDevices;
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
        public ImportRoomControlDevicesRequest build() {
            return new ImportRoomControlDevicesRequest(this);
        } 

    } 

    public static class SwitchList extends TeaModel {
        @NameInMap("AliasList")
        private java.util.List < String > aliasList;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Location")
        private String location;

        private SwitchList(Builder builder) {
            this.aliasList = builder.aliasList;
            this.category = builder.category;
            this.deviceIndex = builder.deviceIndex;
            this.deviceName = builder.deviceName;
            this.location = builder.location;
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
        public java.util.List < String > getAliasList() {
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
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private java.util.List < String > aliasList; 
            private String category; 
            private Integer deviceIndex; 
            private String deviceName; 
            private String location; 

            /**
             * AliasList.
             */
            public Builder aliasList(java.util.List < String > aliasList) {
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
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public SwitchList build() {
                return new SwitchList(this);
            } 

        } 

    }
    public static class MultiKeySwitchExt extends TeaModel {
        @NameInMap("SwitchList")
        private java.util.List < SwitchList> switchList;

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
        public java.util.List < SwitchList> getSwitchList() {
            return this.switchList;
        }

        public static final class Builder {
            private java.util.List < SwitchList> switchList; 

            /**
             * SwitchList.
             */
            public Builder switchList(java.util.List < SwitchList> switchList) {
                this.switchList = switchList;
                return this;
            }

            public MultiKeySwitchExt build() {
                return new MultiKeySwitchExt(this);
            } 

        } 

    }
    public static class Devices extends TeaModel {
        @NameInMap("AliasList")
        private java.util.List < String > aliasList;

        @NameInMap("Brand")
        private String brand;

        @NameInMap("City")
        private String city;

        @NameInMap("ConnectType")
        private String connectType;

        @NameInMap("DeviceName")
        @Validation(required = true)
        private String deviceName;

        @NameInMap("Dn")
        private String dn;

        @NameInMap("InfraredId")
        private String infraredId;

        @NameInMap("InfraredIndex")
        private String infraredIndex;

        @NameInMap("InfraredVersion")
        private String infraredVersion;

        @NameInMap("MultiKeySwitchExt")
        private MultiKeySwitchExt multiKeySwitchExt;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Number")
        private String number;

        @NameInMap("Pk")
        private String pk;

        @NameInMap("Province")
        private String province;

        @NameInMap("ServiceProvider")
        private String serviceProvider;

        private Devices(Builder builder) {
            this.aliasList = builder.aliasList;
            this.brand = builder.brand;
            this.city = builder.city;
            this.connectType = builder.connectType;
            this.deviceName = builder.deviceName;
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
        public java.util.List < String > getAliasList() {
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

        public static final class Builder {
            private java.util.List < String > aliasList; 
            private String brand; 
            private String city; 
            private String connectType; 
            private String deviceName; 
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

            /**
             * AliasList.
             */
            public Builder aliasList(java.util.List < String > aliasList) {
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

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
    public static class LocationDevices extends TeaModel {
        @NameInMap("Devices")
        private java.util.List < Devices> devices;

        @NameInMap("Location")
        @Validation(required = true)
        private String location;

        @NameInMap("LocationName")
        private String locationName;

        private LocationDevices(Builder builder) {
            this.devices = builder.devices;
            this.location = builder.location;
            this.locationName = builder.locationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationDevices create() {
            return builder().build();
        }

        /**
         * @return devices
         */
        public java.util.List < Devices> getDevices() {
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

        public static final class Builder {
            private java.util.List < Devices> devices; 
            private String location; 
            private String locationName; 

            /**
             * Devices.
             */
            public Builder devices(java.util.List < Devices> devices) {
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

            public LocationDevices build() {
                return new LocationDevices(this);
            } 

        } 

    }
}
