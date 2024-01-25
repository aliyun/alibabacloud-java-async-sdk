// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMessageStatusRequest</p>
 */
public class GetMessageStatusRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetMessageStatusRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetMessageStatusRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageStatusRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMessageStatusRequest build() {
            return new GetMessageStatusRequest(this);
        } 

    } 

}
