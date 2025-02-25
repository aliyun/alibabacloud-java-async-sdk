// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListClusterInterceptionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterInterceptionConfigResponseBody</p>
 */
public class ListClusterInterceptionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterConfigList")
    private java.util.List<ClusterConfigList> clusterConfigList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ClusterConfigList> getClusterConfigList() {
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
        private java.util.List<ClusterConfigList> clusterConfigList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>An array that consists of the configurations of the cluster.</p>
         */
        public Builder clusterConfigList(java.util.List<ClusterConfigList> clusterConfigList) {
            this.clusterConfigList = clusterConfigList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>49FDE92F-A0B8-56CC-B7A8-23B17646****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterInterceptionConfigResponseBody build() {
            return new ListClusterInterceptionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterInterceptionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterInterceptionConfigResponseBody</p>
     */
    public static class ClusterConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterCNNFStatus")
        private Integer clusterCNNFStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("InterceptionSwitch")
        private Integer interceptionSwitch;

        @com.aliyun.core.annotation.NameInMap("OpenRuleCount")
        private Long openRuleCount;

        @com.aliyun.core.annotation.NameInMap("SupportCNNF")
        private Boolean supportCNNF;

        @com.aliyun.core.annotation.NameInMap("TotalRuleCount")
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
             * <p>The status of the container firewall feature. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: unknown</li>
             * <li><strong>0</strong>: abnormal</li>
             * <li><strong>1</strong>: normal</li>
             * <li><strong>2</strong>: normal to be confirmed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder clusterCNNFStatus(Integer clusterCNNFStatus) {
                this.clusterCNNFStatus = clusterCNNFStatus;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c9051d30d8a044b4d99e1cb5d25ac****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>container-opa-kill-02</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>ManagedKubernetes</strong>: managed Kubernetes cluster</li>
             * <li><strong>NotManagedKubernetes</strong>: non-managed Kubernetes cluster</li>
             * <li><strong>PrivateKubernetes</strong>: private cluster</li>
             * <li><strong>kubernetes</strong>: dedicated Kubernetes cluster</li>
             * <li><strong>ask</strong>: dedicated serverless Kubernetes (ASK) cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The status of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interceptionSwitch(Integer interceptionSwitch) {
                this.interceptionSwitch = interceptionSwitch;
                return this;
            }

            /**
             * <p>The number of defense rules that are in effect.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder openRuleCount(Long openRuleCount) {
                this.openRuleCount = openRuleCount;
                return this;
            }

            /**
             * <p>Indicates whether the container firewall feature is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportCNNF(Boolean supportCNNF) {
                this.supportCNNF = supportCNNF;
                return this;
            }

            /**
             * <p>The total number of defense rules.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link ListClusterInterceptionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterInterceptionConfigResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrrentPage")
        private Integer currrentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currrentPage(Integer currrentPage) {
                this.currrentPage = currrentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
