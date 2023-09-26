// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetGovernanceKubernetesClusterResponseBody</p>
 */
public class GetGovernanceKubernetesClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGovernanceKubernetesClusterResponseBody build() {
            return new GetGovernanceKubernetesClusterResponseBody(this);
        } 

    } 

    public static class Namespaces extends TeaModel {
        @NameInMap("MseNamespace")
        private String mseNamespace;

        @NameInMap("Name")
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

            /**
             * MseNamespace.
             */
            public Builder mseNamespace(String mseNamespace) {
                this.mseNamespace = mseNamespace;
                return this;
            }

            /**
             * The name.
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
    public static class Data extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("K8sVersion")
        private String k8sVersion;

        @NameInMap("NamespaceInfos")
        private String namespaceInfos;

        @NameInMap("Namespaces")
        private java.util.List < Namespaces> namespaces;

        @NameInMap("PilotStartTime")
        private String pilotStartTime;

        @NameInMap("Region")
        private String region;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.k8sVersion = builder.k8sVersion;
            this.namespaceInfos = builder.namespaceInfos;
            this.namespaces = builder.namespaces;
            this.pilotStartTime = builder.pilotStartTime;
            this.region = builder.region;
            this.updateTime = builder.updateTime;
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
        public java.util.List < Namespaces> getNamespaces() {
            return this.namespaces;
        }

        /**
         * @return pilotStartTime
         */
        public String getPilotStartTime() {
            return this.pilotStartTime;
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

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String k8sVersion; 
            private String namespaceInfos; 
            private java.util.List < Namespaces> namespaces; 
            private String pilotStartTime; 
            private String region; 
            private String updateTime; 

            /**
             * The ID of the instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The version of Kubernetes.
             */
            public Builder k8sVersion(String k8sVersion) {
                this.k8sVersion = k8sVersion;
                return this;
            }

            /**
             * The information of the namespace.
             */
            public Builder namespaceInfos(String namespaceInfos) {
                this.namespaceInfos = namespaceInfos;
                return this;
            }

            /**
             * The queried namespaces.
             */
            public Builder namespaces(java.util.List < Namespaces> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * The time when the ack-onepilot component was started.
             */
            public Builder pilotStartTime(String pilotStartTime) {
                this.pilotStartTime = pilotStartTime;
                return this;
            }

            /**
             * The ID of the region in which the instance resides. The region is supported by MSE.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The time of the last modification.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
