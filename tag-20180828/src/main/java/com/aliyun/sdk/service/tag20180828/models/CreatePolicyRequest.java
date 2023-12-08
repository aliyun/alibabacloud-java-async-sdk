// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyRequest</p>
 */
public class CreatePolicyRequest extends Request {
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
    @Validation(required = true)
    private String policyContent;

    @Query
    @NameInMap("PolicyDesc")
    private String policyDesc;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("UserType")
    private String userType;

    private CreatePolicyRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.policyContent = builder.policyContent;
        this.policyDesc = builder.policyDesc;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyRequest create() {
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

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<CreatePolicyRequest, Builder> {
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String policyContent; 
        private String policyDesc; 
        private String policyName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.policyContent = request.policyContent;
            this.policyDesc = request.policyDesc;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.userType = request.userType;
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

        /**
         * The mode of the Tag Policy feature. Valid values:
         * <p>
         * 
         * *   USER: single-account mode. Set the value to USER if you use an Alibaba Cloud account or a member of a resource directory to call this API operation to create a tag policy for the Alibaba Cloud account or member.
         * *   RD: multi-account mode. Set the value to RD if you use the management account of a resource directory to call this API operation to create a tag policy for the resource directory.
         * 
         * For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public CreatePolicyRequest build() {
            return new CreatePolicyRequest(this);
        } 

    } 

}
