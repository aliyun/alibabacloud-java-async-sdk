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
         * <li>font</li>
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
         * <p>The client token. A 32-character UUID that ensures the idempotence of the request.</p>
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
         * <p>The cover image URL.</p>
         * <ul>
         * <li><p>Maximum length: 128 bytes.</p>
         * </li>
         * <li><p>UTF-8 encoded.</p>
         * </li>
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
         * <li><p>Maximum length: 1024 bytes.</p>
         * </li>
         * <li><p>UTF-8 encoded.</p>
         * </li>
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
         * <p>The URL of the media asset to be registered in the corresponding system. Once registered, this URL cannot be changed and is attached to the IMS mediaId.</p>
         * <ul>
         * <li>OSS URL. Two formats are supported:</li>
         * </ul>
         * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
         * <p>oss://example-bucket/example.mp4
         *  (This format assumes by default that the OSS region is the same as the service registration area.)</p>
         * <ul>
         * <li>VOD media asset:</li>
         * </ul>
         * <p>vod://\<em>\</em>\<em>20b48fb04483915d4f2cd8ac</em>***</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a>  or  vod://<strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The tags.</p>
         * <ul>
         * <li><p>Maximum number of tags: 16.</p>
         * </li>
         * <li><p>Separate multiple tags with commas.</p>
         * </li>
         * <li><p>Maximum length of a single tag: 32 bytes.</p>
         * </li>
         * <li><p>UTF-8 encoded.</p>
         * </li>
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
         * <p>The media type of the media asset. Valid values:</p>
         * <ul>
         * <li>image</li>
         * <li>video</li>
         * <li>audio</li>
         * <li>text</li>
         * </ul>
         * <p>When the value is &quot;text&quot;, the businessType must be set to &quot;subtitles&quot; or &quot;font&quot;.</p>
         * <p>Specify this field as needed. When the InputURL field is an OSS URL, the media type can also be automatically determined based on the file name extension (only for image, video, and audio file extensions). For the mapping between file extensions and media types, see <a href="https://help.aliyun.com/document_detail/466207.html">File formats</a>.</p>
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
         * <p>Specifies whether to overwrite an existing registered media asset. Default value: false.</p>
         * <ul>
         * <li><p>true: If the inputUrl is already registered, the existing media asset is deleted and a new media asset is registered.</p>
         * </li>
         * <li><p>false: If the inputUrl is already registered, the new media asset is not registered. Duplicate inputUrl values are not supported.</p>
         * </li>
         * </ul>
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
         * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_) are supported. The length must be 6 to 64 characters. The ID must be unique for each user.</p>
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
         * <p>The registration configuration.</p>
         * <p>By default, a sprite image is generated for the media asset. To disable this, set the NeedSprite field to false.</p>
         * <p>By default, a snapshot is generated. To disable this, set the NeedSnapshot field to false.</p>
         * <p>To specify the time for the cover image, configure CoverConfig, which contains the following field:</p>
         * <ul>
         * <li>StartTime: The time in seconds at which the cover image is captured from the media asset. Up to four decimal places are supported.</li>
         * </ul>
         * <p>After media asset registration, to import the media asset into a custom search library, configure SearchLibName. For information about how to create and use a custom search library, see <a href="~~2796619#dd34d8c740yj9~~">Use a custom search library</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;NeedSprite&quot;: &quot;false&quot;,
         *     &quot;CoverConfig&quot;: {
         *         &quot;StartTime&quot;: 1.0
         *     },
         *        &quot;SearchLibName&quot;: &quot;test&quot;
         * }</p>
         */
        public Builder registerConfig(String registerConfig) {
            this.putQueryParameter("RegisterConfig", registerConfig);
            this.registerConfig = registerConfig;
            return this;
        }

        /**
         * <p>The intelligent tagging template. Valid values:</p>
         * <ul>
         * <li>S00000101-300080: A system template that includes NLP content understanding.</li>
         * <li>S00000103-000001: A system template that includes NLP content understanding and all <a href="~~2804526#93b27f536airj~~">tagging capabilities</a>.</li>
         * <li>S00000103-000002: A system template that includes all <a href="~~2804526#93b27f536airj~~">tagging capabilities</a> but does not include NLP content understanding.</li>
         * </ul>
         * <p>For more information about tagging capabilities, see the documentation.</p>
         * <p>After this field is configured, an intelligent tagging analysis task is automatically initiated upon media asset registration. For billing information, see <a href="https://help.aliyun.com/document_detail/600262.html">Billing of Smart Tag Standard Edition</a>.</p>
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
         * <p>The title. If not provided, a default title is automatically generated based on the date.</p>
         * <ul>
         * <li><p>Maximum length: 128 bytes.</p>
         * </li>
         * <li><p>UTF-8 encoded.</p>
         * </li>
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
         * <p>The user data. Custom callback URL configuration is supported. For configuration instructions, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
         * <ul>
         * <li><p>Maximum length: 1024 bytes.</p>
         * </li>
         * <li><p>UTF-8 encoded.</p>
         * </li>
         * <li><p>Json format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or{&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
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
