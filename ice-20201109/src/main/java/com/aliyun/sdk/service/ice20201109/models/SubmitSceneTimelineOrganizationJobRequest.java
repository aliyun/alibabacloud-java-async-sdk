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
         * <p>The editing configuration. Its structure depends on the value of JobType.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
         * <p>The input configuration. Its structure and required fields depend on the value of JobType.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
         *         &quot;A new Freshippo store just opened in the nearby mall. Today is the grand opening.&quot;
         *     ]
         * }</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The job type. Valid values:</p>
         * <ul>
         * <li>Smart_Mix_Timeline_Organize: Image-text matching.</li>
         * <li>Screen_Media_Highlights_Timeline_Organize: Highlight mashup.</li>
         * </ul>
         * <p>Differences:</p>
         * <ul>
         * <li>Image-text matching: Arranges a timeline based on the results of matching a voiceover script to media assets. Ideal for bulk marketing videos and general-purpose montages.</li>
         * <li>Highlight mashup: Arranges a timeline based on the results of highlight clip selection. Ideal for creating action-packed highlight reels from short-form dramas.</li>
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
         * <p>The media selection results from a previously run SubmitSceneMediaSelectionJob. You can retrieve this result by calling GetBatchMediaProducingJob.</p>
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
         *                 &quot;text&quot;: &quot;A new Freshippo store just opened in the nearby mall&quot;
         *             },
         *             {
         *                 &quot;duration&quot;: 1.566667,
         *                 &quot;matchClipList&quot;: [{
         *                     &quot;endTime&quot;: 1.54,
         *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
         *                     &quot;startTime&quot;: 0
         *                 }],
         *                 &quot;text&quot;: &quot;Today is the grand opening&quot;
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
         * <p>The output configuration. Its structure and required fields depend on the value of JobType.</p>
         * <ul>
         * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
         * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
         * <p>The user-defined data, including the business and callback configurations. For more information, see <a href="~~357745#section-urj-v3f-0s1~~">UserData</a>.</p>
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
