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
 * {@link CreateTransitRouterMulticastDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterMulticastDomainRequest</p>
 */
public class CreateTransitRouterMulticastDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private Options options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainDescription")
    private String transitRouterMulticastDomainDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainName")
    private String transitRouterMulticastDomainName;

    private CreateTransitRouterMulticastDomainRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.options = builder.options;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterMulticastDomainDescription = builder.transitRouterMulticastDomainDescription;
        this.transitRouterMulticastDomainName = builder.transitRouterMulticastDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterMulticastDomainRequest create() {
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
     * @return options
     */
    public Options getOptions() {
        return this.options;
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
     * @return transitRouterMulticastDomainDescription
     */
    public String getTransitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }

    /**
     * @return transitRouterMulticastDomainName
     */
    public String getTransitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterMulticastDomainRequest, Builder> {
        private String cenId; 
        private String clientToken; 
        private Boolean dryRun; 
        private Options options; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String transitRouterId; 
        private String transitRouterMulticastDomainDescription; 
        private String transitRouterMulticastDomainName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterMulticastDomainRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.options = request.options;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterMulticastDomainDescription = request.transitRouterMulticastDomainDescription;
            this.transitRouterMulticastDomainName = request.transitRouterMulticastDomainName;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-a7syd349kne38g****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-4266****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
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
         * <p>Multicast domain feature.</p>
         */
        public Builder options(Options options) {
            this.putQueryParameter("Options", options);
            this.options = options;
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
         * <p>The region ID of the transit router.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0wr9p28r92d598y6****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The description of the multicast domain.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
            this.putQueryParameter("TransitRouterMulticastDomainDescription", transitRouterMulticastDomainDescription);
            this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
            return this;
        }

        /**
         * <p>The name of the multicast domain.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder transitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
            this.putQueryParameter("TransitRouterMulticastDomainName", transitRouterMulticastDomainName);
            this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
            return this;
        }

        @Override
        public CreateTransitRouterMulticastDomainRequest build() {
            return new CreateTransitRouterMulticastDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTransitRouterMulticastDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterMulticastDomainRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Igmpv2Support")
        private String igmpv2Support;

        private Options(Builder builder) {
            this.igmpv2Support = builder.igmpv2Support;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return igmpv2Support
         */
        public String getIgmpv2Support() {
            return this.igmpv2Support;
        }

        public static final class Builder {
            private String igmpv2Support; 

            /**
             * <p>Indicates whether the IGMP feature is enabled for the multicast domain. Once enabled, hosts can dynamically join or leave multicast groups by using IGMP protocol. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: enables IGMP.</li>
             * <li><strong>disable</strong>(default): disables IGMP.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>The IGMP feature is in beta testing. To use it, contact your account manager.</li>
             * <li>If you select this option, you cannot disable IPv6 after the VBR is created.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder igmpv2Support(String igmpv2Support) {
                this.igmpv2Support = igmpv2Support;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTransitRouterMulticastDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateTransitRouterMulticastDomainRequest</p>
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

            /**
             * <p>The tag key.</p>
             * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
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
}
