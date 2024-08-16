// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterVpnAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterVpnAttachmentsResponseBody</p>
 */
public class ListTransitRouterVpnAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachments")
    private java.util.List < TransitRouterAttachments> transitRouterAttachments;

    private ListTransitRouterVpnAttachmentsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterAttachments = builder.transitRouterAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterVpnAttachmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return transitRouterAttachments
     */
    public java.util.List < TransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterAttachments> transitRouterAttachments; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is not returned, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The information about the VPN attachment.
         */
        public Builder transitRouterAttachments(java.util.List < TransitRouterAttachments> transitRouterAttachments) {
            this.transitRouterAttachments = transitRouterAttachments;
            return this;
        }

        public ListTransitRouterVpnAttachmentsResponseBody build() {
            return new ListTransitRouterVpnAttachmentsResponseBody(this);
        } 

    } 

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
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String zoneId; 

            /**
             * The zone ID.
             * <p>
             * 
             * You can call the [DescribeZones](~~36064~~) operation to query the most recent zone list.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    public static class TransitRouterAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPublishRouteEnabled")
        private Boolean autoPublishRouteEnabled;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentDescription")
        private String transitRouterAttachmentDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentName")
        private String transitRouterAttachmentName;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("VpnId")
        private String vpnId;

        @com.aliyun.core.annotation.NameInMap("VpnOwnerId")
        private Long vpnOwnerId;

        @com.aliyun.core.annotation.NameInMap("VpnRegionId")
        private String vpnRegionId;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List < Zones> zones;

        private TransitRouterAttachments(Builder builder) {
            this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
            this.cenId = builder.cenId;
            this.chargeType = builder.chargeType;
            this.creationTime = builder.creationTime;
            this.orderType = builder.orderType;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
            this.transitRouterId = builder.transitRouterId;
            this.vpnId = builder.vpnId;
            this.vpnOwnerId = builder.vpnOwnerId;
            this.vpnRegionId = builder.vpnRegionId;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterAttachments create() {
            return builder().build();
        }

        /**
         * @return autoPublishRouteEnabled
         */
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterAttachmentDescription
         */
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        /**
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        /**
         * @return transitRouterAttachmentName
         */
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return vpnId
         */
        public String getVpnId() {
            return this.vpnId;
        }

        /**
         * @return vpnOwnerId
         */
        public Long getVpnOwnerId() {
            return this.vpnOwnerId;
        }

        /**
         * @return vpnRegionId
         */
        public String getVpnRegionId() {
            return this.vpnRegionId;
        }

        /**
         * @return zones
         */
        public java.util.List < Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private Boolean autoPublishRouteEnabled; 
            private String cenId; 
            private String chargeType; 
            private String creationTime; 
            private String orderType; 
            private String resourceType; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String transitRouterAttachmentDescription; 
            private String transitRouterAttachmentId; 
            private String transitRouterAttachmentName; 
            private String transitRouterId; 
            private String vpnId; 
            private Long vpnOwnerId; 
            private String vpnRegionId; 
            private java.util.List < Zones> zones; 

            /**
             * Indicates the transit router can automatically advertise routes to the IPsec connection. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
                this.autoPublishRouteEnabled = autoPublishRouteEnabled;
                return this;
            }

            /**
             * The ID of the Cloud Enterprise Network (CEN) instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The billing method of the VPN attachment.
             * <p>
             * 
             * Only POSTPAY may be returned, which is the default pay-as-you-go billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the VPN connection was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The entity that pays the fees of the network instance. Valid values:
             * <p>
             * 
             * *   **PayByCenOwner**: the Alibaba Cloud account that owns the CEN instance.
             * *   **PayByResourceOwner**: the Alibaba Cloud account that owns the network instance.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The type of resource attached to the transit router.
             * <p>
             * 
             * Only **VPN** may be returned, which indicates that an IPsec-VPN connection is attached to the transit router.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The status of the VPN connection. Valid values:
             * <p>
             * 
             * *   **Attached**
             * *   **Attaching**
             * *   **Detaching**
             */
            public Builder status(String status) {
                this.status = status;
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
             * The description of the IPsec-VPN connection.
             */
            public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
                this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
                return this;
            }

            /**
             * The ID of the VPN attachment.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The name of the VPN attachment.
             */
            public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
                this.transitRouterAttachmentName = transitRouterAttachmentName;
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
             * The ID of the IPsec-VPN connection.
             */
            public Builder vpnId(String vpnId) {
                this.vpnId = vpnId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.
             */
            public Builder vpnOwnerId(Long vpnOwnerId) {
                this.vpnOwnerId = vpnOwnerId;
                return this;
            }

            /**
             * The ID of the region to which the IPsec-VPN connection belongs.
             * <p>
             * 
             * You can call the [DescribeRegions](~~36063~~) operation to query the region ID.
             */
            public Builder vpnRegionId(String vpnRegionId) {
                this.vpnRegionId = vpnRegionId;
                return this;
            }

            /**
             * The zones in which the VPN attachment is deployed.
             */
            public Builder zones(java.util.List < Zones> zones) {
                this.zones = zones;
                return this;
            }

            public TransitRouterAttachments build() {
                return new TransitRouterAttachments(this);
            } 

        } 

    }
}
