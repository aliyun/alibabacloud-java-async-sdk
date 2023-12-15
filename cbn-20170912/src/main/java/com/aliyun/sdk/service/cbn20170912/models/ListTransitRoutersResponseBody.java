// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRoutersResponseBody</p>
 */
public class ListTransitRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouters")
    private java.util.List < TransitRouters> transitRouters;

    private ListTransitRoutersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouters = builder.transitRouters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRoutersResponseBody create() {
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
     * @return transitRouters
     */
    public java.util.List < TransitRouters> getTransitRouters() {
        return this.transitRouters;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouters> transitRouters; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of transit routers.
         */
        public Builder transitRouters(java.util.List < TransitRouters> transitRouters) {
            this.transitRouters = transitRouters;
            return this;
        }

        public ListTransitRoutersResponseBody build() {
            return new ListTransitRoutersResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class TransitRouterCidrList extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublishCidrRoute")
        private Boolean publishCidrRoute;

        @NameInMap("TransitRouterCidrId")
        private String transitRouterCidrId;

        private TransitRouterCidrList(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.name = builder.name;
            this.publishCidrRoute = builder.publishCidrRoute;
            this.transitRouterCidrId = builder.transitRouterCidrId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterCidrList create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishCidrRoute
         */
        public Boolean getPublishCidrRoute() {
            return this.publishCidrRoute;
        }

        /**
         * @return transitRouterCidrId
         */
        public String getTransitRouterCidrId() {
            return this.transitRouterCidrId;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String name; 
            private Boolean publishCidrRoute; 
            private String transitRouterCidrId; 

            /**
             * The CIDR block of the transit router.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * The description of the CIDR block.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the CIDR block.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the system is allowed to automatically add a route to the route table of the transit router. Valid values:
             * <p>
             * 
             * - **true**: yes
             * 
             *   A value of **true** indicates that after you create a private VPN connection and create a route learning correlation for the private VPC connection, the system automatically adds the following route to the route table of the transit router that is in route learning correlation with the private VPN connection: A blackhole route whose destination CIDR block is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections. 
             *          
             *   The blackhole route is advertised only to the route tables of virtual border routers (VBRs) that are connected to the transit router. 
             * 
             * - **false**: no
             */
            public Builder publishCidrRoute(Boolean publishCidrRoute) {
                this.publishCidrRoute = publishCidrRoute;
                return this;
            }

            /**
             * The ID of the CIDR block.
             */
            public Builder transitRouterCidrId(String transitRouterCidrId) {
                this.transitRouterCidrId = transitRouterCidrId;
                return this;
            }

            public TransitRouterCidrList build() {
                return new TransitRouterCidrList(this);
            } 

        } 

    }
    public static class TransitRouters extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportMulticast")
        private Boolean supportMulticast;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TransitRouterCidrList")
        private java.util.List < TransitRouterCidrList> transitRouterCidrList;

        @NameInMap("TransitRouterDescription")
        private String transitRouterDescription;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterName")
        private String transitRouterName;

        @NameInMap("Type")
        private String type;

        private TransitRouters(Builder builder) {
            this.aliUid = builder.aliUid;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.supportMulticast = builder.supportMulticast;
            this.tags = builder.tags;
            this.transitRouterCidrList = builder.transitRouterCidrList;
            this.transitRouterDescription = builder.transitRouterDescription;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterName = builder.transitRouterName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouters create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportMulticast
         */
        public Boolean getSupportMulticast() {
            return this.supportMulticast;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterCidrList
         */
        public java.util.List < TransitRouterCidrList> getTransitRouterCidrList() {
            return this.transitRouterCidrList;
        }

        /**
         * @return transitRouterDescription
         */
        public String getTransitRouterDescription() {
            return this.transitRouterDescription;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterName
         */
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long aliUid; 
            private String cenId; 
            private String creationTime; 
            private String regionId; 
            private String status; 
            private Boolean supportMulticast; 
            private java.util.List < Tags> tags; 
            private java.util.List < TransitRouterCidrList> transitRouterCidrList; 
            private String transitRouterDescription; 
            private String transitRouterId; 
            private String transitRouterName; 
            private String type; 

            /**
             * The ID of the Alibaba Cloud account to which the CEN instance belongs.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The ID of the CEN instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the transit router was created.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the region where the transit router is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the transit router. Valid values:
             * <p>
             * 
             * *   **Creating**: The transit router is being created.
             * *   **Active**: The transit router is available.
             * *   **Modifying**: The transit router is being modified
             * *   **Deleting**: The transit router is being deleted.
             * *   **Upgrading**: The transit router is being upgraded.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether multicast is enabled for the transit router. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder supportMulticast(Boolean supportMulticast) {
                this.supportMulticast = supportMulticast;
                return this;
            }

            /**
             * A list of tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The CIDR blocks of the transit router.
             */
            public Builder transitRouterCidrList(java.util.List < TransitRouterCidrList> transitRouterCidrList) {
                this.transitRouterCidrList = transitRouterCidrList;
                return this;
            }

            /**
             * The description of the transit router.
             */
            public Builder transitRouterDescription(String transitRouterDescription) {
                this.transitRouterDescription = transitRouterDescription;
                return this;
            }

            /**
             * The ID of the transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The name of the transit router.
             */
            public Builder transitRouterName(String transitRouterName) {
                this.transitRouterName = transitRouterName;
                return this;
            }

            /**
             * The edition of the transit router. Valid values:
             * <p>
             * 
             * *   **Enterprise**: Enhance Edition
             * *   **Basic**: Basic Edition
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TransitRouters build() {
                return new TransitRouters(this);
            } 

        } 

    }
}
