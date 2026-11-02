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
 * {@link CreateEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateEditingProjectRequest</p>
 */
public class CreateEditingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessConfig")
    private String businessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClipsParam")
    private String clipsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialMaps")
    private String materialMaps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectType")
    private String projectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeline")
    private String timeline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateEditingProjectRequest(Builder builder) {
        super(builder);
        this.businessConfig = builder.businessConfig;
        this.clipsParam = builder.clipsParam;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.materialMaps = builder.materialMaps;
        this.projectType = builder.projectType;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
        this.timeline = builder.timeline;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEditingProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessConfig
     */
    public String getBusinessConfig() {
        return this.businessConfig;
    }

    /**
     * @return clipsParam
     */
    public String getClipsParam() {
        return this.clipsParam;
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
     * @return materialMaps
     */
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    /**
     * @return projectType
     */
    public String getProjectType() {
        return this.projectType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
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

    public static final class Builder extends Request.Builder<CreateEditingProjectRequest, Builder> {
        private String businessConfig; 
        private String clipsParam; 
        private String coverURL; 
        private String description; 
        private String materialMaps; 
        private String projectType; 
        private String templateId; 
        private String templateType; 
        private String timeline; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateEditingProjectRequest request) {
            super(request);
            this.businessConfig = request.businessConfig;
            this.clipsParam = request.clipsParam;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.materialMaps = request.materialMaps;
            this.projectType = request.projectType;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
            this.timeline = request.timeline;
            this.title = request.title;
        } 

        /**
         * <p>The business configuration of the project. You can ignore this parameter for standard editing projects.</p>
         * <ul>
         * <li><p>If the project is a live streaming editing project, OutputMediaConfig.StorageLocation is required.</p>
         * </li>
         * <li><p>If OutputMediaConfig.Path is not specified, the produced live streaming clips are stored in the root directory by default. </p>
         * </li>
         * <li><p>OutputMediaTarget can be set to vod-media or oss-object. If not specified, the default value is oss-object.</p>
         * </li>
         * <li><p>If OutputMediaTarget is set to vod-media, the Path parameter does not take effect.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;OutputMediaConfig&quot; : { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot; }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
         */
        public Builder businessConfig(String businessConfig) {
            this.putQueryParameter("BusinessConfig", businessConfig);
            this.businessConfig = businessConfig;
            return this;
        }

        /**
         * <p>The material parameters for the template in JSON format. If TemplateId is specified, ClipsParam must also be specified. For more information about the format, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use standard templates</a> and <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>See the template documentation</p>
         */
        public Builder clipsParam(String clipsParam) {
            this.putQueryParameter("ClipsParam", clipsParam);
            this.clipsParam = clipsParam;
            return this;
        }

        /**
         * <p>The cover of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/example.png">https://example.com/example.png</a></p>
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * <p>The description of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The materials associated with the project. Separate multiple material IDs with commas (,). You can associate up to 10 material IDs of each type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;video&quot;:&quot;<em><strong><strong>2e057304fcd9b145c5cafc</strong></strong></em>&quot;, &quot;image&quot;:&quot;<strong><strong>8021a8d493da643c8acd98</strong></strong>*,<em><strong><strong>cb6307a4edea614d8b3f3c</strong></strong></em>&quot;, &quot;liveStream&quot;: &quot;[{\&quot;appName\&quot;:\&quot;testrecord\&quot;,\&quot;domainName\&quot;:\&quot;test.alivecdn.com\&quot;,\&quot;liveUrl\&quot;:\&quot;rtmp://test.alivecdn.com/testrecord/teststream\&quot;,\&quot;streamName\&quot;:\&quot;teststream\&quot;}]&quot;, &quot;editingProject&quot;: &quot;<em><strong><strong>9b145c5cafc2e057304fcd</strong></strong></em>&quot;}</p>
         */
        public Builder materialMaps(String materialMaps) {
            this.putQueryParameter("MaterialMaps", materialMaps);
            this.materialMaps = materialMaps;
            return this;
        }

        /**
         * <p>The type of the editing project.</p>
         * <ul>
         * <li><p>EditingProject: standard editing project.</p>
         * </li>
         * <li><p>LiveEditingProject: live streaming editing project.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LiveEditingProject</p>
         */
        public Builder projectType(String projectType) {
            this.putQueryParameter("ProjectType", projectType);
            this.projectType = projectType;
            return this;
        }

        /**
         * <p>The template ID. You can use a template to quickly build a timeline.</p>
         * <blockquote>
         * <p>Notice: You must specify either Timeline or TemplateId, but not both. If TemplateId is specified, ClipsParam must also be specified.</p>
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
         * <p>The templatetype. This parameter is required when you create a cloud editing project based on a template. Default value: Timeline.
         * Valid values:</p>
         * <ul>
         * <li>Timeline: standard template.</li>
         * <li>VETemplate: advanced template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The timeline of the cloud editing project in JSON format.</p>
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
         * <p>The title of the cloud editing project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateEditingProjectRequest build() {
            return new CreateEditingProjectRequest(this);
        } 

    } 

}
