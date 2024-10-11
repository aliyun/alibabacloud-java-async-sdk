// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUploadImageRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadImageRequest</p>
 */
public class CreateUploadImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageExt")
    private String imageExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalFileName")
    private String originalFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateUploadImageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cateId = builder.cateId;
        this.description = builder.description;
        this.imageExt = builder.imageExt;
        this.imageType = builder.imageType;
        this.originalFileName = builder.originalFileName;
        this.storageLocation = builder.storageLocation;
        this.tags = builder.tags;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageExt
     */
    public String getImageExt() {
        return this.imageExt;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return originalFileName
     */
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreateUploadImageRequest, Builder> {
        private String appId; 
        private Long cateId; 
        private String description; 
        private String imageExt; 
        private String imageType; 
        private String originalFileName; 
        private String storageLocation; 
        private String tags; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadImageRequest request) {
            super(request);
            this.appId = request.appId;
            this.cateId = request.cateId;
            this.description = request.description;
            this.imageExt = request.imageExt;
            this.imageType = request.imageType;
            this.originalFileName = request.originalFileName;
            this.storageLocation = request.storageLocation;
            this.tags = request.tags;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The category ID of the image. You can use one of the following methods to obtain the category ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the Categories page, you can view the category ID of the image.</li>
         * <li>Obtain the value of CateId from the response to the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation.</li>
         * <li>Obtain the value of CateId from the response to the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100036****</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * <p>The description of the image.</p>
         * <ul>
         * <li>The description can be up to 1,024 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The description of the image</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The file name extension of the image. Valid values:</p>
         * <ul>
         * <li><strong>png</strong> (default)</li>
         * <li><strong>jpg</strong></li>
         * <li><strong>jpeg</strong></li>
         * <li><strong>gif</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>png</p>
         */
        public Builder imageExt(String imageExt) {
            this.putQueryParameter("ImageExt", imageExt);
            this.imageExt = imageExt;
            return this;
        }

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: the default image type.</li>
         * <li><strong>cover</strong>: the thumbnail.</li>
         * </ul>
         * <blockquote>
         * <p>You can manage only images of the <strong>default</strong> type in the ApsaraVideo VOD console.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>The name of the source file.</p>
         * <blockquote>
         * <p>The name must contain a file name extension. The file name extension is not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>D:\picture_01.png</p>
         */
        public Builder originalFileName(String originalFileName) {
            this.putQueryParameter("OriginalFileName", originalFileName);
            this.originalFileName = originalFileName;
            return this;
        }

        /**
         * <p>The storage address. Perform the following operations to obtain the storage address: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. On the Storage page, view the storage address.</p>
         * <blockquote>
         * <p>If you specify a storage address, media files are uploaded to the specified address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>outin-****..oss-cn-shanghai.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The tags of the image. The following rules apply:</p>
         * <ul>
         * <li>Each tag can be up to 32 characters in length.</li>
         * <li>You can specify a maximum of 16 tags for an image.</li>
         * <li>Separate multiple tags with commas (,).</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title of the image. The following rules apply:</p>
         * <ul>
         * <li>The title can be up to 128 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mytitle</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom configurations, including callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section of the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a> topic.</p>
         * <blockquote>
         * <ul>
         * <li>The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
         * <li>If you want to enable the upload acceleration feature, submit a ticket. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateUploadImageRequest build() {
            return new CreateUploadImageRequest(this);
        } 

    } 

}
