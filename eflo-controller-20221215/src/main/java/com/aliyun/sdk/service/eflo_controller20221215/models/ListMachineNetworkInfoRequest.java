// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListMachineNetworkInfoRequest} extends {@link RequestModel}
 *
 * <p>ListMachineNetworkInfoRequest</p>
 */
public class ListMachineNetworkInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MachineHpnInfo")
    private java.util.List<MachineHpnInfo> machineHpnInfo;

    private ListMachineNetworkInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.machineHpnInfo = builder.machineHpnInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachineNetworkInfoRequest create() {
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
     * @return machineHpnInfo
     */
    public java.util.List<MachineHpnInfo> getMachineHpnInfo() {
        return this.machineHpnInfo;
    }

    public static final class Builder extends Request.Builder<ListMachineNetworkInfoRequest, Builder> {
        private String regionId; 
        private java.util.List<MachineHpnInfo> machineHpnInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListMachineNetworkInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.machineHpnInfo = request.machineHpnInfo;
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
         * MachineHpnInfo.
         */
        public Builder machineHpnInfo(java.util.List<MachineHpnInfo> machineHpnInfo) {
            String machineHpnInfoShrink = shrink(machineHpnInfo, "MachineHpnInfo", "json");
            this.putBodyParameter("MachineHpnInfo", machineHpnInfoShrink);
            this.machineHpnInfo = machineHpnInfo;
            return this;
        }

        @Override
        public ListMachineNetworkInfoRequest build() {
            return new ListMachineNetworkInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMachineNetworkInfoRequest} extends {@link TeaModel}
     *
     * <p>ListMachineNetworkInfoRequest</p>
     */
    public static class MachineHpnInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HpnZone")
        private String hpnZone;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private MachineHpnInfo(Builder builder) {
            this.hpnZone = builder.hpnZone;
            this.machineType = builder.machineType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineHpnInfo create() {
            return builder().build();
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String hpnZone; 
            private String machineType; 
            private String regionId; 

            /**
             * HpnZone.
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public MachineHpnInfo build() {
                return new MachineHpnInfo(this);
            } 

        } 

    }
}
