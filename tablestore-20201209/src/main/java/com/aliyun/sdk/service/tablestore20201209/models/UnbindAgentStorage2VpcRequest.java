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
 * {@link UnbindAgentStorage2VpcRequest} extends {@link RequestModel}
 *
 * <p>UnbindAgentStorage2VpcRequest</p>
 */
public class UnbindAgentStorage2VpcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageVpcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageVpcName;

    private UnbindAgentStorage2VpcRequest(Builder builder) {
        super(builder);
        this.agentStorageName = builder.agentStorageName;
        this.agentStorageVpcName = builder.agentStorageVpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAgentStorage2VpcRequest create() {
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

    public static final class Builder extends Request.Builder<UnbindAgentStorage2VpcRequest, Builder> {
        private String agentStorageName; 
        private String agentStorageVpcName; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAgentStorage2VpcRequest request) {
            super(request);
            this.agentStorageName = request.agentStorageName;
            this.agentStorageVpcName = request.agentStorageVpcName;
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

        @Override
        public UnbindAgentStorage2VpcRequest build() {
            return new UnbindAgentStorage2VpcRequest(this);
        } 

    } 

}
