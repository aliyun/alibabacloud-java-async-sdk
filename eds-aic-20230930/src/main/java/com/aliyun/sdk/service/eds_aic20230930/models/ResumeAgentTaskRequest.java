// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ResumeAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>ResumeAgentTaskRequest</p>
 */
public class ResumeAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalPrompt")
    private String additionalPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    private ResumeAgentTaskRequest(Builder builder) {
        super(builder);
        this.additionalPrompt = builder.additionalPrompt;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalPrompt
     */
    public String getAdditionalPrompt() {
        return this.additionalPrompt;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<ResumeAgentTaskRequest, Builder> {
        private String additionalPrompt; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(ResumeAgentTaskRequest request) {
            super(request);
            this.additionalPrompt = request.additionalPrompt;
            this.taskIds = request.taskIds;
        } 

        /**
         * AdditionalPrompt.
         */
        public Builder additionalPrompt(String additionalPrompt) {
            this.putQueryParameter("AdditionalPrompt", additionalPrompt);
            this.additionalPrompt = additionalPrompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public ResumeAgentTaskRequest build() {
            return new ResumeAgentTaskRequest(this);
        } 

    } 

}
