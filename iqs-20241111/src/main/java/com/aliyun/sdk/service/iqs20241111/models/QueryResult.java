// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link QueryResult} extends {@link TeaModel}
 *
 * <p>QueryResult</p>
 */
public class QueryResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryResult(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryResult model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of returned locations.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique request ID for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>15A85F99-408F-5BFA-B617-0C7D3E732ABD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryResult build() {
            return new QueryResult(this);
        } 

    } 

    /**
     * 
     * {@link QueryResult} extends {@link TeaModel}
     *
     * <p>QueryResult</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Images(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Lobby</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://store.example.com/showpic/e76beb3bedca3fe0375cef12742ea23e">http://store.example.com/showpic/e76beb3bedca3fe0375cef12742ea23e</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryResult} extends {@link TeaModel}
     *
     * <p>QueryResult</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("averageSpend")
        private String averageSpend;

        @com.aliyun.core.annotation.NameInMap("businessArea")
        private String businessArea;

        @com.aliyun.core.annotation.NameInMap("dailyOpeningHours")
        private String dailyOpeningHours;

        @com.aliyun.core.annotation.NameInMap("mainTag")
        private String mainTag;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("weeklyOpeningDays")
        private String weeklyOpeningDays;

        private Metadata(Builder builder) {
            this.averageSpend = builder.averageSpend;
            this.businessArea = builder.businessArea;
            this.dailyOpeningHours = builder.dailyOpeningHours;
            this.mainTag = builder.mainTag;
            this.phone = builder.phone;
            this.score = builder.score;
            this.weeklyOpeningDays = builder.weeklyOpeningDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return averageSpend
         */
        public String getAverageSpend() {
            return this.averageSpend;
        }

        /**
         * @return businessArea
         */
        public String getBusinessArea() {
            return this.businessArea;
        }

        /**
         * @return dailyOpeningHours
         */
        public String getDailyOpeningHours() {
            return this.dailyOpeningHours;
        }

        /**
         * @return mainTag
         */
        public String getMainTag() {
            return this.mainTag;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return weeklyOpeningDays
         */
        public String getWeeklyOpeningDays() {
            return this.weeklyOpeningDays;
        }

        public static final class Builder {
            private String averageSpend; 
            private String businessArea; 
            private String dailyOpeningHours; 
            private String mainTag; 
            private String phone; 
            private String score; 
            private String weeklyOpeningDays; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.averageSpend = model.averageSpend;
                this.businessArea = model.businessArea;
                this.dailyOpeningHours = model.dailyOpeningHours;
                this.mainTag = model.mainTag;
                this.phone = model.phone;
                this.score = model.score;
                this.weeklyOpeningDays = model.weeklyOpeningDays;
            } 

            /**
             * <p>The average spend in CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder averageSpend(String averageSpend) {
                this.averageSpend = averageSpend;
                return this;
            }

            /**
             * <p>The business area.</p>
             * 
             * <strong>example:</strong>
             * <p>Central Area of West Lake Tourist Zone</p>
             */
            public Builder businessArea(String businessArea) {
                this.businessArea = businessArea;
                return this;
            }

            /**
             * <p>The business hours for today.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00-18:00</p>
             */
            public Builder dailyOpeningHours(String dailyOpeningHours) {
                this.dailyOpeningHours = dailyOpeningHours;
                return this;
            }

            /**
             * <p>The main tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Luxury</p>
             */
            public Builder mainTag(String mainTag) {
                this.mainTag = mainTag;
                return this;
            }

            /**
             * <p>The contact phone numbers. Multiple numbers are separated by vertical bars.</p>
             * 
             * <strong>example:</strong>
             * <p>0571-8732****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The rating.</p>
             * 
             * <strong>example:</strong>
             * <p>4.7</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The weekly opening days.</p>
             * 
             * <strong>example:</strong>
             * <p>Monday to Sunday</p>
             */
            public Builder weeklyOpeningDays(String weeklyOpeningDays) {
                this.weeklyOpeningDays = weeklyOpeningDays;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryResult} extends {@link TeaModel}
     *
     * <p>QueryResult</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("cityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("cityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("districtCode")
        private String districtCode;

        @com.aliyun.core.annotation.NameInMap("districtName")
        private String districtName;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("provinceCode")
        private String provinceCode;

        @com.aliyun.core.annotation.NameInMap("provinceName")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("typeCode")
        private String typeCode;

        @com.aliyun.core.annotation.NameInMap("types")
        private String types;

        private Data(Builder builder) {
            this.address = builder.address;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.distanceMeter = builder.distanceMeter;
            this.districtCode = builder.districtCode;
            this.districtName = builder.districtName;
            this.id = builder.id;
            this.images = builder.images;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.provinceCode = builder.provinceCode;
            this.provinceName = builder.provinceName;
            this.typeCode = builder.typeCode;
            this.types = builder.types;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return districtCode
         */
        public String getDistrictCode() {
            return this.districtCode;
        }

        /**
         * @return districtName
         */
        public String getDistrictName() {
            return this.districtName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return typeCode
         */
        public String getTypeCode() {
            return this.typeCode;
        }

        /**
         * @return types
         */
        public String getTypes() {
            return this.types;
        }

        public static final class Builder {
            private String address; 
            private String cityCode; 
            private String cityName; 
            private String distanceMeter; 
            private String districtCode; 
            private String districtName; 
            private String id; 
            private java.util.List<Images> images; 
            private String latitude; 
            private String longitude; 
            private Metadata metadata; 
            private String name; 
            private String provinceCode; 
            private String provinceName; 
            private String typeCode; 
            private String types; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.address = model.address;
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.distanceMeter = model.distanceMeter;
                this.districtCode = model.districtCode;
                this.districtName = model.districtName;
                this.id = model.id;
                this.images = model.images;
                this.latitude = model.latitude;
                this.longitude = model.longitude;
                this.metadata = model.metadata;
                this.name = model.name;
                this.provinceCode = model.provinceCode;
                this.provinceName = model.provinceName;
                this.typeCode = model.typeCode;
                this.types = model.types;
            } 

            /**
             * <p>The detailed address.</p>
             * 
             * <strong>example:</strong>
             * <p>No. 22 Fayun Lane, West Lake Scenic Area</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>0571</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The city name.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The distance from the center point in meters.</p>
             * 
             * <strong>example:</strong>
             * <p>815</p>
             */
            public Builder distanceMeter(String distanceMeter) {
                this.distanceMeter = distanceMeter;
                return this;
            }

            /**
             * <p>The district code.</p>
             * 
             * <strong>example:</strong>
             * <p>330106</p>
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * <p>The district name.</p>
             * 
             * <strong>example:</strong>
             * <p>Xihu District</p>
             */
            public Builder districtName(String districtName) {
                this.districtName = districtName;
                return this;
            }

            /**
             * <p>The internal identifier of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>B023B0BI3J</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The list of images.</p>
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The latitude of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>30.234403</p>
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * <p>The longitude of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>120.097327</p>
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * <p>The related business information.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The location name.</p>
             * 
             * <strong>example:</strong>
             * <p>Amanfayun Hangzhou</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The province code.</p>
             * 
             * <strong>example:</strong>
             * <p>330000</p>
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            /**
             * <p>The province name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang Province</p>
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * <p>The location type code.</p>
             * 
             * <strong>example:</strong>
             * <p>100102</p>
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * <p>The location types. Multiple types are separated by vertical bars.</p>
             * 
             * <strong>example:</strong>
             * <p>Accommodation|Hotel|Five-star hotel</p>
             */
            public Builder types(String types) {
                this.types = types;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
