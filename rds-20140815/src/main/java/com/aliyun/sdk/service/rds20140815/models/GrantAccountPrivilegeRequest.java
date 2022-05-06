// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantAccountPrivilegeRequest} extends {@link RequestModel}
 *
 * <p>GrantAccountPrivilegeRequest</p>
 */
public class GrantAccountPrivilegeRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPrivilege")
    @Validation(required = true)
    private String accountPrivilege;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBName")
    @Validation(required = true)
    private String DBName;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private GrantAccountPrivilegeRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantAccountPrivilegeRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GrantAccountPrivilegeRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String DBInstanceId; 
        private String DBName; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GrantAccountPrivilegeRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * AccountPrivilege.
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putQueryParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public GrantAccountPrivilegeRequest build() {
            return new GrantAccountPrivilegeRequest(this);
        } 

    } 

}
