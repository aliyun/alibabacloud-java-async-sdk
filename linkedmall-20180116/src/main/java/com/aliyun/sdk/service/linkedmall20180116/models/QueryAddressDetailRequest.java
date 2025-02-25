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
 * {@link QueryAddressDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryAddressDetailRequest</p>
 */
public class QueryAddressDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressInfo")
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

    private QueryAddressDetailRequest(Builder builder) {
        super(builder);
        this.addressInfo = builder.addressInfo;
        this.bizId = builder.bizId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddressDetailRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAddressDetailRequest, Builder> {
        private String addressInfo; 
        private String bizId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(QueryAddressDetailRequest request) {
            super(request);
            this.addressInfo = request.addressInfo;
            this.bizId = request.bizId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * AddressInfo.
         */
        public Builder addressInfo(String addressInfo) {
            this.putQueryParameter("AddressInfo", addressInfo);
            this.addressInfo = addressInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL2******01</p>
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
        public QueryAddressDetailRequest build() {
            return new QueryAddressDetailRequest(this);
        } 

    } 

}
