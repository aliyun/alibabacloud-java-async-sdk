// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBundleRequest} extends {@link RequestModel}
 *
 * <p>ModifyBundleRequest</p>
 */
public class ModifyBundleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleName")
    private String bundleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyBundleRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.bundleName = builder.bundleName;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.language = builder.language;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBundleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return bundleName
     */
    public String getBundleName() {
        return this.bundleName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyBundleRequest, Builder> {
        private String bundleId; 
        private String bundleName; 
        private String description; 
        private String imageId; 
        private String language; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBundleRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.bundleName = request.bundleName;
            this.description = request.description;
            this.imageId = request.imageId;
            this.language = request.language;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud computer template that you want to modify.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The name of the new cloud computer template.
         */
        public Builder bundleName(String bundleName) {
            this.putQueryParameter("BundleName", bundleName);
            this.bundleName = bundleName;
            return this;
        }

        /**
         * The description of the new cloud computer template.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The new image ID. The new image must meet the following conditions:
         * <p>
         * 
         * *   The new image must be in the Available state.
         * *   The operating system of the new image must be the same as that of the original image.
         * *   The required disk size for the new image cannot be greater than that for the original image.
         * *   The GPU type of the new image must be the same as that of the original image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The OS language. This parameter is available only for system images.
         * <p>
         * 
         * Valid values:
         * 
         * *   en-US: American English
         * *   zh-HK: Traditional Chinese (Hong Kong)
         * *   zh-CN: Simplified Chinese.
         * 
         * *   ja-JP: Japanese
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyBundleRequest build() {
            return new ModifyBundleRequest(this);
        } 

    } 

}
