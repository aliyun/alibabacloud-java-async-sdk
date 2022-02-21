// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDrdsDBRequest} extends {@link RequestModel}
 *
 * <p>CreateDrdsDBRequest</p>
 */
public class CreateDrdsDBRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("DbInstType")
    private String dbInstType;

    @Query
    @NameInMap("DbInstanceIsCreating")
    private Boolean dbInstanceIsCreating;

    @Query
    @NameInMap("DbName")
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("Encode")
    private String encode;

    @Query
    @NameInMap("InstDbName")
    private java.util.List < InstDbName> instDbName;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RdsInstance")
    private java.util.List < String > rdsInstance;

    @Query
    @NameInMap("RdsSuperAccount")
    private java.util.List < RdsSuperAccount> rdsSuperAccount;

    @Query
    @NameInMap("Type")
    private String type;

    private CreateDrdsDBRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbInstType = builder.dbInstType;
        this.dbInstanceIsCreating = builder.dbInstanceIsCreating;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.encode = builder.encode;
        this.instDbName = builder.instDbName;
        this.password = builder.password;
        this.rdsInstance = builder.rdsInstance;
        this.rdsSuperAccount = builder.rdsSuperAccount;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDrdsDBRequest create() {
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
     * @return dbInstType
     */
    public String getDbInstType() {
        return this.dbInstType;
    }

    /**
     * @return dbInstanceIsCreating
     */
    public Boolean getDbInstanceIsCreating() {
        return this.dbInstanceIsCreating;
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

    /**
     * @return encode
     */
    public String getEncode() {
        return this.encode;
    }

    /**
     * @return instDbName
     */
    public java.util.List < InstDbName> getInstDbName() {
        return this.instDbName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return rdsInstance
     */
    public java.util.List < String > getRdsInstance() {
        return this.rdsInstance;
    }

    /**
     * @return rdsSuperAccount
     */
    public java.util.List < RdsSuperAccount> getRdsSuperAccount() {
        return this.rdsSuperAccount;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateDrdsDBRequest, Builder> {
        private String accountName; 
        private String dbInstType; 
        private Boolean dbInstanceIsCreating; 
        private String dbName; 
        private String drdsInstanceId; 
        private String encode; 
        private java.util.List < InstDbName> instDbName; 
        private String password; 
        private java.util.List < String > rdsInstance; 
        private java.util.List < RdsSuperAccount> rdsSuperAccount; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDrdsDBRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.dbInstType = response.dbInstType;
            this.dbInstanceIsCreating = response.dbInstanceIsCreating;
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.encode = response.encode;
            this.instDbName = response.instDbName;
            this.password = response.password;
            this.rdsInstance = response.rdsInstance;
            this.rdsSuperAccount = response.rdsSuperAccount;
            this.type = response.type;
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
         * DbInstType.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * DbInstanceIsCreating.
         */
        public Builder dbInstanceIsCreating(Boolean dbInstanceIsCreating) {
            this.putQueryParameter("DbInstanceIsCreating", dbInstanceIsCreating);
            this.dbInstanceIsCreating = dbInstanceIsCreating;
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

        /**
         * Encode.
         */
        public Builder encode(String encode) {
            this.putQueryParameter("Encode", encode);
            this.encode = encode;
            return this;
        }

        /**
         * InstDbName.
         */
        public Builder instDbName(java.util.List < InstDbName> instDbName) {
            this.putQueryParameter("InstDbName", instDbName);
            this.instDbName = instDbName;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RdsInstance.
         */
        public Builder rdsInstance(java.util.List < String > rdsInstance) {
            this.putQueryParameter("RdsInstance", rdsInstance);
            this.rdsInstance = rdsInstance;
            return this;
        }

        /**
         * RdsSuperAccount.
         */
        public Builder rdsSuperAccount(java.util.List < RdsSuperAccount> rdsSuperAccount) {
            this.putQueryParameter("RdsSuperAccount", rdsSuperAccount);
            this.rdsSuperAccount = rdsSuperAccount;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDrdsDBRequest build() {
            return new CreateDrdsDBRequest(this);
        } 

    } 

    public static class InstDbName extends TeaModel {
        @NameInMap("DbInstanceId")
        private String dbInstanceId;

        @NameInMap("ShardDbName")
        private java.util.List < String > shardDbName;

        private InstDbName(Builder builder) {
            this.dbInstanceId = builder.dbInstanceId;
            this.shardDbName = builder.shardDbName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstDbName create() {
            return builder().build();
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return shardDbName
         */
        public java.util.List < String > getShardDbName() {
            return this.shardDbName;
        }

        public static final class Builder {
            private String dbInstanceId; 
            private java.util.List < String > shardDbName; 

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * ShardDbName.
             */
            public Builder shardDbName(java.util.List < String > shardDbName) {
                this.shardDbName = shardDbName;
                return this;
            }

            public InstDbName build() {
                return new InstDbName(this);
            } 

        } 

    }
    public static class RdsSuperAccount extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DbInstanceId")
        private String dbInstanceId;

        @NameInMap("Password")
        private String password;

        private RdsSuperAccount(Builder builder) {
            this.accountName = builder.accountName;
            this.dbInstanceId = builder.dbInstanceId;
            this.password = builder.password;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsSuperAccount create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        public static final class Builder {
            private String accountName; 
            private String dbInstanceId; 
            private String password; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public RdsSuperAccount build() {
                return new RdsSuperAccount(this);
            } 

        } 

    }
}
