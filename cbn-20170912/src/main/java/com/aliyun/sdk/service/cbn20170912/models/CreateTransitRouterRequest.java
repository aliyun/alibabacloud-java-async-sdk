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
 * {@link CreateTransitRouterRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterRequest</p>
 */
public class CreateTransitRouterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportMulticast")
    private Boolean supportMulticast;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterCidrList")
    private java.util.List<TransitRouterCidrList> transitRouterCidrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterDescription")
    private String transitRouterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterName")
    private String transitRouterName;

    private CreateTransitRouterRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.supportMulticast = builder.supportMulticast;
        this.tag = builder.tag;
        this.transitRouterCidrList = builder.transitRouterCidrList;
        this.transitRouterDescription = builder.transitRouterDescription;
        this.transitRouterName = builder.transitRouterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return supportMulticast
     */
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
     * @return transitRouterName
     */
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterRequest, Builder> {
        private String cenId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean supportMulticast; 
        private java.util.List<Tag> tag; 
        private java.util.List<TransitRouterCidrList> transitRouterCidrList; 
        private String transitRouterDescription; 
        private String transitRouterName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.supportMulticast = request.supportMulticast;
            this.tag = request.tag;
            this.transitRouterCidrList = request.transitRouterCidrList;
            this.transitRouterDescription = request.transitRouterDescription;
            this.transitRouterName = request.transitRouterName;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * <p>This parameter is required.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request.
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the system automatically uses <strong>RequestId</strong> as <strong>ClientToken</strong>. The value of <strong>RequestId</strong> of each API request is different.</p>
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
         * <p>Specifies whether to check the request without performing the operation. Check items include permissions and the status of the specified cloud resources. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends the request. If the request passes the check, an Enterprise Edition transit router is created.</li>
         * <li><strong>true</strong>: checks the request but does not create the Enterprise Edition transit router. If you use this value, the system checks whether the required parameters are set, and whether the request syntax is valid. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
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
         * <p>Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): no</li>
         * <li><strong>true</strong>: yes</li>
         * </ul>
         * <p>The multicast feature is supported only in specific regions. You can call <a href="https://help.aliyun.com/document_detail/261356.html">ListTransitRouterAvailableResource</a> to query the regions that support multicast.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder supportMulticast(Boolean supportMulticast) {
            this.putQueryParameter("SupportMulticast", supportMulticast);
            this.supportMulticast = supportMulticast;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The CIDR blocks to be added to the transit router.</p>
         */
        public Builder transitRouterCidrList(java.util.List<TransitRouterCidrList> transitRouterCidrList) {
            String transitRouterCidrListShrink = shrink(transitRouterCidrList, "TransitRouterCidrList", "json");
            this.putQueryParameter("TransitRouterCidrList", transitRouterCidrListShrink);
            this.transitRouterCidrList = transitRouterCidrList;
            return this;
        }

        /**
         * <p>The description of the Enterprise Edition transit router instance.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder transitRouterDescription(String transitRouterDescription) {
            this.putQueryParameter("TransitRouterDescription", transitRouterDescription);
            this.transitRouterDescription = transitRouterDescription;
            return this;
        }

        /**
         * <p>The name of the Enterprise Edition transit router.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder transitRouterName(String transitRouterName) {
            this.putQueryParameter("TransitRouterName", transitRouterName);
            this.transitRouterName = transitRouterName;
            return this;
        }

        @Override
        public CreateTransitRouterRequest build() {
            return new CreateTransitRouterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTransitRouterRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterRequest</p>
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
             * <p>The tag keys cannot be an empty string. The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tagtest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>The tag value can be an empty string or up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
    /**
     * 
     * {@link CreateTransitRouterRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterRequest</p>
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

        private TransitRouterCidrList(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.name = builder.name;
            this.publishCidrRoute = builder.publishCidrRoute;
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

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String name; 
            private Boolean publishCidrRoute; 

            private Builder() {
            } 

            private Builder(TransitRouterCidrList model) {
                this.cidr = model.cidr;
                this.description = model.description;
                this.name = model.name;
                this.publishCidrRoute = model.publishCidrRoute;
            } 

            /**
             * <p>The CIDR block of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the transit router CIDR block.</p>
             * <p>The description must be 1 to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the transit router CIDR block.</p>
             * <p>The name must be 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.</p>
             * <ul>
             * <li><p><strong>true</strong> (default)</p>
             * <p>If you set the value to true, after you create a VPN attachment on a private VPN gateway and enable route learning for the VPN attachment, the system automatically adds the following route to the route table of the transit router that is in route learning relationship with the VPN attachment:</p>
             * <p>A blackhole route whose destination CIDR block is the transit router CIDR block, which refers to the CIDR block from which gateway IP addresses are allocated to the IPsec-VPN connection.</p>
             * <p>The blackhole route is advertised only to the route tables of virtual border routers (VBRs) connected to the transit router.</p>
             * </li>
             * <li><p><strong>false</strong></p>
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

            public TransitRouterCidrList build() {
                return new TransitRouterCidrList(this);
            } 

        } 

    }
}
