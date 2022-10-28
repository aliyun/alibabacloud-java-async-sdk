// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProxyAccessRequest} extends {@link RequestModel}
 *
 * <p>CreateProxyAccessRequest</p>
 */
public class CreateProxyAccessRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("IndepAccount")
    private String indepAccount;

    @Query
    @NameInMap("IndepPassword")
    private String indepPassword;

    @Query
    @NameInMap("ProxyId")
    @Validation(required = true)
    private Long proxyId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private Long userId;

    private CreateProxyAccessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.indepAccount = builder.indepAccount;
        this.indepPassword = builder.indepPassword;
        this.proxyId = builder.proxyId;
        this.tid = builder.tid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProxyAccessRequest create() {
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
     * @return indepAccount
     */
    public String getIndepAccount() {
        return this.indepAccount;
    }

    /**
     * @return indepPassword
     */
    public String getIndepPassword() {
        return this.indepPassword;
    }

    /**
     * @return proxyId
     */
    public Long getProxyId() {
        return this.proxyId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateProxyAccessRequest, Builder> {
        private String regionId; 
        private String indepAccount; 
        private String indepPassword; 
        private Long proxyId; 
        private Long tid; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProxyAccessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.indepAccount = request.indepAccount;
            this.indepPassword = request.indepPassword;
            this.proxyId = request.proxyId;
            this.tid = request.tid;
            this.userId = request.userId;
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
         * IndepAccount.
         */
        public Builder indepAccount(String indepAccount) {
            this.putQueryParameter("IndepAccount", indepAccount);
            this.indepAccount = indepAccount;
            return this;
        }

        /**
         * IndepPassword.
         */
        public Builder indepPassword(String indepPassword) {
            this.putQueryParameter("IndepPassword", indepPassword);
            this.indepPassword = indepPassword;
            return this;
        }

        /**
         * ProxyId.
         */
        public Builder proxyId(Long proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateProxyAccessRequest build() {
            return new CreateProxyAccessRequest(this);
        } 

    } 

}
