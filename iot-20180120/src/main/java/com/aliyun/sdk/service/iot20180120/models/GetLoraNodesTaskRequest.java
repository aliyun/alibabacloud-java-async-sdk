// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetLoraNodesTaskRequest} extends {@link RequestModel}
 *
 * <p>GetLoraNodesTaskRequest</p>
 */
public class GetLoraNodesTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The instance ID.</p>
         * <p>You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console. If your instance has an ID, you must specify this parameter. Otherwise, the request fails.</p>
         * <blockquote>
         * <p>The ID of a public instance may not be displayed on the Overview page. For more information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How do I obtain an instance ID?</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the task for creating the LoRaWAN devices. You can call the <a href="https://help.aliyun.com/document_detail/109299.html">CreateLoRaNodesTask</a> operation and obtain the task ID from the value of the <strong>TaskId</strong> response parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>623***</p>
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
