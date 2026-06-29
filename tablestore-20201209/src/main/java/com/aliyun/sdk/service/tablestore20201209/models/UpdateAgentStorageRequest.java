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
 * {@link UpdateAgentStorageRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentStorageRequest</p>
 */
public class UpdateAgentStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageDescription")
    private String agentStorageDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkSourceACL")
    private java.util.List<String> networkSourceACL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkTypeACL")
    private java.util.List<String> networkTypeACL;

    private UpdateAgentStorageRequest(Builder builder) {
        super(builder);
        this.agentStorageDescription = builder.agentStorageDescription;
        this.agentStorageName = builder.agentStorageName;
        this.aliasName = builder.aliasName;
        this.network = builder.network;
        this.networkSourceACL = builder.networkSourceACL;
        this.networkTypeACL = builder.networkTypeACL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageDescription
     */
    public String getAgentStorageDescription() {
        return this.agentStorageDescription;
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    public static final class Builder extends Request.Builder<UpdateAgentStorageRequest, Builder> {
        private String agentStorageDescription; 
        private String agentStorageName; 
        private String aliasName; 
        private String network; 
        private java.util.List<String> networkSourceACL; 
        private java.util.List<String> networkTypeACL; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentStorageRequest request) {
            super(request);
            this.agentStorageDescription = request.agentStorageDescription;
            this.agentStorageName = request.agentStorageName;
            this.aliasName = request.aliasName;
            this.network = request.network;
            this.networkSourceACL = request.networkSourceACL;
            this.networkTypeACL = request.networkTypeACL;
        } 

        /**
         * <p>agent storage description</p>
         * 
         * <strong>example:</strong>
         * <p>description for agent storage</p>
         */
        public Builder agentStorageDescription(String agentStorageDescription) {
            this.putBodyParameter("AgentStorageDescription", agentStorageDescription);
            this.agentStorageDescription = agentStorageDescription;
            return this;
        }

        /**
         * <p>agent storage name</p>
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
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putBodyParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * NetworkSourceACL.
         */
        public Builder networkSourceACL(java.util.List<String> networkSourceACL) {
            this.putBodyParameter("NetworkSourceACL", networkSourceACL);
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * NetworkTypeACL.
         */
        public Builder networkTypeACL(java.util.List<String> networkTypeACL) {
            this.putBodyParameter("NetworkTypeACL", networkTypeACL);
            this.networkTypeACL = networkTypeACL;
            return this;
        }

        @Override
        public UpdateAgentStorageRequest build() {
            return new UpdateAgentStorageRequest(this);
        } 

    } 

}
