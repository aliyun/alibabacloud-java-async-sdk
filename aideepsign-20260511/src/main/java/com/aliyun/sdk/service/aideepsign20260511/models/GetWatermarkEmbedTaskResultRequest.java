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
 * {@link GetWatermarkEmbedTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetWatermarkEmbedTaskResultRequest</p>
 */
public class GetWatermarkEmbedTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetWatermarkEmbedTaskResultRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWatermarkEmbedTaskResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetWatermarkEmbedTaskResultRequest, Builder> {
        private String clientToken; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetWatermarkEmbedTaskResultRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.taskId = request.taskId;
        } 

        /**
         * <p>A reserved idempotency field. This field is not supported. Passing a value does not cause an error, but it does not produce an idempotency effect.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The invisible watermark task ID returned by the CreateWatermarkEmbedTask operation.</p>
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
        public GetWatermarkEmbedTaskResultRequest build() {
            return new GetWatermarkEmbedTaskResultRequest(this);
        } 

    } 

}
