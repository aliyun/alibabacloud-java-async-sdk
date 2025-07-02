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
 * {@link UpdateIpamRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpamRequest</p>
 */
public class UpdateIpamRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("IpamDescription")
    private String ipamDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamName")
    private String ipamName;

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

    private UpdateIpamRequest(Builder builder) {
        super(builder);
        this.addOperatingRegion = builder.addOperatingRegion;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipamDescription = builder.ipamDescription;
        this.ipamId = builder.ipamId;
        this.ipamName = builder.ipamName;
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

    public static UpdateIpamRequest create() {
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
     * @return ipamDescription
     */
    public String getIpamDescription() {
        return this.ipamDescription;
    }

    /**
     * @return ipamId
     */
    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * @return ipamName
     */
    public String getIpamName() {
        return this.ipamName;
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

    public static final class Builder extends Request.Builder<UpdateIpamRequest, Builder> {
        private java.util.List<String> addOperatingRegion; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ipamDescription; 
        private String ipamId; 
        private String ipamName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> removeOperatingRegion; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpamRequest request) {
            super(request);
            this.addOperatingRegion = request.addOperatingRegion;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipamDescription = request.ipamDescription;
            this.ipamId = request.ipamId;
            this.ipamName = request.ipamName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removeOperatingRegion = request.removeOperatingRegion;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The effective region that you want to add.</p>
         */
        public Builder addOperatingRegion(java.util.List<String> addOperatingRegion) {
            this.putQueryParameter("AddOperatingRegion", addOperatingRegion);
            this.addOperatingRegion = addOperatingRegion;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The description of the IPAM.</p>
         * <p>It must be 2 to 256 characters in length and must start with a letter. It cannot start with <code>http://</code> or <code>https://</code>. The default value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder ipamDescription(String ipamDescription) {
            this.putQueryParameter("IpamDescription", ipamDescription);
            this.ipamDescription = ipamDescription;
            return this;
        }

        /**
         * <p>The ID of the IPAM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-ccxbnsbhew0d6t****</p>
         */
        public Builder ipamId(String ipamId) {
            this.putQueryParameter("IpamId", ipamId);
            this.ipamId = ipamId;
            return this;
        }

        /**
         * <p>The name of the IPAM.</p>
         * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipamName(String ipamName) {
            this.putQueryParameter("IpamName", ipamName);
            this.ipamName = ipamName;
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
         * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The effective region that you want to remove.</p>
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
        public UpdateIpamRequest build() {
            return new UpdateIpamRequest(this);
        } 

    } 

}
