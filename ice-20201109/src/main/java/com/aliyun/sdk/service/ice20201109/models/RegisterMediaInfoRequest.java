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
 * {@link RegisterMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>RegisterMediaInfoRequest</p>
 */
public class RegisterMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaTags")
    private String mediaTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisterConfig")
    private String registerConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartTagTemplateId")
    private String smartTagTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private RegisterMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessType = builder.businessType;
        this.cateId = builder.cateId;
        this.clientToken = builder.clientToken;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.inputURL = builder.inputURL;
        this.mediaTags = builder.mediaTags;
        this.mediaType = builder.mediaType;
        this.overwrite = builder.overwrite;
        this.referenceId = builder.referenceId;
        this.registerConfig = builder.registerConfig;
        this.smartTagTemplateId = builder.smartTagTemplateId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaInfoRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return mediaTags
     */
    public String getMediaTags() {
        return this.mediaTags;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * @return registerConfig
     */
    public String getRegisterConfig() {
        return this.registerConfig;
    }

    /**
     * @return smartTagTemplateId
     */
    public String getSmartTagTemplateId() {
        return this.smartTagTemplateId;
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

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<RegisterMediaInfoRequest, Builder> {
        private String regionId; 
        private String businessType; 
        private Long cateId; 
        private String clientToken; 
        private String coverURL; 
        private String description; 
        private String inputURL; 
        private String mediaTags; 
        private String mediaType; 
        private Boolean overwrite; 
        private String referenceId; 
        private String registerConfig; 
        private String smartTagTemplateId; 
        private String title; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessType = request.businessType;
            this.cateId = request.cateId;
            this.clientToken = request.clientToken;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.inputURL = request.inputURL;
            this.mediaTags = request.mediaTags;
            this.mediaType = request.mediaType;
            this.overwrite = request.overwrite;
            this.referenceId = request.referenceId;
            this.registerConfig = request.registerConfig;
            this.smartTagTemplateId = request.smartTagTemplateId;
            this.title = request.title;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
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
         * <p>The business type of the media asset. Valid values:</p>
         * <ul>
         * <li>subtitles</li>
         * <li>watermark</li>
         * <li>opening</li>
         * <li>ending</li>
         * <li>general</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opening</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. The value must be a UUID that contains 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The thumbnail URL of the media asset.</p>
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
         * <p>The description of the media asset.</p>
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
         * <p>The URL of the media asset in another service. The URL is associated with the ID of the media asset in IMS. The URL cannot be modified once registered. The following types of URLs are supported:</p>
         * <ul>
         * <li>OSS URL in one of the following formats:</li>
         * </ul>
         * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
         * <p>oss://example-bucket/example.mp4: In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</p>
         * <ul>
         * <li>URL of an ApsaraVideo VOD media asset</li>
         * </ul>
         * <p>vod://***20b48fb04483915d4f2cd8ac****</p>
         * <p>This parameter is required.</p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The tags of the media asset.</p>
         * <ul>
         * <li>Up to 16 tags are supported.</li>
         * <li>Separate multiple tags with commas (,).</li>
         * <li>Each tag can be up to 32 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        public Builder mediaTags(String mediaTags) {
            this.putQueryParameter("MediaTags", mediaTags);
            this.mediaTags = mediaTags;
            return this;
        }

        /**
         * <p>The type of the media asset. Valid values:</p>
         * <ul>
         * <li>image</li>
         * <li>video</li>
         * <li>audio</li>
         * <li>text</li>
         * </ul>
         * <p>We recommend that you specify this parameter based on your business requirements. If you set InputURL to an OSS URL, the media asset type can be automatically determined based on the file name extension. For more information
         * &lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/document_detail/466207.html">File formats</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the media asset that has been registered by using the same URL. Default value: false. Valid values:</p>
         * <p>- true: If a media asset has been registered by using the same URL, the original media asset is deleted and the new media asset is registered.</p>
         * <p>- false: If a media asset has been registered by using the same URL, the new media asset is not registered. A URL cannot be used to register multiple media assets.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
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
         * <p>The registration configurations.</p>
         * <p>By default, a sprite is generated for the media asset. You can set NeedSprite to false to disable automatic sprite generation.</p>
         * <p>By default, a snapshot is generated for the media asset. You can set NeedSnapshot to false to disable automatic snapshot generation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;NeedSprite&quot;: &quot;false&quot;
         * }</p>
         */
        public Builder registerConfig(String registerConfig) {
            this.putQueryParameter("RegisterConfig", registerConfig);
            this.registerConfig = registerConfig;
            return this;
        }

        /**
         * <p>The ID of the smart tagging template. Valid values:</p>
         * <ul>
         * <li>S00000101-300080: the system template that supports natural language processing (NLP) for content recognition.</li>
         * <li>S00000103-000001: the system template that supports NLP for content recognition and all tagging capabilities.</li>
         * <li>S00000103-000002: the system template that supports all tagging capabilities but does not support NLP for content recognition.</li>
         * </ul>
         * <p>After you configure this parameter, a smart tag analysis task is automatically initiated after the media asset is registered. For more information about the billable items&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/zh/ims/media-ai-billing?spm=a2c4g.11186623.0.0.3147392dWwlSjL#p-k38-3rb-dug">Smart tagging</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000101-300080</p>
         */
        public Builder smartTagTemplateId(String smartTagTemplateId) {
            this.putQueryParameter("SmartTagTemplateId", smartTagTemplateId);
            this.smartTagTemplateId = smartTagTemplateId;
            return this;
        }

        /**
         * <p>The title. If you do not specify this parameter, a default title is automatically generated based on the date.</p>
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
         * <p>The user data. You can specify a custom callback URL. For more information&lt;props=&quot;china&quot;&gt; ,see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
         * <ul>
         * <li>The value can be up to 1,024 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * <li>The value must be in the JSON format.</li>
         * </ul>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>b4fb044839815d4f2cd8</strong></strong></strong></p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public RegisterMediaInfoRequest build() {
            return new RegisterMediaInfoRequest(this);
        } 

    } 

}
