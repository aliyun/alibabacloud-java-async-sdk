// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link UpdateLindormV2WhiteIpListRequest} extends {@link RequestModel}
 *
 * <p>UpdateLindormV2WhiteIpListRequest</p>
 */
public class UpdateLindormV2WhiteIpListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteIpGroupList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<WhiteIpGroupList> whiteIpGroupList;

    private UpdateLindormV2WhiteIpListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.whiteIpGroupList = builder.whiteIpGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLindormV2WhiteIpListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return whiteIpGroupList
     */
    public java.util.List<WhiteIpGroupList> getWhiteIpGroupList() {
        return this.whiteIpGroupList;
    }

    public static final class Builder extends Request.Builder<UpdateLindormV2WhiteIpListRequest, Builder> {
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private java.util.List<WhiteIpGroupList> whiteIpGroupList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLindormV2WhiteIpListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.whiteIpGroupList = request.whiteIpGroupList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-2ze5ipz9zx1e4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder whiteIpGroupList(java.util.List<WhiteIpGroupList> whiteIpGroupList) {
            this.putQueryParameter("WhiteIpGroupList", whiteIpGroupList);
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }

        @Override
        public UpdateLindormV2WhiteIpListRequest build() {
            return new UpdateLindormV2WhiteIpListRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLindormV2WhiteIpListRequest} extends {@link TeaModel}
     *
     * <p>UpdateLindormV2WhiteIpListRequest</p>
     */
    public static class WhiteIpGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("WhiteIpList")
        @com.aliyun.core.annotation.Validation(required = true)
        private String whiteIpList;

        private WhiteIpGroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.whiteIpList = builder.whiteIpList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroupList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return whiteIpList
         */
        public String getWhiteIpList() {
            return this.whiteIpList;
        }

        public static final class Builder {
            private String groupName; 
            private String whiteIpList; 

            private Builder() {
            } 

            private Builder(WhiteIpGroupList model) {
                this.groupName = model.groupName;
                this.whiteIpList = model.whiteIpList;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.X/24</p>
             */
            public Builder whiteIpList(String whiteIpList) {
                this.whiteIpList = whiteIpList;
                return this;
            }

            public WhiteIpGroupList build() {
                return new WhiteIpGroupList(this);
            } 

        } 

    }
}
