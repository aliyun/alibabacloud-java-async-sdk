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
 * {@link UpdateTransitRouterPeerAttachmentAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterPeerAttachmentAttributeRequest</p>
 */
public class UpdateTransitRouterPeerAttachmentAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentDescription")
    private String transitRouterAttachmentDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterAttachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentName")
    private String transitRouterAttachmentName;

    private UpdateTransitRouterPeerAttachmentAttributeRequest(Builder builder) {
        super(builder);
        this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
        this.bandwidth = builder.bandwidth;
        this.bandwidthType = builder.bandwidthType;
        this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
        this.clientToken = builder.clientToken;
        this.defaultLinkType = builder.defaultLinkType;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterPeerAttachmentAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateTransitRouterPeerAttachmentAttributeRequest, Builder> {
        private Boolean autoPublishRouteEnabled; 
        private Integer bandwidth; 
        private String bandwidthType; 
        private String cenBandwidthPackageId; 
        private String clientToken; 
        private String defaultLinkType; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterAttachmentDescription; 
        private String transitRouterAttachmentId; 
        private String transitRouterAttachmentName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterPeerAttachmentAttributeRequest request) {
            super(request);
            this.autoPublishRouteEnabled = request.autoPublishRouteEnabled;
            this.bandwidth = request.bandwidth;
            this.bandwidthType = request.bandwidthType;
            this.cenBandwidthPackageId = request.cenBandwidthPackageId;
            this.clientToken = request.clientToken;
            this.defaultLinkType = request.defaultLinkType;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterAttachmentDescription = request.transitRouterAttachmentDescription;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterAttachmentName = request.transitRouterAttachmentName;
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
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * <p>The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.</p>
         * <blockquote>
         * <p> If you set <strong>BandwidthType</strong> to <strong>DataTransfer</strong>, you do not need to set this parameter.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
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
         * <p>Specifies whether to perform a dry run to check information such as the permissions and the instance status. Default values:</p>
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
         * <p>The new description of the inter-region connection.</p>
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
         * <p>The ID of the inter-region connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-ft94dcrbc3e5taun3x</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * <p>The new name of the inter-region connection.</p>
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

        @Override
        public UpdateTransitRouterPeerAttachmentAttributeRequest build() {
            return new UpdateTransitRouterPeerAttachmentAttributeRequest(this);
        } 

    } 

}
