// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QuerySmsAuthorizationLetterRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsAuthorizationLetterRequest</p>
 */
public class QuerySmsAuthorizationLetterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterIdList")
    private java.util.List<Long> authorizationLetterIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationCode")
    private String organizationCode;

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
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QuerySmsAuthorizationLetterRequest(Builder builder) {
        super(builder);
        this.authorizationLetterIdList = builder.authorizationLetterIdList;
        this.organizationCode = builder.organizationCode;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.state = builder.state;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsAuthorizationLetterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationLetterIdList
     */
    public java.util.List<Long> getAuthorizationLetterIdList() {
        return this.authorizationLetterIdList;
    }

    /**
     * @return organizationCode
     */
    public String getOrganizationCode() {
        return this.organizationCode;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QuerySmsAuthorizationLetterRequest, Builder> {
        private java.util.List<Long> authorizationLetterIdList; 
        private String organizationCode; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private String state; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmsAuthorizationLetterRequest request) {
            super(request);
            this.authorizationLetterIdList = request.authorizationLetterIdList;
            this.organizationCode = request.organizationCode;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
            this.state = request.state;
            this.status = request.status;
        } 

        /**
         * <p>委托授权书id列表</p>
         */
        public Builder authorizationLetterIdList(java.util.List<Long> authorizationLetterIdList) {
            String authorizationLetterIdListShrink = shrink(authorizationLetterIdList, "AuthorizationLetterIdList", "json");
            this.putQueryParameter("AuthorizationLetterIdList", authorizationLetterIdListShrink);
            this.authorizationLetterIdList = authorizationLetterIdList;
            return this;
        }

        /**
         * <p>授权方社会统一信用代码</p>
         * 
         * <strong>example:</strong>
         * <p>9****************A</p>
         */
        public Builder organizationCode(String organizationCode) {
            this.putQueryParameter("OrganizationCode", organizationCode);
            this.organizationCode = organizationCode;
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
         * <p>签名名称（支持命中签名范围查询）</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>授权书审核状态，INT:审核中，PASSED:审核通过</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>授权书可用状态，VALID可用，INVALID不可用</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QuerySmsAuthorizationLetterRequest build() {
            return new QuerySmsAuthorizationLetterRequest(this);
        } 

    } 

}
