// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWorkNodeWorkforceRequest} extends {@link RequestModel}
 *
 * <p>AddWorkNodeWorkforceRequest</p>
 */
public class AddWorkNodeWorkforceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer workNodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List < Long > userIds;

    private AddWorkNodeWorkforceRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.workNodeId = builder.workNodeId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorkNodeWorkforceRequest create() {
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
    public Long getTaskId() {
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
    public java.util.List < Long > getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<AddWorkNodeWorkforceRequest, Builder> {
        private String tenantId; 
        private Long taskId; 
        private Integer workNodeId; 
        private java.util.List < Long > userIds; 

        private Builder() {
            super();
        } 

        private Builder(AddWorkNodeWorkforceRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.workNodeId = request.workNodeId;
            this.userIds = request.userIds;
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
        public Builder taskId(Long taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * WorkNodeId.
         */
        public Builder workNodeId(Integer workNodeId) {
            this.putPathParameter("WorkNodeId", workNodeId);
            this.workNodeId = workNodeId;
            return this;
        }

        /**
         * UserIds.
         */
        public Builder userIds(java.util.List < Long > userIds) {
            this.putBodyParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public AddWorkNodeWorkforceRequest build() {
            return new AddWorkNodeWorkforceRequest(this);
        } 

    } 

}
