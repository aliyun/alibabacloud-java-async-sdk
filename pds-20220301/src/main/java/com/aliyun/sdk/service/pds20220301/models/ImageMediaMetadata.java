// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageMediaMetadata} extends {@link TeaModel}
 *
 * <p>ImageMediaMetadata</p>
 */
public class ImageMediaMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address_line")
    private String addressLine;

    @com.aliyun.core.annotation.NameInMap("city")
    private String city;

    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("district")
    private String district;

    @com.aliyun.core.annotation.NameInMap("exif")
    private String exif;

    @com.aliyun.core.annotation.NameInMap("faces_thumbnail")
    private java.util.List < FaceThumbnail > facesThumbnail;

    @com.aliyun.core.annotation.NameInMap("height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("image_quality")
    private ImageQuality imageQuality;

    @com.aliyun.core.annotation.NameInMap("image_tags")
    private java.util.List < SystemTag > imageTags;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    @com.aliyun.core.annotation.NameInMap("township")
    private String township;

    @com.aliyun.core.annotation.NameInMap("width")
    private Long width;

    private ImageMediaMetadata(Builder builder) {
        this.addressLine = builder.addressLine;
        this.city = builder.city;
        this.country = builder.country;
        this.district = builder.district;
        this.exif = builder.exif;
        this.facesThumbnail = builder.facesThumbnail;
        this.height = builder.height;
        this.imageQuality = builder.imageQuality;
        this.imageTags = builder.imageTags;
        this.location = builder.location;
        this.province = builder.province;
        this.time = builder.time;
        this.township = builder.township;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageMediaMetadata create() {
        return builder().build();
    }

    /**
     * @return addressLine
     */
    public String getAddressLine() {
        return this.addressLine;
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
     * @return district
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * @return exif
     */
    public String getExif() {
        return this.exif;
    }

    /**
     * @return facesThumbnail
     */
    public java.util.List < FaceThumbnail > getFacesThumbnail() {
        return this.facesThumbnail;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return imageQuality
     */
    public ImageQuality getImageQuality() {
        return this.imageQuality;
    }

    /**
     * @return imageTags
     */
    public java.util.List < SystemTag > getImageTags() {
        return this.imageTags;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return township
     */
    public String getTownship() {
        return this.township;
    }

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private String addressLine; 
        private String city; 
        private String country; 
        private String district; 
        private String exif; 
        private java.util.List < FaceThumbnail > facesThumbnail; 
        private Long height; 
        private ImageQuality imageQuality; 
        private java.util.List < SystemTag > imageTags; 
        private String location; 
        private String province; 
        private String time; 
        private String township; 
        private Long width; 

        /**
         * address_line.
         */
        public Builder addressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }

        /**
         * city.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * district.
         */
        public Builder district(String district) {
            this.district = district;
            return this;
        }

        /**
         * exif.
         */
        public Builder exif(String exif) {
            this.exif = exif;
            return this;
        }

        /**
         * faces_thumbnail.
         */
        public Builder facesThumbnail(java.util.List < FaceThumbnail > facesThumbnail) {
            this.facesThumbnail = facesThumbnail;
            return this;
        }

        /**
         * height.
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * image_quality.
         */
        public Builder imageQuality(ImageQuality imageQuality) {
            this.imageQuality = imageQuality;
            return this;
        }

        /**
         * image_tags.
         */
        public Builder imageTags(java.util.List < SystemTag > imageTags) {
            this.imageTags = imageTags;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * province.
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * township.
         */
        public Builder township(String township) {
            this.township = township;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public ImageMediaMetadata build() {
            return new ImageMediaMetadata(this);
        } 

    } 

}
