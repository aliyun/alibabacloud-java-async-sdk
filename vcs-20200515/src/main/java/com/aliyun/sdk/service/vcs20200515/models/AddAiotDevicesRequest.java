// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotDevicesRequest} extends {@link RequestModel}
 *
 * <p>AddAiotDevicesRequest</p>
 */
public class AddAiotDevicesRequest extends Request {
    @Body
    @NameInMap("AiotDeviceList")
    @Validation(required = true)
    private java.util.List < AiotDeviceList> aiotDeviceList;

    private AddAiotDevicesRequest(Builder builder) {
        super(builder);
        this.aiotDeviceList = builder.aiotDeviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAiotDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiotDeviceList
     */
    public java.util.List < AiotDeviceList> getAiotDeviceList() {
        return this.aiotDeviceList;
    }

    public static final class Builder extends Request.Builder<AddAiotDevicesRequest, Builder> {
        private java.util.List < AiotDeviceList> aiotDeviceList; 

        private Builder() {
            super();
        } 

        private Builder(AddAiotDevicesRequest response) {
            super(response);
            this.aiotDeviceList = response.aiotDeviceList;
        } 

        /**
         * AiotDeviceList.
         */
        public Builder aiotDeviceList(java.util.List < AiotDeviceList> aiotDeviceList) {
            this.putBodyParameter("AiotDeviceList", aiotDeviceList);
            this.aiotDeviceList = aiotDeviceList;
            return this;
        }

        @Override
        public AddAiotDevicesRequest build() {
            return new AddAiotDevicesRequest(this);
        } 

    } 

    public static class AiotDeviceList extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        private String corpId;

        @NameInMap("DeviceId")
        @Validation(required = true)
        private String deviceId;

        @NameInMap("IPAddr")
        private String IPAddr;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Place")
        private String place;

        @NameInMap("Port")
        private Long port;

        private AiotDeviceList(Builder builder) {
            this.corpId = builder.corpId;
            this.deviceId = builder.deviceId;
            this.IPAddr = builder.IPAddr;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.name = builder.name;
            this.place = builder.place;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiotDeviceList create() {
            return builder().build();
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
         * @return IPAddr
         */
        public String getIPAddr() {
            return this.IPAddr;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return place
         */
        public String getPlace() {
            return this.place;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        public static final class Builder {
            private String corpId; 
            private String deviceId; 
            private String IPAddr; 
            private Float latitude; 
            private Float longitude; 
            private String name; 
            private String place; 
            private Long port; 

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
             * IPAddr.
             */
            public Builder IPAddr(String IPAddr) {
                this.IPAddr = IPAddr;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            public AiotDeviceList build() {
                return new AiotDeviceList(this);
            } 

        } 

    }
}
