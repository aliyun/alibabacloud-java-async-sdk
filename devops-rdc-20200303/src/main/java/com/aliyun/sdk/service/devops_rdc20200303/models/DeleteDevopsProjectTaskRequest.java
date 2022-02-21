// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsProjectTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevopsProjectTaskRequest</p>
 */
public class DeleteDevopsProjectTaskRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DeleteDevopsProjectTaskRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevopsProjectTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteDevopsProjectTaskRequest, Builder> {
        private String orgId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevopsProjectTaskRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.taskId = response.taskId;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteDevopsProjectTaskRequest build() {
            return new DeleteDevopsProjectTaskRequest(this);
        } 

    } 

}
