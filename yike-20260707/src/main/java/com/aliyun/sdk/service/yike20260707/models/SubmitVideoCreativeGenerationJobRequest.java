// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoCreativeGenerationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoCreativeGenerationJobRequest</p>
 */
public class SubmitVideoCreativeGenerationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AspectRatio")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aspectRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarData")
    private String avatarData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputLanguages")
    private String outputLanguages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserMaterials")
    private String userMaterials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithSubtitles")
    private Boolean withSubtitles;

    private SubmitVideoCreativeGenerationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aspectRatio = builder.aspectRatio;
        this.avatarData = builder.avatarData;
        this.jobParams = builder.jobParams;
        this.outputLanguages = builder.outputLanguages;
        this.resolution = builder.resolution;
        this.sceneType = builder.sceneType;
        this.userData = builder.userData;
        this.userMaterials = builder.userMaterials;
        this.withSubtitles = builder.withSubtitles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoCreativeGenerationJobRequest create() {
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
     * @return aspectRatio
     */
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * @return avatarData
     */
    public String getAvatarData() {
        return this.avatarData;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return outputLanguages
     */
    public String getOutputLanguages() {
        return this.outputLanguages;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return userMaterials
     */
    public String getUserMaterials() {
        return this.userMaterials;
    }

    /**
     * @return withSubtitles
     */
    public Boolean getWithSubtitles() {
        return this.withSubtitles;
    }

    public static final class Builder extends Request.Builder<SubmitVideoCreativeGenerationJobRequest, Builder> {
        private String regionId; 
        private String aspectRatio; 
        private String avatarData; 
        private String jobParams; 
        private String outputLanguages; 
        private String resolution; 
        private String sceneType; 
        private String userData; 
        private String userMaterials; 
        private Boolean withSubtitles; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoCreativeGenerationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aspectRatio = request.aspectRatio;
            this.avatarData = request.avatarData;
            this.jobParams = request.jobParams;
            this.outputLanguages = request.outputLanguages;
            this.resolution = request.resolution;
            this.sceneType = request.sceneType;
            this.userData = request.userData;
            this.userMaterials = request.userMaterials;
            this.withSubtitles = request.withSubtitles;
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
         * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, and 3:4.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4:3</p>
         */
        public Builder aspectRatio(String aspectRatio) {
            this.putQueryParameter("AspectRatio", aspectRatio);
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * <p>The digital human information. The value is a JSON string. This parameter is required for the <code>creator-talk</code>, <code>creator-sales</code>, and <code>avatar-broadcast</code> scenes. It includes the following fields:</p>
         * <ul>
         * <li>AvatarPortrait: The digital human portrait. This field is required. The value is a string that represents the media asset ID of the portrait image or the image URL.</li>
         * <li>AvatarVoice: The digital human voice. This field is optional. The value is a string that represents the voice audio ID or the audio URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AvatarPortrait\&quot;:\&quot;xxxxxxx\&quot;,\&quot;AvatarVoice\&quot;:\&quot;<a href="https://ice-ai-saas.oss-cn-shanghai.aliyuncs.com/ice-ai-saas-prd/xxxxxxx%5C%5C%22%7D">https://ice-ai-saas.oss-cn-shanghai.aliyuncs.com/ice-ai-saas-prd/xxxxxxx\\&quot;}</a></p>
         */
        public Builder avatarData(String avatarData) {
            this.putQueryParameter("AvatarData", avatarData);
            this.avatarData = avatarData;
            return this;
        }

        /**
         * <p>The job parameters. The value is a JSON string. This parameter includes the following fields:</p>
         * <ul>
         * <li>TextType: The text type. This field is required. The value is an integer. Valid values: 1 (original draft, such as product or news information, which the system automatically converts into a voiceover script) and 2 (voiceover script).</li>
         * <li>TextContent: The text content. This field is required. The value is a string. The maximum length is 10,000 characters.</li>
         * <li>VoiceDuration: The expected voiceover duration. This field is optional. The value is an integer. This field is configured when TextType is set to 1. Unit: seconds. Default value: 60. The final video duration will be slightly shorter than the expected duration.</li>
         * <li>NarrationVoiceId: The narration voice ID. This field is valid only for the <code>briefing-voiceover</code> scene.</li>
         * <li>SceneImage: The scene image. This field is optional. This field takes effect only for the three creator marketing scenes (creator-sales, creator-talk, and product-showcase). If you specify valid fields for other scenes, an InvalidParameter error is returned. If both fields are empty (including not specified or an empty object {}), it is equivalent to not providing this parameter, and the behavior is consistent with the existing process without rejecting the job. The Prompt and BackgroundMediaId or BackgroundMediaUrl fields are both optional, can coexist, and are not mutually exclusive. If only Prompt is specified, the text mode is used to generate the scene image. If only the background image is specified, the background image mode is used to fuse based on the background image. If both are specified, the background image takes precedence. If both BackgroundMediaId and BackgroundMediaUrl are specified, BackgroundMediaUrl takes precedence. This field includes the following sub-fields:<ul>
         * <li>Prompt: The text description of the scene image. This field is optional. The value is a string. The maximum length is 2,000 characters. If the length exceeds the limit, an InvalidParameter error is returned. An empty string is considered as not provided.</li>
         * <li>BackgroundMediaId: The media asset ID of the background image. This field is optional. The value is a string. During submission, it is parsed into a URL by ice-media. If the parsing fails, the job is immediately rejected.</li>
         * <li>BackgroundMediaUrl: The direct URL of the background image. This field is optional. The value is a string. The URL must use the HTTP or HTTPS protocol. In this case, media asset parsing is not performed.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TextType&quot;:2,&quot;TextContent&quot;:&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....&quot;,&quot;SceneImage&quot;:{&quot;Prompt&quot;:&quot;Real-life scene of a modern minimalist home kitchen, built-in steam oven and under-counter water purifier, warm white soft lighting, light gray marble countertop with white cabinets, clean and transparent picture with a real life atmosphere, vertical screen composition&quot;,&quot;BackgroundMediaId&quot;:&quot;<Media asset ID>&quot;,&quot;BackgroundMediaUrl&quot;:&quot;<a href="https://example.com/bg.jpg%22%7D%7D">https://example.com/bg.jpg&quot;}}</a></p>
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The output languages. The value is a JSON array string. Valid values: CN, EN, and YUE. The <code>avatar-broadcast</code> and <code>creator-sales</code> scenes only support Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;CN\&quot;,\&quot;EN\&quot;,\&quot;YUE\&quot;]</p>
         */
        public Builder outputLanguages(String outputLanguages) {
            this.putQueryParameter("OutputLanguages", outputLanguages);
            this.outputLanguages = outputLanguages;
            return this;
        }

        /**
         * <p>The resolution. Valid values:</p>
         * <ul>
         * <li>1080P</li>
         * <li>720P (default)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>720P</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>The scene type. Valid values:</p>
         * <ul>
         * <li>briefing-voiceover: News broadcast (supplements video footage based on the voiceover or uses no digital human).</li>
         * <li>creator-talk: Creator explanation (multiple shots for news, science, or finance).</li>
         * <li>creator-sales: Creator product promotion (three-part structure for product promotion, reviews, or store visits).</li>
         * <li>avatar-broadcast: Digital human broadcast (fixed single shot for broadcasts, announcements, or templates).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>creator-sales</p>
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * <p>The custom parameters. The value is a JSON string. The value is returned as-is in query or callback results. The maximum length is 8,192 characters. System reserved words:</p>
         * <ul>
         * <li>NotifyAddress: The callback URL. The URL must use the HTTP or HTTPS protocol. The maximum length is 2,048 characters. The callback is triggered after the node reaches the desired state.</li>
         * <li>UserId: The UID of the actual resource ownership. If this field is missing, the system falls back to CallerUid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12374214127312673137132</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The list of user materials. The value is a JSON array string. This parameter includes the following fields:</p>
         * <ul>
         * <li>MediaId: The media asset ID. This is the ID of the image or video uploaded to the platform.</li>
         * <li>Type: The media type.</li>
         * <li>Action: The method of using the material. Valid values: <code>match</code> (matches suitable clips from the video material based on the voiceover) and <code>insert</code> (inserts the video material before the CTA shot. This is intelligently analyzed after shots are generated based on the voiceover. This value is valid only for videos). Default value: <code>match</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Type\&quot;:\&quot;video\&quot;,\&quot;MediaId\&quot;:\&quot;xxxxxxxx\&quot;,\&quot;Action\&quot;:\&quot;match\&quot;}]</p>
         */
        public Builder userMaterials(String userMaterials) {
            this.putQueryParameter("UserMaterials", userMaterials);
            this.userMaterials = userMaterials;
            return this;
        }

        /**
         * <p>Specifies whether to include subtitles. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withSubtitles(Boolean withSubtitles) {
            this.putQueryParameter("WithSubtitles", withSubtitles);
            this.withSubtitles = withSubtitles;
            return this;
        }

        @Override
        public SubmitVideoCreativeGenerationJobRequest build() {
            return new SubmitVideoCreativeGenerationJobRequest(this);
        } 

    } 

}
