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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ????????????????????????????????????
         * <p>
         * 
         * Cover????????????????????????ips?????????????????????IP????????????
         * 
         * Append?????????IP??????????????????ips??????????????????IP?????????
         * 
         * Delete???Delete?????????IP??????????????????ips??????????????????IP?????????????????????????????????IP?????????
         */
        public Builder modifyMode(String modifyMode) {
            this.putBodyParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * ???????????????????????????PRIVATE???????????????PUBLIC??????????????????????????????whiteIpList??????????????????????????????
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * ???????????????????????????WORKER???Elasticsearch????????????KIBANA???Kibana???????????????????????????whiteIpList??????????????????????????????
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * ???????????????whiteIpGroup???????????????????????????????????????????????????????????????????????????????????????
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * ??????????????????whiteIpGroup?????????????????????????????????????????????
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
             * ???????????????????????????????????????whiteIpGroup??????????????????????????????
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ??????????????????IP????????????????????????whiteIpGroup??????????????????????????????
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * ip??????????????????
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
