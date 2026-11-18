// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The application ID. Default value: <strong>app-1000000</strong>. If you have enabled the multi-application system, you can specify an application ID to upload the image to a specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application system</a>.</p>
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
         * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
         * <li>Call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category. The category ID is the value of the CateId response parameter.</li>
         * <li>Call the <a href="~~GetCategories~~">GetCategories</a> operation to query categories. The category ID is the value of the CateId response parameter.</li>
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
         * <li>The description must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image upload test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The file name extension of the source image file to be uploaded. Valid values:</p>
         * <ul>
         * <li><strong>png</strong>: default value.</li>
         * <li><strong>jpg</strong></li>
         * <li><strong>jpeg</strong></li>
         * <li><strong>gif</strong></li>
         * <li><strong>heic</strong></li>
         * <li><strong>webp</strong></li>
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
         * <li><strong>default</strong>: regular image. This is the default value.</li>
         * <li><strong>cover</strong>: video thumbnail.</li>
         * </ul>
         * <blockquote>
         * <p>The ApsaraVideo VOD console currently supports viewing and managing only images of the <strong>default</strong> type.</p>
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
         * <p>The address of the source image file to be uploaded.</p>
         * <blockquote>
         * <p>The address can exclude the file name extension. If the address includes a file name extension that is different from the one specified by <code>ImageExt</code>, the value of <code>ImageExt</code> prevails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>D:\picture_01</p>
         */
        public Builder originalFileName(String originalFileName) {
            this.putQueryParameter("OriginalFileName", originalFileName);
            this.originalFileName = originalFileName;
            return this;
        }

        /**
         * <p>The storage address. You can obtain the storage address by using the following method:
         * Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Storage Management</strong> to view the storage address.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the image is uploaded to the default storage address. If you specify this parameter, the image is uploaded to the specified storage address.</p>
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
         * <p>The tags of the image. Rules:</p>
         * <ul>
         * <li>A single tag can be up to 32 characters in length.</li>
         * <li>You can specify up to 16 tags.</li>
         * <li>Separate multiple tags with commas (,).</li>
         * <li>The tags must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title of the image. Rules:</p>
         * <ul>
         * <li>The title can be up to 128 characters in length.</li>
         * <li>The title must be encoded in UTF-8.</li>
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
         * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks and upload acceleration. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * <blockquote>
         * <ul>
         * <li>To use message callbacks in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For more information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
         * <li>To use the upload acceleration feature, submit a ticket to apply for activation. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
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
