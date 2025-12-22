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
         * helm_release.
         */
        public Builder helmRelease(HelmRelease helmRelease) {
            this.helmRelease = helmRelease;
            return this;
        }

        /**
         * kubernetes_objects.
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
             * chart_name.
             */
            public Builder chartName(String chartName) {
                this.chartName = chartName;
                return this;
            }

            /**
             * chart_version.
             */
            public Builder chartVersion(String chartVersion) {
                this.chartVersion = chartVersion;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * release_name.
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
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * version.
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
