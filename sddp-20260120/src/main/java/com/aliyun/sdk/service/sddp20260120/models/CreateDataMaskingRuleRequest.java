// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDataMaskingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDataMaskingRuleRequest</p>
 */
public class CreateDataMaskingRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncAlgorithm")
    private String encAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyMode")
    private String encryptionKeyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTimeOperation")
    private String expireTimeOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskHandleId")
    private Long riskHandleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubRuleList")
    private java.util.List<SubRuleList> subRuleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<UserList> userList;

    private CreateDataMaskingRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.encAlgorithm = builder.encAlgorithm;
        this.encryptionKeyId = builder.encryptionKeyId;
        this.encryptionKeyMode = builder.encryptionKeyMode;
        this.engineType = builder.engineType;
        this.expireTime = builder.expireTime;
        this.expireTimeOperation = builder.expireTimeOperation;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskHandleId = builder.riskHandleId;
        this.subRuleList = builder.subRuleList;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataMaskingRuleRequest create() {
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
     * @return encAlgorithm
     */
    public String getEncAlgorithm() {
        return this.encAlgorithm;
    }

    /**
     * @return encryptionKeyId
     */
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /**
     * @return encryptionKeyMode
     */
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expireTimeOperation
     */
    public String getExpireTimeOperation() {
        return this.expireTimeOperation;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return riskHandleId
     */
    public Long getRiskHandleId() {
        return this.riskHandleId;
    }

    /**
     * @return subRuleList
     */
    public java.util.List<SubRuleList> getSubRuleList() {
        return this.subRuleList;
    }

    /**
     * @return userList
     */
    public java.util.List<UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder extends Request.Builder<CreateDataMaskingRuleRequest, Builder> {
        private String regionId; 
        private String encAlgorithm; 
        private String encryptionKeyId; 
        private String encryptionKeyMode; 
        private String engineType; 
        private Long expireTime; 
        private String expireTimeOperation; 
        private String instanceId; 
        private String lang; 
        private String productCode; 
        private Long productId; 
        private Long riskHandleId; 
        private java.util.List<SubRuleList> subRuleList; 
        private java.util.List<UserList> userList; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataMaskingRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.encAlgorithm = request.encAlgorithm;
            this.encryptionKeyId = request.encryptionKeyId;
            this.encryptionKeyMode = request.encryptionKeyMode;
            this.engineType = request.engineType;
            this.expireTime = request.expireTime;
            this.expireTimeOperation = request.expireTimeOperation;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskHandleId = request.riskHandleId;
            this.subRuleList = request.subRuleList;
            this.userList = request.userList;
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
         * <p>The name of the column encryption algorithm. The availability of AES_128_GCM, AES_256_GCM, and SM4_128_GCM depends on the instance. Select an available algorithm from ListDataMaskingEncryptionAlgorithms.</p>
         * 
         * <strong>example:</strong>
         * <p>AES_256_GCM</p>
         */
        public Builder encAlgorithm(String encAlgorithm) {
            this.putQueryParameter("EncAlgorithm", encAlgorithm);
            this.encAlgorithm = encAlgorithm;
            return this;
        }

        /**
         * <p>The identifier of the Key Management Service (KMS) key. You can obtain it from Items[].KeyId in the response of the ListKmsKeys operation. Provide this parameter when you use a KMS key. Do not pass this parameter in local key scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putQueryParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * <p>The key mode. Valid values:</p>
         * <ul>
         * <li>client_key: local key</li>
         * <li>kms_key: KMS key
         * When you use kms_key, you must specify EncryptionKeyId.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>client_key</p>
         */
        public Builder encryptionKeyMode(String encryptionKeyMode) {
            this.putQueryParameter("EncryptionKeyMode", encryptionKeyMode);
            this.encryptionKeyMode = encryptionKeyMode;
            return this;
        }

        /**
         * <p>The type of the database engine. The value must be consistent with the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The expiration time of the plaintext permission. The value is a UNIX timestamp in milliseconds since 00:00:00 UTC on January 1, 1970. Specify this parameter only when ExpireTimeOperation is set to SET. The value must be later than the current time and no greater than 2145953410000. The server saves the value with second precision. Do not specify this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
         * 
         * <strong>example:</strong>
         * <p>2145953410000</p>
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The processing method for the permission expiration time. Valid values:</p>
         * <ul>
         * <li>PRESERVE: retains the original expiration time.</li>
         * <li>CLEAR: clears the expiration time.</li>
         * <li>SET: sets ExpireTime.
         * Default value: PRESERVE. Only fullAccess supports setting a validity period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRESERVE</p>
         */
        public Builder expireTimeOperation(String expireTimeOperation) {
            this.putQueryParameter("ExpireTimeOperation", expireTimeOperation);
            this.expireTimeOperation = expireTimeOperation;
            return this;
        }

        /**
         * <p>The instance identity. You can obtain it from Items[].InstanceId in the response of the ListDataMaskingInstances operation.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the response description. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also passed, the two must correspond to each other.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The identifier of the cloud service type. Valid values:</p>
         * <ul>
         * <li>5: RDS</li>
         * <li>8: POLARDB</li>
         * <li>27: PolarDBX2
         * When specified together with ProductCode, the values must correspond to each other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The identifier of the associated risk handling record. You do not need to specify this parameter in the standard column encryption creation process.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder riskHandleId(Long riskHandleId) {
            this.putQueryParameter("RiskHandleId", riskHandleId);
            this.riskHandleId = riskHandleId;
            return this;
        }

        /**
         * <p>The list of column encryption targets grouped by database and table.</p>
         */
        public Builder subRuleList(java.util.List<SubRuleList> subRuleList) {
            String subRuleListShrink = shrink(subRuleList, "SubRuleList", "json");
            this.putQueryParameter("SubRuleList", subRuleListShrink);
            this.subRuleList = subRuleList;
            return this;
        }

        /**
         * <p>The list of database accounts to which the fullAccess plaintext permission is granted. The accounts must belong to the target instance.</p>
         */
        public Builder userList(java.util.List<UserList> userList) {
            String userListShrink = shrink(userList, "UserList", "json");
            this.putQueryParameter("UserList", userListShrink);
            this.userList = userList;
            return this;
        }

        @Override
        public CreateDataMaskingRuleRequest build() {
            return new CreateDataMaskingRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataMaskingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateDataMaskingRuleRequest</p>
     */
    public static class SubRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private String columns;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private SubRuleList(Builder builder) {
            this.columns = builder.columns;
            this.dbName = builder.dbName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubRuleList create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public String getColumns() {
            return this.columns;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columns; 
            private String dbName; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(SubRuleList model) {
                this.columns = model.columns;
                this.dbName = model.dbName;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The list of target column names. Multiple column names are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>phone,email</p>
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The name of the target database.</p>
             * 
             * <strong>example:</strong>
             * <p>business_db</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The name of the target table.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SubRuleList build() {
                return new SubRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataMaskingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateDataMaskingRuleRequest</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AuthDb")
        private String authDb;

        private UserList(Builder builder) {
            this.accountId = builder.accountId;
            this.authDb = builder.authDb;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return authDb
         */
        public String getAuthDb() {
            return this.authDb;
        }

        public static final class Builder {
            private String accountId; 
            private String authDb; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.accountId = model.accountId;
                this.authDb = model.authDb;
            } 

            /**
             * <p>The identifier of the database account. You can obtain it from Items[].Id in the response of the ListDataAssetAccounts operation. Pass the value as a string.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The authentication database for MongoDB accounts. This parameter is required when you select a MongoDB account. You do not need to pass this parameter for other services.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder authDb(String authDb) {
                this.authDb = authDb;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
