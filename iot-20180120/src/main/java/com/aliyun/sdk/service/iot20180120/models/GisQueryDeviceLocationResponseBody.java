// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GisQueryDeviceLocationResponseBody} extends {@link TeaModel}
 *
 * <p>GisQueryDeviceLocationResponseBody</p>
 */
public class GisQueryDeviceLocationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GisQueryDeviceLocationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GisQueryDeviceLocationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GisQueryDeviceLocationResponseBody build() {
            return new GisQueryDeviceLocationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Adcode")
        private Long adcode;

        @NameInMap("City")
        private String city;

        @NameInMap("CoordinateSystem")
        private Integer coordinateSystem;

        @NameInMap("Country")
        private String country;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("Province")
        private String province;

        private Data(Builder builder) {
            this.adcode = builder.adcode;
            this.city = builder.city;
            this.coordinateSystem = builder.coordinateSystem;
            this.country = builder.country;
            this.deviceName = builder.deviceName;
            this.ip = builder.ip;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.productKey = builder.productKey;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public Long getAdcode() {
            return this.adcode;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return coordinateSystem
         */
        public Integer getCoordinateSystem() {
            return this.coordinateSystem;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private Long adcode; 
            private String city; 
            private Integer coordinateSystem; 
            private String country; 
            private String deviceName; 
            private String ip; 
            private Float latitude; 
            private Float longitude; 
            private String productKey; 
            private String province; 

            /**
             * Adcode.
             */
            public Builder adcode(Long adcode) {
                this.adcode = adcode;
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
             * CoordinateSystem.
             */
            public Builder coordinateSystem(Integer coordinateSystem) {
                this.coordinateSystem = coordinateSystem;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
