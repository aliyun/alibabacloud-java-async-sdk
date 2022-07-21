// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoraNodesTaskRequest} extends {@link RequestModel}
 *
 * <p>GetLoraNodesTaskRequest</p>
 */
public class GetLoraNodesTaskRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetLoraNodesTaskRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoraNodesTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetLoraNodesTaskRequest, Builder> {
        private String iotInstanceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetLoraNodesTaskRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.taskId = request.taskId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
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
        public GetLoraNodesTaskRequest build() {
            return new GetLoraNodesTaskRequest(this);
        } 

    } 

}
