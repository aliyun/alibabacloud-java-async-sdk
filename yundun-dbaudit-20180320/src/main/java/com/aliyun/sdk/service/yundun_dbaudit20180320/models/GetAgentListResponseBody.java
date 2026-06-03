// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetAgentListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentListResponseBody</p>
 */
public class GetAgentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentList")
    private java.util.List<AgentList> agentList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentListResponseBody(Builder builder) {
        this.agentList = builder.agentList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentList
     */
    public java.util.List<AgentList> getAgentList() {
        return this.agentList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AgentList> agentList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentListResponseBody model) {
            this.agentList = model.agentList;
            this.requestId = model.requestId;
        } 

        /**
         * AgentList.
         */
        public Builder agentList(java.util.List<AgentList> agentList) {
            this.agentList = agentList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentListResponseBody build() {
            return new GetAgentListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagId")
        private Long tagId;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagId = builder.tagId;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagId
         */
        public Long getTagId() {
            return this.tagId;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Long tagId; 
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagId = model.tagId;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagId.
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentListResponseBody</p>
     */
    public static class AgentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentOs")
        private String agentOs;

        @com.aliyun.core.annotation.NameInMap("AgentPort")
        private String agentPort;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private Integer agentStatus;

        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        @com.aliyun.core.annotation.NameInMap("FirstLoginTime")
        private String firstLoginTime;

        @com.aliyun.core.annotation.NameInMap("LastActiveTime")
        private String lastActiveTime;

        @com.aliyun.core.annotation.NameInMap("OsCpu")
        private Integer osCpu;

        @com.aliyun.core.annotation.NameInMap("OsMem")
        private Integer osMem;

        @com.aliyun.core.annotation.NameInMap("PktLoss")
        private Integer pktLoss;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("RmagentCpu")
        private Integer rmagentCpu;

        @com.aliyun.core.annotation.NameInMap("RmagentMem")
        private Integer rmagentMem;

        @com.aliyun.core.annotation.NameInMap("SendByteCount")
        private Long sendByteCount;

        @com.aliyun.core.annotation.NameInMap("SendBytes")
        private Long sendBytes;

        @com.aliyun.core.annotation.NameInMap("SendPacketCount")
        private Long sendPacketCount;

        @com.aliyun.core.annotation.NameInMap("SendPackets")
        private Long sendPackets;

        @com.aliyun.core.annotation.NameInMap("SysConfig")
        private String sysConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AgentList(Builder builder) {
            this.agentId = builder.agentId;
            this.agentOs = builder.agentOs;
            this.agentPort = builder.agentPort;
            this.agentStatus = builder.agentStatus;
            this.agentVersion = builder.agentVersion;
            this.ecsId = builder.ecsId;
            this.firstLoginTime = builder.firstLoginTime;
            this.lastActiveTime = builder.lastActiveTime;
            this.osCpu = builder.osCpu;
            this.osMem = builder.osMem;
            this.pktLoss = builder.pktLoss;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.rmagentCpu = builder.rmagentCpu;
            this.rmagentMem = builder.rmagentMem;
            this.sendByteCount = builder.sendByteCount;
            this.sendBytes = builder.sendBytes;
            this.sendPacketCount = builder.sendPacketCount;
            this.sendPackets = builder.sendPackets;
            this.sysConfig = builder.sysConfig;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentList create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentOs
         */
        public String getAgentOs() {
            return this.agentOs;
        }

        /**
         * @return agentPort
         */
        public String getAgentPort() {
            return this.agentPort;
        }

        /**
         * @return agentStatus
         */
        public Integer getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return firstLoginTime
         */
        public String getFirstLoginTime() {
            return this.firstLoginTime;
        }

        /**
         * @return lastActiveTime
         */
        public String getLastActiveTime() {
            return this.lastActiveTime;
        }

        /**
         * @return osCpu
         */
        public Integer getOsCpu() {
            return this.osCpu;
        }

        /**
         * @return osMem
         */
        public Integer getOsMem() {
            return this.osMem;
        }

        /**
         * @return pktLoss
         */
        public Integer getPktLoss() {
            return this.pktLoss;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return rmagentCpu
         */
        public Integer getRmagentCpu() {
            return this.rmagentCpu;
        }

        /**
         * @return rmagentMem
         */
        public Integer getRmagentMem() {
            return this.rmagentMem;
        }

        /**
         * @return sendByteCount
         */
        public Long getSendByteCount() {
            return this.sendByteCount;
        }

        /**
         * @return sendBytes
         */
        public Long getSendBytes() {
            return this.sendBytes;
        }

        /**
         * @return sendPacketCount
         */
        public Long getSendPacketCount() {
            return this.sendPacketCount;
        }

        /**
         * @return sendPackets
         */
        public Long getSendPackets() {
            return this.sendPackets;
        }

        /**
         * @return sysConfig
         */
        public String getSysConfig() {
            return this.sysConfig;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentOs; 
            private String agentPort; 
            private Integer agentStatus; 
            private String agentVersion; 
            private String ecsId; 
            private String firstLoginTime; 
            private String lastActiveTime; 
            private Integer osCpu; 
            private Integer osMem; 
            private Integer pktLoss; 
            private String privateIp; 
            private String publicIp; 
            private Integer rmagentCpu; 
            private Integer rmagentMem; 
            private Long sendByteCount; 
            private Long sendBytes; 
            private Long sendPacketCount; 
            private Long sendPackets; 
            private String sysConfig; 
            private java.util.List<Tags> tags; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AgentList model) {
                this.agentId = model.agentId;
                this.agentOs = model.agentOs;
                this.agentPort = model.agentPort;
                this.agentStatus = model.agentStatus;
                this.agentVersion = model.agentVersion;
                this.ecsId = model.ecsId;
                this.firstLoginTime = model.firstLoginTime;
                this.lastActiveTime = model.lastActiveTime;
                this.osCpu = model.osCpu;
                this.osMem = model.osMem;
                this.pktLoss = model.pktLoss;
                this.privateIp = model.privateIp;
                this.publicIp = model.publicIp;
                this.rmagentCpu = model.rmagentCpu;
                this.rmagentMem = model.rmagentMem;
                this.sendByteCount = model.sendByteCount;
                this.sendBytes = model.sendBytes;
                this.sendPacketCount = model.sendPacketCount;
                this.sendPackets = model.sendPackets;
                this.sysConfig = model.sysConfig;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentOs.
             */
            public Builder agentOs(String agentOs) {
                this.agentOs = agentOs;
                return this;
            }

            /**
             * AgentPort.
             */
            public Builder agentPort(String agentPort) {
                this.agentPort = agentPort;
                return this;
            }

            /**
             * AgentStatus.
             */
            public Builder agentStatus(Integer agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * AgentVersion.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * EcsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * FirstLoginTime.
             */
            public Builder firstLoginTime(String firstLoginTime) {
                this.firstLoginTime = firstLoginTime;
                return this;
            }

            /**
             * LastActiveTime.
             */
            public Builder lastActiveTime(String lastActiveTime) {
                this.lastActiveTime = lastActiveTime;
                return this;
            }

            /**
             * OsCpu.
             */
            public Builder osCpu(Integer osCpu) {
                this.osCpu = osCpu;
                return this;
            }

            /**
             * OsMem.
             */
            public Builder osMem(Integer osMem) {
                this.osMem = osMem;
                return this;
            }

            /**
             * PktLoss.
             */
            public Builder pktLoss(Integer pktLoss) {
                this.pktLoss = pktLoss;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * RmagentCpu.
             */
            public Builder rmagentCpu(Integer rmagentCpu) {
                this.rmagentCpu = rmagentCpu;
                return this;
            }

            /**
             * RmagentMem.
             */
            public Builder rmagentMem(Integer rmagentMem) {
                this.rmagentMem = rmagentMem;
                return this;
            }

            /**
             * SendByteCount.
             */
            public Builder sendByteCount(Long sendByteCount) {
                this.sendByteCount = sendByteCount;
                return this;
            }

            /**
             * SendBytes.
             */
            public Builder sendBytes(Long sendBytes) {
                this.sendBytes = sendBytes;
                return this;
            }

            /**
             * SendPacketCount.
             */
            public Builder sendPacketCount(Long sendPacketCount) {
                this.sendPacketCount = sendPacketCount;
                return this;
            }

            /**
             * SendPackets.
             */
            public Builder sendPackets(Long sendPackets) {
                this.sendPackets = sendPackets;
                return this;
            }

            /**
             * SysConfig.
             */
            public Builder sysConfig(String sysConfig) {
                this.sysConfig = sysConfig;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AgentList build() {
                return new AgentList(this);
            } 

        } 

    }
}
