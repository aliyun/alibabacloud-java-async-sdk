// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGateVerifyBillingPublicRequest} extends {@link RequestModel}
 *
 * <p>QueryGateVerifyBillingPublicRequest</p>
 */
public class QueryGateVerifyBillingPublicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99)
    private Integer authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Month")
    @com.aliyun.core.annotation.Validation(required = true)
    private String month;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private QueryGateVerifyBillingPublicRequest(Builder builder) {
        super(builder);
        this.authenticationType = builder.authenticationType;
        this.month = builder.month;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyBillingPublicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return month
     */
    public String getMonth() {
        return this.month;
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

    public static final class Builder extends Request.Builder<QueryGateVerifyBillingPublicRequest, Builder> {
        private Integer authenticationType; 
        private String month; 
        private Long ownerId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(QueryGateVerifyBillingPublicRequest request) {
            super(request);
            this.authenticationType = request.authenticationType;
            this.month = request.month;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * <p>The verification method. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: phone number verification</li>
         * <li><strong>1</strong>: one-click logon</li>
         * <li><strong>2</strong>: all</li>
         * <li><strong>3</strong>: facial recognition</li>
         * <li><strong>4</strong>: SMS verification</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authenticationType(Integer authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>The month in which the bill is generated. Specify this parameter in the YYYYMM format. Example: 202111.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202111</p>
         */
        public Builder month(String month) {
            this.putQueryParameter("Month", month);
            this.month = month;
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

        @Override
        public QueryGateVerifyBillingPublicRequest build() {
            return new QueryGateVerifyBillingPublicRequest(this);
        } 

    } 

}
