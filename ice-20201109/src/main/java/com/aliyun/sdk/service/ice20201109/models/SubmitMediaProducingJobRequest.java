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
         * <p>Ensures the idempotence of the request. You can generate a parameter value from your client to ensure that the parameter value is unique across different requests. ClientToken only supports ASCII characters and cannot exceed 64 characters.</p>
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
         * <p>The material parameters corresponding to the template, in JSON format. When TemplateId is not empty, ClipsParam cannot be empty. For the specific format, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use common templates</a> and <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>See the template usage documentation</p>
         */
        public Builder clipsParam(String clipsParam) {
            this.putQueryParameter("ClipsParam", clipsParam);
            this.clipsParam = clipsParam;
            return this;
        }

        /**
         * <p>The editing and producing parameters. For configuration details, see <a href="~~357745#section-8a4-pb2-hkv~~">EditingProduceConfig parameter details</a>.</p>
         * <blockquote>
         * <p>If no cover image is configured in EditingProduceConfig, the first frame of the video is used as the cover by default.</p>
         * </blockquote>
         * <ul>
         * <li><p>AutoRegisterInputVodMedia: specifies whether to automatically register the VOD media assets in your timeline to IMS. Default value: true.</p>
         * </li>
         * <li><p>OutputWebmTransparentChannel: specifies whether to output the video with a transparent channel. Default value: false.</p>
         * </li>
         * <li><p>CoverConfig: the custom cover image parameters.</p>
         * </li>
         * <li><p>...</p>
         * </li>
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
         * <p>The metadata of the produced video, in JSON format. For the specific structure definition, see <a href="~~357745#97ff26d0e3c28~~">MediaMetadata</a>.</p>
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
         * <p>The target configuration of the output product, in JSON format. You can set the URL of the output product in OSS or the storage location in the VOD bucket.</p>
         * <ul>
         * <li>When the output is to OSS, the MediaURL parameter of the output target is required.</li>
         * <li>When the output is to VOD, the StorageLocation and FileName parameters are required.</li>
         * </ul>
         * <p><a href="~~357745#title-4j6-ve7-g31~~">OutputMediaConfig parameter examples</a>.</p>
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
         * <p>The target type of the output product. Valid values:</p>
         * <ul>
         * <li><p>oss-object: an OSS object in an Alibaba Cloud OSS bucket.</p>
         * </li>
         * <li><p>vod-media: a media asset in Alibaba Cloud VOD.</p>
         * </li>
         * <li><p>S3: output based on the S3 protocol.</p>
         * </li>
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
         * <p>The ID of the editing project. You can call the <a href="https://help.aliyun.com/document_detail/441137.html">CreateEditingProject</a> operation to create an editing project and obtain the ProjectId parameter to submit an editing task.</p>
         * <blockquote>
         * <p>Notice: You must specify one of the ProjectId, Timeline, and TemplateId parameters, and leave the other two parameters empty.</notice></p>
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
         * <p>The metadata information of the editing project, in JSON format. For the specific structure definition, see <a href="~~357745#title-yvp-81k-wff~~">ProjectMetadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Description&quot;:&quot;Edited video description&quot;,&quot;Title&quot;:&quot;Editing title test&quot;}</p>
         */
        public Builder projectMetadata(String projectMetadata) {
            this.putQueryParameter("ProjectMetadata", projectMetadata);
            this.projectMetadata = projectMetadata;
            return this;
        }

        /**
         * <p>The source of the editing and producing request. Valid values:</p>
         * <ul>
         * <li><p>OpenAPI: direct API requests.</p>
         * </li>
         * <li><p>AliyunConsole: requests from the Alibaba Cloud Management Console.</p>
         * </li>
         * <li><p>WebSDK: requests from frontend pages integrated with WebSDK.</p>
         * </li>
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
         * <p>The ID of the template. This parameter is used to quickly build a timeline with a low threshold. Video editing based on common templates and advanced templates is supported.</p>
         * <ul>
         * <li><p>When you use a template ID to submit a media editing and producing job, you must provide the ClipsParam parameter to flexibly adjust or replace materials in the template.</p>
         * </li>
         * <li><p>You can invoke the <a href="https://help.aliyun.com/document_detail/441164.html">GetTemplate</a> operation to obtain template information.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: You must specify one of the ProjectId, Timeline, and TemplateId parameters, and leave the other two parameters empty.</p>
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
         * <p>The timeline of the cloud editing task. When you need to arrange materials and design special effects based on video ideas, you can manually construct the Timeline parameter.</p>
         * <ul>
         * <li>A timeline mainly includes three types of objects: tracks, materials, and effects. For more information, see <a href="https://help.aliyun.com/document_detail/198823.html">Timeline configurations</a>.</li>
         * <li>For more timeline configuration examples, see <a href="https://help.aliyun.com/document_detail/2766669.html">Best practices</a>.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: You must specify one of the ProjectId, Timeline, and TemplateId parameters, and leave the other two parameters empty.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        public Builder timeline(String timeline) {
            this.putBodyParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * <p>The custom settings, in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Task completion callback configurations</a> are supported. Parameters:</p>
         * <ul>
         * <li>NotifyAddress: the callback URL for task completion.</li>
         * <li>RegisterMediaNotifyAddress: the callback URL for the completion of produced media asset analysis.</li>
         * </ul>
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
