// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
         * <p>Specifies whether to enable cached preview.</p>
         * <ul>
         * <li>true: When enabled, the document preview no longer updates collaborative editing content. This is suitable for preview-only scenarios.</li>
         * <li>false: When disabled, collaborative preview is used by default, which synchronizes collaborative editing content during preview.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Cached preview and non-cached preview have different unit prices. For more information, see the billing item description.
         * </notice>&gt;Notice: Cached preview does not support document content search or printing.</notice>
         * <notice>Cached preview does not support updating cached content.</notice>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cachePreview(Boolean cachePreview) {
            this.putQueryParameter("CachePreview", cachePreview);
            this.cachePreview = cachePreview;
            return this;
        }

        /**
         * <p><strong>Leave this parameter empty unless you have specific requirements.</strong></p>
         * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>Specifies whether uploading a file with the same name to OSS is expected behavior. Valid values:</p>
         * <ul>
         * <li>true: Uploading a file with the same name to OSS is expected behavior. The uploaded document overwrites the original document and generates a new version. After this parameter is set to true, you must first close the document that is being edited, wait about 5 minutes, and then reopen it to load the new document. The upload takes effect only when the document is closed. If the document is open, new saves overwrite the uploaded file.</li>
         * <li>false (default): Uploading a file with the same name to OSS is not expected behavior. The operation returns an error.</li>
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
         * <p>The file name, which must include the file name extension. The default value is the last segment of the <strong>SourceURI</strong> parameter.</p>
         * <p>Supported file name extensions (PDF supports preview only):</p>
         * <ul>
         * <li>Word documents: doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, and rtf</li>
         * <li>PowerPoint documents: ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, and dps</li>
         * <li>Excel documents: et, xls, xlt, xlsx, xlsm, xltx, xltm, and csv</li>
         * <li>PDF documents: pdf.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-Object.pptx</p>
         */
        public Builder filename(String filename) {
            this.putQueryParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * <p>Specifies whether to hide the toolbar. This parameter is supported in document preview mode. Valid values:</p>
         * <ul>
         * <li><p>false (default): The toolbar is not hidden.</p>
         * </li>
         * <li><p>true: The toolbar is hidden.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hidecmb(Boolean hidecmb) {
            this.putQueryParameter("Hidecmb", hidecmb);
            this.hidecmb = hidecmb;
            return this;
        }

        /**
         * <p>The notification configuration. Currently, only MNS is supported. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice message notification format</a>.</p>
         * <blockquote>
         * <p>Message notifications are sent when a file is saved or renamed.</p>
         * </blockquote>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>Sends event notifications to you as MNS messages. This parameter specifies the MNS topic for asynchronous message notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>test-topic</p>
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putQueryParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * <p>The password to open the document.</p>
         * <blockquote>
         * <p>Set this parameter if you want to preview or edit a password-protected document.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The user permission information in JSON format.</p>
         * <p>User permissions include the following options:</p>
         * <p>Each option is of the Boolean type. The default value is false. Valid values: true and false.</p>
         * <ul>
         * <li><p>Readonly (optional): Preview mode.</p>
         * </li>
         * <li><p>Rename (optional): The permission to rename a file. Only message notification is provided. The rename event is sent to MNS.</p>
         * </li>
         * <li><p>History (optional): The permission to view historical versions.</p>
         * </li>
         * <li><p>Copy (optional): The copy permission.</p>
         * </li>
         * <li><p>Export (optional): The permission to export to PDF.</p>
         * </li>
         * <li><p>Print (optional): The print permission.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>PDF supports only the preview feature. You must set the Readonly parameter to true.</p>
         * </blockquote>
         * <blockquote>
         * <p>PDF files do not support export.</p>
         * </blockquote>
         * <blockquote>
         * <p>To use the versioning feature, you must first enable versioning in OSS and then set the History parameter to true.</p>
         * <p>Notice: Printing is not supported in cached preview.
         * Notice: Historical versions can be viewed in edit mode but not in preview mode..</p>
         * </blockquote>
         */
        public Builder permission(WebofficePermission permission) {
            String permissionShrink = shrink(permission, "Permission", "json");
            this.putQueryParameter("Permission", permissionShrink);
            this.permission = permission;
            return this;
        }

        /**
         * <p>The maximum number of pages that can be previewed. By default, no limit is imposed. The maximum value is 5,000.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder previewPages(Long previewPages) {
            this.putQueryParameter("PreviewPages", previewPages);
            this.previewPages = previewPages;
            return this;
        }

        /**
         * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The OSS hotlink protection referer. Intelligent Media Management (IMM) needs to retrieve the source file from OSS. If hotlink protection is configured for OSS, IMM must pass the corresponding header to OSS to retrieve the source file.</p>
         * <blockquote>
         * <p>Set this parameter if the bucket that stores the document has a referer configured.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder referer(String referer) {
            this.putQueryParameter("Referer", referer);
            this.referer = referer;
            return this;
        }

        /**
         * <p>The OSS URI of the document to preview or edit.</p>
         * <p>The OSS URI follows the format <code>oss://${Bucket}/${Object}</code>, where <code>Bucket</code> is the name of an OSS bucket in the same region as the current project, and <code>Object</code> is the full path of the file including the file name extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.docx</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The user information. You can pass in user information from the business side, and the WebOffice page displays this information.</p>
         * <p>The system distinguishes different users by User.Id. User.Name is used only for frontend display. If User.Id is not specified, the backend automatically generates a random ID. Users with different IDs are treated as different principals and cannot modify or delete each other\&quot;s comments.</p>
         * <p>The default format is: Unknown_RandomString. If User.Id is not specified, the user information is displayed as &quot;Unknown&quot; by default.</p>
         */
        public Builder user(WebofficeUser user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        /**
         * <p>The custom user data. This parameter takes effect only when the Notification parameter is specified with MNS configurations. The data is returned in asynchronous message notifications for you to associate and process message notifications within your system. Maximum length: 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;id&quot;: &quot;test-id&quot;,
         *       &quot;name&quot;: &quot;test-name&quot;
         * }</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The watermark information. The watermark is generated on the frontend and is not written to the source document. Different parameters passed for the same document produce different watermarks.</p>
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
