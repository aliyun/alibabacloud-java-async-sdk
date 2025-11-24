// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeServiceMeshAdditionalStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshAdditionalStatusResponseBody</p>
 */
public class DescribeServiceMeshAdditionalStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterStatus")
    private ClusterStatus clusterStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeServiceMeshAdditionalStatusResponseBody model) {
            this.clusterStatus = model.clusterStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster status.</p>
         */
        public Builder clusterStatus(ClusterStatus clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11fd0027-c27e-41bb-a565-75583054****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshAdditionalStatusResponseBody build() {
            return new DescribeServiceMeshAdditionalStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshAdditionalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshAdditionalStatusResponseBody</p>
     */
    public static class ApiServerLoadBalancerStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Locked")
        private Boolean locked;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Reused")
        private Boolean reused;

        @com.aliyun.core.annotation.NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @com.aliyun.core.annotation.NameInMap("SLBExistStatus")
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

            private Builder() {
            } 

            private Builder(ApiServerLoadBalancerStatus model) {
                this.locked = model.locked;
                this.payType = model.payType;
                this.reused = model.reused;
                this.SLBBackEndServerNumStatus = model.SLBBackEndServerNumStatus;
                this.SLBExistStatus = model.SLBExistStatus;
            } 

            /**
             * <p>Indicates whether the CLB instance is locked. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The billing method of the CLB instance. Valid values:</p>
             * <ul>
             * <li><code>PrePay</code>: subscription</li>
             * <li><code>PayOnDemand</code>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePay</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>Indicates whether the CLB instance is reused. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * <p>The check results of the number of backend servers of the CLB instance created for exposing Istio Pilot. Valid values:</p>
             * <ul>
             * <li><code>too_much</code>: An excessive number of backend servers are created.</li>
             * <li><code>num_exact</code>: A proper number of backend servers are created.</li>
             * <li><code>too_little</code>: The number of backend servers falls short.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>num_exact</p>
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * <p>The check results of the CLB instance. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: The CLB instance exists.</li>
             * <li><code>not_exist</code>: The CLB instance does not exist.</li>
             * <li><code>conflict</code>: Conflicts are detected.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
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
    /**
     * 
     * {@link DescribeServiceMeshAdditionalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshAdditionalStatusResponseBody</p>
     */
    public static class CanaryPilotLoadBalancerStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Locked")
        private Boolean locked;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Reused")
        private Boolean reused;

        @com.aliyun.core.annotation.NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @com.aliyun.core.annotation.NameInMap("SLBExistStatus")
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

            private Builder() {
            } 

            private Builder(CanaryPilotLoadBalancerStatus model) {
                this.locked = model.locked;
                this.payType = model.payType;
                this.reused = model.reused;
                this.SLBBackEndServerNumStatus = model.SLBBackEndServerNumStatus;
                this.SLBExistStatus = model.SLBExistStatus;
            } 

            /**
             * <p>Indicates whether the CLB instance is locked due to overdue payments. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The billing method of the CLB instance. Valid values:</p>
             * <ul>
             * <li><code>PrePay</code>: subscription</li>
             * <li><code>PayOnDemand</code> (default): pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayOnDemand</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>Indicates whether the CLB instance is reused. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The CLB instance is reused. Non-ASM listener configuration is detected in the listener configurations of the CLB instance.</li>
             * <li><code>false</code>: The CLB instance is not reused.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * <p>The check result of the number of backend servers of the CLB instance created for exposing Istio Pilot. Valid values:</p>
             * <ul>
             * <li><code>num_exact</code>: A proper number of backend servers are created.</li>
             * <li><code>too_much</code>: An excessive number of backend servers are created.</li>
             * <li><code>too_little</code>: The number of backend servers falls short.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>num_exact</p>
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * <p>The check result of the CLB instance. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: The CLB instance exists.</li>
             * <li><code>not_exist</code>: The CLB instance does not exist.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * <li><code>failed</code>: The CLB instance has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
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
    /**
     * 
     * {@link DescribeServiceMeshAdditionalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshAdditionalStatusResponseBody</p>
     */
    public static class PilotLoadBalancerStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Locked")
        private Boolean locked;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Reused")
        private Boolean reused;

        @com.aliyun.core.annotation.NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @com.aliyun.core.annotation.NameInMap("SLBExistStatus")
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

            private Builder() {
            } 

            private Builder(PilotLoadBalancerStatus model) {
                this.locked = model.locked;
                this.payType = model.payType;
                this.reused = model.reused;
                this.SLBBackEndServerNumStatus = model.SLBBackEndServerNumStatus;
                this.SLBExistStatus = model.SLBExistStatus;
            } 

            /**
             * <p>Indicates whether the CLB instance is locked. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The billing method of the CLB instance. Valid values:</p>
             * <ul>
             * <li><code>PrePay</code>: subscription</li>
             * <li><code>PayOnDemand</code>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayOnDemand</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>Indicates whether the CLB instance is reused. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * <p>The check results of the number of backend servers of the CLB instance created for exposing Istio Pilot. Valid values:</p>
             * <ul>
             * <li><code>too_much</code>: An excessive number of backend servers are created.</li>
             * <li><code>num_exact</code>: A proper number of backend servers are created.</li>
             * <li><code>too_little</code>: The number of backend servers falls short.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>num_exact</p>
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * <p>The check results of the CLB instance. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: The CLB instance exists.</li>
             * <li><code>not_exist</code>: The CLB instance does not exist.</li>
             * <li><code>conflict</code>: Conflicts are detected.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
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
    /**
     * 
     * {@link DescribeServiceMeshAdditionalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshAdditionalStatusResponseBody</p>
     */
    public static class ClusterStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogProjectStatus")
        private String accessLogProjectStatus;

        @com.aliyun.core.annotation.NameInMap("ApiServerEIPStatus")
        private String apiServerEIPStatus;

        @com.aliyun.core.annotation.NameInMap("ApiServerLoadBalancerStatus")
        private ApiServerLoadBalancerStatus apiServerLoadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("AuditProjectStatus")
        private String auditProjectStatus;

        @com.aliyun.core.annotation.NameInMap("CanaryPilotEIPStatus")
        private String canaryPilotEIPStatus;

        @com.aliyun.core.annotation.NameInMap("CanaryPilotLoadBalancerStatus")
        private CanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("ControlPlaneProjectStatus")
        private String controlPlaneProjectStatus;

        @com.aliyun.core.annotation.NameInMap("LogtailStatusRecord")
        private java.util.Map<String, ?> logtailStatusRecord;

        @com.aliyun.core.annotation.NameInMap("PilotEIPStatus")
        private String pilotEIPStatus;

        @com.aliyun.core.annotation.NameInMap("PilotLoadBalancerStatus")
        private PilotLoadBalancerStatus pilotLoadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("RAMApplicationStatus")
        private String RAMApplicationStatus;

        @com.aliyun.core.annotation.NameInMap("SgStatus")
        private String sgStatus;

        private ClusterStatus(Builder builder) {
            this.accessLogProjectStatus = builder.accessLogProjectStatus;
            this.apiServerEIPStatus = builder.apiServerEIPStatus;
            this.apiServerLoadBalancerStatus = builder.apiServerLoadBalancerStatus;
            this.auditProjectStatus = builder.auditProjectStatus;
            this.canaryPilotEIPStatus = builder.canaryPilotEIPStatus;
            this.canaryPilotLoadBalancerStatus = builder.canaryPilotLoadBalancerStatus;
            this.controlPlaneProjectStatus = builder.controlPlaneProjectStatus;
            this.logtailStatusRecord = builder.logtailStatusRecord;
            this.pilotEIPStatus = builder.pilotEIPStatus;
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
         * @return canaryPilotEIPStatus
         */
        public String getCanaryPilotEIPStatus() {
            return this.canaryPilotEIPStatus;
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
        public java.util.Map<String, ?> getLogtailStatusRecord() {
            return this.logtailStatusRecord;
        }

        /**
         * @return pilotEIPStatus
         */
        public String getPilotEIPStatus() {
            return this.pilotEIPStatus;
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
            private String canaryPilotEIPStatus; 
            private CanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus; 
            private String controlPlaneProjectStatus; 
            private java.util.Map<String, ?> logtailStatusRecord; 
            private String pilotEIPStatus; 
            private PilotLoadBalancerStatus pilotLoadBalancerStatus; 
            private String RAMApplicationStatus; 
            private String sgStatus; 

            private Builder() {
            } 

            private Builder(ClusterStatus model) {
                this.accessLogProjectStatus = model.accessLogProjectStatus;
                this.apiServerEIPStatus = model.apiServerEIPStatus;
                this.apiServerLoadBalancerStatus = model.apiServerLoadBalancerStatus;
                this.auditProjectStatus = model.auditProjectStatus;
                this.canaryPilotEIPStatus = model.canaryPilotEIPStatus;
                this.canaryPilotLoadBalancerStatus = model.canaryPilotLoadBalancerStatus;
                this.controlPlaneProjectStatus = model.controlPlaneProjectStatus;
                this.logtailStatusRecord = model.logtailStatusRecord;
                this.pilotEIPStatus = model.pilotEIPStatus;
                this.pilotLoadBalancerStatus = model.pilotLoadBalancerStatus;
                this.RAMApplicationStatus = model.RAMApplicationStatus;
                this.sgStatus = model.sgStatus;
            } 

            /**
             * <p>Indicates whether access logs exist. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: Access logs exist.</li>
             * <li><code>not_exist</code>: Access logs do not exist.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
             */
            public Builder accessLogProjectStatus(String accessLogProjectStatus) {
                this.accessLogProjectStatus = accessLogProjectStatus;
                return this;
            }

            /**
             * <p>The check result of the EIP associated with the API server. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: The EIP exists.</li>
             * <li><code>not_exist</code>: The EIP does not exist.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * <li><code>not_in_use</code>: The EIP is not associated with the API Server.</li>
             * <li><code>locked</code>: The EIP is locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
             */
            public Builder apiServerEIPStatus(String apiServerEIPStatus) {
                this.apiServerEIPStatus = apiServerEIPStatus;
                return this;
            }

            /**
             * <p>The check results of the CLB instance created for exposing the API server.</p>
             */
            public Builder apiServerLoadBalancerStatus(ApiServerLoadBalancerStatus apiServerLoadBalancerStatus) {
                this.apiServerLoadBalancerStatus = apiServerLoadBalancerStatus;
                return this;
            }

            /**
             * <p>Indicates whether audit logs exist. Valid values:</p>
             * <ul>
             * <li><code>exist</code></li>
             * <li><code>not exist</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
             */
            public Builder auditProjectStatus(String auditProjectStatus) {
                this.auditProjectStatus = auditProjectStatus;
                return this;
            }

            /**
             * CanaryPilotEIPStatus.
             */
            public Builder canaryPilotEIPStatus(String canaryPilotEIPStatus) {
                this.canaryPilotEIPStatus = canaryPilotEIPStatus;
                return this;
            }

            /**
             * <p>The check results of the CLB instance that is created for exposing Istio Pilot and used during canary release.</p>
             */
            public Builder canaryPilotLoadBalancerStatus(CanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus) {
                this.canaryPilotLoadBalancerStatus = canaryPilotLoadBalancerStatus;
                return this;
            }

            /**
             * <p>Indicates whether control plane logs exist. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: Control plane logs exist.</li>
             * <li><code>not_exist</code>: Control plane logs do not exist.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
             */
            public Builder controlPlaneProjectStatus(String controlPlaneProjectStatus) {
                this.controlPlaneProjectStatus = controlPlaneProjectStatus;
                return this;
            }

            /**
             * <p>Indicates whether Logtail is installed in clusters on the data plane.</p>
             */
            public Builder logtailStatusRecord(java.util.Map<String, ?> logtailStatusRecord) {
                this.logtailStatusRecord = logtailStatusRecord;
                return this;
            }

            /**
             * <p>The check result of whether the EIP is associated with the API server. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: The EIP exists.</li>
             * <li><code>not_exist</code>: The EIP does not exist.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check is timed out.</li>
             * <li><code>not_in_use</code>: The EIP is not associated with the API server.</li>
             * <li><code>locked</code>: The EIP is locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exist</p>
             */
            public Builder pilotEIPStatus(String pilotEIPStatus) {
                this.pilotEIPStatus = pilotEIPStatus;
                return this;
            }

            /**
             * <p>The check results of the CLB instance created for exposing Istio Pilot.</p>
             */
            public Builder pilotLoadBalancerStatus(PilotLoadBalancerStatus pilotLoadBalancerStatus) {
                this.pilotLoadBalancerStatus = pilotLoadBalancerStatus;
                return this;
            }

            /**
             * <p>The status of the RAM OAuth application that is integrated with Mesh Topology. Valid values:</p>
             * <ul>
             * <li><code>exist</code>: The RAM OAuth application exists.</li>
             * <li><code>reused</code>: The RAM OAuth application is reused.</li>
             * <li><code>not_exist</code>: The RAM OAuth application does not exist.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>reused</p>
             */
            public Builder RAMApplicationStatus(String RAMApplicationStatus) {
                this.RAMApplicationStatus = RAMApplicationStatus;
                return this;
            }

            /**
             * <p>Indicates whether the security group is reused. Valid values:</p>
             * <ul>
             * <li><code>reused</code>: The security group is reused.</li>
             * <li><code>not_reused</code>: The security group is not reused.</li>
             * <li><code>failed</code>: The check fails.</li>
             * <li><code>time_out</code>: The check times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>reused</p>
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
