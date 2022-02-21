// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyWhiteIpsRequest</p>
 */
public class ModifyWhiteIpsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("modifyMode")
    private String modifyMode;

    @Body
    @NameInMap("networkType")
    private String networkType;

    @Body
    @NameInMap("nodeType")
    private String nodeType;

    @Body
    @NameInMap("whiteIpGroup")
    private WhiteIpGroup whiteIpGroup;

    @Body
    @NameInMap("whiteIpList")
    private java.util.List < String > whiteIpList;

    @Query
    @NameInMap("clientToken")
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

        private Builder(ModifyWhiteIpsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.modifyMode = response.modifyMode;
            this.networkType = response.networkType;
            this.nodeType = response.nodeType;
            this.whiteIpGroup = response.whiteIpGroup;
            this.whiteIpList = response.whiteIpList;
            this.clientToken = response.clientToken;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 修改方式，取值含义如下：
         * <p>
         * 
         * Cover（默认值）：使用ips参数的值覆盖原IP白名单。
         * 
         * Append：在原IP白名单中增加ips参数中输入的IP地址。
         * 
         * Delete：Delete：在原IP白名单中删除ips参数中输入的IP地址，至少需要保留一个IP地址。
         */
        public Builder modifyMode(String modifyMode) {
            this.putBodyParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * 网络类型。可选值：PRIVATE（私网）、PUBLIC（公网）。如果选填了whiteIpList参数，则该参数必填。
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * 节点类型。可选值：WORKER（Elasticsearch集群）、KIBANA（Kibana集群）。如果选填了whiteIpList参数，则该参数必填。
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * 以白名单组whiteIpGroup传参方式，更新实例白名单安全配置。仅支持更新一个白名单组。
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * 白名单列表。whiteIpGroup为空时可用，更改默认分组白名单
         */
        public Builder whiteIpList(java.util.List < String > whiteIpList) {
            this.putBodyParameter("whiteIpList", whiteIpList);
            this.whiteIpList = whiteIpList;
            return this;
        }

        /**
         * clientToken.
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
        @NameInMap("groupName")
        private String groupName;

        @NameInMap("ips")
        private java.util.List < String > ips;

        @NameInMap("whiteIpType")
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
             * 白名单组的组名。如果选填了whiteIpGroup参数，则该参数必填。
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * 白名单组中的IP列表。如果选填了whiteIpGroup参数，则该参数必填。
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * ip白名单的类型
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
