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
 * {@link UpdateRecallManagementConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecallManagementConfigRequest</p>
 */
public class UpdateRecallManagementConfigRequest extends Request {
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

    private UpdateRecallManagementConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.networkConfigs = builder.networkConfigs;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecallManagementConfigRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateRecallManagementConfigRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<NetworkConfigs> networkConfigs; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecallManagementConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.networkConfigs = request.networkConfigs;
            this.password = request.password;
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

        @Override
        public UpdateRecallManagementConfigRequest build() {
            return new UpdateRecallManagementConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRecallManagementConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateRecallManagementConfigRequest</p>
     */
    public static class NetworkConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchIds")
        private java.util.Map<String, String> vswitchIds;

        private NetworkConfigs(Builder builder) {
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfigs create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchIds
         */
        public java.util.Map<String, String> getVswitchIds() {
            return this.vswitchIds;
        }

        public static final class Builder {
            private String vpcId; 
            private java.util.Map<String, String> vswitchIds; 

            private Builder() {
            } 

            private Builder(NetworkConfigs model) {
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchIds.
             */
            public Builder vswitchIds(java.util.Map<String, String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            public NetworkConfigs build() {
                return new NetworkConfigs(this);
            } 

        } 

    }
}
