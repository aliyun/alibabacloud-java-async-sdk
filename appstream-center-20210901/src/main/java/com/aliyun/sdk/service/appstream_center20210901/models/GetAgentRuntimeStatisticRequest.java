// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetAgentRuntimeStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetAgentRuntimeStatisticRequest</p>
 */
public class GetAgentRuntimeStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeType;

    private GetAgentRuntimeStatisticRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
        this.runtimeType = builder.runtimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentRuntimeStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public static final class Builder extends Request.Builder<GetAgentRuntimeStatisticRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 
        private String runtimeType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentRuntimeStatisticRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
            this.runtimeType = request.runtimeType;
        } 

        /**
         * <p>The agent platform, which is used to filter the statistical scope, such as ENTERPRISE_AGENTIC_COMPUTER. If this parameter is not specified, all agent platforms are included in the statistics. If an unsupported value is specified, a parameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The agent provider, which is used to filter the statistical scope, such as AgenticComputer. If this parameter is not specified, all agent providers are included in the statistics. If an unsupported value is specified, a parameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AgenticComputer</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>The business type, which is used to filter runtimes of a specified business type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The runtime environment type of the runtime resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder runtimeType(String runtimeType) {
            this.putQueryParameter("RuntimeType", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        @Override
        public GetAgentRuntimeStatisticRequest build() {
            return new GetAgentRuntimeStatisticRequest(this);
        } 

    } 

}
