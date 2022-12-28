// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CollectorDeployMachine} extends {@link TeaModel}
 *
 * <p>CollectorDeployMachine</p>
 */
public class CollectorDeployMachine extends TeaModel {
    @NameInMap("configType")
    @Validation(required = true)
    private String configType;

    @NameInMap("groupId")
    private String groupId;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("machines")
    private java.util.List < Machines> machines;

    @NameInMap("successPodsCount")
    private String successPodsCount;

    @NameInMap("totalPodsCount")
    private String totalPodsCount;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private CollectorDeployMachine(Builder builder) {
        this.configType = builder.configType;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.machines = builder.machines;
        this.successPodsCount = builder.successPodsCount;
        this.totalPodsCount = builder.totalPodsCount;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollectorDeployMachine create() {
        return builder().build();
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return machines
     */
    public java.util.List < Machines> getMachines() {
        return this.machines;
    }

    /**
     * @return successPodsCount
     */
    public String getSuccessPodsCount() {
        return this.successPodsCount;
    }

    /**
     * @return totalPodsCount
     */
    public String getTotalPodsCount() {
        return this.totalPodsCount;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String configType; 
        private String groupId; 
        private String instanceId; 
        private java.util.List < Machines> machines; 
        private String successPodsCount; 
        private String totalPodsCount; 
        private String type; 

        /**
         * 固定值：collectorDeployMachine
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * ECS机器组Id
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * ACK集群Id
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 部署在ECS时，部署到的机器的相关信息，包括ECS的id和每台机器上的采集器状态
         */
        public Builder machines(java.util.List < Machines> machines) {
            this.machines = machines;
            return this;
        }

        /**
         * 返回ACK集群中成功采集状态的Pod节点数
         */
        public Builder successPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }

        /**
         * 返回ACK集群所有采集的Pod节点数
         */
        public Builder totalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }

        /**
         * 采集器部署机器目标的类型，分为ECS和ACK两种
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CollectorDeployMachine build() {
            return new CollectorDeployMachine(this);
        } 

    } 

    public static class Machines extends TeaModel {
        @NameInMap("agentStatus")
        private String agentStatus;

        @NameInMap("instanceId")
        private String instanceId;

        private Machines(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Machines create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String agentStatus; 
            private String instanceId; 

            /**
             * 当前ECS实例采集器安装状态
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * ECS实例Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Machines build() {
                return new Machines(this);
            } 

        } 

    }
}
