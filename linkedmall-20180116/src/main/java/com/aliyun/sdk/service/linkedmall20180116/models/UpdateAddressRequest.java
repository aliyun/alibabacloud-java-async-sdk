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
 * {@link UpdateAddressRequest} extends {@link RequestModel}
 *
 * <p>UpdateAddressRequest</p>
 */
public class UpdateAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private UpdateAddressRequest(Builder builder) {
        super(builder);
        this.addressInfo = builder.addressInfo;
        this.bizId = builder.bizId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressInfo
     */
    public String getAddressInfo() {
        return this.addressInfo;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<UpdateAddressRequest, Builder> {
        private String addressInfo; 
        private String bizId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAddressRequest request) {
            super(request);
            this.addressInfo = request.addressInfo;
            this.bizId = request.bizId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder addressInfo(String addressInfo) {
            this.putBodyParameter("AddressInfo", addressInfo);
            this.addressInfo = addressInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMMINIAPP202004140002</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public UpdateAddressRequest build() {
            return new UpdateAddressRequest(this);
        } 

    } 

}
