// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvStatusResponseBody</p>
 */
public class DescribeAppEnvStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EnvStatus")
    private EnvStatus envStatus;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppEnvStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.envStatus = builder.envStatus;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envStatus
     */
    public EnvStatus getEnvStatus() {
        return this.envStatus;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private EnvStatus envStatus; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EnvStatus.
         */
        public Builder envStatus(EnvStatus envStatus) {
            this.envStatus = envStatus;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppEnvStatusResponseBody build() {
            return new DescribeAppEnvStatusResponseBody(this);
        } 

    } 

    public static class InstanceAgentStatus extends TeaModel {
        @NameInMap("ConnectedInstances")
        private Integer connectedInstances;

        @NameInMap("DisconnectedInstances")
        private Integer disconnectedInstances;

        private InstanceAgentStatus(Builder builder) {
            this.connectedInstances = builder.connectedInstances;
            this.disconnectedInstances = builder.disconnectedInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAgentStatus create() {
            return builder().build();
        }

        /**
         * @return connectedInstances
         */
        public Integer getConnectedInstances() {
            return this.connectedInstances;
        }

        /**
         * @return disconnectedInstances
         */
        public Integer getDisconnectedInstances() {
            return this.disconnectedInstances;
        }

        public static final class Builder {
            private Integer connectedInstances; 
            private Integer disconnectedInstances; 

            /**
             * ConnectedInstances.
             */
            public Builder connectedInstances(Integer connectedInstances) {
                this.connectedInstances = connectedInstances;
                return this;
            }

            /**
             * DisconnectedInstances.
             */
            public Builder disconnectedInstances(Integer disconnectedInstances) {
                this.disconnectedInstances = disconnectedInstances;
                return this;
            }

            public InstanceAgentStatus build() {
                return new InstanceAgentStatus(this);
            } 

        } 

    }
    public static class InstanceAppStatus extends TeaModel {
        @NameInMap("HealthyInstances")
        private Integer healthyInstances;

        @NameInMap("StoppedInstances")
        private Integer stoppedInstances;

        @NameInMap("UnhealthyInstances")
        private Integer unhealthyInstances;

        @NameInMap("UnknownInstances")
        private Integer unknownInstances;

        private InstanceAppStatus(Builder builder) {
            this.healthyInstances = builder.healthyInstances;
            this.stoppedInstances = builder.stoppedInstances;
            this.unhealthyInstances = builder.unhealthyInstances;
            this.unknownInstances = builder.unknownInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAppStatus create() {
            return builder().build();
        }

        /**
         * @return healthyInstances
         */
        public Integer getHealthyInstances() {
            return this.healthyInstances;
        }

        /**
         * @return stoppedInstances
         */
        public Integer getStoppedInstances() {
            return this.stoppedInstances;
        }

        /**
         * @return unhealthyInstances
         */
        public Integer getUnhealthyInstances() {
            return this.unhealthyInstances;
        }

        /**
         * @return unknownInstances
         */
        public Integer getUnknownInstances() {
            return this.unknownInstances;
        }

        public static final class Builder {
            private Integer healthyInstances; 
            private Integer stoppedInstances; 
            private Integer unhealthyInstances; 
            private Integer unknownInstances; 

            /**
             * HealthyInstances.
             */
            public Builder healthyInstances(Integer healthyInstances) {
                this.healthyInstances = healthyInstances;
                return this;
            }

            /**
             * StoppedInstances.
             */
            public Builder stoppedInstances(Integer stoppedInstances) {
                this.stoppedInstances = stoppedInstances;
                return this;
            }

            /**
             * UnhealthyInstances.
             */
            public Builder unhealthyInstances(Integer unhealthyInstances) {
                this.unhealthyInstances = unhealthyInstances;
                return this;
            }

            /**
             * UnknownInstances.
             */
            public Builder unknownInstances(Integer unknownInstances) {
                this.unknownInstances = unknownInstances;
                return this;
            }

            public InstanceAppStatus build() {
                return new InstanceAppStatus(this);
            } 

        } 

    }
    public static class EnvStatus extends TeaModel {
        @NameInMap("AbortingChange")
        private Boolean abortingChange;

        @NameInMap("ApplyingChange")
        private Boolean applyingChange;

        @NameInMap("ChangeBanner")
        private String changeBanner;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvName")
        private String envName;

        @NameInMap("EnvStatus")
        private String envStatus;

        @NameInMap("InstanceAgentStatus")
        private InstanceAgentStatus instanceAgentStatus;

        @NameInMap("InstanceAppStatus")
        private InstanceAppStatus instanceAppStatus;

        @NameInMap("LastEnvStatus")
        private String lastEnvStatus;

        @NameInMap("LatestChangeId")
        private String latestChangeId;

        private EnvStatus(Builder builder) {
            this.abortingChange = builder.abortingChange;
            this.applyingChange = builder.applyingChange;
            this.changeBanner = builder.changeBanner;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.envStatus = builder.envStatus;
            this.instanceAgentStatus = builder.instanceAgentStatus;
            this.instanceAppStatus = builder.instanceAppStatus;
            this.lastEnvStatus = builder.lastEnvStatus;
            this.latestChangeId = builder.latestChangeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvStatus create() {
            return builder().build();
        }

        /**
         * @return abortingChange
         */
        public Boolean getAbortingChange() {
            return this.abortingChange;
        }

        /**
         * @return applyingChange
         */
        public Boolean getApplyingChange() {
            return this.applyingChange;
        }

        /**
         * @return changeBanner
         */
        public String getChangeBanner() {
            return this.changeBanner;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return envStatus
         */
        public String getEnvStatus() {
            return this.envStatus;
        }

        /**
         * @return instanceAgentStatus
         */
        public InstanceAgentStatus getInstanceAgentStatus() {
            return this.instanceAgentStatus;
        }

        /**
         * @return instanceAppStatus
         */
        public InstanceAppStatus getInstanceAppStatus() {
            return this.instanceAppStatus;
        }

        /**
         * @return lastEnvStatus
         */
        public String getLastEnvStatus() {
            return this.lastEnvStatus;
        }

        /**
         * @return latestChangeId
         */
        public String getLatestChangeId() {
            return this.latestChangeId;
        }

        public static final class Builder {
            private Boolean abortingChange; 
            private Boolean applyingChange; 
            private String changeBanner; 
            private String envId; 
            private String envName; 
            private String envStatus; 
            private InstanceAgentStatus instanceAgentStatus; 
            private InstanceAppStatus instanceAppStatus; 
            private String lastEnvStatus; 
            private String latestChangeId; 

            /**
             * AbortingChange.
             */
            public Builder abortingChange(Boolean abortingChange) {
                this.abortingChange = abortingChange;
                return this;
            }

            /**
             * ApplyingChange.
             */
            public Builder applyingChange(Boolean applyingChange) {
                this.applyingChange = applyingChange;
                return this;
            }

            /**
             * ChangeBanner.
             */
            public Builder changeBanner(String changeBanner) {
                this.changeBanner = changeBanner;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * EnvStatus.
             */
            public Builder envStatus(String envStatus) {
                this.envStatus = envStatus;
                return this;
            }

            /**
             * InstanceAgentStatus.
             */
            public Builder instanceAgentStatus(InstanceAgentStatus instanceAgentStatus) {
                this.instanceAgentStatus = instanceAgentStatus;
                return this;
            }

            /**
             * InstanceAppStatus.
             */
            public Builder instanceAppStatus(InstanceAppStatus instanceAppStatus) {
                this.instanceAppStatus = instanceAppStatus;
                return this;
            }

            /**
             * LastEnvStatus.
             */
            public Builder lastEnvStatus(String lastEnvStatus) {
                this.lastEnvStatus = lastEnvStatus;
                return this;
            }

            /**
             * LatestChangeId.
             */
            public Builder latestChangeId(String latestChangeId) {
                this.latestChangeId = latestChangeId;
                return this;
            }

            public EnvStatus build() {
                return new EnvStatus(this);
            } 

        } 

    }
}
