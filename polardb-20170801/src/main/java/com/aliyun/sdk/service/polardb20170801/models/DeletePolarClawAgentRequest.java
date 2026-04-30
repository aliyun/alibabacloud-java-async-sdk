// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarClawAgentRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarClawAgentRequest</p>
 */
public class DeletePolarClawAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteFiles")
    private Boolean deleteFiles;

    private DeletePolarClawAgentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.deleteFiles = builder.deleteFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawAgentRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return deleteFiles
     */
    public Boolean getDeleteFiles() {
        return this.deleteFiles;
    }

    public static final class Builder extends Request.Builder<DeletePolarClawAgentRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private Boolean deleteFiles; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarClawAgentRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.deleteFiles = request.deleteFiles;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * DeleteFiles.
         */
        public Builder deleteFiles(Boolean deleteFiles) {
            this.putQueryParameter("DeleteFiles", deleteFiles);
            this.deleteFiles = deleteFiles;
            return this;
        }

        @Override
        public DeletePolarClawAgentRequest build() {
            return new DeletePolarClawAgentRequest(this);
        } 

    } 

}
