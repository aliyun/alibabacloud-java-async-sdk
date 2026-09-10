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
 * {@link GetInnerConvertAsyncResultRequest} extends {@link RequestModel}
 *
 * <p>GetInnerConvertAsyncResultRequest</p>
 */
public class GetInnerConvertAsyncResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetInnerConvertAsyncResultRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInnerConvertAsyncResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetInnerConvertAsyncResultRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetInnerConvertAsyncResultRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID that uniquely identifies a task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetInnerConvertAsyncResultRequest build() {
            return new GetInnerConvertAsyncResultRequest(this);
        } 

    } 

}
