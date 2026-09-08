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
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The feedback content. You can directly enter the feedback content, or pass a JSON string for the issue report scenario as shown in the example. The feedback_type field corresponds to the issue type, user_feedback corresponds to the issue description, email corresponds to the contact email address, and is_authorized indicates whether to authorize log access for troubleshooting.</p>
         * <p>feedback_type issue types. Valid values:</p>
         * <ul>
         * <li><strong>ANALYSIS_RESULT_INACCURATE</strong>: Inaccurate analysis result.</li>
         * <li><strong>RUNTIME_ERROR</strong>: Runtime error.</li>
         * <li><strong>REPORT_EXCEPTION</strong>: Report exception.</li>
         * <li><strong>SLOW_RESPONSE</strong>: Slow response.</li>
         * <li><strong>PRODUCT_SUGGESTION</strong>: Product suggestion.</li>
         * <li><strong>OTHER</strong>: Other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;feedback_type&quot;:&quot;PRODUCT_SUGGESTION&quot;,&quot;user_feedback&quot;: &quot;test&quot;,&quot;email&quot;:&quot;<a href="mailto:yourname@example.com">yourname@example.com</a>&quot;,&quot;is_authorized&quot;:&quot;Y&quot;}</p>
         */
        public Builder feedbackContent(String feedbackContent) {
            this.putQueryParameter("FeedbackContent", feedbackContent);
            this.feedbackContent = feedbackContent;
            return this;
        }

        /**
         * <p>The feedback type. Valid values:</p>
         * <ul>
         * <li><strong>ISSUE_REPORT</strong>: issue report.</li>
         * <li><strong>CANCEL_CHAT</strong>: task cancellation.</li>
         * <li><strong>LIKE</strong>: like.</li>
         * <li><strong>DISLIKE</strong>: dislike.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE_REPORT</p>
         */
        public Builder feedbackType(String feedbackType) {
            this.putQueryParameter("FeedbackType", feedbackType);
            this.feedbackType = feedbackType;
            return this;
        }

        /**
         * <p>The like value. This parameter is used only for like and dislike scenarios. Do not pass this parameter for other scenarios. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: like.</li>
         * <li><strong>-1</strong>: dislike.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder likeValue(Integer likeValue) {
            this.putQueryParameter("LikeValue", likeValue);
            this.likeValue = likeValue;
            return this;
        }

        /**
         * <p>The agent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>h8r********4fch</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The feedback target ID.</p>
         * <ul>
         * <li>For issue reports, use SessionId + underscore + random UUID.</li>
         * <li>For other feedback types, pass the checkpoint of the current SSE message stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h8r********4fch_sdesfews</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The feedback target. Valid values:</p>
         * <ul>
         * <li><strong>SESSION</strong>: session (used for issue reports).</li>
         * <li><strong>CHAT</strong>: chat (used for task cancellation).</li>
         * <li><strong>REPORT</strong>: report.</li>
         * <li><strong>PLAN</strong>: execution plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SESSION</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>56kv1pvl9uvt9**********bb</p>
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
