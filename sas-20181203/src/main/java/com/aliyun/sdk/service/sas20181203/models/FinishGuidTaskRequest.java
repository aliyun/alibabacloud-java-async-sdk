// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link FinishGuidTaskRequest} extends {@link RequestModel}
 *
 * <p>FinishGuidTaskRequest</p>
 */
public class FinishGuidTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskTypeName;

    private FinishGuidTaskRequest(Builder builder) {
        super(builder);
        this.taskTypeName = builder.taskTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishGuidTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskTypeName
     */
    public String getTaskTypeName() {
        return this.taskTypeName;
    }

    public static final class Builder extends Request.Builder<FinishGuidTaskRequest, Builder> {
        private String taskTypeName; 

        private Builder() {
            super();
        } 

        private Builder(FinishGuidTaskRequest request) {
            super(request);
            this.taskTypeName = request.taskTypeName;
        } 

        /**
         * <p>The name of the task type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>guide_sub_task_config_add_collection</p>
         */
        public Builder taskTypeName(String taskTypeName) {
            this.putQueryParameter("TaskTypeName", taskTypeName);
            this.taskTypeName = taskTypeName;
            return this;
        }

        @Override
        public FinishGuidTaskRequest build() {
            return new FinishGuidTaskRequest(this);
        } 

    } 

}
