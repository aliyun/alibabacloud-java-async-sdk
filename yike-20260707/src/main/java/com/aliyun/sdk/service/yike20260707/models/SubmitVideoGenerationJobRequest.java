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
 * {@link SubmitVideoGenerationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoGenerationJobRequest</p>
 */
public class SubmitVideoGenerationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AspectRatio")
    private String aspectRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobParameters")
    private String jobParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("N")
    private Integer n;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoGenerationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aspectRatio = builder.aspectRatio;
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
        this.input = builder.input;
        this.jobParameters = builder.jobParameters;
        this.jobType = builder.jobType;
        this.model = builder.model;
        this.n = builder.n;
        this.output = builder.output;
        this.resolution = builder.resolution;
        this.scene = builder.scene;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoGenerationJobRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return jobParameters
     */
    public String getJobParameters() {
        return this.jobParameters;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return n
     */
    public Integer getN() {
        return this.n;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitVideoGenerationJobRequest, Builder> {
        private String regionId; 
        private String aspectRatio; 
        private String clientToken; 
        private String duration; 
        private String input; 
        private String jobParameters; 
        private String jobType; 
        private String model; 
        private Integer n; 
        private String output; 
        private String resolution; 
        private String scene; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoGenerationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aspectRatio = request.aspectRatio;
            this.clientToken = request.clientToken;
            this.duration = request.duration;
            this.input = request.input;
            this.jobParameters = request.jobParameters;
            this.jobType = request.jobType;
            this.model = request.model;
            this.n = request.n;
            this.output = request.output;
            this.resolution = request.resolution;
            this.scene = request.scene;
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
         * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, 3:4, 1:1, and adaptive (valid only for wan3.0-video and wan3.0-video-prime).</p>
         * 
         * <strong>example:</strong>
         * <p>9:16</p>
         */
        public Builder aspectRatio(String aspectRatio) {
            this.putQueryParameter("AspectRatio", aspectRatio);
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * <p>The idempotency token. A unique, case-sensitive string of up to 32 characters. This token ensures that the request is completed no more than once, preventing duplicate operations caused by multiple retries.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The output duration. Valid values: 4 to 15 seconds. Default value: 5 seconds.</p>
         * <ul>
         * <li>For wan3.0-video and wan3.0-video-prime, the maximum value is 30 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The task input. This parameter is required. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li>Prompt: string. Required. The prompt.</li>
         * <li>Medias: the list of media items.<ul>
         * <li>If JobType is set to image_to_video, this field is required and only 1 media item is needed.</li>
         * <li>If JobType is set to first_last_frame, this field is required and exactly 2 media items are needed.</li>
         * <li>If JobType is set to reference_to_video, this field is required and up to 9 media items are allowed. For wan3.0-video and wan3.0-video-prime, up to 20 media items are allowed, including up to 10 images, 5 videos, and 5 audio files. The total duration of audio and video files cannot exceed 15 seconds.<blockquote>
         * <p>The Media structure contains the following fields: Type, the media type (string). Valid values: <code>image</code>, <code>video</code>, and <code>audio</code>. URL, the media download URL (string). MediaId, the media asset ID (string).</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Prompt&quot;:&quot;Person 1 dunks a basketball on the court using the move shown in image 2&quot;,&quot;Medias&quot;:[{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;<a href="https://xxx/xxx.jpg%22%7D,%7B%22Type%22:%22image%22,%22Url%22:%22https://xxx/xxx.jpg%22%7D%5D%7D">https://xxx/xxx.jpg&quot;},{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;https://xxx/xxx.jpg&quot;}]}</a></p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The task parameters as a JSON string that contains the following fields:</p>
         * <ul>
         * <li>EnableAudio: boolean. Optional. Specifies whether to include audio in the output. Valid values: true and false.</li>
         * <li>Watermark: boolean. Optional. Specifies whether to include a watermark. Valid values: true (an &quot;AI-generated&quot; watermark is added to the lower-right corner of the video) and false (no watermark is added).</li>
         * <li>PromptExtend: boolean. Optional. Specifies whether to enable intelligent prompt rewriting. This parameter is valid only for wan3.0-video and wan3.0-video-prime. Valid values: true (enabled, default) and false (disabled).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder jobParameters(String jobParameters) {
            this.putQueryParameter("JobParameters", jobParameters);
            this.jobParameters = jobParameters;
            return this;
        }

        /**
         * <p>The task type. This parameter is required. Valid values:</p>
         * <ul>
         * <li>text_to_video: text-to-video.</li>
         * <li>image_to_video: image-to-video.</li>
         * <li>first_last_frame: first and last frame to video.</li>
         * <li>reference_to_video: reference-to-video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_to_video</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The model name. This parameter is required. Valid values:</p>
         * <ul>
         * <li>wan3.0-video</li>
         * <li>wan3.0-video-prime</li>
         * <li>happyhorse-1.1</li>
         * <li>happyhorse-1.0</li>
         * <li>wan2.7</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>happyhorse-1.1</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The number of outputs. Valid values: 1 to 4. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder n(Integer n) {
            this.putQueryParameter("N", n);
            this.n = n;
            return this;
        }

        /**
         * <p>The output configuration as a JSON string. OssUri is an optional OSS output directory. If not specified, a signed URL for the service-generated output is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-translation/output/&quot;}</p>
         */
        public Builder output(String output) {
            this.putQueryParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * <p>The resolution. Valid values:</p>
         * <ul>
         * <li>1080P</li>
         * <li>720P: default value.</li>
         * <li>480P: valid only for wan3.0-video and wan3.0-video-prime.</li>
         * </ul>
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
         * <p>The scene type. Currently, only <code>general</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The custom user parameters as a JSON string. These parameters are returned as-is in the callback result. The system reserved field NotifyAddress specifies the callback URL. The system sends a callback to this URL when the task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoGenerationJobRequest build() {
            return new SubmitVideoGenerationJobRequest(this);
        } 

    } 

}
