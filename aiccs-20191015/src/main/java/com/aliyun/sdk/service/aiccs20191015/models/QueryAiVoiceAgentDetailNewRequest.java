// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiVoiceAgentDetailNewRequest} extends {@link RequestModel}
 *
 * <p>QueryAiVoiceAgentDetailNewRequest</p>
 */
public class QueryAiVoiceAgentDetailNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private Long agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchId")
    private Long branchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private Long versionId;

    private QueryAiVoiceAgentDetailNewRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.branchId = builder.branchId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiVoiceAgentDetailNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * @return branchId
     */
    public Long getBranchId() {
        return this.branchId;
    }

    /**
     * @return versionId
     */
    public Long getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<QueryAiVoiceAgentDetailNewRequest, Builder> {
        private Long agentId; 
        private Long branchId; 
        private Long versionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAiVoiceAgentDetailNewRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.branchId = request.branchId;
            this.versionId = request.versionId;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * BranchId.
         */
        public Builder branchId(Long branchId) {
            this.putQueryParameter("BranchId", branchId);
            this.branchId = branchId;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(Long versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public QueryAiVoiceAgentDetailNewRequest build() {
            return new QueryAiVoiceAgentDetailNewRequest(this);
        } 

    } 

}
