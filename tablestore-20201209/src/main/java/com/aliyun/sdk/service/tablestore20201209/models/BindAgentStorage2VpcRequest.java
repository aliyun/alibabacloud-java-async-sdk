// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link BindAgentStorage2VpcRequest} extends {@link RequestModel}
 *
 * <p>BindAgentStorage2VpcRequest</p>
 */
public class BindAgentStorage2VpcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageVpcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageVpcName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private BindAgentStorage2VpcRequest(Builder builder) {
        super(builder);
        this.agentStorageName = builder.agentStorageName;
        this.agentStorageVpcName = builder.agentStorageVpcName;
        this.virtualSwitchId = builder.virtualSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAgentStorage2VpcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    /**
     * @return agentStorageVpcName
     */
    public String getAgentStorageVpcName() {
        return this.agentStorageVpcName;
    }

    /**
     * @return virtualSwitchId
     */
    public String getVirtualSwitchId() {
        return this.virtualSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<BindAgentStorage2VpcRequest, Builder> {
        private String agentStorageName; 
        private String agentStorageVpcName; 
        private String virtualSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(BindAgentStorage2VpcRequest request) {
            super(request);
            this.agentStorageName = request.agentStorageName;
            this.agentStorageVpcName = request.agentStorageVpcName;
            this.virtualSwitchId = request.virtualSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-test</p>
         */
        public Builder agentStorageName(String agentStorageName) {
            this.putBodyParameter("AgentStorageName", agentStorageName);
            this.agentStorageName = agentStorageName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>remua</p>
         */
        public Builder agentStorageVpcName(String agentStorageVpcName) {
            this.putBodyParameter("AgentStorageVpcName", agentStorageVpcName);
            this.agentStorageVpcName = agentStorageVpcName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6***********ez6ge</p>
         */
        public Builder virtualSwitchId(String virtualSwitchId) {
            this.putBodyParameter("VirtualSwitchId", virtualSwitchId);
            this.virtualSwitchId = virtualSwitchId;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze***********g31n7</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public BindAgentStorage2VpcRequest build() {
            return new BindAgentStorage2VpcRequest(this);
        } 

    } 

}
