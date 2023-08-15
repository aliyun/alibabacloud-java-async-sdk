// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalAgentRequest} extends {@link RequestModel}
 *
 * <p>DescribeExternalAgentRequest</p>
 */
public class DescribeExternalAgentRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("AgentMode")
    private String agentMode;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private DescribeExternalAgentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.agentMode = builder.agentMode;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExternalAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return agentMode
     */
    public String getAgentMode() {
        return this.agentMode;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<DescribeExternalAgentRequest, Builder> {
        private String clusterId; 
        private String agentMode; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExternalAgentRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.agentMode = request.agentMode;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * AgentMode.
         */
        public Builder agentMode(String agentMode) {
            this.putQueryParameter("AgentMode", agentMode);
            this.agentMode = agentMode;
            return this;
        }

        /**
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public DescribeExternalAgentRequest build() {
            return new DescribeExternalAgentRequest(this);
        } 

    } 

}
