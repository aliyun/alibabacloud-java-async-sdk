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
 * {@link ListWaypointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaypointsResponseBody</p>
 */
public class ListWaypointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Continue")
    private String _continue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Waypoints")
    private java.util.List<Waypoints> waypoints;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Waypoints> getWaypoints() {
        return this.waypoints;
    }

    public static final class Builder {
        private String _continue; 
        private String requestId; 
        private java.util.List<Waypoints> waypoints; 

        private Builder() {
        } 

        private Builder(ListWaypointsResponseBody model) {
            this._continue = model._continue;
            this.requestId = model.requestId;
            this.waypoints = model.waypoints;
        } 

        /**
         * <p>Base64 encoded string. If it is empty, it means that all waypoints have been obtained; if it is not empty, this value should be included in the next list, and you can continue to obtain it from the offset that ends this time.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6MjY4Njc5Miwic3RhcnQiOiJkZWZhdWx0L2Jvb2tpbmZvLXByb2R1Y3RwYWdlXHUwMDAwIn0</p>
         */
        public Builder _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of waypoint proxies.</p>
         */
        public Builder waypoints(java.util.List<Waypoints> waypoints) {
            this.waypoints = waypoints;
            return this;
        }

        public ListWaypointsResponseBody build() {
            return new ListWaypointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWaypointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaypointsResponseBody</p>
     */
    public static class Waypoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HPAEnabled")
        private String HPAEnabled;

        @com.aliyun.core.annotation.NameInMap("HPAMaxReplicas")
        private String HPAMaxReplicas;

        @com.aliyun.core.annotation.NameInMap("HPAMinReplicas")
        private String HPAMinReplicas;

        @com.aliyun.core.annotation.NameInMap("HPATargetCPU")
        private String HPATargetCPU;

        @com.aliyun.core.annotation.NameInMap("HPATargetMemory")
        private String HPATargetMemory;

        @com.aliyun.core.annotation.NameInMap("LimitCPU")
        private String limitCPU;

        @com.aliyun.core.annotation.NameInMap("LimitMemory")
        private String limitMemory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PreferECI")
        private String preferECI;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private String replicas;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private String requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
        private String requestMemory;

        @com.aliyun.core.annotation.NameInMap("ServiceAccount")
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

            private Builder() {
            } 

            private Builder(Waypoints model) {
                this.HPAEnabled = model.HPAEnabled;
                this.HPAMaxReplicas = model.HPAMaxReplicas;
                this.HPAMinReplicas = model.HPAMinReplicas;
                this.HPATargetCPU = model.HPATargetCPU;
                this.HPATargetMemory = model.HPATargetMemory;
                this.limitCPU = model.limitCPU;
                this.limitMemory = model.limitMemory;
                this.name = model.name;
                this.namespace = model.namespace;
                this.preferECI = model.preferECI;
                this.replicas = model.replicas;
                this.requestCPU = model.requestCPU;
                this.requestMemory = model.requestMemory;
                this.serviceAccount = model.serviceAccount;
            } 

            /**
             * <p>Indicates whether Horizontal Pod Autoscaling (HPA) is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder HPAEnabled(String HPAEnabled) {
                this.HPAEnabled = HPAEnabled;
                return this;
            }

            /**
             * <p>The maximum number of waypoint proxy pods when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder HPAMaxReplicas(String HPAMaxReplicas) {
                this.HPAMaxReplicas = HPAMaxReplicas;
                return this;
            }

            /**
             * <p>The minimum number of waypoint proxy pods when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder HPAMinReplicas(String HPAMinReplicas) {
                this.HPAMinReplicas = HPAMinReplicas;
                return this;
            }

            /**
             * <p>The expected CPU utilization when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>93</p>
             */
            public Builder HPATargetCPU(String HPATargetCPU) {
                this.HPATargetCPU = HPATargetCPU;
                return this;
            }

            /**
             * <p>The expected memory usage when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>91</p>
             */
            public Builder HPATargetMemory(String HPATargetMemory) {
                this.HPATargetMemory = HPATargetMemory;
                return this;
            }

            /**
             * <p>The maximum amount of CPU resources that are available to the waypoint proxy pods.</p>
             * 
             * <strong>example:</strong>
             * <p>2000m</p>
             */
            public Builder limitCPU(String limitCPU) {
                this.limitCPU = limitCPU;
                return this;
            }

            /**
             * <p>The maximum amount of memory resources that are available to the waypoint proxy pods.</p>
             * 
             * <strong>example:</strong>
             * <p>1024Mi</p>
             */
            public Builder limitMemory(String limitMemory) {
                this.limitMemory = limitMemory;
                return this;
            }

            /**
             * <p>The name of the gateway resource for the waypoint proxy. If the waypoint proxy applies to a service account, the name is the service account name. If the waypoint proxy applies to the entire namespace, the name is <code>namespace</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Indicates whether waypoint proxy pods are preferentially scheduled to elastic container instances.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder preferECI(String preferECI) {
                this.preferECI = preferECI;
                return this;
            }

            /**
             * <p>The number of waypoint proxy pods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The amount of CPU resources requested by the waypoint proxy pods.</p>
             * 
             * <strong>example:</strong>
             * <p>100m</p>
             */
            public Builder requestCPU(String requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>The amount of memory resources requested by the waypoint proxy pods.</p>
             * 
             * <strong>example:</strong>
             * <p>128Mi</p>
             */
            public Builder requestMemory(String requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * <p>The service account to which the waypoint proxy applies. If no value is returned for this parameter, the waypoint proxy applies to the entire namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>bookinfo-productpage</p>
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
