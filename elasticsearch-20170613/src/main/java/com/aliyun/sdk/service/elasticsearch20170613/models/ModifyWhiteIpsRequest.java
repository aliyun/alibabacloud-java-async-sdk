// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
         * <p>The node type. This parameter is required if you configure the whiteIpList parameter. Valid values:</p>
         * <ul>
         * <li>WORKER</li>
         * <li>KIBANA</li>
         * </ul>
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
         * <p>The information about the IP address whitelist that you want to update. You can specify only one whitelist.</p>
         * <blockquote>
         * <p>You cannot configure both the whiteIpList and whiteIpGroup parameters.</p>
         * </blockquote>
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
         * <p>The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
         * <blockquote>
         * <p>You cannot configure both the whiteIpList and whiteIpGroup parameters.</p>
         * </blockquote>
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
         * <p>The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
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
         * <p>The IP addresses in the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * <p>The name of the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
         */
        public Builder whiteIpList(java.util.List < String > whiteIpList) {
            this.putBodyParameter("whiteIpList", whiteIpList);
            this.whiteIpList = whiteIpList;
            return this;
        }

        /**
         * <p>The network type. This parameter is required if you configure the whiteIpList parameter. Valid values:</p>
         * <ul>
         * <li>PRIVATE</li>
         * <li>PUBLIC</li>
         * </ul>
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
             * <p>The type of the IP address whitelist. Valid values:</p>
             * <ul>
             * <li>PRIVATE_KIBANA</li>
             * <li>PRIVATE_ES</li>
             * <li>PUBLIC_ES</li>
             * <li>PUBLIC_KIBANA</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The returned result.</p>
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The request ID.</p>
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
