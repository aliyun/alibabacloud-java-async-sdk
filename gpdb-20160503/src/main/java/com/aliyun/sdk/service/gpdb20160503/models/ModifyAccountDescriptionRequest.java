// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountDescriptionRequest</p>
 */
public class ModifyAccountDescriptionRequest extends Request {
    @Query
    @NameInMap("AccountDescription")
    @Validation(required = true)
    private String accountDescription;

    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private ModifyAccountDescriptionRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountDescriptionRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyAccountDescriptionRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountDescriptionRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.DBInstanceId = request.DBInstanceId;
        } 

        /**
         * The description of the account. The description must meet the following requirements:
         * <p>
         * 
         * *   The description must start with a letter.
         * *   The description can contain letters, digits, underscores (\_), and hyphens (-).
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
         * > You can call the [DescribeAccounts](~~~~) operation to query the information about database accounts in a cluster, including the database account name.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        @Override
        public ModifyAccountDescriptionRequest build() {
            return new ModifyAccountDescriptionRequest(this);
        } 

    } 

}
