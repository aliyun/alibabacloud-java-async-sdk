// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetAiOutboundTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAiOutboundTaskDetailRequest</p>
 */
public class GetAiOutboundTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private GetAiOutboundTaskDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAiOutboundTaskDetailRequest, Builder> {
        private String instanceId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiOutboundTaskDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the Artificial Intelligence Cloud Call Service (AICCS) instance.
         * You can obtain the instance ID from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> operation and check the <strong>Data</strong> parameter in the response, or call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> operation and check the <strong>TaskId</strong> parameter in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAiOutboundTaskDetailRequest build() {
            return new GetAiOutboundTaskDetailRequest(this);
        } 

    } 

}
