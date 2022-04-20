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
         * ClusterStatus.
         */
        public Builder clusterStatus(ClusterStatus clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("PayType")
        private String payType;

        @NameInMap("Reused")
        private Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        private String SLBExistStatus;

        private ApiServerLoadBalancerStatus(Builder builder) {
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
            private String payType; 
            private Boolean reused; 
            private String SLBBackEndServerNumStatus; 
            private String SLBExistStatus; 

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Reused.
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * SLBBackEndServerNumStatus.
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * SLBExistStatus.
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
    public static class PilotLoadBalancerStatus extends TeaModel {
        @NameInMap("PayType")
        private String payType;

        @NameInMap("Reused")
        private Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        private String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        private String SLBExistStatus;

        private PilotLoadBalancerStatus(Builder builder) {
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
            private String payType; 
            private Boolean reused; 
            private String SLBBackEndServerNumStatus; 
            private String SLBExistStatus; 

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Reused.
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * SLBBackEndServerNumStatus.
             */
            public Builder SLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
                this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
                return this;
            }

            /**
             * SLBExistStatus.
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

        @NameInMap("ControlPlaneProjectStatus")
        private String controlPlaneProjectStatus;

        @NameInMap("LogtailStatusRecord")
        private java.util.Map < String, ClusterStatusLogtailStatusRecordValue > logtailStatusRecord;

        @NameInMap("PilotLoadBalancerStatus")
        private PilotLoadBalancerStatus pilotLoadBalancerStatus;

        @NameInMap("SgStatus")
        private String sgStatus;

        private ClusterStatus(Builder builder) {
            this.accessLogProjectStatus = builder.accessLogProjectStatus;
            this.apiServerEIPStatus = builder.apiServerEIPStatus;
            this.apiServerLoadBalancerStatus = builder.apiServerLoadBalancerStatus;
            this.auditProjectStatus = builder.auditProjectStatus;
            this.controlPlaneProjectStatus = builder.controlPlaneProjectStatus;
            this.logtailStatusRecord = builder.logtailStatusRecord;
            this.pilotLoadBalancerStatus = builder.pilotLoadBalancerStatus;
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
         * @return controlPlaneProjectStatus
         */
        public String getControlPlaneProjectStatus() {
            return this.controlPlaneProjectStatus;
        }

        /**
         * @return logtailStatusRecord
         */
        public java.util.Map < String, ClusterStatusLogtailStatusRecordValue > getLogtailStatusRecord() {
            return this.logtailStatusRecord;
        }

        /**
         * @return pilotLoadBalancerStatus
         */
        public PilotLoadBalancerStatus getPilotLoadBalancerStatus() {
            return this.pilotLoadBalancerStatus;
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
            private String controlPlaneProjectStatus; 
            private java.util.Map < String, ClusterStatusLogtailStatusRecordValue > logtailStatusRecord; 
            private PilotLoadBalancerStatus pilotLoadBalancerStatus; 
            private String sgStatus; 

            /**
             * AccessLogProjectStatus.
             */
            public Builder accessLogProjectStatus(String accessLogProjectStatus) {
                this.accessLogProjectStatus = accessLogProjectStatus;
                return this;
            }

            /**
             * ApiServerEIPStatus.
             */
            public Builder apiServerEIPStatus(String apiServerEIPStatus) {
                this.apiServerEIPStatus = apiServerEIPStatus;
                return this;
            }

            /**
             * ApiServerLoadBalancerStatus.
             */
            public Builder apiServerLoadBalancerStatus(ApiServerLoadBalancerStatus apiServerLoadBalancerStatus) {
                this.apiServerLoadBalancerStatus = apiServerLoadBalancerStatus;
                return this;
            }

            /**
             * AuditProjectStatus.
             */
            public Builder auditProjectStatus(String auditProjectStatus) {
                this.auditProjectStatus = auditProjectStatus;
                return this;
            }

            /**
             * ControlPlaneProjectStatus.
             */
            public Builder controlPlaneProjectStatus(String controlPlaneProjectStatus) {
                this.controlPlaneProjectStatus = controlPlaneProjectStatus;
                return this;
            }

            /**
             * LogtailStatusRecord.
             */
            public Builder logtailStatusRecord(java.util.Map < String, ClusterStatusLogtailStatusRecordValue > logtailStatusRecord) {
                this.logtailStatusRecord = logtailStatusRecord;
                return this;
            }

            /**
             * PilotLoadBalancerStatus.
             */
            public Builder pilotLoadBalancerStatus(PilotLoadBalancerStatus pilotLoadBalancerStatus) {
                this.pilotLoadBalancerStatus = pilotLoadBalancerStatus;
                return this;
            }

            /**
             * SgStatus.
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
