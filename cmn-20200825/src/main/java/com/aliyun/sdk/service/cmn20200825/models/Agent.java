// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Agent} extends {@link TeaModel}
 *
 * <p>Agent</p>
 */
public class Agent extends TeaModel {
    @NameInMap("AgentId")
    private String agentId;

    @NameInMap("AgentName")
    private String agentName;

    @NameInMap("AgentVersion")
    private String agentVersion;

    @NameInMap("CpuUsage")
    private String cpuUsage;

    @NameInMap("DiskUsage")
    private String diskUsage;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("Ip")
    private String ip;

    @NameInMap("KernelVersion")
    private String kernelVersion;

    @NameInMap("MemoryUsage")
    private String memoryUsage;

    @NameInMap("SecurityDomain")
    private String securityDomain;

    @NameInMap("Status")
    private String status;

    private Agent(Builder builder) {
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.agentVersion = builder.agentVersion;
        this.cpuUsage = builder.cpuUsage;
        this.diskUsage = builder.diskUsage;
        this.gmtModify = builder.gmtModify;
        this.ip = builder.ip;
        this.kernelVersion = builder.kernelVersion;
        this.memoryUsage = builder.memoryUsage;
        this.securityDomain = builder.securityDomain;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Agent create() {
        return builder().build();
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return cpuUsage
     */
    public String getCpuUsage() {
        return this.cpuUsage;
    }

    /**
     * @return diskUsage
     */
    public String getDiskUsage() {
        return this.diskUsage;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    /**
     * @return memoryUsage
     */
    public String getMemoryUsage() {
        return this.memoryUsage;
    }

    /**
     * @return securityDomain
     */
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String agentId; 
        private String agentName; 
        private String agentVersion; 
        private String cpuUsage; 
        private String diskUsage; 
        private String gmtModify; 
        private String ip; 
        private String kernelVersion; 
        private String memoryUsage; 
        private String securityDomain; 
        private String status; 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.agentName = agentName;
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
         * CpuUsage.
         */
        public Builder cpuUsage(String cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }

        /**
         * DiskUsage.
         */
        public Builder diskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * KernelVersion.
         */
        public Builder kernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }

        /**
         * MemoryUsage.
         */
        public Builder memoryUsage(String memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Agent build() {
            return new Agent(this);
        } 

    } 

}
