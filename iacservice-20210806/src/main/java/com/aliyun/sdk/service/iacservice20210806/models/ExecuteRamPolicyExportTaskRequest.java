// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ExecuteRamPolicyExportTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecuteRamPolicyExportTaskRequest</p>
 */
public class ExecuteRamPolicyExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramPolicyExportTaskId;

    private ExecuteRamPolicyExportTaskRequest(Builder builder) {
        super(builder);
        this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteRamPolicyExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ramPolicyExportTaskId
     */
    public String getRamPolicyExportTaskId() {
        return this.ramPolicyExportTaskId;
    }

    public static final class Builder extends Request.Builder<ExecuteRamPolicyExportTaskRequest, Builder> {
        private String ramPolicyExportTaskId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteRamPolicyExportTaskRequest request) {
            super(request);
            this.ramPolicyExportTaskId = request.ramPolicyExportTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rpe-43ffe1402e77e95092</p>
         */
        public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.putPathParameter("ramPolicyExportTaskId", ramPolicyExportTaskId);
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }

        @Override
        public ExecuteRamPolicyExportTaskRequest build() {
            return new ExecuteRamPolicyExportTaskRequest(this);
        } 

    } 

}
