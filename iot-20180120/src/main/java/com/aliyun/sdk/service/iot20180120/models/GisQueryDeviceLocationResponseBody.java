// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GisQueryDeviceLocationResponseBody} extends {@link TeaModel}
 *
 * <p>GisQueryDeviceLocationResponseBody</p>
 */
public class GisQueryDeviceLocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GisQueryDeviceLocationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(java.util.List<Data> data) {
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

    /**
     * 
     * {@link GisQueryDeviceLocationResponseBody} extends {@link TeaModel}
     *
     * <p>GisQueryDeviceLocationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adcode")
        private Long adcode;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CoordinateSystem")
        private Integer coordinateSystem;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private Float latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private Float longitude;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("Province")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.adcode = model.adcode;
                this.city = model.city;
                this.coordinateSystem = model.coordinateSystem;
                this.country = model.country;
                this.deviceName = model.deviceName;
                this.ip = model.ip;
                this.latitude = model.latitude;
                this.longitude = model.longitude;
                this.productKey = model.productKey;
                this.province = model.province;
            } 

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
