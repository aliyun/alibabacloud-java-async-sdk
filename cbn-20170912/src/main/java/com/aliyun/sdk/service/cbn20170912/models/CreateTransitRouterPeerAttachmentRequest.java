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
 * {@link CreateTransitRouterPeerAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterPeerAttachmentRequest</p>
 */
public class CreateTransitRouterPeerAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPublishRouteEnabled")
    private Boolean autoPublishRouteEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 100000000)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthType")
    private String bandwidthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageId")
    private String cenBandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultLinkType")
    private String defaultLinkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerTransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String peerTransitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerTransitRouterRegionId")
    private String peerTransitRouterRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentDescription")
    private String transitRouterAttachmentDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentName")
    private String transitRouterAttachmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateTransitRouterPeerAttachmentRequest(Builder builder) {
        super(builder);
        this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
        this.bandwidth = builder.bandwidth;
        this.bandwidthType = builder.bandwidthType;
        this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.defaultLinkType = builder.defaultLinkType;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerTransitRouterId = builder.peerTransitRouterId;
        this.peerTransitRouterRegionId = builder.peerTransitRouterRegionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
        this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPeerAttachmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return defaultLinkType
     */
    public String getDefaultLinkType() {
        return this.defaultLinkType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return peerTransitRouterId
     */
    public String getPeerTransitRouterId() {
        return this.peerTransitRouterId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return transitRouterAttachmentDescription
     */
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
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

    public static final class Builder extends Request.Builder<CreateTransitRouterPeerAttachmentRequest, Builder> {
        private Boolean autoPublishRouteEnabled; 
        private Integer bandwidth; 
        private String bandwidthType; 
        private String cenBandwidthPackageId; 
        private String cenId; 
        private String clientToken; 
        private String defaultLinkType; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerTransitRouterId; 
        private String peerTransitRouterRegionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String transitRouterAttachmentDescription; 
        private String transitRouterAttachmentName; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterPeerAttachmentRequest request) {
            super(request);
            this.autoPublishRouteEnabled = request.autoPublishRouteEnabled;
            this.bandwidth = request.bandwidth;
            this.bandwidthType = request.bandwidthType;
            this.cenBandwidthPackageId = request.cenBandwidthPackageId;
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.defaultLinkType = request.defaultLinkType;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerTransitRouterId = request.peerTransitRouterId;
            this.peerTransitRouterRegionId = request.peerTransitRouterRegionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.transitRouterAttachmentDescription = request.transitRouterAttachmentDescription;
            this.transitRouterAttachmentName = request.transitRouterAttachmentName;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): no</li>
         * <li><strong>true</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.putQueryParameter("AutoPublishRouteEnabled", autoPublishRouteEnabled);
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
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The method that is used to allocate bandwidth to the inter-region connection. Valid values:</p>
         * <ul>
         * <li><strong>BandwidthPackage</strong>: allocates bandwidth from a bandwidth plan.</li>
         * <li><strong>DataTransfer</strong>: bandwidth is billed based on the pay-by-data-transfer metering method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BandwidthPackage</p>
         */
        public Builder bandwidthType(String bandwidthType) {
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * <p>The ID of the bandwidth plan that you want to associate with the inter-region connection.</p>
         * <blockquote>
         * <p> If you set <strong>BandwidthType</strong> to <strong>DataTransfer</strong>, you can skip this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cenbwp-3xrxupouolw5ou****</p>
         */
        public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
            this.putQueryParameter("CenBandwidthPackageId", cenBandwidthPackageId);
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-j3jzhw1zpau2km****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The default line type.</p>
         * <p>Valid values: Platinum and Gold.</p>
         * <p>Platinum is supported only when BandwidthType is set to DataTransfer.</p>
         * 
         * <strong>example:</strong>
         * <p>Gold</p>
         */
        public Builder defaultLinkType(String defaultLinkType) {
            this.putQueryParameter("DefaultLinkType", defaultLinkType);
            this.defaultLinkType = defaultLinkType;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Default values:</p>
         * <ul>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters and request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the system returns the ID of the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the peer transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-m5eq27g6bndum7e88****</p>
         */
        public Builder peerTransitRouterId(String peerTransitRouterId) {
            this.putQueryParameter("PeerTransitRouterId", peerTransitRouterId);
            this.peerTransitRouterId = peerTransitRouterId;
            return this;
        }

        /**
         * <p>The ID of the region where the peer transit router is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder peerTransitRouterRegionId(String peerTransitRouterRegionId) {
            this.putQueryParameter("PeerTransitRouterRegionId", peerTransitRouterRegionId);
            this.peerTransitRouterRegionId = peerTransitRouterRegionId;
            return this;
        }

        /**
         * <p>The ID of the region where the local Enterprise Edition transit router is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The information about the tags.</p>
         * <p>You can specify at most 20 tags in each call.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The description of the inter-region connection.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.putQueryParameter("TransitRouterAttachmentDescription", transitRouterAttachmentDescription);
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }

        /**
         * <p>The name of the inter-region connection.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            this.putQueryParameter("TransitRouterAttachmentName", transitRouterAttachmentName);
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }

        /**
         * <p>The ID of the local Enterprise Edition transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateTransitRouterPeerAttachmentRequest build() {
            return new CreateTransitRouterPeerAttachmentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTransitRouterPeerAttachmentRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterPeerAttachmentRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys.</p>
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
             * <p>The tag value can be 0 to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>value_A1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
