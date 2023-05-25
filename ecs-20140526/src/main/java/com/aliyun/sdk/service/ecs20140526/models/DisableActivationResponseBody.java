// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableActivationResponseBody} extends {@link TeaModel}
 *
 * <p>DisableActivationResponseBody</p>
 */
public class DisableActivationResponseBody extends TeaModel {
    @NameInMap("Activation")
    private Activation activation;

    @NameInMap("RequestId")
    private String requestId;

    private DisableActivationResponseBody(Builder builder) {
        this.activation = builder.activation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableActivationResponseBody create() {
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
         * Details about the activation code and its usage information.
         */
        public Builder activation(Activation activation) {
            this.activation = activation;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableActivationResponseBody build() {
            return new DisableActivationResponseBody(this);
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

        @NameInMap("Disabled")
        private Boolean disabled;

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
            this.disabled = builder.disabled;
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
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
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
            private Boolean disabled; 
            private Integer instanceCount; 
            private String instanceName; 
            private String ipAddressRange; 
            private Integer registeredCount; 
            private Long timeToLiveInHours; 

            /**
             * The activation code ID.
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
             * Indicates whether the activation code is disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
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
             * The default prefix of the instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The IP addresses of the hosts that can use the activation code.
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
