// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateWebofficeTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateWebofficeTokenRequest</p>
 */
public class GenerateWebofficeTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CachePreview")
    private Boolean cachePreview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalUploaded")
    private Boolean externalUploaded;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filename")
    private String filename;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hidecmb")
    private Boolean hidecmb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    private WebofficePermission permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewPages")
    private Long previewPages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Referer")
    private String referer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private WebofficeUser user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private WebofficeWatermark watermark;

    private GenerateWebofficeTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cachePreview = builder.cachePreview;
        this.credentialConfig = builder.credentialConfig;
        this.externalUploaded = builder.externalUploaded;
        this.filename = builder.filename;
        this.hidecmb = builder.hidecmb;
        this.notification = builder.notification;
        this.notifyTopicName = builder.notifyTopicName;
        this.password = builder.password;
        this.permission = builder.permission;
        this.previewPages = builder.previewPages;
        this.projectName = builder.projectName;
        this.referer = builder.referer;
        this.sourceURI = builder.sourceURI;
        this.user = builder.user;
        this.userData = builder.userData;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateWebofficeTokenRequest create() {
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
     * @return cachePreview
     */
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return externalUploaded
     */
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return hidecmb
     */
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return permission
     */
    public WebofficePermission getPermission() {
        return this.permission;
    }

    /**
     * @return previewPages
     */
    public Long getPreviewPages() {
        return this.previewPages;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return referer
     */
    public String getReferer() {
        return this.referer;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return user
     */
    public WebofficeUser getUser() {
        return this.user;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return watermark
     */
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<GenerateWebofficeTokenRequest, Builder> {
        private String regionId; 
        private Boolean cachePreview; 
        private CredentialConfig credentialConfig; 
        private Boolean externalUploaded; 
        private String filename; 
        private Boolean hidecmb; 
        private Notification notification; 
        private String notifyTopicName; 
        private String password; 
        private WebofficePermission permission; 
        private Long previewPages; 
        private String projectName; 
        private String referer; 
        private String sourceURI; 
        private WebofficeUser user; 
        private String userData; 
        private WebofficeWatermark watermark; 

        private Builder() {
            super();
        } 

        private Builder(GenerateWebofficeTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cachePreview = request.cachePreview;
            this.credentialConfig = request.credentialConfig;
            this.externalUploaded = request.externalUploaded;
            this.filename = request.filename;
            this.hidecmb = request.hidecmb;
            this.notification = request.notification;
            this.notifyTopicName = request.notifyTopicName;
            this.password = request.password;
            this.permission = request.permission;
            this.previewPages = request.previewPages;
            this.projectName = request.projectName;
            this.referer = request.referer;
            this.sourceURI = request.sourceURI;
            this.user = request.user;
            this.userData = request.userData;
            this.watermark = request.watermark;
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
         * <p>Specifies whether to enable cache preview.</p>
         * <ul>
         * <li>true: enables cache preview. The document can be previewed only and cannot be collaboratively edited.</li>
         * <li>false: does not enable cache preview. The document can be collaboratively edited when it is being previewed.</li>
         * </ul>
         * <blockquote>
         * <p> The pricing for document previews varies based on whether cache preview is enabled or disabled.</p>
         * </blockquote>
         * <blockquote>
         * <p> If you specify this parameter, the Pemission.copy parameter does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cachePreview(Boolean cachePreview) {
            this.putQueryParameter("CachePreview", cachePreview);
            this.cachePreview = cachePreview;
            return this;
        }

        /**
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>Specifies whether to allow an upload of a document to the Object Storage Service (OSS) bucket. Valid values:</p>
         * <ul>
         * <li>true: Documents can be directly uploaded to OSS. The uploaded document overwrites the existing document and a new version is generated for the document. Before you upload a new document, close the existing document if it is being edited. After the document is uploaded, wait for approximately 5 minutes before you open the document again so that the new version can successfully load. Upload a new document only when the existing is closed. Otherwise, the uploaded document is overwritten when the existing document is saved.</li>
         * <li>false: Documents cannot be directly uploaded to OSS. If you try to upload a document, an error is returned. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder externalUploaded(Boolean externalUploaded) {
            this.putQueryParameter("ExternalUploaded", externalUploaded);
            this.externalUploaded = externalUploaded;
            return this;
        }

        /**
         * <p>The name of the file. The extension must be included in the file name. By default, this parameter is set to the last depth level of the <strong>SourceURI</strong> parameter value.</p>
         * <p>Supported extensions (only preview supported for .pdf):</p>
         * <ul>
         * <li>Word documents: .doc, .docx, .txt, .dot, .wps, .wpt, .dotx, .docm, .dotm, and .rtf</li>
         * <li>Presentation documents: .ppt, .pptx, .pptm, .ppsx, .ppsm, .pps, .potx, .potm, .dpt, and .dps</li>
         * <li>Table documents: .et, .xls, .xlt, .xlsx, .xlsm, .xltx, .xltm, and .csv</li>
         * <li>PDF documents: .pdf</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test.pptx</p>
         */
        public Builder filename(String filename) {
            this.putQueryParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * Hidecmb.
         */
        public Builder hidecmb(Boolean hidecmb) {
            this.putQueryParameter("Hidecmb", hidecmb);
            this.hidecmb = hidecmb;
            return this;
        }

        /**
         * <p>The notification settings. Only Simple Message Queue messages are supported. For more information, see <a href="https://help.aliyun.com/zh/imm/developer-reference/weboffice-notification-message-examples?spm=a2c4g.11186623.0.0.7ee46295bRAbGt">WebOffice message example</a>.</p>
         * <blockquote>
         * <p> A notification is sent after the document is saved or renamed.</p>
         * </blockquote>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putQueryParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The user permission settings in the JSON format.</p>
         * <p>The parameter supports the following permission options:</p>
         * <p>Each option is of type Boolean and can have a value of true and false (the default value):</p>
         * <ul>
         * <li>Readonly: grants the permission to preview the document.</li>
         * <li>Rename: grants the permission to rename the document. Notification messages of a rename event can be sent only by using Simple Message Queue.</li>
         * <li>History: grants the permission to view historical versions.</li>
         * <li>Copy: grants the permission to copy the document.</li>
         * <li>Export: grants the permission to export the PDF document.</li>
         * <li>Print: grants the permission to print the document.</li>
         * </ul>
         * <blockquote>
         * <p> Only online preview is supported for PDF documents. When you call the operation on a PDF document, you can set the Readonly option only to true.</p>
         * </blockquote>
         * <blockquote>
         * <p> To manage multiple versions of the document, you must enable versioning for the bucket that stores the document and set the History parameter to true.</p>
         * </blockquote>
         */
        public Builder permission(WebofficePermission permission) {
            String permissionShrink = shrink(permission, "Permission", "json");
            this.putQueryParameter("Permission", permissionShrink);
            this.permission = permission;
            return this;
        }

        /**
         * PreviewPages.
         */
        public Builder previewPages(Long previewPages) {
            this.putQueryParameter("PreviewPages", previewPages);
            this.previewPages = previewPages;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Referer.
         */
        public Builder referer(String referer) {
            this.putQueryParameter("Referer", referer);
            this.referer = referer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/test.pptx</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The user information that you want to display on the WebOffice page. If you do not specify this parameter, the user name displayed is Unknown.</p>
         */
        public Builder user(WebofficeUser user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        /**
         * <p>The user-defined data that you want to return in asynchronous messages. This parameter takes effect only when you specify the MNS settings in the Notification parameter. The maximum length of the value is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;file_id&quot;: &quot;abc&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(WebofficeWatermark watermark) {
            String watermarkShrink = shrink(watermark, "Watermark", "json");
            this.putQueryParameter("Watermark", watermarkShrink);
            this.watermark = watermark;
            return this;
        }

        @Override
        public GenerateWebofficeTokenRequest build() {
            return new GenerateWebofficeTokenRequest(this);
        } 

    } 

}
