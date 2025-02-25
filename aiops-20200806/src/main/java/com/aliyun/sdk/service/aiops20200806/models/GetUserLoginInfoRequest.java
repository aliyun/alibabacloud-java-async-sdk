// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserLoginInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserLoginInfoRequest</p>
 */
public class GetUserLoginInfoRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("AccountPrincipalName")
    private String accountPrincipalName;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("CurrentPk")
    private String currentPk;

    @Query
    @NameInMap("MainAccountPk")
    private String mainAccountPk;

    private GetUserLoginInfoRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrincipalName = builder.accountPrincipalName;
        this.accountType = builder.accountType;
        this.currentPk = builder.currentPk;
        this.mainAccountPk = builder.mainAccountPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserLoginInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPrincipalName
     */
    public String getAccountPrincipalName() {
        return this.accountPrincipalName;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return currentPk
     */
    public String getCurrentPk() {
        return this.currentPk;
    }

    /**
     * @return mainAccountPk
     */
    public String getMainAccountPk() {
        return this.mainAccountPk;
    }

    public static final class Builder extends Request.Builder<GetUserLoginInfoRequest, Builder> {
        private String accountName; 
        private String accountPrincipalName; 
        private String accountType; 
        private String currentPk; 
        private String mainAccountPk; 

        private Builder() {
            super();
        } 

        private Builder(GetUserLoginInfoRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrincipalName = request.accountPrincipalName;
            this.accountType = request.accountType;
            this.currentPk = request.currentPk;
            this.mainAccountPk = request.mainAccountPk;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountPrincipalName.
         */
        public Builder accountPrincipalName(String accountPrincipalName) {
            this.putQueryParameter("AccountPrincipalName", accountPrincipalName);
            this.accountPrincipalName = accountPrincipalName;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * CurrentPk.
         */
        public Builder currentPk(String currentPk) {
            this.putQueryParameter("CurrentPk", currentPk);
            this.currentPk = currentPk;
            return this;
        }

        /**
         * MainAccountPk.
         */
        public Builder mainAccountPk(String mainAccountPk) {
            this.putQueryParameter("MainAccountPk", mainAccountPk);
            this.mainAccountPk = mainAccountPk;
            return this;
        }

        @Override
        public GetUserLoginInfoRequest build() {
            return new GetUserLoginInfoRequest(this);
        } 

    } 

}
