// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetDBAuditCountListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBAuditCountListResponseBody</p>
 */
public class GetDBAuditCountListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbList")
    private java.util.List<DbList> dbList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDBAuditCountListResponseBody(Builder builder) {
        this.dbList = builder.dbList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBAuditCountListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbList
     */
    public java.util.List<DbList> getDbList() {
        return this.dbList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DbList> dbList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDBAuditCountListResponseBody model) {
            this.dbList = model.dbList;
            this.requestId = model.requestId;
        } 

        /**
         * DbList.
         */
        public Builder dbList(java.util.List<DbList> dbList) {
            this.dbList = dbList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDBAuditCountListResponseBody build() {
            return new GetDBAuditCountListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDBAuditCountListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBAuditCountListResponseBody</p>
     */
    public static class DbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("DbAddresses")
        private java.util.List<String> dbAddresses;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private Integer dbType;

        @com.aliyun.core.annotation.NameInMap("DbTypeName")
        private String dbTypeName;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private Integer dbVersion;

        @com.aliyun.core.annotation.NameInMap("DbVersionName")
        private String dbVersionName;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("SqlCount")
        private Long sqlCount;

        private DbList(Builder builder) {
            this.assetType = builder.assetType;
            this.dbAddresses = builder.dbAddresses;
            this.dbId = builder.dbId;
            this.dbName = builder.dbName;
            this.dbType = builder.dbType;
            this.dbTypeName = builder.dbTypeName;
            this.dbVersion = builder.dbVersion;
            this.dbVersionName = builder.dbVersionName;
            this.riskCount = builder.riskCount;
            this.sessionCount = builder.sessionCount;
            this.sqlCount = builder.sqlCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbList create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return dbAddresses
         */
        public java.util.List<String> getDbAddresses() {
            return this.dbAddresses;
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dbType
         */
        public Integer getDbType() {
            return this.dbType;
        }

        /**
         * @return dbTypeName
         */
        public String getDbTypeName() {
            return this.dbTypeName;
        }

        /**
         * @return dbVersion
         */
        public Integer getDbVersion() {
            return this.dbVersion;
        }

        /**
         * @return dbVersionName
         */
        public String getDbVersionName() {
            return this.dbVersionName;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public static final class Builder {
            private Integer assetType; 
            private java.util.List<String> dbAddresses; 
            private Integer dbId; 
            private String dbName; 
            private Integer dbType; 
            private String dbTypeName; 
            private Integer dbVersion; 
            private String dbVersionName; 
            private Long riskCount; 
            private Long sessionCount; 
            private Long sqlCount; 

            private Builder() {
            } 

            private Builder(DbList model) {
                this.assetType = model.assetType;
                this.dbAddresses = model.dbAddresses;
                this.dbId = model.dbId;
                this.dbName = model.dbName;
                this.dbType = model.dbType;
                this.dbTypeName = model.dbTypeName;
                this.dbVersion = model.dbVersion;
                this.dbVersionName = model.dbVersionName;
                this.riskCount = model.riskCount;
                this.sessionCount = model.sessionCount;
                this.sqlCount = model.sqlCount;
            } 

            /**
             * AssetType.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * DbAddresses.
             */
            public Builder dbAddresses(java.util.List<String> dbAddresses) {
                this.dbAddresses = dbAddresses;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
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
             * DbType.
             */
            public Builder dbType(Integer dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * DbTypeName.
             */
            public Builder dbTypeName(String dbTypeName) {
                this.dbTypeName = dbTypeName;
                return this;
            }

            /**
             * DbVersion.
             */
            public Builder dbVersion(Integer dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * DbVersionName.
             */
            public Builder dbVersionName(String dbVersionName) {
                this.dbVersionName = dbVersionName;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * SqlCount.
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
}
