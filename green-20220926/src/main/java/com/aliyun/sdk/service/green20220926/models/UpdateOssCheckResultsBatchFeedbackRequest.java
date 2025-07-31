// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateOssCheckResultsBatchFeedbackRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssCheckResultsBatchFeedbackRequest</p>
 */
public class UpdateOssCheckResultsBatchFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Items")
    private String items;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTaskId")
    private String parentTaskId;

    private UpdateOssCheckResultsBatchFeedbackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.items = builder.items;
        this.parentTaskId = builder.parentTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCheckResultsBatchFeedbackRequest create() {
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
     * @return items
     */
    public String getItems() {
        return this.items;
    }

    /**
     * @return parentTaskId
     */
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public static final class Builder extends Request.Builder<UpdateOssCheckResultsBatchFeedbackRequest, Builder> {
        private String feedback; 
        private String items; 
        private String parentTaskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssCheckResultsBatchFeedbackRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.items = request.items;
            this.parentTaskId = request.parentTaskId;
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
         * Items.
         */
        public Builder items(String items) {
            this.putQueryParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * ParentTaskId.
         */
        public Builder parentTaskId(String parentTaskId) {
            this.putQueryParameter("ParentTaskId", parentTaskId);
            this.parentTaskId = parentTaskId;
            return this;
        }

        @Override
        public UpdateOssCheckResultsBatchFeedbackRequest build() {
            return new UpdateOssCheckResultsBatchFeedbackRequest(this);
        } 

    } 

}
