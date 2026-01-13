// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateRecallManagementConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateRecallManagementConfigRequest</p>
 */
public class CreateRecallManagementConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkConfigs")
    private java.util.List<NetworkConfigs> networkConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CreateRecallManagementConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.networkConfigs = builder.networkConfigs;
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkConfigs
     */
    public java.util.List<NetworkConfigs> getNetworkConfigs() {
        return this.networkConfigs;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateRecallManagementConfigRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<NetworkConfigs> networkConfigs; 
        private String password; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecallManagementConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.networkConfigs = request.networkConfigs;
            this.password = request.password;
            this.userName = request.userName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkConfigs.
         */
        public Builder networkConfigs(java.util.List<NetworkConfigs> networkConfigs) {
            this.putBodyParameter("NetworkConfigs", networkConfigs);
            this.networkConfigs = networkConfigs;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateRecallManagementConfigRequest build() {
            return new CreateRecallManagementConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRecallManagementConfigRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementConfigRequest</p>
     */
    public static class NetworkConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.Map<String, String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NetworkConfigs(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfigs create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.Map<String, String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.Map<String, String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(NetworkConfigs model) {
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.Map<String, String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>Vpc id</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkConfigs build() {
                return new NetworkConfigs(this);
            } 

        } 

    }
}
