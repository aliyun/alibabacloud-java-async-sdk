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
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchId")
    private String branchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

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
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return branchId
     */
    public String getBranchId() {
        return this.branchId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<QueryAiVoiceAgentDetailNewRequest, Builder> {
        private String agentId; 
        private String branchId; 
        private String versionId; 

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
         * <p>The agent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234***5678</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The branch ID. If this parameter is left empty, the currently active branch is automatically used.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder branchId(String branchId) {
            this.putQueryParameter("BranchId", branchId);
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The version ID. If this parameter is left empty, the latest published version of the corresponding branch is used. This parameter must be used together with BranchId.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder versionId(String versionId) {
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
