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
 * {@link CreateTransitRouterRouteTableRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterRouteTableRequest</p>
 */
public class CreateTransitRouterRouteTableRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableDescription")
    private String transitRouterRouteTableDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableName")
    private String transitRouterRouteTableName;

    private CreateTransitRouterRouteTableRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeTableOptions = builder.routeTableOptions;
        this.tag = builder.tag;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterRouteTableDescription = builder.transitRouterRouteTableDescription;
        this.transitRouterRouteTableName = builder.transitRouterRouteTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteTableRequest create() {
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterRouteTableDescription
     */
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    /**
     * @return transitRouterRouteTableName
     */
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterRouteTableRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private RouteTableOptions routeTableOptions; 
        private java.util.List<Tag> tag; 
        private String transitRouterId; 
        private String transitRouterRouteTableDescription; 
        private String transitRouterRouteTableName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterRouteTableRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeTableOptions = request.routeTableOptions;
            this.tag = request.tag;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterRouteTableDescription = request.transitRouterRouteTableDescription;
            this.transitRouterRouteTableName = request.transitRouterRouteTableName;
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
         * <p>Specifies whether to precheck the request. Check items include permissions and the status of the specified cloud resources. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the custom route table is created.</li>
         * <li><strong>true</strong>: prechecks the request but does not create the custom route table. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the system returns the ID of the request.</li>
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
         * <p>The features of the route table.</p>
         */
        public Builder routeTableOptions(RouteTableOptions routeTableOptions) {
            this.putQueryParameter("RouteTableOptions", routeTableOptions);
            this.routeTableOptions = routeTableOptions;
            return this;
        }

        /**
         * <p>The tags.</p>
         * <p>You can specify at most 20 tags in each call.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Edition transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The description of the custom route table.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder transitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
            this.putQueryParameter("TransitRouterRouteTableDescription", transitRouterRouteTableDescription);
            this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
            return this;
        }

        /**
         * <p>The name of the custom route table.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder transitRouterRouteTableName(String transitRouterRouteTableName) {
            this.putQueryParameter("TransitRouterRouteTableName", transitRouterRouteTableName);
            this.transitRouterRouteTableName = transitRouterRouteTableName;
            return this;
        }

        @Override
        public CreateTransitRouterRouteTableRequest build() {
            return new CreateTransitRouterRouteTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTransitRouterRouteTableRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterRouteTableRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(RouteTableOptions model) {
                this.multiRegionECMP = model.multiRegionECMP;
            } 

            /**
             * <p>Specifies whether to enable multi-region equal-cost multi-path (ECMP) routing. Valid values:</p>
             * <ul>
             * <li><strong>disable</strong>(default) If multi-region ECMP routing is disabled, routes that are learned from different regions but have the same prefix and attributes select the transit router with the smallest region ID as the next hop. Region IDs are sorted in alphabetic order. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</li>
             * <li><strong>enable</strong> If multi-region ECMP routing is enabled, routes that are learned from different regions but have the same prefix and attributes form an ECMP route. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disable</p>
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
    /**
     * 
     * {@link CreateTransitRouterRouteTableRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterRouteTableRequest</p>
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
             * <p>test</p>
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
             * <p>tagtest</p>
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
