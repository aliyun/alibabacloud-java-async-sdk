// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTaskFlowStatusRequest} extends {@link RequestModel}
 *
 * <p>ListDevopsProjectTaskFlowStatusRequest</p>
 */
public class ListDevopsProjectTaskFlowStatusRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("TaskFlowId")
    @Validation(required = true)
    private String taskFlowId;

    private ListDevopsProjectTaskFlowStatusRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.taskFlowId = builder.taskFlowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectTaskFlowStatusRequest create() {
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
     * @return taskFlowId
     */
    public String getTaskFlowId() {
        return this.taskFlowId;
    }

    public static final class Builder extends Request.Builder<ListDevopsProjectTaskFlowStatusRequest, Builder> {
        private String orgId; 
        private String taskFlowId; 

        private Builder() {
            super();
        } 

        private Builder(ListDevopsProjectTaskFlowStatusRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.taskFlowId = response.taskFlowId;
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
         * TaskFlowId.
         */
        public Builder taskFlowId(String taskFlowId) {
            this.putBodyParameter("TaskFlowId", taskFlowId);
            this.taskFlowId = taskFlowId;
            return this;
        }

        @Override
        public ListDevopsProjectTaskFlowStatusRequest build() {
            return new ListDevopsProjectTaskFlowStatusRequest(this);
        } 

    } 

}
