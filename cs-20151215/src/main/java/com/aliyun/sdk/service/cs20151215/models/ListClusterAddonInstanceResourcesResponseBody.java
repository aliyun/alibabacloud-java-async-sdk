// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListClusterAddonInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterAddonInstanceResourcesResponseBody</p>
 */
public class ListClusterAddonInstanceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("helm_release")
    private HelmRelease helmRelease;

    @com.aliyun.core.annotation.NameInMap("kubernetes_objects")
    private java.util.List<KubernetesObjects> kubernetesObjects;

    private ListClusterAddonInstanceResourcesResponseBody(Builder builder) {
        this.helmRelease = builder.helmRelease;
        this.kubernetesObjects = builder.kubernetesObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAddonInstanceResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return helmRelease
     */
    public HelmRelease getHelmRelease() {
        return this.helmRelease;
    }

    /**
     * @return kubernetesObjects
     */
    public java.util.List<KubernetesObjects> getKubernetesObjects() {
        return this.kubernetesObjects;
    }

    public static final class Builder {
        private HelmRelease helmRelease; 
        private java.util.List<KubernetesObjects> kubernetesObjects; 

        private Builder() {
        } 

        private Builder(ListClusterAddonInstanceResourcesResponseBody model) {
            this.helmRelease = model.helmRelease;
            this.kubernetesObjects = model.kubernetesObjects;
        } 

        /**
         * <p>Information about the Helm release instance corresponding to the add-on.</p>
         */
        public Builder helmRelease(HelmRelease helmRelease) {
            this.helmRelease = helmRelease;
            return this;
        }

        /**
         * <p>A list of Kubernetes objects associated with the add-on.</p>
         */
        public Builder kubernetesObjects(java.util.List<KubernetesObjects> kubernetesObjects) {
            this.kubernetesObjects = kubernetesObjects;
            return this;
        }

        public ListClusterAddonInstanceResourcesResponseBody build() {
            return new ListClusterAddonInstanceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterAddonInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterAddonInstanceResourcesResponseBody</p>
     */
    public static class HelmRelease extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chart_name")
        private String chartName;

        @com.aliyun.core.annotation.NameInMap("chart_version")
        private String chartVersion;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("release_name")
        private String releaseName;

        private HelmRelease(Builder builder) {
            this.chartName = builder.chartName;
            this.chartVersion = builder.chartVersion;
            this.namespace = builder.namespace;
            this.releaseName = builder.releaseName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HelmRelease create() {
            return builder().build();
        }

        /**
         * @return chartName
         */
        public String getChartName() {
            return this.chartName;
        }

        /**
         * @return chartVersion
         */
        public String getChartVersion() {
            return this.chartVersion;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return releaseName
         */
        public String getReleaseName() {
            return this.releaseName;
        }

        public static final class Builder {
            private String chartName; 
            private String chartVersion; 
            private String namespace; 
            private String releaseName; 

            private Builder() {
            } 

            private Builder(HelmRelease model) {
                this.chartName = model.chartName;
                this.chartVersion = model.chartVersion;
                this.namespace = model.namespace;
                this.releaseName = model.releaseName;
            } 

            /**
             * <p>The name of the Helm chart.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-node-problem-detector</p>
             */
            public Builder chartName(String chartName) {
                this.chartName = chartName;
                return this;
            }

            /**
             * <p>The version of the Helm chart.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.28</p>
             */
            public Builder chartVersion(String chartVersion) {
                this.chartVersion = chartVersion;
                return this;
            }

            /**
             * <p>The namespace where the Helm release is located.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the Helm release instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-node-problem-detector</p>
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            public HelmRelease build() {
                return new HelmRelease(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterAddonInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterAddonInstanceResourcesResponseBody</p>
     */
    public static class KubernetesObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private KubernetesObjects(Builder builder) {
            this.group = builder.group;
            this.kind = builder.kind;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KubernetesObjects create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String group; 
            private String kind; 
            private String name; 
            private String namespace; 
            private String version; 

            private Builder() {
            } 

            private Builder(KubernetesObjects model) {
                this.group = model.group;
                this.kind = model.kind;
                this.name = model.name;
                this.namespace = model.namespace;
                this.version = model.version;
            } 

            /**
             * <p>The Kubernetes API group to which the object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rbac.authorization.k8s.io</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The Kubernetes API type to which the object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterRole</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The name of the Kubernetes object.</p>
             * 
             * <strong>example:</strong>
             * <p>terway-pod-reader</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The Kubernetes API version to which the object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public KubernetesObjects build() {
                return new KubernetesObjects(this);
            } 

        } 

    }
}
