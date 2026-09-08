// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link AddFeedbackRequest} extends {@link RequestModel}
 *
 * <p>AddFeedbackRequest</p>
 */
public class AddFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rating")
    private Integer rating;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private AddFeedbackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.instanceId = builder.instanceId;
        this.rating = builder.rating;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFeedbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return rating
     */
    public Integer getRating() {
        return this.rating;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<AddFeedbackRequest, Builder> {
        private String feedback; 
        private String instanceId; 
        private Integer rating; 
        private String taskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(AddFeedbackRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.instanceId = request.instanceId;
            this.rating = request.rating;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The feedback provided by returning users.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;问题描述&quot;:&quot;客户询问沙发生产周期并尝试加快&quot;, &quot;客服方案&quot;:&quot;订单确认，建议联系在线客服&quot;, &quot;完成度判断&quot;:&quot;否&quot;}</p>
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Rating:</p>
         * <ul>
         * <li><p>thumbsDown: Thumbs down.</p>
         * </li>
         * <li><p>thumbsUp: Thumbs up.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>thumbsUp</p>
         */
        public Builder rating(Integer rating) {
            this.putQueryParameter("Rating", rating);
            this.rating = rating;
            return this;
        }

        /**
         * <p>AI task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f780ade8-****-458b-b067-63077946a570</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Task type.</p>
         * <ul>
         * <li><p>Abstract:fields (Field extraction)</p>
         * </li>
         * <li><p>Abstract:keywords (Hot keywords)</p>
         * </li>
         * <li><p>Abstract:title_summary (Summary)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Abstract:fields</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public AddFeedbackRequest build() {
            return new AddFeedbackRequest(this);
        } 

    } 

}
