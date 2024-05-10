// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyWhiteIpsRequest</p>
 */
public class ModifyWhiteIpsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkType")
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
    private WhiteIpGroup whiteIpGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whiteIpList")
    private java.util.List < String > whiteIpList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private ModifyWhiteIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modifyMode = builder.modifyMode;
        this.networkType = builder.networkType;
        this.nodeType = builder.nodeType;
        this.whiteIpGroup = builder.whiteIpGroup;
        this.whiteIpList = builder.whiteIpList;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWhiteIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return whiteIpGroup
     */
    public WhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    /**
     * @return whiteIpList
     */
    public java.util.List < String > getWhiteIpList() {
        return this.whiteIpList;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<ModifyWhiteIpsRequest, Builder> {
        private String instanceId; 
        private String modifyMode; 
        private String networkType; 
        private String nodeType; 
        private WhiteIpGroup whiteIpGroup; 
        private java.util.List < String > whiteIpList; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWhiteIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modifyMode = request.modifyMode;
            this.networkType = request.networkType;
            this.nodeType = request.nodeType;
            this.whiteIpGroup = request.whiteIpGroup;
            this.whiteIpList = request.whiteIpList;
            this.clientToken = request.clientToken;
        } 

        /**
         * The node type. This parameter is required if you configure the whiteIpList parameter. Valid values:
         * <p>
         * 
         * *   WORKER
         * *   KIBANA
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The information about the IP address whitelist that you want to update. You can specify only one whitelist.
         * <p>
         * 
         * > You cannot configure both the whiteIpList and whiteIpGroup parameters.
         */
        public Builder modifyMode(String modifyMode) {
            this.putBodyParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.
         * <p>
         * 
         * > You cannot configure both the whiteIpList and whiteIpGroup parameters.
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * The IP addresses in the whitelist. This parameter is required if you configure the whiteIpGroup parameter.
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * The name of the whitelist. This parameter is required if you configure the whiteIpGroup parameter.
         */
        public Builder whiteIpList(java.util.List < String > whiteIpList) {
            this.putBodyParameter("whiteIpList", whiteIpList);
            this.whiteIpList = whiteIpList;
            return this;
        }

        /**
         * The network type. This parameter is required if you configure the whiteIpList parameter. Valid values:
         * <p>
         * 
         * *   PRIVATE
         * *   PUBLIC
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public ModifyWhiteIpsRequest build() {
            return new ModifyWhiteIpsRequest(this);
        } 

    } 

    public static class WhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List < String > ips;

        @com.aliyun.core.annotation.NameInMap("whiteIpType")
        private String whiteIpType;

        private WhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.whiteIpType = builder.whiteIpType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroup create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return whiteIpType
         */
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 
            private String whiteIpType; 

            /**
             * The type of the IP address whitelist. Valid values:
             * <p>
             * 
             * *   PRIVATE_KIBANA
             * *   PRIVATE_ES
             * *   PUBLIC_ES
             * *   PUBLIC_KIBANA
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The returned result.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder whiteIpType(String whiteIpType) {
                this.whiteIpType = whiteIpType;
                return this;
            }

            public WhiteIpGroup build() {
                return new WhiteIpGroup(this);
            } 

        } 

    }
}
