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
 * {@link UpdateEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateEditingProjectRequest</p>
 */
public class UpdateEditingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

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
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeline")
    private String timeline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
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
         * <p>The business status of the project. This parameter can be ignored for general editing projects. Valid values:</p>
         * <ul>
         * <li>Reserving</li>
         * <li>ReservationCanceled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reserving</p>
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * <p>The material parameter corresponding to the template, in the JSON format. If TemplateId is specified, ClipsParam must also be specified.</p>
         */
        public Builder clipsParam(String clipsParam) {
            this.putQueryParameter("ClipsParam", clipsParam);
            this.clipsParam = clipsParam;
            return this;
        }

        /**
         * <p>The thumbnail URL of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong>.com/6AB4D0E1E1C7446888</strong></strong>.png</p>
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * <p>The description of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>testtimeline001desciption</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the online editing project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>4ee4b97e27b525142a6b2</strong></strong></p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The template ID. This parameter is used to quickly build a timeline with ease. Note: Only one of ProjectId, Timeline, and TemplateId can be specified. If TemplateId is specified, ClipsParam must also be specified.</p>
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
         * <p>The title of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>testtimeline</p>
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
