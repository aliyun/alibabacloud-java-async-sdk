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
         * Feedback.
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
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
         * Rating.
         */
        public Builder rating(Integer rating) {
            this.putQueryParameter("Rating", rating);
            this.rating = rating;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
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
