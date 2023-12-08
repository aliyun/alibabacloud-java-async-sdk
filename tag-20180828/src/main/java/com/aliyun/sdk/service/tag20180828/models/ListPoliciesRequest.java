// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesRequest</p>
 */
public class ListPoliciesRequest extends Request {
    @Query
    @NameInMap("MaxResult")
    private Integer maxResult;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PolicyIds")
    private java.util.List < String > policyIds;

    @Query
    @NameInMap("PolicyNames")
    private java.util.List < String > policyNames;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("UserType")
    private String userType;

    private ListPoliciesRequest(Builder builder) {
        super(builder);
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.policyIds = builder.policyIds;
        this.policyNames = builder.policyNames;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResult
     */
    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return policyIds
     */
    public java.util.List < String > getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return policyNames
     */
    public java.util.List < String > getPolicyNames() {
        return this.policyNames;
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

    public static final class Builder extends Request.Builder<ListPoliciesRequest, Builder> {
        private Integer maxResult; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < String > policyIds; 
        private java.util.List < String > policyNames; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesRequest request) {
            super(request);
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.policyIds = request.policyIds;
            this.policyNames = request.policyNames;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.userType = request.userType;
        } 

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 50. Maximum value: 1000.
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * The token that is used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The ID of a tag policy. This parameter specifies a filter condition for the query.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * The name of a tag policy. This parameter specifies a filter condition for the query.
         */
        public Builder policyNames(java.util.List < String > policyNames) {
            this.putQueryParameter("PolicyNames", policyNames);
            this.policyNames = policyNames;
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
         * The mode of the Tag Policy feature. This parameter specifies a filter condition for the query. Valid values:
         * <p>
         * 
         * *   USER: single-account mode
         * *   RD: multi-account mode
         * 
         * For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).
         * 
         * >  The value of this parameter is not case-sensitive.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public ListPoliciesRequest build() {
            return new ListPoliciesRequest(this);
        } 

    } 

}
