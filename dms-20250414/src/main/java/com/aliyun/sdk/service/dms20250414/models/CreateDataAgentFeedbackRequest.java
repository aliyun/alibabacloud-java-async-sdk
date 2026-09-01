// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateDataAgentFeedbackRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentFeedbackRequest</p>
 */
public class CreateDataAgentFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeedbackContent")
    private String feedbackContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeedbackType")
    private String feedbackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LikeValue")
    private Integer likeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDataAgentFeedbackRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.feedbackContent = builder.feedbackContent;
        this.feedbackType = builder.feedbackType;
        this.likeValue = builder.likeValue;
        this.sessionId = builder.sessionId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentFeedbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return feedbackContent
     */
    public String getFeedbackContent() {
        return this.feedbackContent;
    }

    /**
     * @return feedbackType
     */
    public String getFeedbackType() {
        return this.feedbackType;
    }

    /**
     * @return likeValue
     */
    public Integer getLikeValue() {
        return this.likeValue;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDataAgentFeedbackRequest, Builder> {
        private String DMSUnit; 
        private String feedbackContent; 
        private String feedbackType; 
        private Integer likeValue; 
        private String sessionId; 
        private String targetId; 
        private String targetType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentFeedbackRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.feedbackContent = request.feedbackContent;
            this.feedbackType = request.feedbackType;
            this.likeValue = request.likeValue;
            this.sessionId = request.sessionId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * FeedbackContent.
         */
        public Builder feedbackContent(String feedbackContent) {
            this.putQueryParameter("FeedbackContent", feedbackContent);
            this.feedbackContent = feedbackContent;
            return this;
        }

        /**
         * FeedbackType.
         */
        public Builder feedbackType(String feedbackType) {
            this.putQueryParameter("FeedbackType", feedbackType);
            this.feedbackType = feedbackType;
            return this;
        }

        /**
         * LikeValue.
         */
        public Builder likeValue(Integer likeValue) {
            this.putQueryParameter("LikeValue", likeValue);
            this.likeValue = likeValue;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TargetId.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDataAgentFeedbackRequest build() {
            return new CreateDataAgentFeedbackRequest(this);
        } 

    } 

}
