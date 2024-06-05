// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAddressGroupsRequest} extends {@link RequestModel}
 *
 * <p>SearchAddressGroupsRequest</p>
 */
public class SearchAddressGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("address_level")
    private String addressLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("address_names")
    private java.util.List < String > addressNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("br_geo_point")
    private String brGeoPoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_thumbnail_process")
    private String imageThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tl_geo_point")
    private String tlGeoPoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("video_thumbnail_process")
    private String videoThumbnailProcess;

    private SearchAddressGroupsRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.addressLevel = builder.addressLevel;
        this.addressNames = builder.addressNames;
        this.brGeoPoint = builder.brGeoPoint;
        this.driveId = builder.driveId;
        this.imageThumbnailProcess = builder.imageThumbnailProcess;
        this.tlGeoPoint = builder.tlGeoPoint;
        this.videoThumbnailProcess = builder.videoThumbnailProcess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAddressGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return addressLevel
     */
    public String getAddressLevel() {
        return this.addressLevel;
    }

    /**
     * @return addressNames
     */
    public java.util.List < String > getAddressNames() {
        return this.addressNames;
    }

    /**
     * @return brGeoPoint
     */
    public String getBrGeoPoint() {
        return this.brGeoPoint;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return imageThumbnailProcess
     */
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    /**
     * @return tlGeoPoint
     */
    public String getTlGeoPoint() {
        return this.tlGeoPoint;
    }

    /**
     * @return videoThumbnailProcess
     */
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

    public static final class Builder extends Request.Builder<SearchAddressGroupsRequest, Builder> {
        private String domainId; 
        private String addressLevel; 
        private java.util.List < String > addressNames; 
        private String brGeoPoint; 
        private String driveId; 
        private String imageThumbnailProcess; 
        private String tlGeoPoint; 
        private String videoThumbnailProcess; 

        private Builder() {
            super();
        } 

        private Builder(SearchAddressGroupsRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.addressLevel = request.addressLevel;
            this.addressNames = request.addressNames;
            this.brGeoPoint = request.brGeoPoint;
            this.driveId = request.driveId;
            this.imageThumbnailProcess = request.imageThumbnailProcess;
            this.tlGeoPoint = request.tlGeoPoint;
            this.videoThumbnailProcess = request.videoThumbnailProcess;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The level of the location.
         * <p>
         * 
         * Valid values:
         * 
         * *   country
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   province
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   city
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   district
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   township
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder addressLevel(String addressLevel) {
            this.putBodyParameter("address_level", addressLevel);
            this.addressLevel = addressLevel;
            return this;
        }

        /**
         * The locations.
         */
        public Builder addressNames(java.util.List < String > addressNames) {
            this.putBodyParameter("address_names", addressNames);
            this.addressNames = addressNames;
            return this;
        }

        /**
         * The coordinates of the bottom right vertex of the rectangle. Set the value in the format of latitude,longitude.
         */
        public Builder brGeoPoint(String brGeoPoint) {
            this.putBodyParameter("br_geo_point", brGeoPoint);
            this.brGeoPoint = brGeoPoint;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The method used to generate the thumbnail of an image.
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putBodyParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * The coordinates of the top left vertex of the rectangle. Set the value in the format of latitude,longitude.
         */
        public Builder tlGeoPoint(String tlGeoPoint) {
            this.putBodyParameter("tl_geo_point", tlGeoPoint);
            this.tlGeoPoint = tlGeoPoint;
            return this;
        }

        /**
         * The method used to generate the thumbnail of a video.
         */
        public Builder videoThumbnailProcess(String videoThumbnailProcess) {
            this.putBodyParameter("video_thumbnail_process", videoThumbnailProcess);
            this.videoThumbnailProcess = videoThumbnailProcess;
            return this;
        }

        @Override
        public SearchAddressGroupsRequest build() {
            return new SearchAddressGroupsRequest(this);
        } 

    } 

}
