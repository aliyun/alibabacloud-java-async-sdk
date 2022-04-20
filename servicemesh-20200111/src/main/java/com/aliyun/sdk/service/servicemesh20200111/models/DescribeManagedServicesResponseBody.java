// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManagedServicesResponseBody</p>
 */
public class DescribeManagedServicesResponseBody extends TeaModel {
    @NameInMap("ManagedServiceInfo")
    private java.util.List < ManagedServiceInfo> managedServiceInfo;

    @NameInMap("Mark")
    private String mark;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeManagedServicesResponseBody(Builder builder) {
        this.managedServiceInfo = builder.managedServiceInfo;
        this.mark = builder.mark;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return managedServiceInfo
     */
    public java.util.List < ManagedServiceInfo> getManagedServiceInfo() {
        return this.managedServiceInfo;
    }

    /**
     * @return mark
     */
    public String getMark() {
        return this.mark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ManagedServiceInfo> managedServiceInfo; 
        private String mark; 
        private String requestId; 

        /**
         * ManagedServiceInfo.
         */
        public Builder managedServiceInfo(java.util.List < ManagedServiceInfo> managedServiceInfo) {
            this.managedServiceInfo = managedServiceInfo;
            return this;
        }

        /**
         * Mark.
         */
        public Builder mark(String mark) {
            this.mark = mark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeManagedServicesResponseBody build() {
            return new DescribeManagedServicesResponseBody(this);
        } 

    } 

    public static class DeploymentInstances extends TeaModel {
        @NameInMap("ReadyReplicas")
        private Integer readyReplicas;

        @NameInMap("Replicas")
        private Integer replicas;

        @NameInMap("Version")
        private String version;

        private DeploymentInstances(Builder builder) {
            this.readyReplicas = builder.readyReplicas;
            this.replicas = builder.replicas;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentInstances create() {
            return builder().build();
        }

        /**
         * @return readyReplicas
         */
        public Integer getReadyReplicas() {
            return this.readyReplicas;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer readyReplicas; 
            private Integer replicas; 
            private String version; 

            /**
             * ReadyReplicas.
             */
            public Builder readyReplicas(Integer readyReplicas) {
                this.readyReplicas = readyReplicas;
                return this;
            }

            /**
             * Replicas.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DeploymentInstances build() {
                return new DeploymentInstances(this);
            } 

        } 

    }
    public static class SidecarResource extends TeaModel {
        @NameInMap("LimitCPU")
        private String limitCPU;

        @NameInMap("LimitMemory")
        private String limitMemory;

        @NameInMap("RequestCPU")
        private String requestCPU;

        @NameInMap("RequestMemory")
        private String requestMemory;

        private SidecarResource(Builder builder) {
            this.limitCPU = builder.limitCPU;
            this.limitMemory = builder.limitMemory;
            this.requestCPU = builder.requestCPU;
            this.requestMemory = builder.requestMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarResource create() {
            return builder().build();
        }

        /**
         * @return limitCPU
         */
        public String getLimitCPU() {
            return this.limitCPU;
        }

        /**
         * @return limitMemory
         */
        public String getLimitMemory() {
            return this.limitMemory;
        }

        /**
         * @return requestCPU
         */
        public String getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestMemory
         */
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public static final class Builder {
            private String limitCPU; 
            private String limitMemory; 
            private String requestCPU; 
            private String requestMemory; 

            /**
             * LimitCPU.
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * LimitMemory.
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * RequestCPU.
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * RequestMemory.
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            public SidecarResource build() {
                return new SidecarResource(this);
            } 

        } 

    }
    public static class ManagedServiceInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeploymentInstances")
        private java.util.List < DeploymentInstances> deploymentInstances;

        @NameInMap("Message")
        private String message;

        @NameInMap("Selector")
        private java.util.Map < String, String > selector;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SidecarInjectStatus")
        private String sidecarInjectStatus;

        @NameInMap("SidecarResource")
        private SidecarResource sidecarResource;

        private ManagedServiceInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.deploymentInstances = builder.deploymentInstances;
            this.message = builder.message;
            this.selector = builder.selector;
            this.serviceName = builder.serviceName;
            this.sidecarInjectStatus = builder.sidecarInjectStatus;
            this.sidecarResource = builder.sidecarResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedServiceInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deploymentInstances
         */
        public java.util.List < DeploymentInstances> getDeploymentInstances() {
            return this.deploymentInstances;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return selector
         */
        public java.util.Map < String, String > getSelector() {
            return this.selector;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return sidecarInjectStatus
         */
        public String getSidecarInjectStatus() {
            return this.sidecarInjectStatus;
        }

        /**
         * @return sidecarResource
         */
        public SidecarResource getSidecarResource() {
            return this.sidecarResource;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List < DeploymentInstances> deploymentInstances; 
            private String message; 
            private java.util.Map < String, String > selector; 
            private String serviceName; 
            private String sidecarInjectStatus; 
            private SidecarResource sidecarResource; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeploymentInstances.
             */
            public Builder deploymentInstances(java.util.List < DeploymentInstances> deploymentInstances) {
                this.deploymentInstances = deploymentInstances;
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
             * Selector.
             */
            public Builder selector(java.util.Map < String, String > selector) {
                this.selector = selector;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SidecarInjectStatus.
             */
            public Builder sidecarInjectStatus(String sidecarInjectStatus) {
                this.sidecarInjectStatus = sidecarInjectStatus;
                return this;
            }

            /**
             * SidecarResource.
             */
            public Builder sidecarResource(SidecarResource sidecarResource) {
                this.sidecarResource = sidecarResource;
                return this;
            }

            public ManagedServiceInfo build() {
                return new ManagedServiceInfo(this);
            } 

        } 

    }
}
