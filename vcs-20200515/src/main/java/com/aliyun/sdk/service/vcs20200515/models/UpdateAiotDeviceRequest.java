// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotDeviceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiotDeviceRequest</p>
 */
public class UpdateAiotDeviceRequest extends Request {
    @Body
    @NameInMap("AiotDevice")
    @Validation(required = true)
    private AiotDevice aiotDevice;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private UpdateAiotDeviceRequest(Builder builder) {
        super(builder);
        this.aiotDevice = builder.aiotDevice;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiotDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiotDevice
     */
    public AiotDevice getAiotDevice() {
        return this.aiotDevice;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateAiotDeviceRequest, Builder> {
        private AiotDevice aiotDevice; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAiotDeviceRequest response) {
            super(response);
            this.aiotDevice = response.aiotDevice;
            this.id = response.id;
        } 

        /**
         * AiotDevice.
         */
        public Builder aiotDevice(AiotDevice aiotDevice) {
            this.putBodyParameter("AiotDevice", aiotDevice);
            this.aiotDevice = aiotDevice;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateAiotDeviceRequest build() {
            return new UpdateAiotDeviceRequest(this);
        } 

    } 

    public static class AiotDevice extends TeaModel {
        @NameInMap("IPAddr")
        private String IPAddr;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("Name")
        private String name;

        @NameInMap("Place")
        private String place;

        @NameInMap("Port")
        private Long port;

        private AiotDevice(Builder builder) {
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

        public static AiotDevice create() {
            return builder().build();
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
            private String IPAddr; 
            private Float latitude; 
            private Float longitude; 
            private String name; 
            private String place; 
            private Long port; 

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

            public AiotDevice build() {
                return new AiotDevice(this);
            } 

        } 

    }
}
