// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link GetImageDefectDetectionTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetImageDefectDetectionTaskResultRequest</p>
 */
public class GetImageDefectDetectionTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetImageDefectDetectionTaskResultRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDefectDetectionTaskResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetImageDefectDetectionTaskResultRequest, Builder> {
        private String clientToken; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageDefectDetectionTaskResultRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The idempotency parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The task ID returned by <code>CreateImageDefectDetectionTask</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetImageDefectDetectionTaskResultRequest build() {
            return new GetImageDefectDetectionTaskResultRequest(this);
        } 

    } 

}
