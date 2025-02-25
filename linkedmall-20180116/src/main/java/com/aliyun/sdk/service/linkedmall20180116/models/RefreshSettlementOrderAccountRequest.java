// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link RefreshSettlementOrderAccountRequest} extends {@link RequestModel}
 *
 * <p>RefreshSettlementOrderAccountRequest</p>
 */
public class RefreshSettlementOrderAccountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private RefreshSettlementOrderAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.bizId = builder.bizId;
        this.extInfo = builder.extInfo;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshSettlementOrderAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RefreshSettlementOrderAccountRequest, Builder> {
        private String accountId; 
        private String bizId; 
        private String extInfo; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshSettlementOrderAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.bizId = request.bizId;
            this.extInfo = request.extInfo;
            this.tenantId = request.tenantId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20210125****</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public RefreshSettlementOrderAccountRequest build() {
            return new RefreshSettlementOrderAccountRequest(this);
        } 

    } 

}
