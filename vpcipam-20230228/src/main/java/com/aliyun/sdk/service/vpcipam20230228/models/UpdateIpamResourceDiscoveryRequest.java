// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link UpdateIpamResourceDiscoveryRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpamResourceDiscoveryRequest</p>
 */
public class UpdateIpamResourceDiscoveryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddOperatingRegion")
    private java.util.List<String> addOperatingRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryDescription")
    private String ipamResourceDiscoveryDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamResourceDiscoveryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryName")
    private String ipamResourceDiscoveryName;

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
    @com.aliyun.core.annotation.NameInMap("RemoveOperatingRegion")
    private java.util.List<String> removeOperatingRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateIpamResourceDiscoveryRequest(Builder builder) {
        super(builder);
        this.addOperatingRegion = builder.addOperatingRegion;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipamResourceDiscoveryDescription = builder.ipamResourceDiscoveryDescription;
        this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
        this.ipamResourceDiscoveryName = builder.ipamResourceDiscoveryName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.removeOperatingRegion = builder.removeOperatingRegion;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpamResourceDiscoveryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addOperatingRegion
     */
    public java.util.List<String> getAddOperatingRegion() {
        return this.addOperatingRegion;
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
     * @return ipamResourceDiscoveryDescription
     */
    public String getIpamResourceDiscoveryDescription() {
        return this.ipamResourceDiscoveryDescription;
    }

    /**
     * @return ipamResourceDiscoveryId
     */
    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * @return ipamResourceDiscoveryName
     */
    public String getIpamResourceDiscoveryName() {
        return this.ipamResourceDiscoveryName;
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
     * @return removeOperatingRegion
     */
    public java.util.List<String> getRemoveOperatingRegion() {
        return this.removeOperatingRegion;
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

    public static final class Builder extends Request.Builder<UpdateIpamResourceDiscoveryRequest, Builder> {
        private java.util.List<String> addOperatingRegion; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ipamResourceDiscoveryDescription; 
        private String ipamResourceDiscoveryId; 
        private String ipamResourceDiscoveryName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> removeOperatingRegion; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpamResourceDiscoveryRequest request) {
            super(request);
            this.addOperatingRegion = request.addOperatingRegion;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipamResourceDiscoveryDescription = request.ipamResourceDiscoveryDescription;
            this.ipamResourceDiscoveryId = request.ipamResourceDiscoveryId;
            this.ipamResourceDiscoveryName = request.ipamResourceDiscoveryName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removeOperatingRegion = request.removeOperatingRegion;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The list of effective regions to add.</p>
         */
        public Builder addOperatingRegion(java.util.List<String> addOperatingRegion) {
            this.putQueryParameter("AddOperatingRegion", addOperatingRegion);
            this.addOperatingRegion = addOperatingRegion;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform the dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Performs a dry run without modifying the resource discovery instance. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): Performs a dry run and the actual request. If the request passes the check, an HTTP 2xx status code is returned and the resource discovery instance is modified.</li>
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
         * <p>The description of resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder ipamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
            this.putQueryParameter("IpamResourceDiscoveryDescription", ipamResourceDiscoveryDescription);
            this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
            return this;
        }

        /**
         * <p>The ID of resource discovery instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.putQueryParameter("IpamResourceDiscoveryId", ipamResourceDiscoveryId);
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
            return this;
        }

        /**
         * <p>The name of the resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipamResourceDiscoveryName(String ipamResourceDiscoveryName) {
            this.putQueryParameter("IpamResourceDiscoveryName", ipamResourceDiscoveryName);
            this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
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
         * <p>The request region.</p>
         * <p>This parameter is required.</p>
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
         * <p>The list of effective regions to remove.</p>
         */
        public Builder removeOperatingRegion(java.util.List<String> removeOperatingRegion) {
            this.putQueryParameter("RemoveOperatingRegion", removeOperatingRegion);
            this.removeOperatingRegion = removeOperatingRegion;
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

        @Override
        public UpdateIpamResourceDiscoveryRequest build() {
            return new UpdateIpamResourceDiscoveryRequest(this);
        } 

    } 

}
