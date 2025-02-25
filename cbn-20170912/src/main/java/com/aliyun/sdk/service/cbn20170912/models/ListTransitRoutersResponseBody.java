// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListTransitRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRoutersResponseBody</p>
 */
public class ListTransitRoutersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouters")
    private java.util.List<TransitRouters> transitRouters;

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
    public java.util.List<TransitRouters> getTransitRouters() {
        return this.transitRouters;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TransitRouters> transitRouters; 

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>68521297-5FA6-46CB-B4EB-658F1C68C8CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of transit routers.</p>
         */
        public Builder transitRouters(java.util.List<TransitRouters> transitRouters) {
            this.transitRouters = transitRouters;
            return this;
        }

        public ListTransitRoutersResponseBody build() {
            return new ListTransitRoutersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRoutersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
    /**
     * 
     * {@link ListTransitRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRoutersResponseBody</p>
     */
    public static class TransitRouterCidrList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublishCidrRoute")
        private Boolean publishCidrRoute;

        @com.aliyun.core.annotation.NameInMap("TransitRouterCidrId")
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
             * <p>The CIDR block of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>CIDRdesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>CIDRname</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the system is allowed to automatically add a route to the route table of the transit router. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: yes</p>
             * <p>A value of <strong>true</strong> indicates that after you create a private VPN connection and create a route learning correlation for the private VPC connection, the system automatically adds the following route to the route table of the transit router that is in route learning correlation with the private VPN connection: A blackhole route whose destination CIDR block is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections. </p>
             * <p>The blackhole route is advertised only to the route tables of virtual border routers (VBRs) that are connected to the transit router. </p>
             * </li>
             * <li><p><strong>false</strong>: no</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publishCidrRoute(Boolean publishCidrRoute) {
                this.publishCidrRoute = publishCidrRoute;
                return this;
            }

            /**
             * <p>The ID of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>cidr-46p5ceg21e8152****</p>
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
    /**
     * 
     * {@link ListTransitRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRoutersResponseBody</p>
     */
    public static class TransitRouters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportMulticast")
        private Boolean supportMulticast;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterCidrList")
        private java.util.List<TransitRouterCidrList> transitRouterCidrList;

        @com.aliyun.core.annotation.NameInMap("TransitRouterDescription")
        private String transitRouterDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterName")
        private String transitRouterName;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterCidrList
         */
        public java.util.List<TransitRouterCidrList> getTransitRouterCidrList() {
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
            private java.util.List<Tags> tags; 
            private java.util.List<TransitRouterCidrList> transitRouterCidrList; 
            private String transitRouterDescription; 
            private String transitRouterId; 
            private String transitRouterName; 
            private String type; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-j3jzhw1zpau2km****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The time when the transit router was created.</p>
             * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T09:39Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the region where the transit router is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the transit router. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The transit router is being created.</li>
             * <li><strong>Active</strong>: The transit router is available.</li>
             * <li><strong>Modifying</strong>: The transit router is being modified</li>
             * <li><strong>Deleting</strong>: The transit router is being deleted.</li>
             * <li><strong>Upgrading</strong>: The transit router is being upgraded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether multicast is enabled for the transit router. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportMulticast(Boolean supportMulticast) {
                this.supportMulticast = supportMulticast;
                return this;
            }

            /**
             * <p>A list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The CIDR blocks of the transit router.</p>
             */
            public Builder transitRouterCidrList(java.util.List<TransitRouterCidrList> transitRouterCidrList) {
                this.transitRouterCidrList = transitRouterCidrList;
                return this;
            }

            /**
             * <p>The description of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>testdesc</p>
             */
            public Builder transitRouterDescription(String transitRouterDescription) {
                this.transitRouterDescription = transitRouterDescription;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-bp1su1ytdxtataupl****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The name of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder transitRouterName(String transitRouterName) {
                this.transitRouterName = transitRouterName;
                return this;
            }

            /**
             * <p>The edition of the transit router. Valid values:</p>
             * <ul>
             * <li><strong>Enterprise</strong>: Enhance Edition</li>
             * <li><strong>Basic</strong>: Basic Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enterprise</p>
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
