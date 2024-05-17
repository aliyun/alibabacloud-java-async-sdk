// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterPeerAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterPeerAttachmentsResponseBody</p>
 */
public class ListTransitRouterPeerAttachmentsResponseBody extends TeaModel {
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

    private ListTransitRouterPeerAttachmentsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterAttachments = builder.transitRouterAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterPeerAttachmentsResponseBody create() {
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
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If the **NextToken** parameter is empty, no next page exists.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
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
         * A list of inter-region connections.
         */
        public Builder transitRouterAttachments(java.util.List < TransitRouterAttachments> transitRouterAttachments) {
            this.transitRouterAttachments = transitRouterAttachments;
            return this;
        }

        public ListTransitRouterPeerAttachmentsResponseBody build() {
            return new ListTransitRouterPeerAttachmentsResponseBody(this);
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
    public static class TransitRouterAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPublishRouteEnabled")
        private Boolean autoPublishRouteEnabled;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageId")
        private String cenBandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DefaultLinkType")
        private String defaultLinkType;

        @com.aliyun.core.annotation.NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @com.aliyun.core.annotation.NameInMap("PeerTransitRouterId")
        private String peerTransitRouterId;

        @com.aliyun.core.annotation.NameInMap("PeerTransitRouterOwnerId")
        private Long peerTransitRouterOwnerId;

        @com.aliyun.core.annotation.NameInMap("PeerTransitRouterRegionId")
        private String peerTransitRouterRegionId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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

        private TransitRouterAttachments(Builder builder) {
            this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.defaultLinkType = builder.defaultLinkType;
            this.geographicSpanId = builder.geographicSpanId;
            this.peerTransitRouterId = builder.peerTransitRouterId;
            this.peerTransitRouterOwnerId = builder.peerTransitRouterOwnerId;
            this.peerTransitRouterRegionId = builder.peerTransitRouterRegionId;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
            this.transitRouterId = builder.transitRouterId;
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
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return cenBandwidthPackageId
         */
        public String getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
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
         * @return defaultLinkType
         */
        public String getDefaultLinkType() {
            return this.defaultLinkType;
        }

        /**
         * @return geographicSpanId
         */
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        /**
         * @return peerTransitRouterId
         */
        public String getPeerTransitRouterId() {
            return this.peerTransitRouterId;
        }

        /**
         * @return peerTransitRouterOwnerId
         */
        public Long getPeerTransitRouterOwnerId() {
            return this.peerTransitRouterOwnerId;
        }

        /**
         * @return peerTransitRouterRegionId
         */
        public String getPeerTransitRouterRegionId() {
            return this.peerTransitRouterRegionId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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

        public static final class Builder {
            private Boolean autoPublishRouteEnabled; 
            private Integer bandwidth; 
            private String bandwidthType; 
            private String cenBandwidthPackageId; 
            private String cenId; 
            private String creationTime; 
            private String defaultLinkType; 
            private String geographicSpanId; 
            private String peerTransitRouterId; 
            private Long peerTransitRouterOwnerId; 
            private String peerTransitRouterRegionId; 
            private String regionId; 
            private String resourceType; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String transitRouterAttachmentDescription; 
            private String transitRouterAttachmentId; 
            private String transitRouterAttachmentName; 
            private String transitRouterId; 

            /**
             * Indicates whether the local Enterprise Edition transit router automatically advertises routes of the cross-region connection to the peer transit router. Valid values:
             * <p>
             * 
             * *   **false** (default)
             * *   **true**
             */
            public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
                this.autoPublishRouteEnabled = autoPublishRouteEnabled;
                return this;
            }

            /**
             * The bandwidth value of the inter-region connection. Unit: Mbit/s.
             * <p>
             * 
             * *   This parameter specifies the maximum bandwidth value for the inter-region connection if you set **BandwidthType** to **BandwidthPackage**.
             * *   This parameter specifies the bandwidth throttling threshold for the inter-region connection if you set **BandwidthType** to **DataTransfer**.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The bandwidth allocation method. Valid values:
             * <p>
             * 
             * *   **BandwidthPackage**: allocates bandwidth from a bandwidth plan.
             * *   **DataTransfer**: bandwidth is billed based on the pay-by-data-transfer metering method.
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.
             */
            public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
                return this;
            }

            /**
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the inter-region connection was created.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The default line type.
             * <p>
             * 
             * *   **Gold** (default)
             * *   **Platinum**
             */
            public Builder defaultLinkType(String defaultLinkType) {
                this.defaultLinkType = defaultLinkType;
                return this;
            }

            /**
             * The areas that are connected by the bandwidth plan.
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * The ID of the peer transit router.
             */
            public Builder peerTransitRouterId(String peerTransitRouterId) {
                this.peerTransitRouterId = peerTransitRouterId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the peer transit router belongs.
             */
            public Builder peerTransitRouterOwnerId(Long peerTransitRouterOwnerId) {
                this.peerTransitRouterOwnerId = peerTransitRouterOwnerId;
                return this;
            }

            /**
             * The region ID of the peer transit router.
             */
            public Builder peerTransitRouterRegionId(String peerTransitRouterRegionId) {
                this.peerTransitRouterRegionId = peerTransitRouterRegionId;
                return this;
            }

            /**
             * The region ID of the Enterprise Edition transit router.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the resource to which the transit router is connected. Valid values:
             * <p>
             * 
             * *   **VPC**: virtual private cloud (VPC)
             * *   **CCN**: Cloud Connect Network (CCN) instance
             * *   **VBR**: virtual border router (VBR)
             * *   **TR**: transit router
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The status of the inter-region connection. Valid values:
             * <p>
             * 
             * *   **Attached**
             * *   **Attaching**
             * *   **Detaching**
             * *   **Detached**
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
             * The description of the inter-region connection.
             */
            public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
                this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
                return this;
            }

            /**
             * The ID of the inter-region connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The name of the inter-region connection.
             */
            public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
                this.transitRouterAttachmentName = transitRouterAttachmentName;
                return this;
            }

            /**
             * The ID of the Enterprise Edition transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public TransitRouterAttachments build() {
                return new TransitRouterAttachments(this);
            } 

        } 

    }
}
