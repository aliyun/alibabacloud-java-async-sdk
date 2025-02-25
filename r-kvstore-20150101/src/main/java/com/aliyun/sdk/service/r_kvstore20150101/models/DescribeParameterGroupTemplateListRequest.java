// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeParameterGroupTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeParameterGroupTemplateListRequest</p>
 */
public class DescribeParameterGroupTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterType")
    private String characterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

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
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeParameterGroupTemplateListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.characterType = builder.characterType;
        this.engineType = builder.engineType;
        this.engineVersion = builder.engineVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupTemplateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return characterType
     */
    public String getCharacterType() {
        return this.characterType;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeParameterGroupTemplateListRequest, Builder> {
        private String regionId; 
        private String category; 
        private String characterType; 
        private String engineType; 
        private String engineVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParameterGroupTemplateListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.category = request.category;
            this.characterType = request.characterType;
            this.engineType = request.engineType;
            this.engineVersion = request.engineVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service category. Valid values:</p>
         * <p>standard: Community Edition enterprise: Enhanced Edition (Tair)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The role of the instance. Valid values: logic: logical instance. db: database instance. proxy: proxy node. cs: ConfigServer node. normal: master-replica database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        public Builder characterType(String characterType) {
            this.putQueryParameter("CharacterType", characterType);
            this.characterType = characterType;
            return this;
        }

        /**
         * <p>The engine type. Valid values:</p>
         * <p>redis: Redis or Tair DRAM-based instance tair_pena: Tair persistent memory-optimized instance tair_pdb: Tair ESSD-based instance</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The compatible engine version. Valid values:</p>
         * <p>ApsaraDB for Redis Community Edition: 5.0, 6.0, and 7.0. Tair DRAM-based instances: 5.0 and 6.0. Tair persistent memory-optimized instances: 6.0. Tair ESSD-based instances: 4.0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeParameterGroupTemplateListRequest build() {
            return new DescribeParameterGroupTemplateListRequest(this);
        } 

    } 

}
