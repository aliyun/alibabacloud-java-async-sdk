// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateEditingProjectRequest</p>
 */
public class CreateEditingProjectRequest extends Request {
    @Query
    @NameInMap("BusinessConfig")
    private String businessConfig;

    @Query
    @NameInMap("ClipsParam")
    private String clipsParam;

    @Query
    @NameInMap("CoverURL")
    private String coverURL;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("MaterialMaps")
    private String materialMaps;

    @Query
    @NameInMap("ProjectType")
    private String projectType;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    @Body
    @NameInMap("Timeline")
    private String timeline;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
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
         * BusinessConfig.
         */
        public Builder businessConfig(String businessConfig) {
            this.putQueryParameter("BusinessConfig", businessConfig);
            this.businessConfig = businessConfig;
            return this;
        }

        /**
         * ClipsParam.
         */
        public Builder clipsParam(String clipsParam) {
            this.putQueryParameter("ClipsParam", clipsParam);
            this.clipsParam = clipsParam;
            return this;
        }

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MaterialMaps.
         */
        public Builder materialMaps(String materialMaps) {
            this.putQueryParameter("MaterialMaps", materialMaps);
            this.materialMaps = materialMaps;
            return this;
        }

        /**
         * ProjectType.
         */
        public Builder projectType(String projectType) {
            this.putQueryParameter("ProjectType", projectType);
            this.projectType = projectType;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
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
         * Title.
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
