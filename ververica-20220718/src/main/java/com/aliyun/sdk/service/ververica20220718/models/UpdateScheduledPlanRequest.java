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
 * {@link UpdateScheduledPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateScheduledPlanRequest</p>
 */
public class UpdateScheduledPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scheduledPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ScheduledPlan body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private UpdateScheduledPlanRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.scheduledPlanId = builder.scheduledPlanId;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScheduledPlanRequest create() {
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
     * @return body
     */
    public ScheduledPlan getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdateScheduledPlanRequest, Builder> {
        private String namespace; 
        private String scheduledPlanId; 
        private ScheduledPlan body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScheduledPlanRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.scheduledPlanId = request.scheduledPlanId;
            this.body = request.body;
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
         * body.
         */
        public Builder body(ScheduledPlan body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
        public UpdateScheduledPlanRequest build() {
            return new UpdateScheduledPlanRequest(this);
        } 

    } 

}
