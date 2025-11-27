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
         * <p>Cache preview flag: </p>
         * <ul>
         * <li>true: When enabled, the document preview will no longer update collaborative editing content, suitable for scenarios where only preview is needed. </li>
         * <li>false: When disabled, it defaults to collaborative preview, allowing the preview to synchronously update collaborative editing content.<blockquote>
         * <p>Notice: The price for cache preview and non-cache preview differs. Please refer to the billing item description for more details.</notice> &gt;Notice: Search and print functions are not supported during cache preview.</notice> <notice>Updating cached content is currently not supported in cache preview mode.</notice></p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true、false</p>
         */
        public Builder cachePreview(Boolean cachePreview) {
            this.putQueryParameter("CachePreview", cachePreview);
            this.cachePreview = cachePreview;
            return this;
        }

        /**
         * <p><strong>If there are no special requirements, leave this blank.</strong></p>
         * <p>Chained authorization configuration, not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Using Chained Authorization to Access Other Entity Resources</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>Indicates whether uploading a file with the same name to OSS is an expected behavior. Possible values are as follows:</p>
         * <ul>
         * <li>true: Uploading a file with the same name to OSS is an expected behavior. The uploaded document will overwrite the original document and generate a new version. After setting it to true, you still need to close the currently editing document and wait for about 5 minutes before reopening it to load the new document. The upload is only effective when the document is closed; if the document is open, the new save will overwrite the uploaded file.</li>
         * <li>false (default): Uploading a file with the same name to OSS is not an expected behavior, and the interface will return an error.</li>
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
         * <p>Filename, which must include the file extension. By default, it is the last segment of the <strong>SourceURI</strong> parameter.
         * Supported file extensions (PDF is only supported for preview):</p>
         * <ul>
         * <li>Text documents (Word): doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, rtf </li>
         * <li>Presentation documents (PPT): ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, dps - Spreadsheet documents (Excel): et, xls, xlt, xlsx, xlsm, xltx, xltm, csv </li>
         * <li>PDF documents: pdf</li>
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
         * <p>Whether to hide the toolbar. This parameter can be set in document preview mode. Possible values are as follows:</p>
         * <ul>
         * <li>false (default): Do not hide the toolbar.</li>
         * <li>true: Hide the toolbar.</li>
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
         * <p>Notification message configuration, currently supporting only MNS. For the asynchronous notification message format, refer to <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice Message Notification Format</a>.</p>
         * <blockquote>
         * <p>There will be message notifications when the file is saved or renamed.</p>
         * </blockquote>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>Supports notifying some events to customers via MNS messages. This parameter is the topic for MNS asynchronous message notifications.</p>
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
         * <p>If you need to preview or edit a password-protected document, set this parameter.</p>
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
         * <p>User permission information, represented in JSON format.</p>
         * <p>User permissions include the following options:</p>
         * <p>Each option is of type Boolean, with a default value of false, and can be set to true or false.</p>
         * <ul>
         * <li>Readonly (optional): Preview mode.</li>
         * <li>Rename (optional): File renaming permission, which only provides message notification functionality. The renaming event will be sent to MNS.</li>
         * <li>History (optional): Permission to view historical versions.</li>
         * <li>Copy (optional): Copy permission.</li>
         * <li>Export (optional): PDF export permission.</li>
         * <li>Print (optional): Print permission.</li>
         * </ul>
         * <blockquote>
         * <p>PDF only supports preview functionality, so the &quot;Readonly&quot; parameter must be set to true.</p>
         * <p>PDF files do not support exporting.</p>
         * <p>To use the multi-version feature, you must first enable the multi-version feature in OSS and then set the &quot;History&quot; parameter to true.</p>
         * <p>Notice: Printing is not supported in cached preview.
         * Notice: Historical versions can be viewed in edit mode but not in preview mode.</p>
         * </blockquote>
         */
        public Builder permission(WebofficePermission permission) {
            String permissionShrink = shrink(permission, "Permission", "json");
            this.putQueryParameter("Permission", permissionShrink);
            this.permission = permission;
            return this;
        }

        /**
         * <p>Limits the number of pages that can be previewed. By default, there is no limit. The maximum cannot exceed 5000.</p>
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
         * <p>Project name, for how to obtain it, please refer to <a href="https://help.aliyun.com/document_detail/478153.html">Create Project</a>.</p>
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
         * <p>OSS anti-leeching. IMM needs to obtain the source file from OSS. If OSS has set up anti-leeching, IMM must pass the corresponding header to OSS to get the source file.</p>
         * <blockquote>
         * <p>If the Bucket where the document is located has Referer set, please configure this parameter.</p>
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
         * <p>OSS address of the document to be previewed or edited. The OSS address follows the rule <code>oss://${Bucket}/${Object}</code>, where <code>Bucket</code> is the name of the OSS Bucket in the same region as the current project, and <code>Object</code> is the full path of the file including the file extension.</p>
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
         * <p>User information. You can pass in user information from the business side, which will be displayed on the WebOffice page.</p>
         * <p>The system distinguishes different users by User.Id, and User.Name is used only for front-end display. If User.Id is not provided, the backend will generate a random ID. Users with different IDs are considered different entities and cannot modify or delete each other&quot;s comments.</p>
         * <p>The default format is: Unknown_random string. If User.Id is not provided, the user information will default to &quot;Unknown&quot;.</p>
         */
        public Builder user(WebofficeUser user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        /**
         * <p>User-defined information. It only takes effect when Notification parameters are filled in for MNS configuration. It will be returned in asynchronous message notifications, which can help you correlate and process messages within your system. The maximum length is 2048 bytes.</p>
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
         * <p>Watermark information. The watermark is generated on the front end and is not written into the source document. The same document with different parameters will result in different watermarks.</p>
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
