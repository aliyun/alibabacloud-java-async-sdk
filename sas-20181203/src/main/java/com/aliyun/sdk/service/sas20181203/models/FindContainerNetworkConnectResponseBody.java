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
 * {@link FindContainerNetworkConnectResponseBody} extends {@link TeaModel}
 *
 * <p>FindContainerNetworkConnectResponseBody</p>
 */
public class FindContainerNetworkConnectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connects")
    private java.util.List<Connects> connects;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private FindContainerNetworkConnectResponseBody(Builder builder) {
        this.connects = builder.connects;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindContainerNetworkConnectResponseBody create() {
        return builder().build();
    }

    /**
     * @return connects
     */
    public java.util.List<Connects> getConnects() {
        return this.connects;
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
        private java.util.List<Connects> connects; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about the network connections.</p>
         */
        public Builder connects(java.util.List<Connects> connects) {
            this.connects = connects;
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
         * <p>8686CE6E-9BFA-5436-A9D9-77B984AEE7F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindContainerNetworkConnectResponseBody build() {
            return new FindContainerNetworkConnectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindContainerNetworkConnectResponseBody} extends {@link TeaModel}
     *
     * <p>FindContainerNetworkConnectResponseBody</p>
     */
    public static class DstContainer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        private DstContainer(Builder builder) {
            this.containerId = builder.containerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstContainer create() {
            return builder().build();
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        public static final class Builder {
            private String containerId; 

            /**
             * <p>The ID of the destination container.</p>
             * 
             * <strong>example:</strong>
             * <p>48a6dxxx9d5a5866</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            public DstContainer build() {
                return new DstContainer(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindContainerNetworkConnectResponseBody} extends {@link TeaModel}
     *
     * <p>FindContainerNetworkConnectResponseBody</p>
     */
    public static class SrcContainer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        private SrcContainer(Builder builder) {
            this.containerId = builder.containerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcContainer create() {
            return builder().build();
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        public static final class Builder {
            private String containerId; 

            /**
             * <p>The ID of the source container.</p>
             * 
             * <strong>example:</strong>
             * <p>48a6xxx5709d5a5866</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            public SrcContainer build() {
                return new SrcContainer(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindContainerNetworkConnectResponseBody} extends {@link TeaModel}
     *
     * <p>FindContainerNetworkConnectResponseBody</p>
     */
    public static class Connects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstContainer")
        private DstContainer dstContainer;

        @com.aliyun.core.annotation.NameInMap("DstIp")
        private String dstIp;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private String dstPort;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("SrcContainer")
        private SrcContainer srcContainer;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("SrcPort")
        private String srcPort;

        private Connects(Builder builder) {
            this.dstContainer = builder.dstContainer;
            this.dstIp = builder.dstIp;
            this.dstPort = builder.dstPort;
            this.firstTime = builder.firstTime;
            this.id = builder.id;
            this.lastTime = builder.lastTime;
            this.srcContainer = builder.srcContainer;
            this.srcIp = builder.srcIp;
            this.srcPort = builder.srcPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connects create() {
            return builder().build();
        }

        /**
         * @return dstContainer
         */
        public DstContainer getDstContainer() {
            return this.dstContainer;
        }

        /**
         * @return dstIp
         */
        public String getDstIp() {
            return this.dstIp;
        }

        /**
         * @return dstPort
         */
        public String getDstPort() {
            return this.dstPort;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return srcContainer
         */
        public SrcContainer getSrcContainer() {
            return this.srcContainer;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        /**
         * @return srcPort
         */
        public String getSrcPort() {
            return this.srcPort;
        }

        public static final class Builder {
            private DstContainer dstContainer; 
            private String dstIp; 
            private String dstPort; 
            private Long firstTime; 
            private Long id; 
            private Long lastTime; 
            private SrcContainer srcContainer; 
            private String srcIp; 
            private String srcPort; 

            /**
             * <p>The information about the destination container.</p>
             * <blockquote>
             * <p>This parameter is not supported.</p>
             * </blockquote>
             */
            public Builder dstContainer(DstContainer dstContainer) {
                this.dstContainer = dstContainer;
                return this;
            }

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.20.62.176</p>
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder dstPort(String dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * <p>The timestamp when the connection was first established.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-11 20:54:32</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The ID of the network connection.</p>
             * 
             * <strong>example:</strong>
             * <p>1458</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The timestamp when the connection was last established.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-24 10:26:00</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The information about the source container.</p>
             * <blockquote>
             * <p>This parameter is not supported.</p>
             * </blockquote>
             */
            public Builder srcContainer(SrcContainer srcContainer) {
                this.srcContainer = srcContainer;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>35.233.62.116</p>
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * <p>The source port.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder srcPort(String srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            public Connects build() {
                return new Connects(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindContainerNetworkConnectResponseBody} extends {@link TeaModel}
     *
     * <p>FindContainerNetworkConnectResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

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
        public Long getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long count; 
            private Long currentPage; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
