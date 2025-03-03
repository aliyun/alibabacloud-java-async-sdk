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
 * {@link ListMachineNetworkInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListMachineNetworkInfoResponseBody</p>
 */
public class ListMachineNetworkInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineNetworkInfo")
    private java.util.List<MachineNetworkInfo> machineNetworkInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMachineNetworkInfoResponseBody(Builder builder) {
        this.machineNetworkInfo = builder.machineNetworkInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachineNetworkInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return machineNetworkInfo
     */
    public java.util.List<MachineNetworkInfo> getMachineNetworkInfo() {
        return this.machineNetworkInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MachineNetworkInfo> machineNetworkInfo; 
        private String requestId; 

        /**
         * MachineNetworkInfo.
         */
        public Builder machineNetworkInfo(java.util.List<MachineNetworkInfo> machineNetworkInfo) {
            this.machineNetworkInfo = machineNetworkInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMachineNetworkInfoResponseBody build() {
            return new ListMachineNetworkInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMachineNetworkInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListMachineNetworkInfoResponseBody</p>
     */
    public static class MachineNetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterNet")
        private String clusterNet;

        @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
        private Boolean enableJumboFrame;

        @com.aliyun.core.annotation.NameInMap("HpnZone")
        private String hpnZone;

        @com.aliyun.core.annotation.NameInMap("IsDpuMode")
        private Boolean isDpuMode;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("NetArch")
        private String netArch;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private MachineNetworkInfo(Builder builder) {
            this.clusterNet = builder.clusterNet;
            this.enableJumboFrame = builder.enableJumboFrame;
            this.hpnZone = builder.hpnZone;
            this.isDpuMode = builder.isDpuMode;
            this.machineType = builder.machineType;
            this.netArch = builder.netArch;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineNetworkInfo create() {
            return builder().build();
        }

        /**
         * @return clusterNet
         */
        public String getClusterNet() {
            return this.clusterNet;
        }

        /**
         * @return enableJumboFrame
         */
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        /**
         * @return isDpuMode
         */
        public Boolean getIsDpuMode() {
            return this.isDpuMode;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return netArch
         */
        public String getNetArch() {
            return this.netArch;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String clusterNet; 
            private Boolean enableJumboFrame; 
            private String hpnZone; 
            private Boolean isDpuMode; 
            private String machineType; 
            private String netArch; 
            private String regionId; 

            /**
             * ClusterNet.
             */
            public Builder clusterNet(String clusterNet) {
                this.clusterNet = clusterNet;
                return this;
            }

            /**
             * EnableJumboFrame.
             */
            public Builder enableJumboFrame(Boolean enableJumboFrame) {
                this.enableJumboFrame = enableJumboFrame;
                return this;
            }

            /**
             * HpnZone.
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * IsDpuMode.
             */
            public Builder isDpuMode(Boolean isDpuMode) {
                this.isDpuMode = isDpuMode;
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
             * NetArch.
             */
            public Builder netArch(String netArch) {
                this.netArch = netArch;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public MachineNetworkInfo build() {
                return new MachineNetworkInfo(this);
            } 

        } 

    }
}
