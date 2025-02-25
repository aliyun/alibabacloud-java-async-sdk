// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreezeAccountRequest} extends {@link RequestModel}
 *
 * <p>FreezeAccountRequest</p>
 */
public class FreezeAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    private FreezeAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.account = builder.account;
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FreezeAccountRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<FreezeAccountRequest, Builder> {
        private String regionId; 
        private String account; 
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(FreezeAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.account = request.account;
            this.bizid = request.bizid;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        @Override
        public FreezeAccountRequest build() {
            return new FreezeAccountRequest(this);
        } 

    } 

}
