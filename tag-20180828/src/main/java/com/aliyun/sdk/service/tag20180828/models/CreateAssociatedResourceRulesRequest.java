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
 * {@link CreateAssociatedResourceRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateAssociatedResourceRulesRequest</p>
 */
public class CreateAssociatedResourceRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateRulesList")
    private java.util.List<CreateRulesList> createRulesList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private CreateAssociatedResourceRulesRequest(Builder builder) {
        super(builder);
        this.createRulesList = builder.createRulesList;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssociatedResourceRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createRulesList
     */
    public java.util.List<CreateRulesList> getCreateRulesList() {
        return this.createRulesList;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<CreateAssociatedResourceRulesRequest, Builder> {
        private java.util.List<CreateRulesList> createRulesList; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(CreateAssociatedResourceRulesRequest request) {
            super(request);
            this.createRulesList = request.createRulesList;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * CreateRulesList.
         */
        public Builder createRulesList(java.util.List<CreateRulesList> createRulesList) {
            this.putQueryParameter("CreateRulesList", createRulesList);
            this.createRulesList = createRulesList;
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

        @Override
        public CreateAssociatedResourceRulesRequest build() {
            return new CreateAssociatedResourceRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAssociatedResourceRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateAssociatedResourceRulesRequest</p>
     */
    public static class CreateRulesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SettingName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String settingName;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagKeys")
        private java.util.List<String> tagKeys;

        private CreateRulesList(Builder builder) {
            this.settingName = builder.settingName;
            this.status = builder.status;
            this.tagKeys = builder.tagKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateRulesList create() {
            return builder().build();
        }

        /**
         * @return settingName
         */
        public String getSettingName() {
            return this.settingName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tagKeys
         */
        public java.util.List<String> getTagKeys() {
            return this.tagKeys;
        }

        public static final class Builder {
            private String settingName; 
            private String status; 
            private java.util.List<String> tagKeys; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rule:AttachEni-DetachEni-TagInstance:Ecs-Instance:Ecs-Eni</p>
             */
            public Builder settingName(String settingName) {
                this.settingName = settingName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TagKeys.
             */
            public Builder tagKeys(java.util.List<String> tagKeys) {
                this.tagKeys = tagKeys;
                return this;
            }

            public CreateRulesList build() {
                return new CreateRulesList(this);
            } 

        } 

    }
}
