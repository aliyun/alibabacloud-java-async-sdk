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
    private java.util.List<TransitRouterAttachments> transitRouterAttachments;

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
    public java.util.List<TransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TransitRouterAttachments> transitRouterAttachments; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If the <strong>NextToken</strong> parameter is empty, no next page exists.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AA97AFA3-8E48-4BD7-9F3E-A9F6176018A0</p>
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
         * <p>A list of inter-region connections.</p>
         */
        public Builder transitRouterAttachments(java.util.List<TransitRouterAttachments> transitRouterAttachments) {
            this.transitRouterAttachments = transitRouterAttachments;
            return this;
        }

        public ListTransitRouterPeerAttachmentsResponseBody build() {
            return new ListTransitRouterPeerAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterPeerAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterPeerAttachmentsResponseBody</p>
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
             * <p>tag_A1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link ListTransitRouterPeerAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterPeerAttachmentsResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private String transitRouterAttachmentDescription; 
            private String transitRouterAttachmentId; 
            private String transitRouterAttachmentName; 
            private String transitRouterId; 

            /**
             * <p>Indicates whether the local Enterprise Edition transit router automatically advertises routes of the cross-region connection to the peer transit router. Valid values:</p>
             * <ul>
             * <li><strong>false</strong> (default)</li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
                this.autoPublishRouteEnabled = autoPublishRouteEnabled;
                return this;
            }

            /**
             * <p>The bandwidth value of the inter-region connection. Unit: Mbit/s.</p>
             * <ul>
             * <li>This parameter specifies the maximum bandwidth value for the inter-region connection if you set <strong>BandwidthType</strong> to <strong>BandwidthPackage</strong>.</li>
             * <li>This parameter specifies the bandwidth throttling threshold for the inter-region connection if you set <strong>BandwidthType</strong> to <strong>DataTransfer</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The bandwidth allocation method. Valid values:</p>
             * <ul>
             * <li><strong>BandwidthPackage</strong>: allocates bandwidth from a bandwidth plan.</li>
             * <li><strong>DataTransfer</strong>: bandwidth is billed based on the pay-by-data-transfer metering method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BandwidthPackage</p>
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * <p>The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.</p>
             * 
             * <strong>example:</strong>
             * <p>cenbwp-3xrxupouolw5ou****</p>
             */
            public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
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
             * <p>The time when the inter-region connection was created.</p>
             * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-16T02:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The default line type.</p>
             * <ul>
             * <li><strong>Gold</strong> (default)</li>
             * <li><strong>Platinum</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Gold</p>
             */
            public Builder defaultLinkType(String defaultLinkType) {
                this.defaultLinkType = defaultLinkType;
                return this;
            }

            /**
             * <p>The areas that are connected by the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>china_china</p>
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * <p>The ID of the peer transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-m5eq27g6bndum7e88****</p>
             */
            public Builder peerTransitRouterId(String peerTransitRouterId) {
                this.peerTransitRouterId = peerTransitRouterId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the peer transit router belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder peerTransitRouterOwnerId(Long peerTransitRouterOwnerId) {
                this.peerTransitRouterOwnerId = peerTransitRouterOwnerId;
                return this;
            }

            /**
             * <p>The region ID of the peer transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder peerTransitRouterRegionId(String peerTransitRouterRegionId) {
                this.peerTransitRouterRegionId = peerTransitRouterRegionId;
                return this;
            }

            /**
             * <p>The region ID of the Enterprise Edition transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the resource to which the transit router is connected. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
             * <li><strong>CCN</strong>: Cloud Connect Network (CCN) instance</li>
             * <li><strong>VBR</strong>: virtual border router (VBR)</li>
             * <li><strong>TR</strong>: transit router</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TR</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The status of the inter-region connection. Valid values:</p>
             * <ul>
             * <li><strong>Attached</strong></li>
             * <li><strong>Attaching</strong></li>
             * <li><strong>Detaching</strong></li>
             * <li><strong>Detached</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder status(String status) {
                this.status = status;
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
             * <p>The description of the inter-region connection.</p>
             * 
             * <strong>example:</strong>
             * <p>testdesc</p>
             */
            public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
                this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
                return this;
            }

            /**
             * <p>The ID of the inter-region connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-5u4qbayfv2io5v****</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The name of the inter-region connection.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
                this.transitRouterAttachmentName = transitRouterAttachmentName;
                return this;
            }

            /**
             * <p>The ID of the Enterprise Edition transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-bp1su1ytdxtataupl****</p>
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
