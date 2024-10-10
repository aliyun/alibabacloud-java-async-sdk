// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResult4QueryInstancePrice4ModifyRequest} extends {@link RequestModel}
 *
 * <p>GetResult4QueryInstancePrice4ModifyRequest</p>
 */
public class GetResult4QueryInstancePrice4ModifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetResult4QueryInstancePrice4ModifyRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResult4QueryInstancePrice4ModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetResult4QueryInstancePrice4ModifyRequest, Builder> {
        private String applicationId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetResult4QueryInstancePrice4ModifyRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.taskId = request.taskId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>58d5d8c5b5489150417a7cd6caa614bb</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetResult4QueryInstancePrice4ModifyRequest build() {
            return new GetResult4QueryInstancePrice4ModifyRequest(this);
        } 

    } 

}
