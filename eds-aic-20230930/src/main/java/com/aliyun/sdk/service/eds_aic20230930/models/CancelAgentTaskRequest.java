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
 * {@link CancelAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelAgentTaskRequest</p>
 */
public class CancelAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    private CancelAgentTaskRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<CancelAgentTaskRequest, Builder> {
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(CancelAgentTaskRequest request) {
            super(request);
            this.taskIds = request.taskIds;
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
        public CancelAgentTaskRequest build() {
            return new CancelAgentTaskRequest(this);
        } 

    } 

}
