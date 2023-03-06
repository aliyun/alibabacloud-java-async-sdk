// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterPeerAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterPeerAttachmentsResponseBody</p>
 */
public class ListTransitRouterPeerAttachmentsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterAttachments")
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
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If the returned value of **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If the returned value of **NextToken** is not empty, the value indicates the token that is used for the next query.
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of cross-region connections.
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
             * The key of tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
        @NameInMap("AutoPublishRouteEnabled")
        private Boolean autoPublishRouteEnabled;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BandwidthType")
        private String bandwidthType;

        @NameInMap("CenBandwidthPackageId")
        private String cenBandwidthPackageId;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @NameInMap("PeerTransitRouterId")
        private String peerTransitRouterId;

        @NameInMap("PeerTransitRouterOwnerId")
        private Long peerTransitRouterOwnerId;

        @NameInMap("PeerTransitRouterRegionId")
        private String peerTransitRouterRegionId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TransitRouterAttachmentDescription")
        private String transitRouterAttachmentDescription;

        @NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @NameInMap("TransitRouterAttachmentName")
        private String transitRouterAttachmentName;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        private TransitRouterAttachments(Builder builder) {
            this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
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
             * *   **false** (default): no
             * *   **true**: yes
             */
            public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
                this.autoPublishRouteEnabled = autoPublishRouteEnabled;
                return this;
            }

            /**
             * The bandwidth value of the cross-region connection. Unit: Mbit/s.
             * <p>
             * 
             * *   If **BandwidthType** is set to **BandwidthPackage**, this parameter indicates the bandwidth that is available for the cross-region connection.
             * *   If **BandwidthType** is set to **DataTransfer**, this parameter indicates the bandwidth limit of the cross-region connection.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The bandwidth allocation method. Valid values:
             * <p>
             * 
             * **BandwidthPackage**: allocates bandwidth from a bandwidth plan.
             * 
             * **DataTransfer**: uses pay-by-data-transfer bandwidth.
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * The ID of the bandwidth plan that is used to allocate bandwidth to the cross-region connection.
             */
            public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
                return this;
            }

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the cross-region connection was created.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-ddTHH:mmZ` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The ID of the region where the peer transit router is deployed.
             */
            public Builder peerTransitRouterRegionId(String peerTransitRouterRegionId) {
                this.peerTransitRouterRegionId = peerTransitRouterRegionId;
                return this;
            }

            /**
             * The ID of the region where the Enterprise Edition transit router is deployed.
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
             * The status of the cross-region connection. Valid values:
             * <p>
             * 
             * *   **Attached**: The local transit router is connected to the peer transit router.
             * *   **Attaching**: The local transit router is connecting to the peer transit router.
             * *   **Detaching**: The local transit router is disconnecting from the peer transit router.
             * *   **Detached**: The local transit router is disconnected from the peer transit router.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The list of tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The description of the cross-region connection.
             */
            public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
                this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
                return this;
            }

            /**
             * The ID of the cross-region connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The name of the cross-region connection.
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
