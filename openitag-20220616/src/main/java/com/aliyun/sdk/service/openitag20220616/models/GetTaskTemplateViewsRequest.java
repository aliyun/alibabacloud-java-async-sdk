// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskTemplateViewsRequest} extends {@link RequestModel}
 *
 * <p>GetTaskTemplateViewsRequest</p>
 */
public class GetTaskTemplateViewsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetTaskTemplateViewsRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskTemplateViewsRequest create() {
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

    public static final class Builder extends Request.Builder<GetTaskTemplateViewsRequest, Builder> {
        private String tenantId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskTemplateViewsRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
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

        @Override
        public GetTaskTemplateViewsRequest build() {
            return new GetTaskTemplateViewsRequest(this);
        } 

    } 

}
