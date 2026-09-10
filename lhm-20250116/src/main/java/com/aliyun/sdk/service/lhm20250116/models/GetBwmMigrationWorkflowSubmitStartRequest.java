// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetBwmMigrationWorkflowSubmitStartRequest} extends {@link RequestModel}
 *
 * <p>GetBwmMigrationWorkflowSubmitStartRequest</p>
 */
public class GetBwmMigrationWorkflowSubmitStartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetBwmMigrationWorkflowSubmitStartRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBwmMigrationWorkflowSubmitStartRequest create() {
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

    public static final class Builder extends Request.Builder<GetBwmMigrationWorkflowSubmitStartRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetBwmMigrationWorkflowSubmitStartRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The scheduling migration task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetBwmMigrationWorkflowSubmitStartRequest build() {
            return new GetBwmMigrationWorkflowSubmitStartRequest(this);
        } 

    } 

}
