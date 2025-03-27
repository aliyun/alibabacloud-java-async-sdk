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
 * {@link QueryRoomControlDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRoomControlDevicesResponseBody</p>
 */
public class QueryRoomControlDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private QueryRoomControlDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRoomControlDevicesResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(QueryRoomControlDevicesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
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

        public QueryRoomControlDevicesResponseBody build() {
            return new QueryRoomControlDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRoomControlDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesResponseBody</p>
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

        private SwitchList(Builder builder) {
            this.aliasList = builder.aliasList;
            this.category = builder.category;
            this.deviceIndex = builder.deviceIndex;
            this.deviceName = builder.deviceName;
            this.deviceStatus = builder.deviceStatus;
            this.elementCode = builder.elementCode;
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

        public static final class Builder {
            private java.util.List<String> aliasList; 
            private String category; 
            private Integer deviceIndex; 
            private String deviceName; 
            private String deviceStatus; 
            private String elementCode; 
            private String location; 

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

            public SwitchList build() {
                return new SwitchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomControlDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesResponseBody</p>
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
     * {@link QueryRoomControlDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasList")
        private java.util.List<String> aliasList;

        @com.aliyun.core.annotation.NameInMap("ConnectType")
        private String connectType;

        @com.aliyun.core.annotation.NameInMap("DN")
        private String dn;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("MultiKeySwitchExt")
        private MultiKeySwitchExt multiKeySwitchExt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("PK")
        private String pk;

        private Devices(Builder builder) {
            this.aliasList = builder.aliasList;
            this.connectType = builder.connectType;
            this.dn = builder.dn;
            this.deviceName = builder.deviceName;
            this.deviceStatus = builder.deviceStatus;
            this.multiKeySwitchExt = builder.multiKeySwitchExt;
            this.name = builder.name;
            this.number = builder.number;
            this.pk = builder.pk;
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
         * @return connectType
         */
        public String getConnectType() {
            return this.connectType;
        }

        /**
         * @return dn
         */
        public String getDn() {
            return this.dn;
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

        public static final class Builder {
            private java.util.List<String> aliasList; 
            private String connectType; 
            private String dn; 
            private String deviceName; 
            private String deviceStatus; 
            private MultiKeySwitchExt multiKeySwitchExt; 
            private String name; 
            private String number; 
            private String pk; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.aliasList = model.aliasList;
                this.connectType = model.connectType;
                this.dn = model.dn;
                this.deviceName = model.deviceName;
                this.deviceStatus = model.deviceStatus;
                this.multiKeySwitchExt = model.multiKeySwitchExt;
                this.name = model.name;
                this.number = model.number;
                this.pk = model.pk;
            } 

            /**
             * AliasList.
             */
            public Builder aliasList(java.util.List<String> aliasList) {
                this.aliasList = aliasList;
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
             * DN.
             */
            public Builder dn(String dn) {
                this.dn = dn;
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
             * PK.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomControlDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomControlDevicesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Devices")
        private java.util.List<Devices> devices;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("LocationName")
        private String locationName;

        private Result(Builder builder) {
            this.devices = builder.devices;
            this.location = builder.location;
            this.locationName = builder.locationName;
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

        public static final class Builder {
            private java.util.List<Devices> devices; 
            private String location; 
            private String locationName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.devices = model.devices;
                this.location = model.location;
                this.locationName = model.locationName;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
