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
 * {@link ListTransitRouterVpcAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterVpcAttachmentsResponseBody</p>
 */
public class ListTransitRouterVpcAttachmentsResponseBody extends TeaModel {
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

    private ListTransitRouterVpcAttachmentsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterAttachments = builder.transitRouterAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterVpcAttachmentsResponseBody create() {
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
         * <p>The token that determines the start point of the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>C97FF53F-3EF8-4883-B459-60E171924B23</p>
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
         * <p>The information about the VPC connection.</p>
         */
        public Builder transitRouterAttachments(java.util.List<TransitRouterAttachments> transitRouterAttachments) {
            this.transitRouterAttachments = transitRouterAttachments;
            return this;
        }

        public ListTransitRouterVpcAttachmentsResponseBody build() {
            return new ListTransitRouterVpcAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterVpcAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterVpcAttachmentsResponseBody</p>
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
             * <p>test</p>
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
     * {@link ListTransitRouterVpcAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterVpcAttachmentsResponseBody</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.networkInterfaceId = builder.networkInterfaceId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String networkInterfaceId; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * <p>The ID of the ENI created by the Enterprise Edition transit router in the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp149hmyaqegerml****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1a214sbus8z3b54****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTransitRouterVpcAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterVpcAttachmentsResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentDescription")
        private String transitRouterAttachmentDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentName")
        private String transitRouterAttachmentName;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterVPCAttachmentOptions")
        private java.util.Map<String, String> transitRouterVPCAttachmentOptions;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
        private Long vpcOwnerId;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        @com.aliyun.core.annotation.NameInMap("ZoneMappings")
        private java.util.List<ZoneMappings> zoneMappings;

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
            this.transitRouterVPCAttachmentOptions = builder.transitRouterVPCAttachmentOptions;
            this.vpcId = builder.vpcId;
            this.vpcOwnerId = builder.vpcOwnerId;
            this.vpcRegionId = builder.vpcRegionId;
            this.zoneMappings = builder.zoneMappings;
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

        /**
         * @return transitRouterVPCAttachmentOptions
         */
        public java.util.Map<String, String> getTransitRouterVPCAttachmentOptions() {
            return this.transitRouterVPCAttachmentOptions;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcOwnerId
         */
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        /**
         * @return vpcRegionId
         */
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        /**
         * @return zoneMappings
         */
        public java.util.List<ZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

        public static final class Builder {
            private Boolean autoPublishRouteEnabled; 
            private String cenId; 
            private String chargeType; 
            private String creationTime; 
            private String orderType; 
            private String resourceType; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String transitRouterAttachmentDescription; 
            private String transitRouterAttachmentId; 
            private String transitRouterAttachmentName; 
            private String transitRouterId; 
            private java.util.Map<String, String> transitRouterVPCAttachmentOptions; 
            private String vpcId; 
            private Long vpcOwnerId; 
            private String vpcRegionId; 
            private java.util.List<ZoneMappings> zoneMappings; 

            /**
             * <p>Indicates whether the Enterprise Edition transit router can automatically advertise routes to the VPC. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
                this.autoPublishRouteEnabled = autoPublishRouteEnabled;
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
             * <p>The billing method of the VPC connection.</p>
             * <p>Only <strong>POSTPAY</strong> may be returned, which indicates the default pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the VPC connection was created.</p>
             * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T02:14Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The entity that pays the fees of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>PayByCenOwner</strong>: the Alibaba Cloud account that owns the CEN instance.</li>
             * <li><strong>PayByResourceOwner</strong>: the Alibaba Cloud account that owns the network instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByCenOwner</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The type of resource to which the transit router is connected.</p>
             * <p>Only <strong>VPC</strong> may be returned, which indicates VPCs.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The status of the VPC connection. Valid values:</p>
             * <ul>
             * <li><strong>Attached</strong></li>
             * <li><strong>Attaching</strong></li>
             * <li><strong>Detaching</strong></li>
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
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The description of the VPC connection.</p>
             * 
             * <strong>example:</strong>
             * <p>testdesc</p>
             */
            public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
                this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
                return this;
            }

            /**
             * <p>The VPC connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-nls9fzkfat8934****</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The name of the VPC connection.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
                this.transitRouterAttachmentName = transitRouterAttachmentName;
                return this;
            }

            /**
             * <p>The description of the Enterprise Edition transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-bp1su1ytdxtataupl****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The features of the VPC connection.</p>
             */
            public Builder transitRouterVPCAttachmentOptions(java.util.Map<String, String> transitRouterVPCAttachmentOptions) {
                this.transitRouterVPCAttachmentOptions = transitRouterVPCAttachmentOptions;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1h8vbrbcgohcju5****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder vpcOwnerId(Long vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            /**
             * <p>The primary and secondary zones, vSwitches, and ENIs of the VPC.</p>
             */
            public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
                this.zoneMappings = zoneMappings;
                return this;
            }

            public TransitRouterAttachments build() {
                return new TransitRouterAttachments(this);
            } 

        } 

    }
}
