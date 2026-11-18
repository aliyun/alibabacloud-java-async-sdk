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
 * {@link UploadMediaByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadMediaByURLRequest</p>
 */
public class UploadMediaByURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableFirstFrameCover")
    private Boolean enableFirstFrameCover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateThumbnail")
    private Boolean generateThumbnail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
    private String templateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadMetadatas")
    private String uploadMetadatas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadURLs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private UploadMediaByURLRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.enableFirstFrameCover = builder.enableFirstFrameCover;
        this.generateThumbnail = builder.generateThumbnail;
        this.sessionId = builder.sessionId;
        this.storageLocation = builder.storageLocation;
        this.templateGroupId = builder.templateGroupId;
        this.uploadMetadatas = builder.uploadMetadatas;
        this.uploadURLs = builder.uploadURLs;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaByURLRequest create() {
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
     * @return enableFirstFrameCover
     */
    public Boolean getEnableFirstFrameCover() {
        return this.enableFirstFrameCover;
    }

    /**
     * @return generateThumbnail
     */
    public Boolean getGenerateThumbnail() {
        return this.generateThumbnail;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return uploadMetadatas
     */
    public String getUploadMetadatas() {
        return this.uploadMetadatas;
    }

    /**
     * @return uploadURLs
     */
    public String getUploadURLs() {
        return this.uploadURLs;
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

    public static final class Builder extends Request.Builder<UploadMediaByURLRequest, Builder> {
        private String appId; 
        private Boolean enableFirstFrameCover; 
        private Boolean generateThumbnail; 
        private String sessionId; 
        private String storageLocation; 
        private String templateGroupId; 
        private String uploadMetadatas; 
        private String uploadURLs; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(UploadMediaByURLRequest request) {
            super(request);
            this.appId = request.appId;
            this.enableFirstFrameCover = request.enableFirstFrameCover;
            this.generateThumbnail = request.generateThumbnail;
            this.sessionId = request.sessionId;
            this.storageLocation = request.storageLocation;
            this.templateGroupId = request.templateGroupId;
            this.uploadMetadatas = request.uploadMetadatas;
            this.uploadURLs = request.uploadURLs;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to use the first frame of the video as the cover.</p>
         */
        public Builder enableFirstFrameCover(Boolean enableFirstFrameCover) {
            this.putQueryParameter("EnableFirstFrameCover", enableFirstFrameCover);
            this.enableFirstFrameCover = enableFirstFrameCover;
            return this;
        }

        /**
         * <p>Specifies whether to generate a thumbnail for the video.</p>
         */
        public Builder generateThumbnail(Boolean generateThumbnail) {
            this.putQueryParameter("GenerateThumbnail", generateThumbnail);
            this.generateThumbnail = generateThumbnail;
            return this;
        }

        /**
         * <p>The custom deduplication identifier. If this parameter is passed in a request and a request with the same identifier was detected within the past 10 minutes, an error is returned for the current request.</p>
         * <blockquote>
         * <ul>
         * <li>The deduplication identifier is custom. It can be up to 50 characters in length and supports uppercase and lowercase letters, digits, hyphens (-), and underscores (_). If you do not pass this parameter or pass an empty string, deduplication is not performed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5c62d40299034bbaa4c195da330****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The storage address of the media file.</p>
         * <p>Log on to the <a href="https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Storage Management</strong> to view the storage address. If you do not specify this parameter, the default storage address is used.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Transcoding Template Groups</strong> to view the ID of the transcoding template group.</li>
         * <li>When you create a transcoding template group by calling the <a href="https://help.aliyun.com/document_detail/102665.html">Create a transcoding template group</a> operation, the ID of the transcoding template group is the value of the TranscodeTemplateGroupId response parameter.</li>
         * <li>When you query transcoding template groups by calling the <a href="https://help.aliyun.com/document_detail/102669.html">Query transcoding template groups</a> operation, the ID is the value of the TranscodeTemplateGroupId response parameter.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you do not specify the ID of a transcoding template group, the default transcoding template group is used for transcoding. If you specify the ID of a transcoding template group, the specified template group is used for transcoding.</li>
         * <li>You can also set this parameter in <code>UploadMetadatas</code>. If TemplateGroupId is set in both <code>UploadMetadatas</code> and here, the TemplateGroupId set in <code>UploadMetadatas</code> prevails.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ca3a8f6e4957b65806709586****</p>
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * <p>The metadata of the media files to be uploaded. The value is a JSON string.</p>
         * <ul>
         * <li>The metadata takes effect only when it matches the URL in UploadURLs.</li>
         * <li>JSON format: <code>[UploadMetadata, UploadMetadata,…]</code>. The value must be converted to a JSON string.</li>
         * <li>For more information, see the <strong>UploadMetadata</strong> table below.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
         */
        public Builder uploadMetadatas(String uploadMetadatas) {
            this.putQueryParameter("UploadMetadatas", uploadMetadatas);
            this.uploadMetadatas = uploadMetadatas;
            return this;
        }

        /**
         * <p>The URLs of the source media files.</p>
         * <ul>
         * <li>The URL must include a file name extension. For example, in <code>https://****.mp4</code>, mp4 is the file name extension.<ul>
         * <li>If the URL does not contain a file name extension, you can specify it by passing <code>FileExtension</code> in <code>UploadMetadatas</code>.</li>
         * <li>If the URL contains a file name extension and <code>FileExtension</code> is also passed, the passed <code>FileExtension</code> prevails.</li>
         * <li>For supported file name extensions, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload overview</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The URLs must be URL-encoded. Separate multiple URLs with commas (,). You can specify up to 20 URLs. To prevent upload failures caused by special characters, <strong>URL-encode</strong> the URLs before concatenating them with commas.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>https://****.mp4</p>
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
            return this;
        }

        /**
         * <p>The custom settings. The value is a JSON string. You can configure settings such as message callbacks and upload acceleration. For more information, see <a href="~~86952#UserData~~">UserData</a>.</p>
         * <blockquote>
         * <ul>
         * <li>To use the message callback feature in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For more information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
         * <li>To use the upload acceleration feature, you must submit a ticket to apply for activation. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
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

        /**
         * <p>The workflow ID. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Workflow Management</strong> to view the workflow ID.</p>
         * <blockquote>
         * <p>If both WorkflowId and TemplateGroupId are passed, WorkflowId prevails. For usage instructions, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e1e243b42548248197d6f74f9****</p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public UploadMediaByURLRequest build() {
            return new UploadMediaByURLRequest(this);
        } 

    } 

}
