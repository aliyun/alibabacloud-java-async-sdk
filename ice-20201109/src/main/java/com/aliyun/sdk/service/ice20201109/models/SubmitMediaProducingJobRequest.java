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
 * {@link SubmitMediaProducingJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaProducingJobRequest</p>
 */
public class SubmitMediaProducingJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClipsParam")
    private String clipsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditingProduceConfig")
    private String editingProduceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetadata")
    private String mediaMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputMediaConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputMediaConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputMediaTarget")
    private String outputMediaTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectMetadata")
    private String projectMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeline")
    private String timeline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitMediaProducingJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.clipsParam = builder.clipsParam;
        this.editingProduceConfig = builder.editingProduceConfig;
        this.mediaMetadata = builder.mediaMetadata;
        this.outputMediaConfig = builder.outputMediaConfig;
        this.outputMediaTarget = builder.outputMediaTarget;
        this.projectId = builder.projectId;
        this.projectMetadata = builder.projectMetadata;
        this.source = builder.source;
        this.templateId = builder.templateId;
        this.timeline = builder.timeline;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaProducingJobRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clipsParam
     */
    public String getClipsParam() {
        return this.clipsParam;
    }

    /**
     * @return editingProduceConfig
     */
    public String getEditingProduceConfig() {
        return this.editingProduceConfig;
    }

    /**
     * @return mediaMetadata
     */
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    /**
     * @return outputMediaConfig
     */
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    /**
     * @return outputMediaTarget
     */
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectMetadata
     */
    public String getProjectMetadata() {
        return this.projectMetadata;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return timeline
     */
    public String getTimeline() {
        return this.timeline;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitMediaProducingJobRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String clipsParam; 
        private String editingProduceConfig; 
        private String mediaMetadata; 
        private String outputMediaConfig; 
        private String outputMediaTarget; 
        private String projectId; 
        private String projectMetadata; 
        private String source; 
        private String templateId; 
        private String timeline; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaProducingJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.clipsParam = request.clipsParam;
            this.editingProduceConfig = request.editingProduceConfig;
            this.mediaMetadata = request.mediaMetadata;
            this.outputMediaConfig = request.outputMediaConfig;
            this.outputMediaTarget = request.outputMediaTarget;
            this.projectId = request.projectId;
            this.projectMetadata = request.projectMetadata;
            this.source = request.source;
            this.templateId = request.templateId;
            this.timeline = request.timeline;
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>12e8864746a0a398</strong></strong></p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The material parameters of the template, in the JSON format. If TemplateId is specified, ClipsParam must also be specified. For more information, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a> and <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</p>
         */
        public Builder clipsParam(String clipsParam) {
            this.putQueryParameter("ClipsParam", clipsParam);
            this.clipsParam = clipsParam;
            return this;
        }

        /**
         * <p>The parameters for editing and production. For more information, see <a href="https://help.aliyun.com/document_detail/357745.html">EditingProduceConfig</a>.</p>
         * <blockquote>
         * <p> If no thumbnail is specified in EditingProduceConfig, the first frame of the video is used as the thumbnail.</p>
         * </blockquote>
         * <ul>
         * <li>AutoRegisterInputVodMedia: specifies whether to automatically register the ApsaraVideo VOD media assets in your timeline with IMS. Default value: true.</li>
         * <li>OutputWebmTransparentChannel: specifies whether the output video contains alpha channels. Default value: false.</li>
         * <li>CoverConfig: the custom thumbnail parameters.</li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;AutoRegisterInputVodMedia&quot;: &quot;true&quot;,
         *       &quot;OutputWebmTransparentChannel&quot;: &quot;true&quot;
         * }</p>
         */
        public Builder editingProduceConfig(String editingProduceConfig) {
            this.putQueryParameter("EditingProduceConfig", editingProduceConfig);
            this.editingProduceConfig = editingProduceConfig;
            return this;
        }

        /**
         * <p>The metadata of the produced video, in the JSON format. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/357745.html">MediaMetadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Title&quot;:&quot;test-title&quot;,
         *       &quot;Tags&quot;:&quot;test-tags1,tags2&quot;
         * }</p>
         */
        public Builder mediaMetadata(String mediaMetadata) {
            this.putQueryParameter("MediaMetadata", mediaMetadata);
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        /**
         * <p>The configurations of the output file, in the JSON format. You can specify an OSS URL or a storage location in a storage bucket of ApsaraVideo VOD.</p>
         * <p>To store the output file in OSS, you must specify MediaURL. To store the output file in ApsaraVideo VOD, you must specify StorageLocation and FileName.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/357745.html">OutputMediaConfig</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MediaURL&quot;:&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4%22%7D">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4&quot;}</a></p>
         */
        public Builder outputMediaConfig(String outputMediaConfig) {
            this.putQueryParameter("OutputMediaConfig", outputMediaConfig);
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ul>
         * <li>oss-object: OSS object in an OSS bucket.</li>
         * <li>vod-media: media asset in ApsaraVideo VOD.</li>
         * <li>S3: output file based on the Amazon Simple Storage Service (S3) protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss-object</p>
         */
        public Builder outputMediaTarget(String outputMediaTarget) {
            this.putQueryParameter("OutputMediaTarget", outputMediaTarget);
            this.outputMediaTarget = outputMediaTarget;
            return this;
        }

        /**
         * <p>The ID of the editing project.</p>
         * <blockquote>
         * <p>: You must specify one of ProgectId, Timeline, and TempalteId and leave the other two parameters empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xxxxxfb2101cb318xxxxx</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The metadata of the editing project, in the JSON format. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/357745.html">ProjectMetadata</a>.</p>
         */
        public Builder projectMetadata(String projectMetadata) {
            this.putQueryParameter("ProjectMetadata", projectMetadata);
            this.projectMetadata = projectMetadata;
            return this;
        }

        /**
         * <p>The source of the editing and production request. Valid values:</p>
         * <ul>
         * <li>OpenAPI</li>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPENAPI</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The template ID. The template is used to build a timeline with ease.</p>
         * <blockquote>
         * <p>: You must specify one of ProgectId, Timeline, and TempalteId and leave the other two parameters empty. If TemplateId is specified, ClipsParam must also be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Timeline.
         */
        public Builder timeline(String timeline) {
            this.putBodyParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.com/xx%22,%22RegisterMediaNotifyAddress%22:%22https://xxx.com/xx%22%7D">https://xx.com/xx&quot;,&quot;RegisterMediaNotifyAddress&quot;:&quot;https://xxx.com/xx&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitMediaProducingJobRequest build() {
            return new SubmitMediaProducingJobRequest(this);
        } 

    } 

}
