// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitSceneMediaSelectionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSceneMediaSelectionJobRequest</p>
 */
public class SubmitSceneMediaSelectionJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EditingConfig")
    private String editingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitSceneMediaSelectionJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.jobType = builder.jobType;
        this.outputConfig = builder.outputConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSceneMediaSelectionJobRequest create() {
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
     * @return editingConfig
     */
    public String getEditingConfig() {
        return this.editingConfig;
    }

    /**
     * @return inputConfig
     */
    public String getInputConfig() {
        return this.inputConfig;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitSceneMediaSelectionJobRequest, Builder> {
        private String regionId; 
        private String editingConfig; 
        private String inputConfig; 
        private String jobType; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSceneMediaSelectionJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.jobType = request.jobType;
            this.outputConfig = request.outputConfig;
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
         * <p>The editing configuration, which is the same as the EditingConfig parameter for the intelligent graphic matching and highlight mashup features of one-click video production.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Intelligent graphic matching parameter settings</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Highlight mashup parameter settings</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaConfig&quot;: {
         *       &quot;Volume&quot;: 0
         *   },
         *   &quot;SpeechConfig&quot;: {
         *       &quot;Volume&quot;: 1
         *   },
         *  &quot;BackgroundMusicConfig&quot;: {
         *       &quot;Volume&quot;: 0.3
         *   }
         * }</p>
         */
        public Builder editingConfig(String editingConfig) {
            this.putBodyParameter("EditingConfig", editingConfig);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * <p>The input configuration, which is the same as the InputConfig parameter for the intelligent graphic matching and highlight mashup features of one-click video production.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Intelligent graphic matching parameter settings</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Highlight mashup parameter settings</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;BackgroundMusic&quot;: &quot;<strong><strong>75c3936f3a8743850f2da942</strong></strong>&quot;,
         *     &quot;MediaArray&quot;: [
         *         &quot;<a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4</a>&quot;
         *     ],
         *     &quot;SpeechTextArray&quot;: [
         *         &quot;A new Hema Fresh store just opened at the mall nearby, and today is its grand opening.&quot;,
         *         &quot;There are quite a few people in the mall, and snacks and drinks are pretty affordable—come check it out!&quot;
         *     ]
         * }</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>Smart_Mix_Media_Select: intelligent matching material selection.</li>
         * <li>Screen_Media_Highlights_Media_Select: highlight mashup material selection.</li>
         * </ul>
         * <p>Differences between the two scenarios:</p>
         * <ul>
         * <li>Intelligent matching: You input voiceover scripts along with video and image materials. The system selects the most matching video and image materials based on the voiceover script content and returns the matching results. This scenario includes two sub-scenarios: general edition and film and television highlight edition. The general edition is suitable for daily general-purpose materials such as lifestyle, travel, and marketing. The film and television highlight edition is more suitable for plot-driven materials such as TV series and movies.</li>
         * <li>Highlight mashup: You input video materials (typically multi-episode short dramas). The system automatically selects appropriate highlight segments based on highlight definitions or storylines for subsequent mashup production.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Smart_Mix_Media_Select</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The output configuration, which is the same as the OutputConfig parameter for the intelligent graphic matching and highlight mashup features of one-click video production.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Intelligent graphic matching parameter settings</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Highlight mashup parameter settings</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaURL&quot;: &quot;<a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
         *   &quot;Count&quot;: 1,
         *   &quot;Width&quot;: 1080,
         *   &quot;Height&quot;: 1920
         * }</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>The user business and callback configurations. For more information about the structure, see <a href="~~357745#section-urj-v3f-0s1~~">UserData configuration</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSceneMediaSelectionJobRequest build() {
            return new SubmitSceneMediaSelectionJobRequest(this);
        } 

    } 

}
