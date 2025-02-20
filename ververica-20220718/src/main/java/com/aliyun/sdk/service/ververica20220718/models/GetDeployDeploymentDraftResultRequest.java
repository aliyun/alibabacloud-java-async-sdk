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
 * {@link GetDeployDeploymentDraftResultRequest} extends {@link RequestModel}
 *
 * <p>GetDeployDeploymentDraftResultRequest</p>
 */
public class GetDeployDeploymentDraftResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ticketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetDeployDeploymentDraftResultRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.ticketId = builder.ticketId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeployDeploymentDraftResultRequest create() {
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
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetDeployDeploymentDraftResultRequest, Builder> {
        private String namespace; 
        private String ticketId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetDeployDeploymentDraftResultRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.ticketId = request.ticketId;
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
         * <p>88a8fc49-e090-430a-85d8-3ee8c79c****</p>
         */
        public Builder ticketId(String ticketId) {
            this.putPathParameter("ticketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>710d6a64d8****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetDeployDeploymentDraftResultRequest build() {
            return new GetDeployDeploymentDraftResultRequest(this);
        } 

    } 

}
