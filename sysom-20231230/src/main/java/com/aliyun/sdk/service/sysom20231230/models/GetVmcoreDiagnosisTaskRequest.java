// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetVmcoreDiagnosisTaskRequest} extends {@link RequestModel}
 *
 * <p>GetVmcoreDiagnosisTaskRequest</p>
 */
public class GetVmcoreDiagnosisTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetVmcoreDiagnosisTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmcoreDiagnosisTaskRequest create() {
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

    public static final class Builder extends Request.Builder<GetVmcoreDiagnosisTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetVmcoreDiagnosisTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetVmcoreDiagnosisTaskRequest build() {
            return new GetVmcoreDiagnosisTaskRequest(this);
        } 

    } 

}
