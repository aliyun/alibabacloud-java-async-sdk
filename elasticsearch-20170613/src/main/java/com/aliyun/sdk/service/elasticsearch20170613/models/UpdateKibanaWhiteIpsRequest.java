// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKibanaWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>UpdateKibanaWhiteIpsRequest</p>
 */
public class UpdateKibanaWhiteIpsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("kibanaIPWhitelist")
    private java.util.List < String > kibanaIPWhitelist;

    @Body
    @NameInMap("whiteIpGroup")
    private WhiteIpGroup whiteIpGroup;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("modifyMode")
    private String modifyMode;

    private UpdateKibanaWhiteIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
        this.whiteIpGroup = builder.whiteIpGroup;
        this.clientToken = builder.clientToken;
        this.modifyMode = builder.modifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaWhiteIpsRequest create() {
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
     * @return kibanaIPWhitelist
     */
    public java.util.List < String > getKibanaIPWhitelist() {
        return this.kibanaIPWhitelist;
    }

    /**
     * @return whiteIpGroup
     */
    public WhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    public static final class Builder extends Request.Builder<UpdateKibanaWhiteIpsRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > kibanaIPWhitelist; 
        private WhiteIpGroup whiteIpGroup; 
        private String clientToken; 
        private String modifyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKibanaWhiteIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.kibanaIPWhitelist = request.kibanaIPWhitelist;
            this.whiteIpGroup = request.whiteIpGroup;
            this.clientToken = request.clientToken;
            this.modifyMode = request.modifyMode;
        } 

        /**
         * es-cn-tl329rbpc0001\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * kibana节点IP访问白名单。不可与分组同时设置。
         */
        public Builder kibanaIPWhitelist(java.util.List < String > kibanaIPWhitelist) {
            this.putBodyParameter("kibanaIPWhitelist", kibanaIPWhitelist);
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }

        /**
         * Kibana 访问白名单分组设置
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * 5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Cover
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        @Override
        public UpdateKibanaWhiteIpsRequest build() {
            return new UpdateKibanaWhiteIpsRequest(this);
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
             * 分组名称
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * 分组白名单列表
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * 白名单类型，固定设置PUBLIC_KIBANA
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
