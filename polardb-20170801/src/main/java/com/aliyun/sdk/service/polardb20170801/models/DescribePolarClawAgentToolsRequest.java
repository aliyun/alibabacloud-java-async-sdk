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
 * {@link DescribePolarClawAgentToolsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawAgentToolsRequest</p>
 */
public class DescribePolarClawAgentToolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludePlugins")
    private Boolean includePlugins;

    private DescribePolarClawAgentToolsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.includePlugins = builder.includePlugins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawAgentToolsRequest create() {
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
     * @return includePlugins
     */
    public Boolean getIncludePlugins() {
        return this.includePlugins;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawAgentToolsRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private Boolean includePlugins; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawAgentToolsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.includePlugins = request.includePlugins;
        } 

        /**
         * <p>Agent ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
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
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * IncludePlugins.
         */
        public Builder includePlugins(Boolean includePlugins) {
            this.putQueryParameter("IncludePlugins", includePlugins);
            this.includePlugins = includePlugins;
            return this;
        }

        @Override
        public DescribePolarClawAgentToolsRequest build() {
            return new DescribePolarClawAgentToolsRequest(this);
        } 

    } 

}
