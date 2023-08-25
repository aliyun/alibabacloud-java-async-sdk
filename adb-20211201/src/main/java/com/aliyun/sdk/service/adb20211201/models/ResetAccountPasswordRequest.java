// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetAccountPasswordRequest</p>
 */
public class ResetAccountPasswordRequest extends Request {
    @Query
    @NameInMap("AccountDescription")
    private String accountDescription;

    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    @Validation(required = true)
    private String accountPassword;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private ResetAccountPasswordRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAccountPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountDescription
     */
    public String getAccountDescription() {
        return this.accountDescription;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<ResetAccountPasswordRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(ResetAccountPasswordRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The description of the database account.
         * <p>
         * 
         * *   The description cannot start with `http://` or `https://`.
         * *   The description must be 2 to 256 characters in length.
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * The name of the database account.
         * <p>
         * 
         * > You can call the [DescribeAccounts](~~612430~~) operation to query the information about database accounts in a cluster, including the database account name.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The password of the database account.
         * <p>
         * 
         * *   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * *   Special characters include `! @ # $ % ^ & * ( ) _ + - =`
         * *   The password must be 8 to 32 characters in length.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public ResetAccountPasswordRequest build() {
            return new ResetAccountPasswordRequest(this);
        } 

    } 

}
