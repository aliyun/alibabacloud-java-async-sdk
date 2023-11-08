// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWaypointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaypointsResponseBody</p>
 */
public class ListWaypointsResponseBody extends TeaModel {
    @NameInMap("Continue")
    private String _continue;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Waypoints")
    private java.util.List < Waypoints> waypoints;

    private ListWaypointsResponseBody(Builder builder) {
        this._continue = builder._continue;
        this.requestId = builder.requestId;
        this.waypoints = builder.waypoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaypointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return _continue
     */
    public String get_continue() {
        return this._continue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waypoints
     */
    public java.util.List < Waypoints> getWaypoints() {
        return this.waypoints;
    }

    public static final class Builder {
        private String _continue; 
        private String requestId; 
        private java.util.List < Waypoints> waypoints; 

        /**
         * Continue.
         */
        public Builder _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of waypoint proxy configurations.
         */
        public Builder waypoints(java.util.List < Waypoints> waypoints) {
            this.waypoints = waypoints;
            return this;
        }

        public ListWaypointsResponseBody build() {
            return new ListWaypointsResponseBody(this);
        } 

    } 

    public static class Waypoints extends TeaModel {
        @NameInMap("HPAEnabled")
        private String HPAEnabled;

        @NameInMap("HPAMaxReplicas")
        private String HPAMaxReplicas;

        @NameInMap("HPAMinReplicas")
        private String HPAMinReplicas;

        @NameInMap("HPATargetCPU")
        private String HPATargetCPU;

        @NameInMap("HPATargetMemory")
        private String HPATargetMemory;

        @NameInMap("LimitCPU")
        private String limitCPU;

        @NameInMap("LimitMemory")
        private String limitMemory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PreferECI")
        private String preferECI;

        @NameInMap("Replicas")
        private String replicas;

        @NameInMap("RequestCPU")
        private String requestCPU;

        @NameInMap("RequestMemory")
        private String requestMemory;

        @NameInMap("ServiceAccount")
        private String serviceAccount;

        private Waypoints(Builder builder) {
            this.HPAEnabled = builder.HPAEnabled;
            this.HPAMaxReplicas = builder.HPAMaxReplicas;
            this.HPAMinReplicas = builder.HPAMinReplicas;
            this.HPATargetCPU = builder.HPATargetCPU;
            this.HPATargetMemory = builder.HPATargetMemory;
            this.limitCPU = builder.limitCPU;
            this.limitMemory = builder.limitMemory;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.preferECI = builder.preferECI;
            this.replicas = builder.replicas;
            this.requestCPU = builder.requestCPU;
            this.requestMemory = builder.requestMemory;
            this.serviceAccount = builder.serviceAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Waypoints create() {
            return builder().build();
        }

        /**
         * @return HPAEnabled
         */
        public String getHPAEnabled() {
            return this.HPAEnabled;
        }

        /**
         * @return HPAMaxReplicas
         */
        public String getHPAMaxReplicas() {
            return this.HPAMaxReplicas;
        }

        /**
         * @return HPAMinReplicas
         */
        public String getHPAMinReplicas() {
            return this.HPAMinReplicas;
        }

        /**
         * @return HPATargetCPU
         */
        public String getHPATargetCPU() {
            return this.HPATargetCPU;
        }

        /**
         * @return HPATargetMemory
         */
        public String getHPATargetMemory() {
            return this.HPATargetMemory;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return preferECI
         */
        public String getPreferECI() {
            return this.preferECI;
        }

        /**
         * @return replicas
         */
        public String getReplicas() {
            return this.replicas;
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

        /**
         * @return serviceAccount
         */
        public String getServiceAccount() {
            return this.serviceAccount;
        }

        public static final class Builder {
            private String HPAEnabled; 
            private String HPAMaxReplicas; 
            private String HPAMinReplicas; 
            private String HPATargetCPU; 
            private String HPATargetMemory; 
            private String limitCPU; 
            private String limitMemory; 
            private String name; 
            private String namespace; 
            private String preferECI; 
            private String replicas; 
            private String requestCPU; 
            private String requestMemory; 
            private String serviceAccount; 

            /**
             * Indicates whether Horizontal Pod Autoscaling (HPA) is enabled.
             */
            public Builder HPAEnabled(String HPAEnabled) {
                this.HPAEnabled = HPAEnabled;
                return this;
            }

            /**
             * The maximum number of waypoint proxy pods when HPA is enabled.
             */
            public Builder HPAMaxReplicas(String HPAMaxReplicas) {
                this.HPAMaxReplicas = HPAMaxReplicas;
                return this;
            }

            /**
             * The minimum number of waypoint proxy pods when HPA is enabled.
             */
            public Builder HPAMinReplicas(String HPAMinReplicas) {
                this.HPAMinReplicas = HPAMinReplicas;
                return this;
            }

            /**
             * The expected CPU utilization when HPA is enabled.
             */
            public Builder HPATargetCPU(String HPATargetCPU) {
                this.HPATargetCPU = HPATargetCPU;
                return this;
            }

            /**
             * The expected memory usage when HPA is enabled.
             */
            public Builder HPATargetMemory(String HPATargetMemory) {
                this.HPATargetMemory = HPATargetMemory;
                return this;
            }

            /**
             * The maximum number of CPU cores that are available to the waypoint proxy pods.
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * The maximum size of the memory that is available to the waypoint proxy pods.
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * The name of the gateway resource corresponding to the waypoint proxy. If the waypoint proxy takes effect on a service account, the name is the service account name. If the waypoint proxy takes effect for the entire namespace, the name is "namespace".
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Indicates whether waypoint proxy pods are deployed based on Elastic Container Instance (ECI).
             */
            public Builder preferECI(String preferECI) {
                this.preferECI = preferECI;
                return this;
            }

            /**
             * The number of waypoint proxy pods.
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * The number of CPU cores requested by the waypoint proxy pods.
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * The size of the memory requested by the waypoint proxy pods.
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * The service account on which the waypoint proxy takes effect. If this parameter is not specified, the waypoint proxy takes effect for the entire namespace.
             */
            public Builder serviceAccount(String serviceAccount) {
                this.serviceAccount = serviceAccount;
                return this;
            }

            public Waypoints build() {
                return new Waypoints(this);
            } 

        } 

    }
}
