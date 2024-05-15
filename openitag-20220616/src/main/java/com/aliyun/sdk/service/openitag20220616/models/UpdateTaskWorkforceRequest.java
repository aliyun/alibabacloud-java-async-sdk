// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskWorkforceRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskWorkforceRequest</p>
 */
public class UpdateTaskWorkforceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Workforce")
    private java.util.List < SimpleWorkforce > workforce;

    private UpdateTaskWorkforceRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.workforce = builder.workforce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskWorkforceRequest create() {
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
     * @return workforce
     */
    public java.util.List < SimpleWorkforce > getWorkforce() {
        return this.workforce;
    }

    public static final class Builder extends Request.Builder<UpdateTaskWorkforceRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private java.util.List < SimpleWorkforce > workforce; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskWorkforceRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.workforce = request.workforce;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Workforce.
         */
        public Builder workforce(java.util.List < SimpleWorkforce > workforce) {
            this.putBodyParameter("Workforce", workforce);
            this.workforce = workforce;
            return this;
        }

        @Override
        public UpdateTaskWorkforceRequest build() {
            return new UpdateTaskWorkforceRequest(this);
        } 

    } 

}
