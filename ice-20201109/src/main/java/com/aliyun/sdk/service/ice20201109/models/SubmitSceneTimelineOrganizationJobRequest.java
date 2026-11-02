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
 * {@link SubmitSceneTimelineOrganizationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSceneTimelineOrganizationJobRequest</p>
 */
public class SubmitSceneTimelineOrganizationJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MediaSelectResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaSelectResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitSceneTimelineOrganizationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.jobType = builder.jobType;
        this.mediaSelectResult = builder.mediaSelectResult;
        this.outputConfig = builder.outputConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSceneTimelineOrganizationJobRequest create() {
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
     * @return mediaSelectResult
     */
    public String getMediaSelectResult() {
        return this.mediaSelectResult;
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

    public static final class Builder extends Request.Builder<SubmitSceneTimelineOrganizationJobRequest, Builder> {
        private String regionId; 
        private String editingConfig; 
        private String inputConfig; 
        private String jobType; 
        private String mediaSelectResult; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSceneTimelineOrganizationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.jobType = request.jobType;
            this.mediaSelectResult = request.mediaSelectResult;
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
         * <p>The editing configuration. This parameter is the same as the EditingConfig parameter for the one-click video generation intelligent graphic matching and high-energy mashup features.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Parameter settings for intelligent graphic matching</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Parameter settings for high-energy mashup</a>.</li>
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
         * <p>The input configuration. This parameter is the same as the InputConfig parameter for the one-click video generation intelligent graphic matching and high-energy mashup features.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Parameter settings for intelligent graphic matching</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Parameter settings for high-energy mashup</a>.</li>
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
         *         &quot;A new Hema Fresh store just opened at the mall nearby, and today is its grand opening.&quot;
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
         * <li>Smart_Mix_Timeline_Organize: intelligent matching timeline orchestration.</li>
         * <li>Screen_Media_Highlights_Timeline_Organize: high-energy mashup timeline orchestration.</li>
         * </ul>
         * <p>Differences between the two scenarios:</p>
         * <ul>
         * <li>Intelligent matching: automatically organizes one or more timelines for final videos based on the material selection results of the intelligent matching scenario (the matching results of voiceover scripts and materials). This scenario is mostly applicable to batch marketing and general mashup scenarios.</li>
         * <li>High-energy mashup: automatically organizes one or more timelines for final videos based on the material selection results of the high-energy mashup scenario (the selection results of high-energy clips). This scenario is mostly applicable to high-energy mashup scenarios for short dramas.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Smart_Mix_Timeline_Organize</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The material selection results. You can call SubmitSceneMediaSelectionJob to submit a material selection task and call GetBatchMediaProducingJob to obtain the selection results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;textMatchMediaOutputList&quot;: [{
         *         &quot;textMatchMediaSentenceOutputList&quot;: [{
         *                 &quot;duration&quot;: 3.366667,
         *                 &quot;matchClipList&quot;: [{
         *                     &quot;endTime&quot;: 11.16,
         *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
         *                     &quot;startTime&quot;: 8.04
         *                 }],
         *                 &quot;text&quot;: &quot;A new Hema Fresh store just opened at the mall nearby&quot;
         *             },
         *             {
         *                 &quot;duration&quot;: 1.566667,
         *                 &quot;matchClipList&quot;: [{
         *                     &quot;endTime&quot;: 1.54,
         *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
         *                     &quot;startTime&quot;: 0
         *                 }],
         *                 &quot;text&quot;: &quot;and today is its grand opening&quot;
         *             }
         *         ]
         *     }]
         * }</p>
         */
        public Builder mediaSelectResult(String mediaSelectResult) {
            this.putQueryParameter("MediaSelectResult", mediaSelectResult);
            this.mediaSelectResult = mediaSelectResult;
            return this;
        }

        /**
         * <p>The output configuration. This parameter is the same as the OutputConfig parameter for the one-click video generation intelligent graphic matching and high-energy mashup features.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Parameter settings for intelligent graphic matching</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Parameter settings for high-energy mashup</a>.</li>
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
         * <p>The user business and callback configurations. For more information about the structure, see <a href="~~357745#section-urj-v3f-0s1~~">UserData configuration instructions</a>.</p>
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
        public SubmitSceneTimelineOrganizationJobRequest build() {
            return new SubmitSceneTimelineOrganizationJobRequest(this);
        } 

    } 

}
