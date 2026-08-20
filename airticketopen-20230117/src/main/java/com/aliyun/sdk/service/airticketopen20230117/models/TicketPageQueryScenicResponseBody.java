// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketPageQueryScenicResponseBody} extends {@link TeaModel}
 *
 * <p>TicketPageQueryScenicResponseBody</p>
 */
public class TicketPageQueryScenicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TicketPageQueryScenicResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketPageQueryScenicResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TicketPageQueryScenicResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public TicketPageQueryScenicResponseBody build() {
            return new TicketPageQueryScenicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketPageQueryScenicResponseBody} extends {@link TeaModel}
     *
     * <p>TicketPageQueryScenicResponseBody</p>
     */
    public static class Scenics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private Double latitude;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private Double longitude;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpeningTime")
        private String openingTime;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("PreferentialPolicy")
        private String preferentialPolicy;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("ResidenceTime")
        private String residenceTime;

        @com.aliyun.core.annotation.NameInMap("ScenicId")
        private Long scenicId;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private Scenics(Builder builder) {
            this.address = builder.address;
            this.city = builder.city;
            this.country = builder.country;
            this.description = builder.description;
            this.images = builder.images;
            this.latitude = builder.latitude;
            this.level = builder.level;
            this.longitude = builder.longitude;
            this.name = builder.name;
            this.openingTime = builder.openingTime;
            this.phone = builder.phone;
            this.preferentialPolicy = builder.preferentialPolicy;
            this.province = builder.province;
            this.residenceTime = builder.residenceTime;
            this.scenicId = builder.scenicId;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenics create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return images
         */
        public java.util.List<String> getImages() {
            return this.images;
        }

        /**
         * @return latitude
         */
        public Double getLatitude() {
            return this.latitude;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return longitude
         */
        public Double getLongitude() {
            return this.longitude;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return openingTime
         */
        public String getOpeningTime() {
            return this.openingTime;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return preferentialPolicy
         */
        public String getPreferentialPolicy() {
            return this.preferentialPolicy;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return residenceTime
         */
        public String getResidenceTime() {
            return this.residenceTime;
        }

        /**
         * @return scenicId
         */
        public Long getScenicId() {
            return this.scenicId;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String address; 
            private String city; 
            private String country; 
            private String description; 
            private java.util.List<String> images; 
            private Double latitude; 
            private String level; 
            private Double longitude; 
            private String name; 
            private String openingTime; 
            private String phone; 
            private String preferentialPolicy; 
            private String province; 
            private String residenceTime; 
            private Long scenicId; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(Scenics model) {
                this.address = model.address;
                this.city = model.city;
                this.country = model.country;
                this.description = model.description;
                this.images = model.images;
                this.latitude = model.latitude;
                this.level = model.level;
                this.longitude = model.longitude;
                this.name = model.name;
                this.openingTime = model.openingTime;
                this.phone = model.phone;
                this.preferentialPolicy = model.preferentialPolicy;
                this.province = model.province;
                this.residenceTime = model.residenceTime;
                this.scenicId = model.scenicId;
                this.timezone = model.timezone;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
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
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(Double latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(Double longitude) {
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
             * OpeningTime.
             */
            public Builder openingTime(String openingTime) {
                this.openingTime = openingTime;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * PreferentialPolicy.
             */
            public Builder preferentialPolicy(String preferentialPolicy) {
                this.preferentialPolicy = preferentialPolicy;
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
             * ResidenceTime.
             */
            public Builder residenceTime(String residenceTime) {
                this.residenceTime = residenceTime;
                return this;
            }

            /**
             * ScenicId.
             */
            public Builder scenicId(Long scenicId) {
                this.scenicId = scenicId;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public Scenics build() {
                return new Scenics(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketPageQueryScenicResponseBody} extends {@link TeaModel}
     *
     * <p>TicketPageQueryScenicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Scenics")
        private java.util.List<Scenics> scenics;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.scenics = builder.scenics;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scenics
         */
        public java.util.List<Scenics> getScenics() {
            return this.scenics;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Scenics> scenics; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.scenics = model.scenics;
                this.totalSize = model.totalSize;
            } 

            /**
             * Scenics.
             */
            public Builder scenics(java.util.List<Scenics> scenics) {
                this.scenics = scenics;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
