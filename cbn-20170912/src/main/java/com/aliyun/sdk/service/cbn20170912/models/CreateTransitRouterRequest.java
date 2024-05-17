// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterCidrList")
    private java.util.List < TransitRouterCidrList> transitRouterCidrList;

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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return transitRouterCidrList
     */
    public java.util.List < TransitRouterCidrList> getTransitRouterCidrList() {
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
        private java.util.List < Tag> tag; 
        private java.util.List < TransitRouterCidrList> transitRouterCidrList; 
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
         * The ID of the Cloud Enterprise Network (CEN) instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. The value of **RequestId** of each API request is different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to check the request without performing the operation. Check items include permissions and the status of the specified cloud resources. Valid values:
         * <p>
         * 
         * *   **false** (default): sends the request. If the request passes the check, an Enterprise Edition transit router is created.
         * *   **true**: checks the request but does not create the Enterprise Edition transit router. If you use this value, the system checks whether the required parameters are set, and whether the request syntax is valid. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
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
         * The ID of the region where the Enterprise Edition transit router is deployed.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
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
         * Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values:
         * <p>
         * 
         * *   **false** (default): no
         * *   **true**: yes
         * 
         * The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](~~261356~~) to query the regions that support multicast.
         */
        public Builder supportMulticast(Boolean supportMulticast) {
            this.putQueryParameter("SupportMulticast", supportMulticast);
            this.supportMulticast = supportMulticast;
            return this;
        }

        /**
         * The information about the tags.
         * <p>
         * 
         * You can specify at most 20 tags in each call.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The CIDR blocks of the transit router.
         * <p>
         * 
         * You can add up to five CIDR blocks at a time. For more information about CIDR blocks of transit routers, see [CIDR blocks of transit routers](~~462635~~).
         * 
         * >  Only Enterprise Edition transit routers support CIDR blocks.
         */
        public Builder transitRouterCidrList(java.util.List < TransitRouterCidrList> transitRouterCidrList) {
            String transitRouterCidrListShrink = shrink(transitRouterCidrList, "TransitRouterCidrList", "json");
            this.putQueryParameter("TransitRouterCidrList", transitRouterCidrListShrink);
            this.transitRouterCidrList = transitRouterCidrList;
            return this;
        }

        /**
         * The description of the Enterprise Edition transit router instance.
         * <p>
         * 
         * The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
         */
        public Builder transitRouterDescription(String transitRouterDescription) {
            this.putQueryParameter("TransitRouterDescription", transitRouterDescription);
            this.transitRouterDescription = transitRouterDescription;
            return this;
        }

        /**
         * The name of the Enterprise Edition transit router.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
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

            /**
             * The tag key.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             * 
             * You can specify at most 20 tag keys.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             * 
             * Each tag key has a unique tag value. You can specify at most 20 tag values in each call.
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

            /**
             * The CIDR block of the transit router.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * The description of the CIDR block.
             * <p>
             * 
             * The description must be 1 to 256 characters in length.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the CIDR block.
             * <p>
             * 
             * The name must be 1 to 128 characters in length.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.
             * <p>
             * 
             * *   **true** (default): yes.
             * 
             *     A value of true specifies that after you create a private VPN connection and enable route learning for the connection, the system automatically adds a blackhole route to the route table of the transit router to which the VPN connection is attached.
             * 
             *     The destination CIDR block of the blackhole route is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections.
             * 
             *     The blackhole route is only advertised to the route table of the virtual border router (VBR) that is connected to the transit router.
             * 
             * *   **false**: no.
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
