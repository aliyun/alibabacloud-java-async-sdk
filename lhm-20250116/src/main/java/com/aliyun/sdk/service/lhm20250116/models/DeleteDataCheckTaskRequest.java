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
 * {@link DeleteDataCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataCheckTaskRequest</p>
 */
public class DeleteDataCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> taskIds;

    private DeleteDataCheckTaskRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataCheckTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIds
     */
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DeleteDataCheckTaskRequest, Builder> {
        private java.util.List<Long> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataCheckTaskRequest request) {
            super(request);
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>The list of task IDs. Batch deletion is supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<Long> taskIds) {
            this.putBodyParameter("taskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DeleteDataCheckTaskRequest build() {
            return new DeleteDataCheckTaskRequest(this);
        } 

    } 

}
