// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantDbToAccountRequest} extends {@link RequestModel}
 *
 * <p>GrantDbToAccountRequest</p>
 */
public class GrantDbToAccountRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("AccountPrivilege")
    @Validation(required = true)
    private String accountPrivilege;

    @Body
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    private GrantDbToAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.dbInstanceId = builder.dbInstanceId;
        this.dbName = builder.dbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantDbToAccountRequest create() {
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
     * @return accountPrivilege
     */
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    public static final class Builder extends Request.Builder<GrantDbToAccountRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String dbInstanceId; 
        private String dbName; 

        private Builder() {
            super();
        } 

        private Builder(GrantDbToAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.dbInstanceId = request.dbInstanceId;
            this.dbName = request.dbName;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountPrivilege.
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putBodyParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putBodyParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        @Override
        public GrantDbToAccountRequest build() {
            return new GrantDbToAccountRequest(this);
        } 

    } 

}
