// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    private java.util.List<String> addressNames;

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
    public java.util.List<String> getAddressNames() {
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
        private java.util.List<String> addressNames; 
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
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The level of the location.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>country</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>province</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>city</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>district</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>township</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         */
        public Builder addressLevel(String addressLevel) {
            this.putBodyParameter("address_level", addressLevel);
            this.addressLevel = addressLevel;
            return this;
        }

        /**
         * <p>The locations.</p>
         */
        public Builder addressNames(java.util.List<String> addressNames) {
            this.putBodyParameter("address_names", addressNames);
            this.addressNames = addressNames;
            return this;
        }

        /**
         * <p>The coordinates of the bottom right vertex of the rectangle. Set the value in the format of latitude,longitude.</p>
         * 
         * <strong>example:</strong>
         * <p>40.121,105.2121</p>
         */
        public Builder brGeoPoint(String brGeoPoint) {
            this.putBodyParameter("br_geo_point", brGeoPoint);
            this.brGeoPoint = brGeoPoint;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The method used to generate the thumbnail of an image.</p>
         * 
         * <strong>example:</strong>
         * <p>image/resize,w_200</p>
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putBodyParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * <p>The coordinates of the top left vertex of the rectangle. Set the value in the format of latitude,longitude.</p>
         * 
         * <strong>example:</strong>
         * <p>39.121,101.2121</p>
         */
        public Builder tlGeoPoint(String tlGeoPoint) {
            this.putBodyParameter("tl_geo_point", tlGeoPoint);
            this.tlGeoPoint = tlGeoPoint;
            return this;
        }

        /**
         * <p>The method used to generate the thumbnail of a video.</p>
         * 
         * <strong>example:</strong>
         * <p>video/snapshot,t_7000,f_jpg,w_800,h_600,m_fast</p>
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
