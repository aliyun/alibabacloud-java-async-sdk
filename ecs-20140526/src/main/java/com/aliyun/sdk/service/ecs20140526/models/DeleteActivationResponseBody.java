// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteActivationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteActivationResponseBody</p>
 */
public class DeleteActivationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Activation")
    private Activation activation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The time when the activation code was created.</p>
         */
        public Builder activation(Activation activation) {
            this.activation = activation;
            return this;
        }

        /**
         * <p>Details of the activation code and its usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F74942176</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteActivationResponseBody build() {
            return new DeleteActivationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteActivationResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteActivationResponseBody</p>
     */
    public static class Activation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivationId")
        private String activationId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeregisteredCount")
        private Integer deregisteredCount;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IpAddressRange")
        private String ipAddressRange;

        @com.aliyun.core.annotation.NameInMap("RegisteredCount")
        private Integer registeredCount;

        @com.aliyun.core.annotation.NameInMap("TimeToLiveInHours")
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
             * ActivationId.
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            /**
             * <p>The number of instances that were deregistered.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-20T06:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The maximum number of times that the activation code can be used to register managed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deregisteredCount(Integer deregisteredCount) {
                this.deregisteredCount = deregisteredCount;
                return this;
            }

            /**
             * <p>The number of registered instances.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The description of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The IP addresses of hosts that are allowed to use the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>test-InstanceName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The validity period of the activation code. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder ipAddressRange(String ipAddressRange) {
                this.ipAddressRange = ipAddressRange;
                return this;
            }

            /**
             * <p>The default instance name prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder registeredCount(Integer registeredCount) {
                this.registeredCount = registeredCount;
                return this;
            }

            /**
             * <p>The ID of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
