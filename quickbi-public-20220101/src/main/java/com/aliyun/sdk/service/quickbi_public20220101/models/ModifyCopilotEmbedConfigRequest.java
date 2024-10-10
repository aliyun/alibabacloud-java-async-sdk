// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCopilotEmbedConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyCopilotEmbedConfigRequest</p>
 */
public class ModifyCopilotEmbedConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CopilotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String copilotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRange")
    private String dataRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    private ModifyCopilotEmbedConfigRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.copilotId = builder.copilotId;
        this.dataRange = builder.dataRange;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCopilotEmbedConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return copilotId
     */
    public String getCopilotId() {
        return this.copilotId;
    }

    /**
     * @return dataRange
     */
    public String getDataRange() {
        return this.dataRange;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    public static final class Builder extends Request.Builder<ModifyCopilotEmbedConfigRequest, Builder> {
        private String agentName; 
        private String copilotId; 
        private String dataRange; 
        private String moduleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCopilotEmbedConfigRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.copilotId = request.copilotId;
            this.dataRange = request.dataRange;
            this.moduleName = request.moduleName;
        } 

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccd3428c-dd2xxxxxxxxxxxxdffee</p>
         */
        public Builder copilotId(String copilotId) {
            this.putQueryParameter("CopilotId", copilotId);
            this.copilotId = copilotId;
            return this;
        }

        /**
         * DataRange.
         */
        public Builder dataRange(String dataRange) {
            this.putQueryParameter("DataRange", dataRange);
            this.dataRange = dataRange;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        @Override
        public ModifyCopilotEmbedConfigRequest build() {
            return new ModifyCopilotEmbedConfigRequest(this);
        } 

    } 

}
