// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceNetworkTypeRequest</p>
 */
public class ModifyDBInstanceNetworkTypeRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    private String instanceNetworkType;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private ModifyDBInstanceNetworkTypeRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.privateIpAddress = builder.privateIpAddress;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceNetworkTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceNetworkTypeRequest, Builder> {
        private String DBInstanceId; 
        private String instanceNetworkType; 
        private String privateIpAddress; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceNetworkTypeRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.instanceNetworkType = response.instanceNetworkType;
            this.privateIpAddress = response.privateIpAddress;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * InstanceNetworkType.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyDBInstanceNetworkTypeRequest build() {
            return new ModifyDBInstanceNetworkTypeRequest(this);
        } 

    } 

}
