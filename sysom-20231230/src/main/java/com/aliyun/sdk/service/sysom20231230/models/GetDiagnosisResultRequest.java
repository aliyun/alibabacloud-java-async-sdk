// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDiagnosisResultRequest} extends {@link RequestModel}
 *
 * <p>GetDiagnosisResultRequest</p>
 */
public class GetDiagnosisResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("task_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetDiagnosisResultRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosisResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetDiagnosisResultRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagnosisResultRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quzuYl23</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetDiagnosisResultRequest build() {
            return new GetDiagnosisResultRequest(this);
        } 

    } 

}
