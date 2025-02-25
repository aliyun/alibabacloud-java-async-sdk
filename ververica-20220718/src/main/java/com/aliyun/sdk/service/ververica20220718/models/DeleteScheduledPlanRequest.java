// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link DeleteScheduledPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteScheduledPlanRequest</p>
 */
public class DeleteScheduledPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scheduledPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledPlanId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteScheduledPlanRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.scheduledPlanId = builder.scheduledPlanId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduledPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return scheduledPlanId
     */
    public String getScheduledPlanId() {
        return this.scheduledPlanId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteScheduledPlanRequest, Builder> {
        private String namespace; 
        private String scheduledPlanId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScheduledPlanRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.scheduledPlanId = request.scheduledPlanId;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f420c2e7-6d3f-4683-81d0-3ea8585*****</p>
         */
        public Builder scheduledPlanId(String scheduledPlanId) {
            this.putPathParameter("scheduledPlanId", scheduledPlanId);
            this.scheduledPlanId = scheduledPlanId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteScheduledPlanRequest build() {
            return new DeleteScheduledPlanRequest(this);
        } 

    } 

}
