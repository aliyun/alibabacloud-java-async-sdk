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
         * configType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * machines.
         */
        public Builder machines(java.util.List < Machines> machines) {
            this.machines = machines;
            return this;
        }

        /**
         * successPodsCount.
         */
        public Builder successPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }

        /**
         * totalPodsCount.
         */
        public Builder totalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }

        /**
         * type.
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
             * agentStatus.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * instanceId.
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
