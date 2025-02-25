// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnfreezeAntChainAccountRequest} extends {@link RequestModel}
 *
 * <p>UnfreezeAntChainAccountRequest</p>
 */
public class UnfreezeAntChainAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    private UnfreezeAntChainAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.antChainId = builder.antChainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnfreezeAntChainAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    public static final class Builder extends Request.Builder<UnfreezeAntChainAccountRequest, Builder> {
        private String regionId; 
        private String account; 
        private String antChainId; 

        private Builder() {
            super();
        } 

        private Builder(UnfreezeAntChainAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.antChainId = request.antChainId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putBodyParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        @Override
        public UnfreezeAntChainAccountRequest build() {
            return new UnfreezeAntChainAccountRequest(this);
        } 

    } 

}
