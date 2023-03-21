// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterInterceptionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterInterceptionConfigResponseBody</p>
 */
public class ListClusterInterceptionConfigResponseBody extends TeaModel {
    @NameInMap("ClusterConfigList")
    private java.util.List < ClusterConfigList> clusterConfigList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterInterceptionConfigResponseBody(Builder builder) {
        this.clusterConfigList = builder.clusterConfigList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterInterceptionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterConfigList
     */
    public java.util.List < ClusterConfigList> getClusterConfigList() {
        return this.clusterConfigList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClusterConfigList> clusterConfigList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the configurations of the cluster.
         */
        public Builder clusterConfigList(java.util.List < ClusterConfigList> clusterConfigList) {
            this.clusterConfigList = clusterConfigList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterInterceptionConfigResponseBody build() {
            return new ListClusterInterceptionConfigResponseBody(this);
        } 

    } 

    public static class ClusterConfigList extends TeaModel {
        @NameInMap("ClusterCNNFStatus")
        private Integer clusterCNNFStatus;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("InterceptionSwitch")
        private Integer interceptionSwitch;

        @NameInMap("OpenRuleCount")
        private Long openRuleCount;

        @NameInMap("SupportCNNF")
        private Boolean supportCNNF;

        @NameInMap("TotalRuleCount")
        private Long totalRuleCount;

        private ClusterConfigList(Builder builder) {
            this.clusterCNNFStatus = builder.clusterCNNFStatus;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.interceptionSwitch = builder.interceptionSwitch;
            this.openRuleCount = builder.openRuleCount;
            this.supportCNNF = builder.supportCNNF;
            this.totalRuleCount = builder.totalRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterConfigList create() {
            return builder().build();
        }

        /**
         * @return clusterCNNFStatus
         */
        public Integer getClusterCNNFStatus() {
            return this.clusterCNNFStatus;
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
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return interceptionSwitch
         */
        public Integer getInterceptionSwitch() {
            return this.interceptionSwitch;
        }

        /**
         * @return openRuleCount
         */
        public Long getOpenRuleCount() {
            return this.openRuleCount;
        }

        /**
         * @return supportCNNF
         */
        public Boolean getSupportCNNF() {
            return this.supportCNNF;
        }

        /**
         * @return totalRuleCount
         */
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

        public static final class Builder {
            private Integer clusterCNNFStatus; 
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private Integer interceptionSwitch; 
            private Long openRuleCount; 
            private Boolean supportCNNF; 
            private Long totalRuleCount; 

            /**
             * The status of the container firewall feature. Valid values:
             * <p>
             * 
             * *   **-1**: unknown
             * *   **0**: abnormal
             * *   **1**: normal
             * *   **2**: normal to be confirmed
             */
            public Builder clusterCNNFStatus(Integer clusterCNNFStatus) {
                this.clusterCNNFStatus = clusterCNNFStatus;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   **ManagedKubernetes**: managed Kubernetes cluster
             * *   **NotManagedKubernetes**: non-managed Kubernetes cluster
             * *   **PrivateKubernetes**: private cluster
             * *   **kubernetes**: dedicated Kubernetes cluster
             * *   **ask**: dedicated serverless Kubernetes (ASK) cluster
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The status of the defense rule. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             */
            public Builder interceptionSwitch(Integer interceptionSwitch) {
                this.interceptionSwitch = interceptionSwitch;
                return this;
            }

            /**
             * The number of defense rules that are in effect.
             */
            public Builder openRuleCount(Long openRuleCount) {
                this.openRuleCount = openRuleCount;
                return this;
            }

            /**
             * Indicates whether the container firewall feature is supported.
             */
            public Builder supportCNNF(Boolean supportCNNF) {
                this.supportCNNF = supportCNNF;
                return this;
            }

            /**
             * The total number of defense rules.
             */
            public Builder totalRuleCount(Long totalRuleCount) {
                this.totalRuleCount = totalRuleCount;
                return this;
            }

            public ClusterConfigList build() {
                return new ClusterConfigList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrrentPage")
        private Integer currrentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currrentPage = builder.currrentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currrentPage
         */
        public Integer getCurrrentPage() {
            return this.currrentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currrentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currrentPage(Integer currrentPage) {
                this.currrentPage = currrentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
