// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotFeedbackRequest} extends {@link RequestModel}
 *
 * <p>KopilotFeedbackRequest</p>
 */
public class KopilotFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TurnId")
    private String turnId;

    private KopilotFeedbackRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.feedback = builder.feedback;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.turnId = builder.turnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotFeedbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return turnId
     */
    public String getTurnId() {
        return this.turnId;
    }

    public static final class Builder extends Request.Builder<KopilotFeedbackRequest, Builder> {
        private String comment; 
        private String feedback; 
        private String regionId; 
        private String sessionId; 
        private String turnId; 

        private Builder() {
            super();
        } 

        private Builder(KopilotFeedbackRequest request) {
            super(request);
            this.comment = request.comment;
            this.feedback = request.feedback;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.turnId = request.turnId;
        } 

        /**
         * <p>The user feedback comment.</p>
         * 
         * <strong>example:</strong>
         * <p>good</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The user satisfaction level. Valid values:</p>
         * <ul>
         * <li>1: satisfied</li>
         * <li>-1: not satisfied</li>
         * <li>0: cancel the evaluation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e356c91c-8220-425c-9d86-********</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5243231*****</p>
         */
        public Builder turnId(String turnId) {
            this.putQueryParameter("TurnId", turnId);
            this.turnId = turnId;
            return this;
        }

        @Override
        public KopilotFeedbackRequest build() {
            return new KopilotFeedbackRequest(this);
        } 

    } 

}
