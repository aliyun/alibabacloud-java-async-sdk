// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListConfigRulesForTargetRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRulesForTargetRequest</p>
 */
public class ListConfigRulesForTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResult")
    private Integer maxResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private String tagKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private ListConfigRulesForTargetRequest(Builder builder) {
        super(builder);
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.policyType = builder.policyType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.tagKey = builder.tagKey;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRulesForTargetRequest create() {
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
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
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
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<ListConfigRulesForTargetRequest, Builder> {
        private Integer maxResult; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String policyType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String tagKey; 
        private String targetId; 
        private String targetType; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigRulesForTargetRequest request) {
            super(request);
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.policyType = request.policyType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.tagKey = request.tagKey;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.userType = request.userType;
        } 

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: 50. Maximum value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * <p>The token that is used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
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
         * <p>The use scenario of the tag policy. This parameter specifies a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>tags: enables tags with specified tag values to be added to resources.</li>
         * <li>rg_inherit: enables resources in a resource group to automatically inherit tags from the resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tags</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The region ID. Set the value to cn-shanghai.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>The tag key. This parameter specifies a filter condition for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>CostCenter</p>
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * <p>The ID of the object. This parameter specifies a filter condition for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>134254031178****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the object. This parameter specifies a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
         * <li>ROOT: the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * <li>FOLDER: a folder other than the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * <li>ACCOUNT: a member in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter is not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ACCOUNT</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The mode of the Tag Policy feature. This parameter specifies a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>USER: single-account mode</li>
         * <li>RD: multi-account mode</li>
         * </ul>
         * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
         * <blockquote>
         * <p> The value of this parameter is not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public ListConfigRulesForTargetRequest build() {
            return new ListConfigRulesForTargetRequest(this);
        } 

    } 

}
