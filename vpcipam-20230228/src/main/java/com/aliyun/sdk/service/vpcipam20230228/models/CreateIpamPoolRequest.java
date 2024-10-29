// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIpamPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateIpamPoolRequest</p>
 */
public class CreateIpamPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationDefaultCidrMask")
    private Integer allocationDefaultCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationMaxCidrMask")
    private Integer allocationMaxCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationMinCidrMask")
    private Integer allocationMinCidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoImport")
    private Boolean autoImport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolDescription")
    private String ipamPoolDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolName")
    private String ipamPoolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamScopeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamScopeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolRegionId")
    private String poolRegionId;

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
    @com.aliyun.core.annotation.NameInMap("SourceIpamPoolId")
    private String sourceIpamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateIpamPoolRequest(Builder builder) {
        super(builder);
        this.allocationDefaultCidrMask = builder.allocationDefaultCidrMask;
        this.allocationMaxCidrMask = builder.allocationMaxCidrMask;
        this.allocationMinCidrMask = builder.allocationMinCidrMask;
        this.autoImport = builder.autoImport;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipVersion = builder.ipVersion;
        this.ipamPoolDescription = builder.ipamPoolDescription;
        this.ipamPoolName = builder.ipamPoolName;
        this.ipamScopeId = builder.ipamScopeId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.poolRegionId = builder.poolRegionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIpamPoolId = builder.sourceIpamPoolId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationDefaultCidrMask
     */
    public Integer getAllocationDefaultCidrMask() {
        return this.allocationDefaultCidrMask;
    }

    /**
     * @return allocationMaxCidrMask
     */
    public Integer getAllocationMaxCidrMask() {
        return this.allocationMaxCidrMask;
    }

    /**
     * @return allocationMinCidrMask
     */
    public Integer getAllocationMinCidrMask() {
        return this.allocationMinCidrMask;
    }

    /**
     * @return autoImport
     */
    public Boolean getAutoImport() {
        return this.autoImport;
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ipamPoolDescription
     */
    public String getIpamPoolDescription() {
        return this.ipamPoolDescription;
    }

    /**
     * @return ipamPoolName
     */
    public String getIpamPoolName() {
        return this.ipamPoolName;
    }

    /**
     * @return ipamScopeId
     */
    public String getIpamScopeId() {
        return this.ipamScopeId;
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
     * @return poolRegionId
     */
    public String getPoolRegionId() {
        return this.poolRegionId;
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
     * @return sourceIpamPoolId
     */
    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateIpamPoolRequest, Builder> {
        private Integer allocationDefaultCidrMask; 
        private Integer allocationMaxCidrMask; 
        private Integer allocationMinCidrMask; 
        private Boolean autoImport; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ipVersion; 
        private String ipamPoolDescription; 
        private String ipamPoolName; 
        private String ipamScopeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String poolRegionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceIpamPoolId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpamPoolRequest request) {
            super(request);
            this.allocationDefaultCidrMask = request.allocationDefaultCidrMask;
            this.allocationMaxCidrMask = request.allocationMaxCidrMask;
            this.allocationMinCidrMask = request.allocationMinCidrMask;
            this.autoImport = request.autoImport;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipVersion = request.ipVersion;
            this.ipamPoolDescription = request.ipamPoolDescription;
            this.ipamPoolName = request.ipamPoolName;
            this.ipamScopeId = request.ipamScopeId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.poolRegionId = request.poolRegionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIpamPoolId = request.sourceIpamPoolId;
            this.tag = request.tag;
        } 

        /**
         * AllocationDefaultCidrMask.
         */
        public Builder allocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
            this.putQueryParameter("AllocationDefaultCidrMask", allocationDefaultCidrMask);
            this.allocationDefaultCidrMask = allocationDefaultCidrMask;
            return this;
        }

        /**
         * AllocationMaxCidrMask.
         */
        public Builder allocationMaxCidrMask(Integer allocationMaxCidrMask) {
            this.putQueryParameter("AllocationMaxCidrMask", allocationMaxCidrMask);
            this.allocationMaxCidrMask = allocationMaxCidrMask;
            return this;
        }

        /**
         * AllocationMinCidrMask.
         */
        public Builder allocationMinCidrMask(Integer allocationMinCidrMask) {
            this.putQueryParameter("AllocationMinCidrMask", allocationMinCidrMask);
            this.allocationMinCidrMask = allocationMinCidrMask;
            return this;
        }

        /**
         * AutoImport.
         */
        public Builder autoImport(Boolean autoImport) {
            this.putQueryParameter("AutoImport", autoImport);
            this.autoImport = autoImport;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * IpamPoolDescription.
         */
        public Builder ipamPoolDescription(String ipamPoolDescription) {
            this.putQueryParameter("IpamPoolDescription", ipamPoolDescription);
            this.ipamPoolDescription = ipamPoolDescription;
            return this;
        }

        /**
         * IpamPoolName.
         */
        public Builder ipamPoolName(String ipamPoolName) {
            this.putQueryParameter("IpamPoolName", ipamPoolName);
            this.ipamPoolName = ipamPoolName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        public Builder ipamScopeId(String ipamScopeId) {
            this.putQueryParameter("IpamScopeId", ipamScopeId);
            this.ipamScopeId = ipamScopeId;
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
         * PoolRegionId.
         */
        public Builder poolRegionId(String poolRegionId) {
            this.putQueryParameter("PoolRegionId", poolRegionId);
            this.poolRegionId = poolRegionId;
            return this;
        }

        /**
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
         * SourceIpamPoolId.
         */
        public Builder sourceIpamPoolId(String sourceIpamPoolId) {
            this.putQueryParameter("SourceIpamPoolId", sourceIpamPoolId);
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateIpamPoolRequest build() {
            return new CreateIpamPoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIpamPoolRequest} extends {@link TeaModel}
     *
     * <p>CreateIpamPoolRequest</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
