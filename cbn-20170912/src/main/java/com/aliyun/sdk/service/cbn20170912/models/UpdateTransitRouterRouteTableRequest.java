// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterRouteTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterRouteTableRequest</p>
 */
public class UpdateTransitRouterRouteTableRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableOptions")
    private RouteTableOptions routeTableOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableDescription")
    private String transitRouterRouteTableDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterRouteTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableName")
    private String transitRouterRouteTableName;

    private UpdateTransitRouterRouteTableRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeTableOptions = builder.routeTableOptions;
        this.transitRouterRouteTableDescription = builder.transitRouterRouteTableDescription;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
        this.transitRouterRouteTableName = builder.transitRouterRouteTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterRouteTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return routeTableOptions
     */
    public RouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    /**
     * @return transitRouterRouteTableDescription
     */
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    /**
     * @return transitRouterRouteTableName
     */
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static final class Builder extends Request.Builder<UpdateTransitRouterRouteTableRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private RouteTableOptions routeTableOptions; 
        private String transitRouterRouteTableDescription; 
        private String transitRouterRouteTableId; 
        private String transitRouterRouteTableName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterRouteTableRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeTableOptions = request.routeTableOptions;
            this.transitRouterRouteTableDescription = request.transitRouterRouteTableDescription;
            this.transitRouterRouteTableId = request.transitRouterRouteTableId;
            this.transitRouterRouteTableName = request.transitRouterRouteTableName;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Default values:
         * <p>
         * 
         * *   **false** (default): performs a dry run and sends the request.
         * *   **true**: performs a dry run. The system checks the required parameters and the request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
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
         * The features of the route table.
         */
        public Builder routeTableOptions(RouteTableOptions routeTableOptions) {
            this.putQueryParameter("RouteTableOptions", routeTableOptions);
            this.routeTableOptions = routeTableOptions;
            return this;
        }

        /**
         * The description of the route table.
         * <p>
         * 
         * The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
         */
        public Builder transitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
            this.putQueryParameter("TransitRouterRouteTableDescription", transitRouterRouteTableDescription);
            this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
            return this;
        }

        /**
         * The ID of the route table of the Enterprise Edition transit router.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * The name of the route table.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
         */
        public Builder transitRouterRouteTableName(String transitRouterRouteTableName) {
            this.putQueryParameter("TransitRouterRouteTableName", transitRouterRouteTableName);
            this.transitRouterRouteTableName = transitRouterRouteTableName;
            return this;
        }

        @Override
        public UpdateTransitRouterRouteTableRequest build() {
            return new UpdateTransitRouterRouteTableRequest(this);
        } 

    } 

    public static class RouteTableOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultiRegionECMP")
        private String multiRegionECMP;

        private RouteTableOptions(Builder builder) {
            this.multiRegionECMP = builder.multiRegionECMP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTableOptions create() {
            return builder().build();
        }

        /**
         * @return multiRegionECMP
         */
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

        public static final class Builder {
            private String multiRegionECMP; 

            /**
             * Indicates whether multi-region ECMP routing is enabled. Valid values:
             * <p>
             * 
             * - **disable**: If multi-region ECMP routing is disabled, routes that are learned from different regions but have the same prefix and attributes select the transit router with the smallest region ID as the next hop. Region IDs are sorted in alphabetic order. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.
             * - **enable**: If multi-region ECMP routing is enabled, routes that are learned from different regions but have the same prefix and attributes form an ECMP route. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.
             */
            public Builder multiRegionECMP(String multiRegionECMP) {
                this.multiRegionECMP = multiRegionECMP;
                return this;
            }

            public RouteTableOptions build() {
                return new RouteTableOptions(this);
            } 

        } 

    }
}
