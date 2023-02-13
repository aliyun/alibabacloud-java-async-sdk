// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteActivationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteActivationResponseBody</p>
 */
public class DeleteActivationResponseBody extends TeaModel {
    @NameInMap("Activation")
    private Activation activation;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteActivationResponseBody(Builder builder) {
        this.activation = builder.activation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteActivationResponseBody create() {
        return builder().build();
    }

    /**
     * @return activation
     */
    public Activation getActivation() {
        return this.activation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Activation activation; 
        private String requestId; 

        /**
         * Details of the activation code and its usage information.
         */
        public Builder activation(Activation activation) {
            this.activation = activation;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteActivationResponseBody build() {
            return new DeleteActivationResponseBody(this);
        } 

    } 

    public static class Activation extends TeaModel {
        @NameInMap("ActivationId")
        private String activationId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeregisteredCount")
        private Integer deregisteredCount;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("IpAddressRange")
        private String ipAddressRange;

        @NameInMap("RegisteredCount")
        private Integer registeredCount;

        @NameInMap("TimeToLiveInHours")
        private Long timeToLiveInHours;

        private Activation(Builder builder) {
            this.activationId = builder.activationId;
            this.creationTime = builder.creationTime;
            this.deregisteredCount = builder.deregisteredCount;
            this.description = builder.description;
            this.instanceCount = builder.instanceCount;
            this.instanceName = builder.instanceName;
            this.ipAddressRange = builder.ipAddressRange;
            this.registeredCount = builder.registeredCount;
            this.timeToLiveInHours = builder.timeToLiveInHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activation create() {
            return builder().build();
        }

        /**
         * @return activationId
         */
        public String getActivationId() {
            return this.activationId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deregisteredCount
         */
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ipAddressRange
         */
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        /**
         * @return registeredCount
         */
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        /**
         * @return timeToLiveInHours
         */
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public static final class Builder {
            private String activationId; 
            private String creationTime; 
            private Integer deregisteredCount; 
            private String description; 
            private Integer instanceCount; 
            private String instanceName; 
            private String ipAddressRange; 
            private Integer registeredCount; 
            private Long timeToLiveInHours; 

            /**
             * The ID of the activation code.
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            /**
             * The time when the activation code was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of instances that were deregistered.
             */
            public Builder deregisteredCount(Integer deregisteredCount) {
                this.deregisteredCount = deregisteredCount;
                return this;
            }

            /**
             * The description of the activation code.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The maximum number of times that the activation code can be used to register managed instances.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The default instance name prefix.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The IP addresses of hosts that are allowed to use the activation code.
             */
            public Builder ipAddressRange(String ipAddressRange) {
                this.ipAddressRange = ipAddressRange;
                return this;
            }

            /**
             * The number of registered instances.
             */
            public Builder registeredCount(Integer registeredCount) {
                this.registeredCount = registeredCount;
                return this;
            }

            /**
             * The validity period of the activation code. Unit: hours.
             */
            public Builder timeToLiveInHours(Long timeToLiveInHours) {
                this.timeToLiveInHours = timeToLiveInHours;
                return this;
            }

            public Activation build() {
                return new Activation(this);
            } 

        } 

    }
}
