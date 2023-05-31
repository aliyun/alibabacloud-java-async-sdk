// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindContainerNetworkConnectResponseBody} extends {@link TeaModel}
 *
 * <p>FindContainerNetworkConnectResponseBody</p>
 */
public class FindContainerNetworkConnectResponseBody extends TeaModel {
    @NameInMap("Connects")
    private java.util.List < Connects> connects;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
    public java.util.List < Connects> getConnects() {
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
        private java.util.List < Connects> connects; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The information about the network connections.
         */
        public Builder connects(java.util.List < Connects> connects) {
            this.connects = connects;
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

        public FindContainerNetworkConnectResponseBody build() {
            return new FindContainerNetworkConnectResponseBody(this);
        } 

    } 

    public static class DstContainer extends TeaModel {
        @NameInMap("ContainerId")
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
             * The ID of the destination container.
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
    public static class SrcContainer extends TeaModel {
        @NameInMap("ContainerId")
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
             * The ID of the source container.
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
    public static class Connects extends TeaModel {
        @NameInMap("DstContainer")
        private DstContainer dstContainer;

        @NameInMap("DstIp")
        private String dstIp;

        @NameInMap("DstPort")
        private String dstPort;

        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("SrcContainer")
        private SrcContainer srcContainer;

        @NameInMap("SrcIp")
        private String srcIp;

        @NameInMap("SrcPort")
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
             * The information about the destination container.
             * <p>
             * 
             * > This parameter is not supported.
             */
            public Builder dstContainer(DstContainer dstContainer) {
                this.dstContainer = dstContainer;
                return this;
            }

            /**
             * The destination IP address.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * The destination port.
             */
            public Builder dstPort(String dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * The timestamp when the connection was first established.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * The ID of the network connection.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The timestamp when the connection was last established.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The information about the source container.
             * <p>
             * 
             * > This parameter is not supported.
             */
            public Builder srcContainer(SrcContainer srcContainer) {
                this.srcContainer = srcContainer;
                return this;
            }

            /**
             * The source IP address.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * The source port.
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
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("CurrentPage")
        private Long currentPage;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
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
             * The number of entries returned on the current page.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
