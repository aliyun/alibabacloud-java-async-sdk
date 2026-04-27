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
 * {@link CloudDeleteAgentTelRequest} extends {@link RequestModel}
 *
 * <p>CloudDeleteAgentTelRequest</p>
 */
public class CloudDeleteAgentTelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

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

    private CloudDeleteAgentTelRequest(Builder builder) {
        super(builder);
        this.cno = builder.cno;
        this.enterpriseId = builder.enterpriseId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tel = builder.tel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudDeleteAgentTelRequest create() {
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

    public static final class Builder extends Request.Builder<CloudDeleteAgentTelRequest, Builder> {
        private String cno; 
        private Long enterpriseId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tel; 

        private Builder() {
            super();
        } 

        private Builder(CloudDeleteAgentTelRequest request) {
            super(request);
            this.cno = request.cno;
            this.enterpriseId = request.enterpriseId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tel = request.tel;
        } 

        /**
         * <p>座席工号；3-10位数字</p>
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
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
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
         * <p>座席绑定电话；固话带区号，手机不加0；固话带分机的以&quot;-&quot;分隔</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22223333</p>
         */
        public Builder tel(String tel) {
            this.putQueryParameter("Tel", tel);
            this.tel = tel;
            return this;
        }

        @Override
        public CloudDeleteAgentTelRequest build() {
            return new CloudDeleteAgentTelRequest(this);
        } 

    } 

}
