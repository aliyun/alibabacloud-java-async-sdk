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
 * {@link QuerySmsAppIcpRecordRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsAppIcpRecordRequest</p>
 */
public class QuerySmsAppIcpRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIcpRecordIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> appIcpRecordIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QuerySmsAppIcpRecordRequest(Builder builder) {
        super(builder);
        this.appIcpRecordIdList = builder.appIcpRecordIdList;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsAppIcpRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIcpRecordIdList
     */
    public java.util.List<Long> getAppIcpRecordIdList() {
        return this.appIcpRecordIdList;
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

    public static final class Builder extends Request.Builder<QuerySmsAppIcpRecordRequest, Builder> {
        private java.util.List<Long> appIcpRecordIdList; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmsAppIcpRecordRequest request) {
            super(request);
            this.appIcpRecordIdList = request.appIcpRecordIdList;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>app-icp备案实体id列表</p>
         * <p>This parameter is required.</p>
         */
        public Builder appIcpRecordIdList(java.util.List<Long> appIcpRecordIdList) {
            String appIcpRecordIdListShrink = shrink(appIcpRecordIdList, "AppIcpRecordIdList", "json");
            this.putQueryParameter("AppIcpRecordIdList", appIcpRecordIdListShrink);
            this.appIcpRecordIdList = appIcpRecordIdList;
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
        public QuerySmsAppIcpRecordRequest build() {
            return new QuerySmsAppIcpRecordRequest(this);
        } 

    } 

}
