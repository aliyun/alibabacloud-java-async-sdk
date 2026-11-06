// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UpdateImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageRequest</p>
 */
public class UpdateImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdaptorIdList")
    private java.util.List<String> adaptorIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Distro")
    private String distro;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private UpdateImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adaptorIdList = builder.adaptorIdList;
        this.description = builder.description;
        this.distro = builder.distro;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.language = builder.language;
        this.versionId = builder.versionId;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adaptorIdList
     */
    public java.util.List<String> getAdaptorIdList() {
        return this.adaptorIdList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return distro
     */
    public String getDistro() {
        return this.distro;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<UpdateImageRequest, Builder> {
        private String regionId; 
        private java.util.List<String> adaptorIdList; 
        private String description; 
        private String distro; 
        private String imageId; 
        private String imageName; 
        private String language; 
        private String versionId; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adaptorIdList = request.adaptorIdList;
            this.description = request.description;
            this.distro = request.distro;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.language = request.language;
            this.versionId = request.versionId;
            this.versionName = request.versionName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The complete list of application adapter IDs for the selected image version. A maximum of 100 items are supported. <strong>When a non-empty list is passed, it must include the adapters that you still want to retain. Omitting this parameter or passing an empty list does not clear the existing associations.</strong></p>
         */
        public Builder adaptorIdList(java.util.List<String> adaptorIdList) {
            this.putBodyParameter("AdaptorIdList", adaptorIdList);
            this.adaptorIdList = adaptorIdList;
            return this;
        }

        /**
         * <p>The updated description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Update office software and basic configurations</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The operating system distribution information of the image. This must be consistent with the actual operating system distribution of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu 22.04 64-bit</p>
         */
        public Builder distro(String distro) {
            this.putBodyParameter("Distro", distro);
            this.distro = distro;
            return this;
        }

        /**
         * <p>The ID of the image to be modified. You must provide at least one of ImageId and VersionId. If both are provided, they must belong to the same image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The new name of the image. Specify this parameter only when you need to update the name.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeImage_202611</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The language of the image. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Simplified Chinese.</li>
         * <li><strong>zh-HK</strong>: Traditional Chinese (Hong Kong).</li>
         * <li><strong>en-US</strong>: English.</li>
         * <li><strong>ja-JP</strong>: Japanese.</li>
         * <li><strong>CN</strong>: A compatible value for Simplified Chinese.</li>
         * <li><strong>EN</strong>: A compatible value for English.</li>
         * <li><strong>JP</strong>: A compatible value for Japanese.</li>
         * <li><strong>CN-HK</strong>: A compatible value for Traditional Chinese (Hong Kong).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the image version to be modified. If this parameter is omitted, the current effective version of the image specified by ImageId is used. You must provide at least one of ImageId and VersionId.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The new display name of the image version.</p>
         * 
         * <strong>example:</strong>
         * <p>Office environment-202611</p>
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public UpdateImageRequest build() {
            return new UpdateImageRequest(this);
        } 

    } 

}
