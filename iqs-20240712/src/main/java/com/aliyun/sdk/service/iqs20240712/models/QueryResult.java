// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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

    private QueryResult(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResult create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    public static final class Builder {
        private java.util.List<Data> data; 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
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
            private String businessArea; 
            private String dailyOpeningHours; 
            private String mainTag; 
            private String phone; 
            private String score; 
            private String weeklyOpeningDays; 

            /**
             * businessArea.
             */
            public Builder businessArea(String businessArea) {
                this.businessArea = businessArea;
                return this;
            }

            /**
             * dailyOpeningHours.
             */
            public Builder dailyOpeningHours(String dailyOpeningHours) {
                this.dailyOpeningHours = dailyOpeningHours;
                return this;
            }

            /**
             * mainTag.
             */
            public Builder mainTag(String mainTag) {
                this.mainTag = mainTag;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * weeklyOpeningDays.
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

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * cityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * cityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * districtCode.
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * districtName.
             */
            public Builder districtName(String districtName) {
                this.districtName = districtName;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * provinceCode.
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            /**
             * provinceName.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * typeCode.
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * types.
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
