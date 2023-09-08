// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParameterGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyParameterGroupRequest</p>
 */
public class ModifyParameterGroupRequest extends Request {
    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ParameterGroupDesc")
    private String parameterGroupDesc;

    @Query
    @NameInMap("ParameterGroupId")
    @Validation(required = true)
    private String parameterGroupId;

    @Query
    @NameInMap("ParameterGroupName")
    private String parameterGroupName;

    @Query
    @NameInMap("Parameters")
    private String parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyParameterGroupRequest(Builder builder) {
        super(builder);
        this.modifyMode = builder.modifyMode;
        this.ownerId = builder.ownerId;
        this.parameterGroupDesc = builder.parameterGroupDesc;
        this.parameterGroupId = builder.parameterGroupId;
        this.parameterGroupName = builder.parameterGroupName;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParameterGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
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
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<ModifyParameterGroupRequest, Builder> {
        private String modifyMode; 
        private Long ownerId; 
        private String parameterGroupDesc; 
        private String parameterGroupId; 
        private String parameterGroupName; 
        private String parameters; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyParameterGroupRequest request) {
            super(request);
            this.modifyMode = request.modifyMode;
            this.ownerId = request.ownerId;
            this.parameterGroupDesc = request.parameterGroupDesc;
            this.parameterGroupId = request.parameterGroupId;
            this.parameterGroupName = request.parameterGroupName;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The modification mode of the parameter template. Valid values:
         * <p>
         * 
         * *   **Collectivity** (default): adds new parameters or modifies parameters in the original parameter template.
         * 
         * > If ModifyMode is set to Collectivity, the system adds the value of **Parameters** to the parameter template or modifies the corresponding parameters in the parameter template. Other parameters in the original parameter template are not affected.
         * 
         * *   **Individual**: overwrites original parameters.
         * 
         * > If ModifyMode is set to Individual, the system uses the value of **Parameters** to overwrite the original parameter in the parameter template.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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
         * The new description of the parameter template. The description can be up to 200 characters in length.
         * <p>
         * 
         * > If you do not specify this parameter, the original description of the parameter template is retained.
         */
        public Builder parameterGroupDesc(String parameterGroupDesc) {
            this.putQueryParameter("ParameterGroupDesc", parameterGroupDesc);
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }

        /**
         * The parameter template ID. You can call the [DescribeParameterGroups](~~144491~~) operation to query the parameter template ID.
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * The parameter template name.
         * <p>
         * 
         * *   The name can contain letters, digits, periods (.), and underscores (\_). It must start with a letter.
         * *   It can be 8 to 64 characters in length.
         * 
         * > If you do not specify this parameter, the original name of the parameter template is retained.
         */
        public Builder parameterGroupName(String parameterGroupName) {
            this.putQueryParameter("ParameterGroupName", parameterGroupName);
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * A JSON string that consists of parameters and their values in the parameter template. Format: {"Parameter 1":"Value of Parameter 1","Parameter 2":"Value of Parameter 2"...}. For more information about the parameters that can be modified, see [Modify the parameters of an ApsaraDB RDS for MySQL instance](~~96063~~) or [Modify the parameters of an ApsaraDB RDS for PostgreSQL instance](~~96751~~).
         * <p>
         * 
         * > 
         * 
         * *   If **ModifyMode** is set to **Individual** and this parameter is specified, the new parameters overwrite the parameters in the original parameter template.
         * 
         * *   If you set **ModifyMode** to **Collectivity** and specify this parameter, the new parameters are added to the original parameter template, or the parameters in the original parameter template are modified.
         * *   If you do not specify this parameter, the parameters in the original parameter template remain unchanged.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         * <p>
         * 
         * > The region of a parameter template cannot be changed. You can call the [CloneParameterGroup](~~144581~~) operation to replicate a parameter template to a specific region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group. You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to obtain the ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public ModifyParameterGroupRequest build() {
            return new ModifyParameterGroupRequest(this);
        } 

    } 

}
