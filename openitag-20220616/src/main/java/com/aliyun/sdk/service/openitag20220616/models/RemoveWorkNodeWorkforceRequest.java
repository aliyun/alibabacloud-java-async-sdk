// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

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
 * {@link RemoveWorkNodeWorkforceRequest} extends {@link RequestModel}
 *
 * <p>RemoveWorkNodeWorkforceRequest</p>
 */
public class RemoveWorkNodeWorkforceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer workNodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List<Long> userIds;

    private RemoveWorkNodeWorkforceRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.workNodeId = builder.workNodeId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveWorkNodeWorkforceRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workNodeId
     */
    public Integer getWorkNodeId() {
        return this.workNodeId;
    }

    /**
     * @return userIds
     */
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<RemoveWorkNodeWorkforceRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private Integer workNodeId; 
        private java.util.List<Long> userIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveWorkNodeWorkforceRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.workNodeId = request.workNodeId;
            this.userIds = request.userIds;
        } 

        /**
         * <p>Tenant ID. For how to obtain the Tenant ID, see <a href="https://help.aliyun.com/document_detail/454649.html">ListTenants</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GA***W134</p>
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>Task ID. For how to obtain the Task ID, see <a href="https://help.aliyun.com/document_detail/454662.html">ListTasks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>154***518306500608</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Work node ID, workflow sequence starting from 0. For example, in Labeling-QC-Acceptance, Labeling is 0, QC is 1, and Acceptance is 2.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder workNodeId(Integer workNodeId) {
            this.putPathParameter("WorkNodeId", workNodeId);
            this.workNodeId = workNodeId;
            return this;
        }

        /**
         * <p>User IDs.</p>
         */
        public Builder userIds(java.util.List<Long> userIds) {
            this.putBodyParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public RemoveWorkNodeWorkforceRequest build() {
            return new RemoveWorkNodeWorkforceRequest(this);
        } 

    } 

}
