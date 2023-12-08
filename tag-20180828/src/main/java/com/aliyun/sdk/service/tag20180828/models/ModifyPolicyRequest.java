// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyRequest</p>
 */
public class ModifyPolicyRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PolicyContent")
    private String policyContent;

    @Query
    @NameInMap("PolicyDesc")
    private String policyDesc;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private ModifyPolicyRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.policyContent = builder.policyContent;
        this.policyDesc = builder.policyDesc;
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return policyContent
     */
    public String getPolicyContent() {
        return this.policyContent;
    }

    /**
     * @return policyDesc
     */
    public String getPolicyDesc() {
        return this.policyDesc;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
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

    public static final class Builder extends Request.Builder<ModifyPolicyRequest, Builder> {
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String policyContent; 
        private String policyDesc; 
        private String policyId; 
        private String policyName; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.policyContent = request.policyContent;
            this.policyDesc = request.policyDesc;
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * Specifies whether to perform a dry run for the request. Valid values:
         * <p>
         * 
         * *   false: The system performs the related operation based on the parameter settings in the request. This is the default value.
         * *   true: The system does not perform the related operation based on the parameter settings in the request but only verifies the parameter settings.
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
         * The document of the tag policy.
         * <p>
         * 
         * For more information about the syntax of a tag policy, see [Syntax of a tag policy](~~417436~~).
         */
        public Builder policyContent(String policyContent) {
            this.putQueryParameter("PolicyContent", policyContent);
            this.policyContent = policyContent;
            return this;
        }

        /**
         * The description of the tag policy.
         * <p>
         * 
         * The description must be 0 to 512 characters in length.
         */
        public Builder policyDesc(String policyDesc) {
            this.putQueryParameter("PolicyDesc", policyDesc);
            this.policyDesc = policyDesc;
            return this;
        }

        /**
         * The ID of the tag policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The name of the tag policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (\_).
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The region ID. Set the value to cn-shanghai.
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

        @Override
        public ModifyPolicyRequest build() {
            return new ModifyPolicyRequest(this);
        } 

    } 

}
