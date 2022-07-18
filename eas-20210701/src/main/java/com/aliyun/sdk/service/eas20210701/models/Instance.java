// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Instance} extends {@link TeaModel}
 *
 * <p>Instance</p>
 */
public class Instance extends TeaModel {
    @NameInMap("HostIP")
    private String hostIP;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("InnerIP")
    private String innerIP;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstancePort")
    private Integer instancePort;

    @NameInMap("LastState")
    private java.util.List < java.util.Map<String, ?>> lastState;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("ReadyProcesses")
    private Integer readyProcesses;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("RestartCount")
    private Integer restartCount;

    @NameInMap("StartAt")
    private String startAt;

    @NameInMap("Status")
    private String status;

    @NameInMap("TotalProcesses")
    private Integer totalProcesses;

    private Instance(Builder builder) {
        this.hostIP = builder.hostIP;
        this.hostName = builder.hostName;
        this.innerIP = builder.innerIP;
        this.instanceName = builder.instanceName;
        this.instancePort = builder.instancePort;
        this.lastState = builder.lastState;
        this.namespace = builder.namespace;
        this.readyProcesses = builder.readyProcesses;
        this.reason = builder.reason;
        this.restartCount = builder.restartCount;
        this.startAt = builder.startAt;
        this.status = builder.status;
        this.totalProcesses = builder.totalProcesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Instance create() {
        return builder().build();
    }

    /**
     * @return hostIP
     */
    public String getHostIP() {
        return this.hostIP;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return innerIP
     */
    public String getInnerIP() {
        return this.innerIP;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instancePort
     */
    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return lastState
     */
    public java.util.List < java.util.Map<String, ?>> getLastState() {
        return this.lastState;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return readyProcesses
     */
    public Integer getReadyProcesses() {
        return this.readyProcesses;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return restartCount
     */
    public Integer getRestartCount() {
        return this.restartCount;
    }

    /**
     * @return startAt
     */
    public String getStartAt() {
        return this.startAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalProcesses
     */
    public Integer getTotalProcesses() {
        return this.totalProcesses;
    }

    public static final class Builder {
        private String hostIP; 
        private String hostName; 
        private String innerIP; 
        private String instanceName; 
        private Integer instancePort; 
        private java.util.List < java.util.Map<String, ?>> lastState; 
        private String namespace; 
        private Integer readyProcesses; 
        private String reason; 
        private Integer restartCount; 
        private String startAt; 
        private String status; 
        private Integer totalProcesses; 

        /**
         * 实例所在的宿主机IP
         */
        public Builder hostIP(String hostIP) {
            this.hostIP = hostIP;
            return this;
        }

        /**
         * 实例所在的宿主机名字
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * 实例的内网IP
         */
        public Builder innerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }

        /**
         * 实例的名字
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 实例的网络端口
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * 实例上一次退出的状态
         */
        public Builder lastState(java.util.List < java.util.Map<String, ?>> lastState) {
            this.lastState = lastState;
            return this;
        }

        /**
         * 实例的命名空间
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * 实例已经启动完成的进程数
         */
        public Builder readyProcesses(Integer readyProcesses) {
            this.readyProcesses = readyProcesses;
            return this;
        }

        /**
         * 实例当前状态的标识
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * 实例重启次数
         */
        public Builder restartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        /**
         * 实例的启动时间
         */
        public Builder startAt(String startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * 实例状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 实例总的进程数
         */
        public Builder totalProcesses(Integer totalProcesses) {
            this.totalProcesses = totalProcesses;
            return this;
        }

        public Instance build() {
            return new Instance(this);
        } 

    } 

}
