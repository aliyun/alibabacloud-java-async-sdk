// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubtaskRequest} extends {@link RequestModel}
 *
 * <p>GetSubtaskRequest</p>
 */
public class GetSubtaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subtaskId;

    private GetSubtaskRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskID = builder.taskID;
        this.subtaskId = builder.subtaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubtaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskID
     */
    public String getTaskID() {
        return this.taskID;
    }

    /**
     * @return subtaskId
     */
    public String getSubtaskId() {
        return this.subtaskId;
    }

    public static final class Builder extends Request.Builder<GetSubtaskRequest, Builder> {
        private String tenantId; 
        private String taskID; 
        private String subtaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubtaskRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskID = request.taskID;
            this.subtaskId = request.subtaskId;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TaskID.
         */
        public Builder taskID(String taskID) {
            this.putPathParameter("TaskID", taskID);
            this.taskID = taskID;
            return this;
        }

        /**
         * SubtaskId.
         */
        public Builder subtaskId(String subtaskId) {
            this.putPathParameter("SubtaskId", subtaskId);
            this.subtaskId = subtaskId;
            return this;
        }

        @Override
        public GetSubtaskRequest build() {
            return new GetSubtaskRequest(this);
        } 

    } 

}
