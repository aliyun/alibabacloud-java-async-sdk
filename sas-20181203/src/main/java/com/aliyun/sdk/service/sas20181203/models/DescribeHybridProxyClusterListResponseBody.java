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
 * {@link DescribeHybridProxyClusterListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridProxyClusterListResponseBody</p>
 */
public class DescribeHybridProxyClusterListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterList")
    private java.util.List<ClusterList> clusterList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridProxyClusterListResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridProxyClusterListResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterList
     */
    public java.util.List<ClusterList> getClusterList() {
        return this.clusterList;
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
        private java.util.List<ClusterList> clusterList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The proxy clusters.</p>
         */
        public Builder clusterList(java.util.List<ClusterList> clusterList) {
            this.clusterList = clusterList;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1A36413-50B2-5B2F-843F-EB14C582713F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridProxyClusterListResponseBody build() {
            return new DescribeHybridProxyClusterListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridProxyClusterListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridProxyClusterListResponseBody</p>
     */
    public static class ClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("AuthKeySecret")
        private String authKeySecret;

        @com.aliyun.core.annotation.NameInMap("ClientCount")
        private Integer clientCount;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("InstallCommand")
        private String installCommand;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("LastHeartTime")
        private Long lastHeartTime;

        @com.aliyun.core.annotation.NameInMap("ProxyCount")
        private Integer proxyCount;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClusterList(Builder builder) {
            this.authKey = builder.authKey;
            this.authKeySecret = builder.authKeySecret;
            this.clientCount = builder.clientCount;
            this.clusterName = builder.clusterName;
            this.installCommand = builder.installCommand;
            this.ip = builder.ip;
            this.lastHeartTime = builder.lastHeartTime;
            this.proxyCount = builder.proxyCount;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterList create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return authKeySecret
         */
        public String getAuthKeySecret() {
            return this.authKeySecret;
        }

        /**
         * @return clientCount
         */
        public Integer getClientCount() {
            return this.clientCount;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return installCommand
         */
        public String getInstallCommand() {
            return this.installCommand;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return lastHeartTime
         */
        public Long getLastHeartTime() {
            return this.lastHeartTime;
        }

        /**
         * @return proxyCount
         */
        public Integer getProxyCount() {
            return this.proxyCount;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String authKey; 
            private String authKeySecret; 
            private Integer clientCount; 
            private String clusterName; 
            private String installCommand; 
            private String ip; 
            private Long lastHeartTime; 
            private Integer proxyCount; 
            private String remark; 
            private String status; 

            /**
             * <p>The ID of the credential that is used for cluster authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * <p>The key of the credential that is used for cluster authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder authKeySecret(String authKeySecret) {
                this.authKeySecret = authKeySecret;
                return this;
            }

            /**
             * <p>The number of servers that are connected to the proxy cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder clientCount(Integer clientCount) {
                this.clientCount = clientCount;
                return this;
            }

            /**
             * <p>The name of the proxy cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>idc-sas-proxy</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The installation command for the node of the proxy cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder installCommand(String installCommand) {
                this.installCommand = installCommand;
                return this;
            }

            /**
             * <p>The endpoint of the cluster. An IP address or a domain name is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>114.115.XXX.XXX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The timestamp when the cluster last sent a heartbeat message. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1608304654000</p>
             */
            public Builder lastHeartTime(Long lastHeartTime) {
                this.lastHeartTime = lastHeartTime;
                return this;
            }

            /**
             * <p>The number of proxy nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder proxyCount(Integer proxyCount) {
                this.proxyCount = proxyCount;
                return this;
            }

            /**
             * <p>The description of the proxy cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>offline</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridProxyClusterListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridProxyClusterListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
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
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
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
             * <p>45</p>
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
