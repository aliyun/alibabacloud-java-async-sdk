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
 * {@link ProduceEditingProjectVideoRequest} extends {@link RequestModel}
 *
 * <p>ProduceEditingProjectVideoRequest</p>
 */
public class ProduceEditingProjectVideoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetadata")
    private String mediaMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProduceConfig")
    private String produceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeline")
    private String timeline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private ProduceEditingProjectVideoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.mediaMetadata = builder.mediaMetadata;
        this.ownerId = builder.ownerId;
        this.produceConfig = builder.produceConfig;
        this.projectId = builder.projectId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.timeline = builder.timeline;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProduceEditingProjectVideoRequest create() {
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
     * @return mediaMetadata
     */
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return produceConfig
     */
    public String getProduceConfig() {
        return this.produceConfig;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return timeline
     */
    public String getTimeline() {
        return this.timeline;
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

    public static final class Builder extends Request.Builder<ProduceEditingProjectVideoRequest, Builder> {
        private String appId; 
        private String coverURL; 
        private String description; 
        private String mediaMetadata; 
        private Long ownerId; 
        private String produceConfig; 
        private String projectId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String timeline; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ProduceEditingProjectVideoRequest request) {
            super(request);
            this.appId = request.appId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.mediaMetadata = request.mediaMetadata;
            this.ownerId = request.ownerId;
            this.produceConfig = request.produceConfig;
            this.projectId = request.projectId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.timeline = request.timeline;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
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
         * <p>The thumbnail URL of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/6AB4D0E1E1C7446888351****.png">https://example.aliyundoc.com/6AB4D0E1E1C7446888351****.png</a></p>
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * <p>The description of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>description test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The video metadata. The value must be in JSON format. For more information about the parameter structure, see <a href="~~52839#title_rtf_ry5_gjp~~">MediaMetadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Description&quot;:&quot;video description&quot;,&quot;Title&quot;:&quot;userData test&quot;}</p>
         */
        public Builder mediaMetadata(String mediaMetadata) {
            this.putQueryParameter("MediaMetadata", mediaMetadata);
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The configuration of video production. The value must be in the JSON format. For more information about the parameter structure, see <a href="~~52839#title-ybl-7cs-y7d~~">ProduceConfig</a>.</p>
         * <blockquote>
         * <p> StorageLocation is required if you produce videos in a region other than China (Shanghai).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TemplateGroupId&quot;:&quot;6d11e25ea30a4c465435c74****&quot;}</p>
         */
        public Builder produceConfig(String produceConfig) {
            this.putQueryParameter("ProduceConfig", produceConfig);
            this.produceConfig = produceConfig;
            return this;
        }

        /**
         * <p>The ID of the online editing project. You can use one of the following methods to obtain the ID of the online editing project:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Production Center</strong> &gt; <strong>Video Editing</strong> to view the ID of the online editing project.</li>
         * <li>Obtain the value of ProjectId from the response to the <a href="https://help.aliyun.com/document_detail/69048.html">AddEditingProject</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fb2101bf24b4cb318787dc****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The timeline of the online editing project. The value must be in JSON format. For more information about the parameter structure, see <a href="~~52839#07bc7fe0f2xuh~~">Timeline</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;cc3308ac59615a54328bc3443****&quot;},{&quot;MediaId&quot;:&quot;da87a9cff645cd88bc6d8326e4****&quot;}]}]}</p>
         */
        public Builder timeline(String timeline) {
            this.putQueryParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * <p>The title of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>editing project test</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom configurations, such as the callback configuration. The value must be a JSON string. For more information about the parameter structure, see <a href="~~86952#title_vz7_xzs_0c5~~">UserData</a>.</p>
         * <blockquote>
         * <p>The callback configurations take effect only after you specify an HTTP URL for receiving callback notifications and select the event types in the ApsaraVideo VOD console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Extend&quot;:{&quot;width&quot;:1280,&quot;id&quot;:&quot;028a8e56b1ebf6bb7afc74****&quot;,&quot;height&quot;:720},&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="https://example.aliyundoc.com/2016-08-15/proxy/httpcallback/testcallback/%22,%22CallbackType%22:%22http%22%7D%7D">https://example.aliyundoc.com/2016-08-15/proxy/httpcallback/testcallback/&quot;,&quot;CallbackType&quot;:&quot;http&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public ProduceEditingProjectVideoRequest build() {
            return new ProduceEditingProjectVideoRequest(this);
        } 

    } 

}
