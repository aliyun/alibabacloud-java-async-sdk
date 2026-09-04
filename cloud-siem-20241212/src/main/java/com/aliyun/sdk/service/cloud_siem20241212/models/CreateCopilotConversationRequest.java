// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateCopilotConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateCopilotConversationRequest</p>
 */
public class CreateCopilotConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanMode")
    private String planMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThinkingMode")
    private String thinkingMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private CreateCopilotConversationRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.model = builder.model;
        this.planMode = builder.planMode;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.thinkingMode = builder.thinkingMode;
        this.title = builder.title;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCopilotConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return planMode
     */
    public String getPlanMode() {
        return this.planMode;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return thinkingMode
     */
    public String getThinkingMode() {
        return this.thinkingMode;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<CreateCopilotConversationRequest, Builder> {
        private String lang; 
        private String model; 
        private String planMode; 
        private String projectId; 
        private String regionId; 
        private String thinkingMode; 
        private String title; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCopilotConversationRequest request) {
            super(request);
            this.lang = request.lang;
            this.model = request.model;
            this.planMode = request.planMode;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.thinkingMode = request.thinkingMode;
            this.title = request.title;
            this.traceId = request.traceId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * PlanMode.
         */
        public Builder planMode(String planMode) {
            this.putBodyParameter("PlanMode", planMode);
            this.planMode = planMode;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ThinkingMode.
         */
        public Builder thinkingMode(String thinkingMode) {
            this.putBodyParameter("ThinkingMode", thinkingMode);
            this.thinkingMode = thinkingMode;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public CreateCopilotConversationRequest build() {
            return new CreateCopilotConversationRequest(this);
        } 

    } 

}
