// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVideoModerationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoModerationTaskRequest</p>
 */
public class CreateVideoModerationTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxFrames")
    private Long maxFrames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenes")
    private java.util.List < String > scenes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateVideoModerationTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.interval = builder.interval;
        this.maxFrames = builder.maxFrames;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.scenes = builder.scenes;
        this.sourceURI = builder.sourceURI;
        this.tags = builder.tags;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoModerationTaskRequest create() {
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
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return maxFrames
     */
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return scenes
     */
    public java.util.List < String > getScenes() {
        return this.scenes;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateVideoModerationTaskRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private Long interval; 
        private Long maxFrames; 
        private Notification notification; 
        private String projectName; 
        private java.util.List < String > scenes; 
        private String sourceURI; 
        private java.util.Map < String, ? > tags; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoModerationTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.interval = request.interval;
            this.maxFrames = request.maxFrames;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.scenes = request.scenes;
            this.sourceURI = request.sourceURI;
            this.tags = request.tags;
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
         * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The interval of capturing video frames. Unit: seconds. Valid values: 1 to 600. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The maximum number of frames that can be captured from the video. Valid values: 5 to 3600. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxFrames(Long maxFrames) {
            this.putQueryParameter("MaxFrames", maxFrames);
            this.maxFrames = maxFrames;
            return this;
        }

        /**
         * <p>The notification settings. For information about the asynchronous notification format, see the &quot;Metadata indexing&quot; section of the <a href="https://help.aliyun.com/document_detail/471456.html">Asynchronous message examples</a> topic.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
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
         * <p>The scenarios of video moderation.</p>
         */
        public Builder scenes(java.util.List < String > scenes) {
            String scenesShrink = shrink(scenes, "Scenes", "json");
            this.putQueryParameter("Scenes", scenesShrink);
            this.scenes = scenes;
            return this;
        }

        /**
         * <p>The OSS URI of the video.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The custom tags. The custom tags help you retrieve the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum length of the value is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateVideoModerationTaskRequest build() {
            return new CreateVideoModerationTaskRequest(this);
        } 

    } 

}
