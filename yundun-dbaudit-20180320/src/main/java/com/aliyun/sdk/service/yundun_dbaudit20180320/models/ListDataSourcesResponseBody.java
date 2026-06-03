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
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbList")
    private java.util.List<DbList> dbList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataSourcesResponseBody(Builder builder) {
        this.dbList = builder.dbList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesResponseBody create() {
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

        private Builder(ListDataSourcesResponseBody model) {
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

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourcesResponseBody</p>
     */
    public static class DbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AuditSwitch")
        private Integer auditSwitch;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DbAddresses")
        private java.util.List<String> dbAddresses;

        @com.aliyun.core.annotation.NameInMap("DbCertificate")
        private String dbCertificate;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private Integer dbType;

        @com.aliyun.core.annotation.NameInMap("DbTypeName")
        private String dbTypeName;

        @com.aliyun.core.annotation.NameInMap("DbUsername")
        private String dbUsername;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private Integer dbVersion;

        @com.aliyun.core.annotation.NameInMap("DbVersionName")
        private String dbVersionName;

        private DbList(Builder builder) {
            this.assetType = builder.assetType;
            this.auditSwitch = builder.auditSwitch;
            this.createTime = builder.createTime;
            this.dbAddresses = builder.dbAddresses;
            this.dbCertificate = builder.dbCertificate;
            this.dbId = builder.dbId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbName = builder.dbName;
            this.dbType = builder.dbType;
            this.dbTypeName = builder.dbTypeName;
            this.dbUsername = builder.dbUsername;
            this.dbVersion = builder.dbVersion;
            this.dbVersionName = builder.dbVersionName;
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
         * @return auditSwitch
         */
        public Integer getAuditSwitch() {
            return this.auditSwitch;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbAddresses
         */
        public java.util.List<String> getDbAddresses() {
            return this.dbAddresses;
        }

        /**
         * @return dbCertificate
         */
        public String getDbCertificate() {
            return this.dbCertificate;
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
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
         * @return dbUsername
         */
        public String getDbUsername() {
            return this.dbUsername;
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

        public static final class Builder {
            private Integer assetType; 
            private Integer auditSwitch; 
            private String createTime; 
            private java.util.List<String> dbAddresses; 
            private String dbCertificate; 
            private Integer dbId; 
            private String dbInstanceId; 
            private String dbName; 
            private Integer dbType; 
            private String dbTypeName; 
            private String dbUsername; 
            private Integer dbVersion; 
            private String dbVersionName; 

            private Builder() {
            } 

            private Builder(DbList model) {
                this.assetType = model.assetType;
                this.auditSwitch = model.auditSwitch;
                this.createTime = model.createTime;
                this.dbAddresses = model.dbAddresses;
                this.dbCertificate = model.dbCertificate;
                this.dbId = model.dbId;
                this.dbInstanceId = model.dbInstanceId;
                this.dbName = model.dbName;
                this.dbType = model.dbType;
                this.dbTypeName = model.dbTypeName;
                this.dbUsername = model.dbUsername;
                this.dbVersion = model.dbVersion;
                this.dbVersionName = model.dbVersionName;
            } 

            /**
             * AssetType.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * AuditSwitch.
             */
            public Builder auditSwitch(Integer auditSwitch) {
                this.auditSwitch = auditSwitch;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * DbCertificate.
             */
            public Builder dbCertificate(String dbCertificate) {
                this.dbCertificate = dbCertificate;
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
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
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
             * DbUsername.
             */
            public Builder dbUsername(String dbUsername) {
                this.dbUsername = dbUsername;
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

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
}
