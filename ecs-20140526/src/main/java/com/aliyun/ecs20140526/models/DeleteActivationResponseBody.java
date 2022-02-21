// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Activation")
    private Activation activation;

    private DeleteActivationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.activation = builder.activation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteActivationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return activation
     */
    public Activation getActivation() {
        return this.activation;
    }

    public static final class Builder {
        private String requestId; 
        private Activation activation; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A collection of activation codes and usage information.
         */
        public Builder activation(Activation activation) {
            this.activation = activation;
            return this;
        }

        public DeleteActivationResponseBody build() {
            return new DeleteActivationResponseBody(this);
        } 

    } 

    public static class Activation extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeregisteredCount")
        private Integer deregisteredCount;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("Description")
        private String description;

        @NameInMap("RegisteredCount")
        private Integer registeredCount;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("IpAddressRange")
        private String ipAddressRange;

        @NameInMap("TimeToLiveInHours")
        private Long timeToLiveInHours;

        @NameInMap("ActivationId")
        private String activationId;

        private Activation(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deregisteredCount = builder.deregisteredCount;
            this.instanceCount = builder.instanceCount;
            this.description = builder.description;
            this.registeredCount = builder.registeredCount;
            this.instanceName = builder.instanceName;
            this.ipAddressRange = builder.ipAddressRange;
            this.timeToLiveInHours = builder.timeToLiveInHours;
            this.activationId = builder.activationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activation create() {
            return builder().build();
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
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return registeredCount
         */
        public Integer getRegisteredCount() {
            return this.registeredCount;
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
         * @return timeToLiveInHours
         */
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        /**
         * @return activationId
         */
        public String getActivationId() {
            return this.activationId;
        }

        public static final class Builder {
            private String creationTime; 
            private Integer deregisteredCount; 
            private Integer instanceCount; 
            private String description; 
            private Integer registeredCount; 
            private String instanceName; 
            private String ipAddressRange; 
            private Long timeToLiveInHours; 
            private String activationId; 

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of canceled instances.
             */
            public Builder deregisteredCount(Integer deregisteredCount) {
                this.deregisteredCount = deregisteredCount;
                return this;
            }

            /**
             * The maximum number of times an activation code is used to register a managed instance.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
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
             * The number of registered instances.
             */
            public Builder registeredCount(Integer registeredCount) {
                this.registeredCount = registeredCount;
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
             * The IP address of the host that allows the activation code.
             */
            public Builder ipAddressRange(String ipAddressRange) {
                this.ipAddressRange = ipAddressRange;
                return this;
            }

            /**
             * The validity period of the activation code. Unit: Hour.
             */
            public Builder timeToLiveInHours(Long timeToLiveInHours) {
                this.timeToLiveInHours = timeToLiveInHours;
                return this;
            }

            /**
             * Activation Code ID.
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            public Activation build() {
                return new Activation(this);
            } 

        } 

    }
}
