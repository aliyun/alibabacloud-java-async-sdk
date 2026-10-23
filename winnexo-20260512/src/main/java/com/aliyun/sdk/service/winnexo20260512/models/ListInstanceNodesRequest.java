// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListInstanceNodesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceNodesRequest</p>
 */
public class ListInstanceNodesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListInstanceNodesRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListInstanceNodesRequest, Builder> {
        private String collaborationGroupId; 
        private String instanceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceNodesRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The collaboration workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The physical workflow instance ID (planId).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListInstanceNodesRequest build() {
            return new ListInstanceNodesRequest(this);
        } 

    } 

}
