// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link MoveContactToGroupRequest} extends {@link RequestModel}
 *
 * <p>MoveContactToGroupRequest</p>
 */
public class MoveContactToGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Contacts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contacts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkExistGroups")
    private String linkExistGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkNewGroups")
    private String linkNewGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private MoveContactToGroupRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.contacts = builder.contacts;
        this.linkExistGroups = builder.linkExistGroups;
        this.linkNewGroups = builder.linkNewGroups;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveContactToGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return bizExtend
     */
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    /**
     * @return contacts
     */
    public String getContacts() {
        return this.contacts;
    }

    /**
     * @return linkExistGroups
     */
    public String getLinkExistGroups() {
        return this.linkExistGroups;
    }

    /**
     * @return linkNewGroups
     */
    public String getLinkNewGroups() {
        return this.linkNewGroups;
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

    public static final class Builder extends Request.Builder<MoveContactToGroupRequest, Builder> {
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private String contacts; 
        private String linkExistGroups; 
        private String linkNewGroups; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(MoveContactToGroupRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.contacts = request.contacts;
            this.linkExistGroups = request.linkExistGroups;
            this.linkNewGroups = request.linkNewGroups;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * BizExtend.
         */
        public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
            String bizExtendShrink = shrink(bizExtend, "BizExtend", "json");
            this.putQueryParameter("BizExtend", bizExtendShrink);
            this.bizExtend = bizExtend;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:1}]</p>
         */
        public Builder contacts(String contacts) {
            this.putQueryParameter("Contacts", contacts);
            this.contacts = contacts;
            return this;
        }

        /**
         * LinkExistGroups.
         */
        public Builder linkExistGroups(String linkExistGroups) {
            this.putQueryParameter("LinkExistGroups", linkExistGroups);
            this.linkExistGroups = linkExistGroups;
            return this;
        }

        /**
         * LinkNewGroups.
         */
        public Builder linkNewGroups(String linkNewGroups) {
            this.putQueryParameter("LinkNewGroups", linkNewGroups);
            this.linkNewGroups = linkNewGroups;
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

        @Override
        public MoveContactToGroupRequest build() {
            return new MoveContactToGroupRequest(this);
        } 

    } 

}
