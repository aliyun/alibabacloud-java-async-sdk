// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParameterGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateParameterGroupRequest</p>
 */
public class CreateParameterGroupRequest extends Request {
    @Query
    @NameInMap("DBType")
    @Validation(required = true)
    private String DBType;

    @Query
    @NameInMap("DBVersion")
    @Validation(required = true)
    private String DBVersion;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ParameterGroupDesc")
    private String parameterGroupDesc;

    @Query
    @NameInMap("ParameterGroupName")
    @Validation(required = true)
    private String parameterGroupName;

    @Query
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateParameterGroupRequest(Builder builder) {
        super(builder);
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameterGroupDesc = builder.parameterGroupDesc;
        this.parameterGroupName = builder.parameterGroupName;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
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
     * @return parameterGroupDesc
     */
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    /**
     * @return parameterGroupName
     */
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
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

    public static final class Builder extends Request.Builder<CreateParameterGroupRequest, Builder> {
        private String DBType; 
        private String DBVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String parameterGroupDesc; 
        private String parameterGroupName; 
        private String parameters; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateParameterGroupRequest response) {
            super(response);
            this.DBType = response.DBType;
            this.DBVersion = response.DBVersion;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.parameterGroupDesc = response.parameterGroupDesc;
            this.parameterGroupName = response.parameterGroupName;
            this.parameters = response.parameters;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
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
         * ParameterGroupDesc.
         */
        public Builder parameterGroupDesc(String parameterGroupDesc) {
            this.putQueryParameter("ParameterGroupDesc", parameterGroupDesc);
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }

        /**
         * ParameterGroupName.
         */
        public Builder parameterGroupName(String parameterGroupName) {
            this.putQueryParameter("ParameterGroupName", parameterGroupName);
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * RegionId.
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

        @Override
        public CreateParameterGroupRequest build() {
            return new CreateParameterGroupRequest(this);
        } 

    } 

}
