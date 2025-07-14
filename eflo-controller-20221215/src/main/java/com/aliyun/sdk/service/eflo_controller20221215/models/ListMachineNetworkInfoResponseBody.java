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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMachineNetworkInfoResponseBody model) {
            this.machineNetworkInfo = model.machineNetworkInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>machine network infomation</p>
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

            private Builder() {
            } 

            private Builder(MachineNetworkInfo model) {
                this.clusterNet = model.clusterNet;
                this.enableJumboFrame = model.enableJumboFrame;
                this.hpnZone = model.hpnZone;
                this.isDpuMode = model.isDpuMode;
                this.machineType = model.machineType;
                this.netArch = model.netArch;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Network of cluster</p>
             * 
             * <strong>example:</strong>
             * <p>vpc/acl</p>
             */
            public Builder clusterNet(String clusterNet) {
                this.clusterNet = clusterNet;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Jumbo Frames feature for the instance. Valid values:</p>
             * <ul>
             * <li>true: The Jumbo Frame feature is enabled for the instance.</li>
             * <li>false: The Jumbo Frame feature is disabled for the instance.</li>
             * </ul>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state.</li>
             * <li>The instance must reside in a VPC.</li>
             * <li>After the Jumbo Frames feature is enabled, the MTU value of the instance is set to 8500. After the Jumbo Frames feature is disabled, the MTU value of the instance is set to 1500. You can enable the Jumbo Frames feature only for specific instance types. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">Jumbo Frames</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableJumboFrame(Boolean enableJumboFrame) {
                this.enableJumboFrame = enableJumboFrame;
                return this;
            }

            /**
             * <p>HPN zone</p>
             * 
             * <strong>example:</strong>
             * <p>B1</p>
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * <p>Specifies whether dpu machine.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDpuMode(Boolean isDpuMode) {
                this.isDpuMode = isDpuMode;
                return this;
            }

            /**
             * <p>The type of machine.</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga8n</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>Network architecture</p>
             * 
             * <strong>example:</strong>
             * <p>XX-7.0</p>
             */
            public Builder netArch(String netArch) {
                this.netArch = netArch;
                return this;
            }

            /**
             * <p>The ID of the region in which the application is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
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
