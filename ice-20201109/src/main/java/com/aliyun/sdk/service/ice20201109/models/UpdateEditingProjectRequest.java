// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateEditingProjectRequest</p>
 */
public class UpdateEditingProjectRequest extends Request {
    @Query
    @NameInMap("BusinessStatus")
    private String businessStatus;

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
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Body
    @NameInMap("Timeline")
    private String timeline;

    @Query
    @NameInMap("Title")
    private String title;

    private UpdateEditingProjectRequest(Builder builder) {
        super(builder);
        this.businessStatus = builder.businessStatus;
        this.clipsParam = builder.clipsParam;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.projectId = builder.projectId;
        this.templateId = builder.templateId;
        this.timeline = builder.timeline;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEditingProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateEditingProjectRequest, Builder> {
        private String businessStatus; 
        private String clipsParam; 
        private String coverURL; 
        private String description; 
        private String projectId; 
        private String templateId; 
        private String timeline; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEditingProjectRequest request) {
            super(request);
            this.businessStatus = request.businessStatus;
            this.clipsParam = request.clipsParam;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.projectId = request.projectId;
            this.templateId = request.templateId;
            this.timeline = request.timeline;
            this.title = request.title;
        } 

        /**
         * BusinessStatus.
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public UpdateEditingProjectRequest build() {
            return new UpdateEditingProjectRequest(this);
        } 

    } 

}
