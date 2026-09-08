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
         * EncAlgorithm.
         */
        public Builder encAlgorithm(String encAlgorithm) {
            this.putQueryParameter("EncAlgorithm", encAlgorithm);
            this.encAlgorithm = encAlgorithm;
            return this;
        }

        /**
         * EncryptionKeyId.
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putQueryParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * EncryptionKeyMode.
         */
        public Builder encryptionKeyMode(String encryptionKeyMode) {
            this.putQueryParameter("EncryptionKeyMode", encryptionKeyMode);
            this.encryptionKeyMode = encryptionKeyMode;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExpireTimeOperation.
         */
        public Builder expireTimeOperation(String expireTimeOperation) {
            this.putQueryParameter("ExpireTimeOperation", expireTimeOperation);
            this.expireTimeOperation = expireTimeOperation;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RiskHandleId.
         */
        public Builder riskHandleId(Long riskHandleId) {
            this.putQueryParameter("RiskHandleId", riskHandleId);
            this.riskHandleId = riskHandleId;
            return this;
        }

        /**
         * SubRuleList.
         */
        public Builder subRuleList(java.util.List<SubRuleList> subRuleList) {
            String subRuleListShrink = shrink(subRuleList, "SubRuleList", "json");
            this.putQueryParameter("SubRuleList", subRuleListShrink);
            this.subRuleList = subRuleList;
            return this;
        }

        /**
         * UserList.
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
             * Columns.
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * TableName.
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

        private UserList(Builder builder) {
            this.accountId = builder.accountId;
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

        public static final class Builder {
            private String accountId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.accountId = model.accountId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
