// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteInstanceResponseBody</p>
 */
public class DescribeWebsiteInstanceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WebsiteInstanceList")
    private java.util.List < WebsiteInstanceList> websiteInstanceList;

    private DescribeWebsiteInstanceResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.websiteInstanceList = builder.websiteInstanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteInstanceResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return websiteInstanceList
     */
    public java.util.List < WebsiteInstanceList> getWebsiteInstanceList() {
        return this.websiteInstanceList;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < WebsiteInstanceList> websiteInstanceList; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WebsiteInstanceList.
         */
        public Builder websiteInstanceList(java.util.List < WebsiteInstanceList> websiteInstanceList) {
            this.websiteInstanceList = websiteInstanceList;
            return this;
        }

        public DescribeWebsiteInstanceResponseBody build() {
            return new DescribeWebsiteInstanceResponseBody(this);
        } 

    } 

    public static class WebsiteInstanceList extends TeaModel {
        @NameInMap("BuyTime")
        private String buyTime;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("IndexPage")
        private String indexPage;

        @NameInMap("IndexPageScanInterval")
        private Integer indexPageScanInterval;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Status")
        private String status;

        @NameInMap("WebsiteScanInterval")
        private Integer websiteScanInterval;

        private WebsiteInstanceList(Builder builder) {
            this.buyTime = builder.buyTime;
            this.domain = builder.domain;
            this.expiredTime = builder.expiredTime;
            this.indexPage = builder.indexPage;
            this.indexPageScanInterval = builder.indexPageScanInterval;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.websiteScanInterval = builder.websiteScanInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebsiteInstanceList create() {
            return builder().build();
        }

        /**
         * @return buyTime
         */
        public String getBuyTime() {
            return this.buyTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return indexPage
         */
        public String getIndexPage() {
            return this.indexPage;
        }

        /**
         * @return indexPageScanInterval
         */
        public Integer getIndexPageScanInterval() {
            return this.indexPageScanInterval;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return websiteScanInterval
         */
        public Integer getWebsiteScanInterval() {
            return this.websiteScanInterval;
        }

        public static final class Builder {
            private String buyTime; 
            private String domain; 
            private String expiredTime; 
            private String indexPage; 
            private Integer indexPageScanInterval; 
            private String instanceId; 
            private String protocol; 
            private String status; 
            private Integer websiteScanInterval; 

            /**
             * BuyTime.
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * IndexPage.
             */
            public Builder indexPage(String indexPage) {
                this.indexPage = indexPage;
                return this;
            }

            /**
             * IndexPageScanInterval.
             */
            public Builder indexPageScanInterval(Integer indexPageScanInterval) {
                this.indexPageScanInterval = indexPageScanInterval;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WebsiteScanInterval.
             */
            public Builder websiteScanInterval(Integer websiteScanInterval) {
                this.websiteScanInterval = websiteScanInterval;
                return this;
            }

            public WebsiteInstanceList build() {
                return new WebsiteInstanceList(this);
            } 

        } 

    }
}
