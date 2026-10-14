// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateOptimizeRunRequest} extends {@link RequestModel}
 *
 * <p>UpdateOptimizeRunRequest</p>
 */
public class UpdateOptimizeRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeRunId")
    private String optimizeRunId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, ?> extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateOptimizeRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.optimizeTaskName = builder.optimizeTaskName;
        this.optimizeRunId = builder.optimizeRunId;
        this.extra = builder.extra;
        this.status = builder.status;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOptimizeRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    /**
     * @return optimizeRunId
     */
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateOptimizeRunRequest, Builder> {
        private String agentSpace; 
        private String optimizeTaskName; 
        private String optimizeRunId; 
        private java.util.Map<String, ?> extra; 
        private String status; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOptimizeRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.optimizeTaskName = request.optimizeTaskName;
            this.optimizeRunId = request.optimizeRunId;
            this.extra = request.extra;
            this.status = request.status;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The name of the AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the optimization task.</p>
         * 
         * <strong>example:</strong>
         * <p>efficiency-analysis</p>
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.putPathParameter("optimizeTaskName", optimizeTaskName);
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        /**
         * <p>The ID of the execution instance.</p>
         * 
         * <strong>example:</strong>
         * <p>or-20260812-0001</p>
         */
        public Builder optimizeRunId(String optimizeRunId) {
            this.putPathParameter("optimizeRunId", optimizeRunId);
            this.optimizeRunId = optimizeRunId;
            return this;
        }

        /**
         * <p>The extra parameters. To retry a failed artifact application, set application.action to retry and do not specify status. Do not specify this field when canceling a run.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;application&quot;:{&quot;action&quot;:&quot;retry&quot;}}</p>
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The status. Only Cancelled is supported when canceling a run. The execution status is maintained by the server. Do not specify this field when retrying an artifact application.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateOptimizeRunRequest build() {
            return new UpdateOptimizeRunRequest(this);
        } 

    } 

}
