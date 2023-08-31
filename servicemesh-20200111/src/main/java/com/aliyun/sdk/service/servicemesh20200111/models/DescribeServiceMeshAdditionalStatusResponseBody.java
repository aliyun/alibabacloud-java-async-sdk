// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshAdditionalStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshAdditionalStatusResponseBody</p>
 */
public class DescribeServiceMeshAdditionalStatusResponseBody extends TeaModel {
    @NameInMap("ClusterStatus")
    private ClusterStatus clusterStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshAdditionalStatusResponseBody(Builder builder) {
        this.clusterStatus = builder.clusterStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshAdditionalStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterStatus
     */
    public ClusterStatus getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterStatus clusterStatus; 
        private String requestId; 

        /**
         * The status of the cluster.
         */
        public Builder clusterStatus(ClusterStatus clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshAdditionalStatusResponseBody build() {
            return new DescribeServiceMeshAdditionalStatusResponseBody(this);
        } 

    } 

    public static class ApiServerLoadBalancerStatus extends TeaModel {
        @NameInMap("Locked")
        private Boolean locked;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Reused")
        private Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        private String SLBExistStatus;

        private ApiServerLoadBalancerStatus(Builder builder) {
            this.locked = builder.locked;
            this.payType = builder.payType;
            this.reused = builder.reused;
            this.SLBBackEndServerNumStatus = builder.SLBBackEndServerNumStatus;
            this.SLBExistStatus = builder.SLBExistStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiServerLoadBalancerStatus create() {
            return builder().build();
        }

        /**
         * @return locked
         */
        public Boolean getLocked() {
            return this.locked;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return reused
         */
        public Boolean getReused() {
            return this.reused;
        }

        /**
         * @return SLBBackEndServerNumStatus
         */
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        /**
         * @return SLBExistStatus
         */
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

        public static final class Builder {
            private Boolean locked; 
            private String payType; 
            private Boolean reused; 
            private String SLBBackEndServerNumStatus; 
            private String SLBExistStatus; 

            /**
             * Indicates whether the SLB instance is locked. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * The billing method of the SLB instance. Valid values:
             * <p>
             * 
             * *   `PrePay`: subscription
             * *   `PayOnDemand`: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Indicates whether the SLB instance is reused. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * The check result of the number of backend servers of the SLB instance created for exposing the API server. Valid values:
             * <p>
             * 
             * *   `too_much`: An excessive number of backend servers are created.
             * *   `num_exact`: A proper number of backend servers are created.
             * *   `too_little`: The number of backend servers falls short.
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * The check result of the SLB instance. Valid values:
             * <p>
             * 
             * *   `exist`: The SLB instance exists.
             * *   `not_exist`: The SLB instance does not exist.
             * *   `conflict`: Conflicts are detected.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             */
            public Builder SLBExistStatus(String SLBExistStatus) {
                this.SLBExistStatus = SLBExistStatus;
                return this;
            }

            public ApiServerLoadBalancerStatus build() {
                return new ApiServerLoadBalancerStatus(this);
            } 

        } 

    }
    public static class CanaryPilotLoadBalancerStatus extends TeaModel {
        @NameInMap("Locked")
        private Boolean locked;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Reused")
        private Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        private String SLBExistStatus;

        private CanaryPilotLoadBalancerStatus(Builder builder) {
            this.locked = builder.locked;
            this.payType = builder.payType;
            this.reused = builder.reused;
            this.SLBBackEndServerNumStatus = builder.SLBBackEndServerNumStatus;
            this.SLBExistStatus = builder.SLBExistStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CanaryPilotLoadBalancerStatus create() {
            return builder().build();
        }

        /**
         * @return locked
         */
        public Boolean getLocked() {
            return this.locked;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return reused
         */
        public Boolean getReused() {
            return this.reused;
        }

        /**
         * @return SLBBackEndServerNumStatus
         */
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        /**
         * @return SLBExistStatus
         */
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

        public static final class Builder {
            private Boolean locked; 
            private String payType; 
            private Boolean reused; 
            private String SLBBackEndServerNumStatus; 
            private String SLBExistStatus; 

            /**
             * Indicates whether the SLB instance is locked due to overdue payments. Valid values: `true` `false`
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * The billing method of the SLB instance. Valid values:
             * <p>
             * 
             * *   `PrePay`: subscription
             * *   `PayOnDemand`: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Indicates whether the SLB instance is reused. Valid values:
             * <p>
             * 
             * *   `true`: The SLB instance is reused. Non-ASM listener configuration is detected in the listener configurations of the SLB instance.
             * *   `false`: The SLB instance is not reused.
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * The check result of the number of backend servers of the SLB instance created for exposing Istio Pilot. Valid values:
             * <p>
             * 
             * *   `num_exact`: A proper number of backend servers are created.
             * *   `too_much`: An excessive number of backend servers are created.
             * *   `too_little`: The number of backend servers falls short.
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * The check result of the SLB instance. Valid values:
             * <p>
             * 
             * *   `exist`: The SLB instance exists.
             * *   `not_exist`: The SLB instance does not exist.
             * *   `time_out`: The check times out.
             * *   `failed`: The SLB instance has expired.
             */
            public Builder SLBExistStatus(String SLBExistStatus) {
                this.SLBExistStatus = SLBExistStatus;
                return this;
            }

            public CanaryPilotLoadBalancerStatus build() {
                return new CanaryPilotLoadBalancerStatus(this);
            } 

        } 

    }
    public static class PilotLoadBalancerStatus extends TeaModel {
        @NameInMap("Locked")
        private Boolean locked;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Reused")
        private Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        private String SLBExistStatus;

        private PilotLoadBalancerStatus(Builder builder) {
            this.locked = builder.locked;
            this.payType = builder.payType;
            this.reused = builder.reused;
            this.SLBBackEndServerNumStatus = builder.SLBBackEndServerNumStatus;
            this.SLBExistStatus = builder.SLBExistStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PilotLoadBalancerStatus create() {
            return builder().build();
        }

        /**
         * @return locked
         */
        public Boolean getLocked() {
            return this.locked;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return reused
         */
        public Boolean getReused() {
            return this.reused;
        }

        /**
         * @return SLBBackEndServerNumStatus
         */
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        /**
         * @return SLBExistStatus
         */
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

        public static final class Builder {
            private Boolean locked; 
            private String payType; 
            private Boolean reused; 
            private String SLBBackEndServerNumStatus; 
            private String SLBExistStatus; 

            /**
             * Indicates whether the SLB instance is locked. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * The billing method of the SLB instance. Valid values:
             * <p>
             * 
             * *   `PrePay`: subscription
             * *   `PayOnDemand`: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Indicates whether the SLB instance is reused. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * The check result of the number of backend servers of the SLB instance created for exposing Istio Pilot. Valid values:
             * <p>
             * 
             * *   `too_much`: An excessive number of backend servers are created.
             * *   `num_exact`: A proper number of backend servers are created.
             * *   `too_little`: The number of backend servers falls short.
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * The check result of the SLB instance. Valid values:
             * <p>
             * 
             * *   `exist`: The SLB instance exists.
             * *   `not_exist`: The SLB instance does not exist.
             * *   `conflict`: Conflicts are detected.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             */
            public Builder SLBExistStatus(String SLBExistStatus) {
                this.SLBExistStatus = SLBExistStatus;
                return this;
            }

            public PilotLoadBalancerStatus build() {
                return new PilotLoadBalancerStatus(this);
            } 

        } 

    }
    public static class ClusterStatus extends TeaModel {
        @NameInMap("AccessLogProjectStatus")
        private String accessLogProjectStatus;

        @NameInMap("ApiServerEIPStatus")
        private String apiServerEIPStatus;

        @NameInMap("ApiServerLoadBalancerStatus")
        private ApiServerLoadBalancerStatus apiServerLoadBalancerStatus;

        @NameInMap("AuditProjectStatus")
        private String auditProjectStatus;

        @NameInMap("CanaryPilotLoadBalancerStatus")
        private CanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus;

        @NameInMap("ControlPlaneProjectStatus")
        private String controlPlaneProjectStatus;

        @NameInMap("LogtailStatusRecord")
        private java.util.Map < String, ? > logtailStatusRecord;

        @NameInMap("PilotLoadBalancerStatus")
        private PilotLoadBalancerStatus pilotLoadBalancerStatus;

        @NameInMap("RAMApplicationStatus")
        private String RAMApplicationStatus;

        @NameInMap("SgStatus")
        private String sgStatus;

        private ClusterStatus(Builder builder) {
            this.accessLogProjectStatus = builder.accessLogProjectStatus;
            this.apiServerEIPStatus = builder.apiServerEIPStatus;
            this.apiServerLoadBalancerStatus = builder.apiServerLoadBalancerStatus;
            this.auditProjectStatus = builder.auditProjectStatus;
            this.canaryPilotLoadBalancerStatus = builder.canaryPilotLoadBalancerStatus;
            this.controlPlaneProjectStatus = builder.controlPlaneProjectStatus;
            this.logtailStatusRecord = builder.logtailStatusRecord;
            this.pilotLoadBalancerStatus = builder.pilotLoadBalancerStatus;
            this.RAMApplicationStatus = builder.RAMApplicationStatus;
            this.sgStatus = builder.sgStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatus create() {
            return builder().build();
        }

        /**
         * @return accessLogProjectStatus
         */
        public String getAccessLogProjectStatus() {
            return this.accessLogProjectStatus;
        }

        /**
         * @return apiServerEIPStatus
         */
        public String getApiServerEIPStatus() {
            return this.apiServerEIPStatus;
        }

        /**
         * @return apiServerLoadBalancerStatus
         */
        public ApiServerLoadBalancerStatus getApiServerLoadBalancerStatus() {
            return this.apiServerLoadBalancerStatus;
        }

        /**
         * @return auditProjectStatus
         */
        public String getAuditProjectStatus() {
            return this.auditProjectStatus;
        }

        /**
         * @return canaryPilotLoadBalancerStatus
         */
        public CanaryPilotLoadBalancerStatus getCanaryPilotLoadBalancerStatus() {
            return this.canaryPilotLoadBalancerStatus;
        }

        /**
         * @return controlPlaneProjectStatus
         */
        public String getControlPlaneProjectStatus() {
            return this.controlPlaneProjectStatus;
        }

        /**
         * @return logtailStatusRecord
         */
        public java.util.Map < String, ? > getLogtailStatusRecord() {
            return this.logtailStatusRecord;
        }

        /**
         * @return pilotLoadBalancerStatus
         */
        public PilotLoadBalancerStatus getPilotLoadBalancerStatus() {
            return this.pilotLoadBalancerStatus;
        }

        /**
         * @return RAMApplicationStatus
         */
        public String getRAMApplicationStatus() {
            return this.RAMApplicationStatus;
        }

        /**
         * @return sgStatus
         */
        public String getSgStatus() {
            return this.sgStatus;
        }

        public static final class Builder {
            private String accessLogProjectStatus; 
            private String apiServerEIPStatus; 
            private ApiServerLoadBalancerStatus apiServerLoadBalancerStatus; 
            private String auditProjectStatus; 
            private CanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus; 
            private String controlPlaneProjectStatus; 
            private java.util.Map < String, ? > logtailStatusRecord; 
            private PilotLoadBalancerStatus pilotLoadBalancerStatus; 
            private String RAMApplicationStatus; 
            private String sgStatus; 

            /**
             * Indicates whether access logs exist. Valid values:
             * <p>
             * 
             * *   `exist`: Access logs exist.
             * *   `not_exist`: Access logs do not exist.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             */
            public Builder accessLogProjectStatus(String accessLogProjectStatus) {
                this.accessLogProjectStatus = accessLogProjectStatus;
                return this;
            }

            /**
             * The check result of the EIP associated with the API server. Valid values:
             * <p>
             * 
             * *   `exist`: The EIP exists.
             * *   `not_exist`: The EIP does not exist.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             * *   `not_in_use`: The EIP is not associated with the API Server.
             * *   `locked`: The EIP is locked.
             */
            public Builder apiServerEIPStatus(String apiServerEIPStatus) {
                this.apiServerEIPStatus = apiServerEIPStatus;
                return this;
            }

            /**
             * The check results of the SLB instance created for exposing the API server.
             */
            public Builder apiServerLoadBalancerStatus(ApiServerLoadBalancerStatus apiServerLoadBalancerStatus) {
                this.apiServerLoadBalancerStatus = apiServerLoadBalancerStatus;
                return this;
            }

            /**
             * Indicates whether audit logs exist. Valid values:
             * <p>
             * 
             * *   `exist`
             * *   `not exist`
             */
            public Builder auditProjectStatus(String auditProjectStatus) {
                this.auditProjectStatus = auditProjectStatus;
                return this;
            }

            /**
             * The check results of the SLB instance that is created for exposing Istio Pilot and used during canary release.
             */
            public Builder canaryPilotLoadBalancerStatus(CanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus) {
                this.canaryPilotLoadBalancerStatus = canaryPilotLoadBalancerStatus;
                return this;
            }

            /**
             * Indicates whether control plane logs exist. Valid values:
             * <p>
             * 
             * *   `exist`: Control plane logs exist.
             * *   `not_exist`: Control plane logs do not exist.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             */
            public Builder controlPlaneProjectStatus(String controlPlaneProjectStatus) {
                this.controlPlaneProjectStatus = controlPlaneProjectStatus;
                return this;
            }

            /**
             * Indicates whether Logtail is installed in clusters on the data plane.
             */
            public Builder logtailStatusRecord(java.util.Map < String, ? > logtailStatusRecord) {
                this.logtailStatusRecord = logtailStatusRecord;
                return this;
            }

            /**
             * The check results of the SLB instance created for exposing Istio Pilot.
             */
            public Builder pilotLoadBalancerStatus(PilotLoadBalancerStatus pilotLoadBalancerStatus) {
                this.pilotLoadBalancerStatus = pilotLoadBalancerStatus;
                return this;
            }

            /**
             * The status of the RAM OAuth application that is integrated with Mesh Topology. Valid values:
             * <p>
             * 
             * *   `exist`: The RAM OAuth application exists.
             * *   `reused`: The RAM OAuth application is reused.
             * *   `not_exist`: The RAM OAuth application does not exist.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             */
            public Builder RAMApplicationStatus(String RAMApplicationStatus) {
                this.RAMApplicationStatus = RAMApplicationStatus;
                return this;
            }

            /**
             * Indicates whether the security group is reused. Valid values:
             * <p>
             * 
             * *   `reused`: The security group is reused.
             * *   `not_reused`: The security group is not reused.
             * *   `failed`: The check fails.
             * *   `time_out`: The check times out.
             */
            public Builder sgStatus(String sgStatus) {
                this.sgStatus = sgStatus;
                return this;
            }

            public ClusterStatus build() {
                return new ClusterStatus(this);
            } 

        } 

    }
}
