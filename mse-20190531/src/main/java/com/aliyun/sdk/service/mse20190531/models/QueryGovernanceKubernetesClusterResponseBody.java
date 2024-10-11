// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGovernanceKubernetesClusterResponseBody</p>
 */
public class QueryGovernanceKubernetesClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryGovernanceKubernetesClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGovernanceKubernetesClusterResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>DE34D413-2B79-5E77-9696-36D875E822AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryGovernanceKubernetesClusterResponseBody build() {
            return new QueryGovernanceKubernetesClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGovernanceKubernetesClusterResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("K8sVersion")
        private String k8sVersion;

        @com.aliyun.core.annotation.NameInMap("NamespaceInfos")
        private String namespaceInfos;

        @com.aliyun.core.annotation.NameInMap("PilotStartTime")
        private String pilotStartTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private Result(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.k8sVersion = builder.k8sVersion;
            this.namespaceInfos = builder.namespaceInfos;
            this.pilotStartTime = builder.pilotStartTime;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String k8sVersion; 
            private String namespaceInfos; 
            private String pilotStartTime; 
            private String region; 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>abcdef123456789</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>example-cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The version of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.22</p>
             */
            public Builder k8sVersion(String k8sVersion) {
                this.k8sVersion = k8sVersion;
                return this;
            }

            /**
             * <p>The information about the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Name&quot;:&quot;ack-onepilot&quot;,&quot;Tags&quot;:{&quot;name&quot;:&quot;ack-onepilot&quot;}}]</p>
             */
            public Builder namespaceInfos(String namespaceInfos) {
                this.namespaceInfos = namespaceInfos;
                return this;
            }

            /**
             * <p>The time when the pilot component was started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-17T05:39:43.000+0000</p>
             */
            public Builder pilotStartTime(String pilotStartTime) {
                this.pilotStartTime = pilotStartTime;
                return this;
            }

            /**
             * <p>The region where the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryGovernanceKubernetesClusterResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGovernanceKubernetesClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The details of the data.</p>
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
