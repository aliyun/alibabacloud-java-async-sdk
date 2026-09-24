// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
    private java.util.List<String> whiteIpList;

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
    public java.util.List<String> getWhiteIpList() {
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
        private java.util.List<String> whiteIpList; 
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-0pp1jxvcl000z****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The modification mode. Valid values:</p>
         * <ul>
         * <li>Cover (default): Overwrites the original IP whitelist with the value of the ips parameter.</li>
         * <li>Append: Adds the IP addresses specified in the ips parameter to the original IP whitelist.</li>
         * <li>Delete: Removes the IP addresses specified in the ips parameter from the original IP whitelist. At least one IP address must be retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putBodyParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The network type. This parameter is required if whiteIpList is specified. Valid values:</p>
         * <ul>
         * <li>PRIVATE: private network.</li>
         * <li>PUBLIC: public network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The node type. This parameter is required if whiteIpList is specified. Valid values:</p>
         * <ul>
         * <li>WORKER: Elasticsearch cluster.</li>
         * <li>KIBANA: Kibana cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>Updates the instance whitelist configuration by using the whitelist group method. Only one whitelist group can be updated at a time.</p>
         * <blockquote>
         * <p>Notice: You cannot configure whiteIpList and whiteIpGroup at the same time.</p>
         * </blockquote>
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * <p>The IP address whitelist. This parameter is available when whiteIpGroup is empty and updates the default group whitelist.</p>
         */
        public Builder whiteIpList(java.util.List<String> whiteIpList) {
            this.putBodyParameter("whiteIpList", whiteIpList);
            this.whiteIpList = whiteIpList;
            return this;
        }

        /**
         * <p>A unique token generated by the client to guarantee the idempotency of the request. The maximum length is 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
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

    /**
     * 
     * {@link ModifyWhiteIpsRequest} extends {@link TeaModel}
     *
     * <p>ModifyWhiteIpsRequest</p>
     */
    public static class WhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

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
        public java.util.List<String> getIps() {
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
            private java.util.List<String> ips; 
            private String whiteIpType; 

            private Builder() {
            } 

            private Builder(WhiteIpGroup model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
                this.whiteIpType = model.whiteIpType;
            } 

            /**
             * <p>The name of the whitelist group. This parameter is required if whiteIpGroup is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The list of IP addresses in the whitelist group. This parameter is required if whiteIpGroup is specified.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The type of the IP whitelist. Valid values:</p>
             * <ul>
             * <li>PRIVATE_KIBANA: Kibana private access whitelist.</li>
             * <li>PRIVATE_ES: Elasticsearch private access whitelist.</li>
             * <li>PUBLIC_ES: Elasticsearch public access whitelist.</li>
             * <li>PUBLIC_KIBANA: Kibana public access whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE_ES</p>
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
