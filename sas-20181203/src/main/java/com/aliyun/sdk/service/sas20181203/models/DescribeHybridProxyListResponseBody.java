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
 * {@link DescribeHybridProxyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridProxyListResponseBody</p>
 */
public class DescribeHybridProxyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("ProxyList")
    private java.util.List<ProxyList> proxyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridProxyListResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.proxyList = builder.proxyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridProxyListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return proxyList
     */
    public java.util.List<ProxyList> getProxyList() {
        return this.proxyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<ProxyList> proxyList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHybridProxyListResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.proxyList = model.proxyList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The information about the proxy clusters.</p>
         */
        public Builder proxyList(java.util.List<ProxyList> proxyList) {
            this.proxyList = proxyList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75801E5D-E2EB-5C1D-B65D-2F7D2B00EF93</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridProxyListResponseBody build() {
            return new DescribeHybridProxyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridProxyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridProxyListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

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
             * <p>69</p>
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
    /**
     * 
     * {@link DescribeHybridProxyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridProxyListResponseBody</p>
     */
    public static class ProxyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientCount")
        private Integer clientCount;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("ProxyUuid")
        private String proxyUuid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ProxyList(Builder builder) {
            this.clientCount = builder.clientCount;
            this.currentVersion = builder.currentVersion;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.proxyUuid = builder.proxyUuid;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyList create() {
            return builder().build();
        }

        /**
         * @return clientCount
         */
        public Integer getClientCount() {
            return this.clientCount;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return proxyUuid
         */
        public String getProxyUuid() {
            return this.proxyUuid;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer clientCount; 
            private String currentVersion; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String proxyUuid; 
            private String status; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(ProxyList model) {
                this.clientCount = model.clientCount;
                this.currentVersion = model.currentVersion;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.proxyUuid = model.proxyUuid;
                this.status = model.status;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The number of servers that are connected to the proxy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder clientCount(Integer clientCount) {
                this.clientCount = clientCount;
                return this;
            }

            /**
             * <p>The version of the proxy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>proxy_01_05</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf61q03boqhhmeai1XXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>47.76.XXX.XXX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.23.XXX.XXX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The UUID of the proxy node.</p>
             * 
             * <strong>example:</strong>
             * <p>inet-proxy-3bb11fad-37d6-4aee-9c37-b0ad1612a18e</p>
             */
            public Builder proxyUuid(String proxyUuid) {
                this.proxyUuid = proxyUuid;
                return this;
            }

            /**
             * <p>The status of the proxy server. Valid values:</p>
             * <ul>
             * <li><strong>online</strong></li>
             * <li><strong>offline</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the server that is connected to the proxy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>59a9d158-b2f0-4766-a893-ae67b943XXXX</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ProxyList build() {
                return new ProxyList(this);
            } 

        } 

    }
}
