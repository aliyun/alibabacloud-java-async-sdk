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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListTransitRoutersResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.transitRouters = model.transitRouters;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. For more information about paging, see the related parameter descriptions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <p>The list of transit router instances.</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            private Builder() {
            } 

            private Builder(TransitRouterCidrList model) {
                this.cidr = model.cidr;
                this.description = model.description;
                this.name = model.name;
                this.publishCidrRoute = model.publishCidrRoute;
                this.transitRouterCidrId = model.transitRouterCidrId;
            } 

            /**
             * <p>The transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>CIDRdesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the transit router CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>CIDRname</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the system is allowed to automatically add a route for the transit router CIDR block to the transit router route table. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: allowed.</p>
             * <p>   If the value is <strong>true</strong>, after you create a VPN connection of the private gateway type and create a route learning relationship for the VPN connection, the system automatically adds the following route entry to the transit router route table that has a route learning relationship with the VPN connection:</p>
             * <p>A blackhole route whose destination CIDR block is the transit router CIDR block from which a gateway IP address is allocated to the IPsec connection.</p>
             * <p>The blackhole route is propagated only to the route tables of VBR instances under the transit router.</p>
             * </li>
             * <li><p><strong>false</strong>: not allowed.</p>
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
             * <p>The ID of the transit router CIDR block.</p>
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

            private Builder() {
            } 

            private Builder(TransitRouters model) {
                this.aliUid = model.aliUid;
                this.cenId = model.cenId;
                this.creationTime = model.creationTime;
                this.regionId = model.regionId;
                this.status = model.status;
                this.supportMulticast = model.supportMulticast;
                this.tags = model.tags;
                this.transitRouterCidrList = model.transitRouterCidrList;
                this.transitRouterDescription = model.transitRouterDescription;
                this.transitRouterId = model.transitRouterId;
                this.transitRouterName = model.transitRouterName;
                this.type = model.type;
            } 

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
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-j3jzhw1zpau2km****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The time when the transit router instance was created.</p>
             * <p>The time is displayed in UTC in the <code>YYYY-MM-DDThh:mmZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T09:39Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The region ID of the transit router instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the transit router instance. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: being created.</li>
             * <li><strong>Active</strong>: active.</li>
             * <li><strong>Modifying</strong>: being modified.</li>
             * <li><strong>Deleting</strong>: being deleted.</li>
             * <li><strong>Upgrading</strong>: being upgraded.</li>
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
             * <p>Indicates whether the multicast feature is enabled for the transit router instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled.</li>
             * <li><strong>false</strong>: disabled.</li>
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
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The list of transit router CIDR blocks.</p>
             */
            public Builder transitRouterCidrList(java.util.List<TransitRouterCidrList> transitRouterCidrList) {
                this.transitRouterCidrList = transitRouterCidrList;
                return this;
            }

            /**
             * <p>The description of the transit router instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testdesc</p>
             */
            public Builder transitRouterDescription(String transitRouterDescription) {
                this.transitRouterDescription = transitRouterDescription;
                return this;
            }

            /**
             * <p>The transit router instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-bp1su1ytdxtataupl****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The name of the transit router instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder transitRouterName(String transitRouterName) {
                this.transitRouterName = transitRouterName;
                return this;
            }

            /**
             * <p>The type of the transit router instance. Valid values:</p>
             * <ul>
             * <li><strong>Enterprise</strong>: Enterprise Edition transit router.</li>
             * <li><strong>Basic</strong>: Basic Edition transit router.</li>
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
