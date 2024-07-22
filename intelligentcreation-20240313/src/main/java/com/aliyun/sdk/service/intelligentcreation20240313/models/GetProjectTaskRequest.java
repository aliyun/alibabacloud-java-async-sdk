// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectTaskRequest} extends {@link RequestModel}
 *
 * <p>GetProjectTaskRequest</p>
 */
public class GetProjectTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentId")
    private String idempotentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetProjectTaskRequest(Builder builder) {
        super(builder);
        this.idempotentId = builder.idempotentId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetProjectTaskRequest, Builder> {
        private String idempotentId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectTaskRequest request) {
            super(request);
            this.idempotentId = request.idempotentId;
            this.taskId = request.taskId;
        } 

        /**
         * IdempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putQueryParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetProjectTaskRequest build() {
            return new GetProjectTaskRequest(this);
        } 

    } 

}
