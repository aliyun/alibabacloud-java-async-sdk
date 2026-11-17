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
 * {@link GetTenantMemoryConfigRequest} extends {@link RequestModel}
 *
 * <p>GetTenantMemoryConfigRequest</p>
 */
public class GetTenantMemoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentInstanceId")
    private String agentInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    private String agentProvider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    private GetTenantMemoryConfigRequest(Builder builder) {
        super(builder);
        this.agentInstanceId = builder.agentInstanceId;
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantMemoryConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentInstanceId
     */
    public String getAgentInstanceId() {
        return this.agentInstanceId;
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

    public static final class Builder extends Request.Builder<GetTenantMemoryConfigRequest, Builder> {
        private String agentInstanceId; 
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 

        private Builder() {
            super();
        } 

        private Builder(GetTenantMemoryConfigRequest request) {
            super(request);
            this.agentInstanceId = request.agentInstanceId;
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
        } 

        /**
         * <p>This parameter is not enabled. Do not specify this parameter. The current API operation queries tenant configurations by provider, business platform, and business type. The example is used to illustrate the field status.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A (not enabled)</p>
         */
        public Builder agentInstanceId(String agentInstanceId) {
            this.putBodyParameter("AgentInstanceId", agentInstanceId);
            this.agentInstanceId = agentInstanceId;
            return this;
        }

        /**
         * <p>The business platform to which the agent belongs. Specify the platform corresponding to the tenant memory configuration, such as the enterprise platform <code>ENTERPRISE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putBodyParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The agent provider. This parameter is used together with AgentPlatform and BizType to locate the memory configuration. You must use a configured business combination.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putBodyParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>The business type code. This parameter is used together with the provider and business platform. Common values include <code>1</code> (Enterprise Edition), <code>10</code> (Personal Edition), and <code>20</code> (Commercial Edition).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public GetTenantMemoryConfigRequest build() {
            return new GetTenantMemoryConfigRequest(this);
        } 

    } 

}
