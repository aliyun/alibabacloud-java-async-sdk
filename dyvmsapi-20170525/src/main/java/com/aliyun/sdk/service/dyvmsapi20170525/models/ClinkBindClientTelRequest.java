// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkBindClientTelRequest} extends {@link RequestModel}
 *
 * <p>ClinkBindClientTelRequest</p>
 */
public class ClinkBindClientTelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsBind")
    private Long isBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReserveTel")
    private Long isReserveTel;

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
    @com.aliyun.core.annotation.NameInMap("Tel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tel;

    private ClinkBindClientTelRequest(Builder builder) {
        super(builder);
        this.cno = builder.cno;
        this.enterpriseId = builder.enterpriseId;
        this.isBind = builder.isBind;
        this.isReserveTel = builder.isReserveTel;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tel = builder.tel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkBindClientTelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return isBind
     */
    public Long getIsBind() {
        return this.isBind;
    }

    /**
     * @return isReserveTel
     */
    public Long getIsReserveTel() {
        return this.isReserveTel;
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
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    public static final class Builder extends Request.Builder<ClinkBindClientTelRequest, Builder> {
        private String cno; 
        private Long enterpriseId; 
        private Long isBind; 
        private Long isReserveTel; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tel; 

        private Builder() {
            super();
        } 

        private Builder(ClinkBindClientTelRequest request) {
            super(request);
            this.cno = request.cno;
            this.enterpriseId = request.enterpriseId;
            this.isBind = request.isBind;
            this.isReserveTel = request.isReserveTel;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tel = request.tel;
        } 

        /**
         * <p>座席号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>是否绑定 1: 是，0: 否</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isBind(Long isBind) {
            this.putQueryParameter("IsBind", isBind);
            this.isBind = isBind;
            return this;
        }

        /**
         * <p>是否同步为备用手机 1: 是，0: 否</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isReserveTel(Long isReserveTel) {
            this.putQueryParameter("IsReserveTel", isReserveTel);
            this.isReserveTel = isReserveTel;
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
         * <p>电话号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxx7750</p>
         */
        public Builder tel(String tel) {
            this.putQueryParameter("Tel", tel);
            this.tel = tel;
            return this;
        }

        @Override
        public ClinkBindClientTelRequest build() {
            return new ClinkBindClientTelRequest(this);
        } 

    } 

}
