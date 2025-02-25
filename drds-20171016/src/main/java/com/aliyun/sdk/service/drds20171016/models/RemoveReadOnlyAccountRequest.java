// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveReadOnlyAccountRequest} extends {@link RequestModel}
 *
 * <p>RemoveReadOnlyAccountRequest</p>
 */
public class RemoveReadOnlyAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    private RemoveReadOnlyAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveReadOnlyAccountRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<RemoveReadOnlyAccountRequest, Builder> {
        private String accountName; 
        private String dbName; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveReadOnlyAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
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
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public RemoveReadOnlyAccountRequest build() {
            return new RemoveReadOnlyAccountRequest(this);
        } 

    } 

}
