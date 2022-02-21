// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreezeAntChainAccountRequest} extends {@link RequestModel}
 *
 * <p>FreezeAntChainAccountRequest</p>
 */
public class FreezeAntChainAccountRequest extends Request {
    @Body
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private FreezeAntChainAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.antChainId = builder.antChainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FreezeAntChainAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<FreezeAntChainAccountRequest, Builder> {
        private String account; 
        private String antChainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(FreezeAntChainAccountRequest response) {
            super(response);
            this.account = response.account;
            this.antChainId = response.antChainId;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public FreezeAntChainAccountRequest build() {
            return new FreezeAntChainAccountRequest(this);
        } 

    } 

}
