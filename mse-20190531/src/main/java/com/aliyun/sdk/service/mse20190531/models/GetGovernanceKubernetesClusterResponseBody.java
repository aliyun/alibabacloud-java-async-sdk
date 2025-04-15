// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetGovernanceKubernetesClusterResponseBody</p>
 */
public class GetGovernanceKubernetesClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGovernanceKubernetesClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceKubernetesClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetGovernanceKubernetesClusterResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5B170A0D-2C5D-4CF8-B808-03966B86****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGovernanceKubernetesClusterResponseBody build() {
            return new GetGovernanceKubernetesClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceKubernetesClusterResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MseNamespace")
        private String mseNamespace;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Namespaces(Builder builder) {
            this.mseNamespace = builder.mseNamespace;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return mseNamespace
         */
        public String getMseNamespace() {
            return this.mseNamespace;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mseNamespace; 
            private String name; 

            private Builder() {
            } 

            private Builder(Namespaces model) {
                this.mseNamespace = model.mseNamespace;
                this.name = model.name;
            } 

            /**
             * <p>The name of the MSE namespace that you want to access.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder mseNamespace(String mseNamespace) {
                this.mseNamespace = mseNamespace;
                return this;
            }

            /**
             * <p>The name of the namespace in the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceKubernetesClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("K8sVersion")
        private String k8sVersion;

        @com.aliyun.core.annotation.NameInMap("NamespaceInfos")
        private String namespaceInfos;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<Namespaces> namespaces;

        @com.aliyun.core.annotation.NameInMap("PilotStartTime")
        private String pilotStartTime;

        @com.aliyun.core.annotation.NameInMap("PilotVersion")
        private String pilotVersion;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VersionLifeCycle")
        private String versionLifeCycle;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.k8sVersion = builder.k8sVersion;
            this.namespaceInfos = builder.namespaceInfos;
            this.namespaces = builder.namespaces;
            this.pilotStartTime = builder.pilotStartTime;
            this.pilotVersion = builder.pilotVersion;
            this.region = builder.region;
            this.updateTime = builder.updateTime;
            this.versionLifeCycle = builder.versionLifeCycle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return k8sVersion
         */
        public String getK8sVersion() {
            return this.k8sVersion;
        }

        /**
         * @return namespaceInfos
         */
        public String getNamespaceInfos() {
            return this.namespaceInfos;
        }

        /**
         * @return namespaces
         */
        public java.util.List<Namespaces> getNamespaces() {
            return this.namespaces;
        }

        /**
         * @return pilotStartTime
         */
        public String getPilotStartTime() {
            return this.pilotStartTime;
        }

        /**
         * @return pilotVersion
         */
        public String getPilotVersion() {
            return this.pilotVersion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionLifeCycle
         */
        public String getVersionLifeCycle() {
            return this.versionLifeCycle;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String k8sVersion; 
            private String namespaceInfos; 
            private java.util.List<Namespaces> namespaces; 
            private String pilotStartTime; 
            private String pilotVersion; 
            private String region; 
            private String updateTime; 
            private String versionLifeCycle; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.k8sVersion = model.k8sVersion;
                this.namespaceInfos = model.namespaceInfos;
                this.namespaces = model.namespaces;
                this.pilotStartTime = model.pilotStartTime;
                this.pilotVersion = model.pilotVersion;
                this.region = model.region;
                this.updateTime = model.updateTime;
                this.versionLifeCycle = model.versionLifeCycle;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cd23228b3c80c4d4f9ad7af1d87cc30d5</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>myCluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The version of Kubernetes.</p>
             * 
             * <strong>example:</strong>
             * <p>1.20.11-aliyun.1</p>
             */
            public Builder k8sVersion(String k8sVersion) {
                this.k8sVersion = k8sVersion;
                return this;
            }

            /**
             * <p>The information of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Name&quot;:&quot;ack-onepilot&quot;,&quot;Tags&quot;:null},{&quot;Name&quot;:&quot;default&quot;,&quot;Tags&quot;:{&quot;mse-enable&quot;:&quot;enabled&quot;}},{&quot;Name&quot;:&quot;kube-node-lease&quot;,&quot;Tags&quot;:null},{&quot;Name&quot;:&quot;kube-public&quot;,&quot;Tags&quot;:null},{&quot;Name&quot;:&quot;kube-system&quot;,&quot;Tags&quot;:null}]</p>
             */
            public Builder namespaceInfos(String namespaceInfos) {
                this.namespaceInfos = namespaceInfos;
                return this;
            }

            /**
             * <p>The queried namespaces.</p>
             */
            public Builder namespaces(java.util.List<Namespaces> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * <p>The time when the pilot component was started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-11T11:50:38.000+0000</p>
             */
            public Builder pilotStartTime(String pilotStartTime) {
                this.pilotStartTime = pilotStartTime;
                return this;
            }

            /**
             * PilotVersion.
             */
            public Builder pilotVersion(String pilotVersion) {
                this.pilotVersion = pilotVersion;
                return this;
            }

            /**
             * <p>The ID of the region in which the instance resides. The region is supported by MSE.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time of the last modification.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T05:24:31.000+0000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VersionLifeCycle.
             */
            public Builder versionLifeCycle(String versionLifeCycle) {
                this.versionLifeCycle = versionLifeCycle;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
