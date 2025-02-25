// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaInfoRequest</p>
 */
public class UpdateMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppendTags")
    private Boolean appendTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaTags")
    private String mediaTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private UpdateMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appendTags = builder.appendTags;
        this.businessType = builder.businessType;
        this.cateId = builder.cateId;
        this.category = builder.category;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
        this.mediaTags = builder.mediaTags;
        this.referenceId = builder.referenceId;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaInfoRequest create() {
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
     * @return appendTags
     */
    public Boolean getAppendTags() {
        return this.appendTags;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputURL
     */
    public String getInputURL() {
        return this.inputURL;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaTags
     */
    public String getMediaTags() {
        return this.mediaTags;
    }

    /**
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UpdateMediaInfoRequest, Builder> {
        private String regionId; 
        private Boolean appendTags; 
        private String businessType; 
        private Long cateId; 
        private String category; 
        private String coverURL; 
        private String description; 
        private String inputURL; 
        private String mediaId; 
        private String mediaTags; 
        private String referenceId; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appendTags = request.appendTags;
            this.businessType = request.businessType;
            this.cateId = request.cateId;
            this.category = request.category;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
            this.mediaTags = request.mediaTags;
            this.referenceId = request.referenceId;
            this.title = request.title;
            this.userData = request.userData;
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
         * <p>Specifies whether to append tags. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: updates the MediaTags parameter by appending new tags.</li>
         * <li>false: updates the MediaTags parameter by overwriting existing tags with new tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder appendTags(Boolean appendTags) {
            this.putQueryParameter("AppendTags", appendTags);
            this.appendTags = appendTags;
            return this;
        }

        /**
         * <p>The business type. Valid values:</p>
         * <ul>
         * <li>subtitles</li>
         * <li>watermark</li>
         * <li>opening</li>
         * <li>ending</li>
         * <li>general</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3048</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * <p>The category.</p>
         * <ul>
         * <li>The value can be up to 64 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defaultCategory</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The URL of the thumbnail.</p>
         * <ul>
         * <li>The value can be up to 128 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png</a></p>
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * <p>The content description.</p>
         * <ul>
         * <li>The value can be up to 1,024 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defaultDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The input URL of the media asset in another service. The URL must be bound to the ID of the media asset in IMS. The URL cannot be modified once registered.</p>
         * <p>For a media asset from Object Storage Service (OSS), the URL may have one of the following formats:</p>
         * <p>1. http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
         * <p>2. oss://example-bucket/example.mp4. This format indicates that the region in which the OSS bucket of the media asset resides is the same as the region in which OSS is activated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The ID of the media asset. If this parameter is left empty, you must specify the input URL of the media asset, which has been registered in the IMS content library.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The tags.</p>
         * <ul>
         * <li>Up to 16 tags are supported.</li>
         * <li>Separate multiple tags with commas (,).</li>
         * <li>Each tag can be up to 32 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>updateTags1,updateTags2</p>
         */
        public Builder mediaTags(String mediaTags) {
            this.putQueryParameter("MediaTags", mediaTags);
            this.mediaTags = mediaTags;
            return this;
        }

        /**
         * <p>The custom ID. The ID can be 6 to 64 characters in length and can contain only letters, digits, hyphens (-), and underscores (_). Make sure that the ID is unique among users.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * <p>The title.</p>
         * <ul>
         * <li>The value can be up to 128 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defaultTitle</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The user data. It can be up to 1,024 bytes in size.</p>
         * 
         * <strong>example:</strong>
         * <p>userData</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UpdateMediaInfoRequest build() {
            return new UpdateMediaInfoRequest(this);
        } 

    } 

}
