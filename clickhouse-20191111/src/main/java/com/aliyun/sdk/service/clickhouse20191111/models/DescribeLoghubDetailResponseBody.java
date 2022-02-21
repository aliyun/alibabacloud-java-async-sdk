// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoghubDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoghubDetailResponseBody</p>
 */
public class DescribeLoghubDetailResponseBody extends TeaModel {
    @NameInMap("LoghubInfo")
    private LoghubInfo loghubInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLoghubDetailResponseBody(Builder builder) {
        this.loghubInfo = builder.loghubInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoghubDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return loghubInfo
     */
    public LoghubInfo getLoghubInfo() {
        return this.loghubInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LoghubInfo loghubInfo; 
        private String requestId; 

        /**
         * LoghubInfo.
         */
        public Builder loghubInfo(LoghubInfo loghubInfo) {
            this.loghubInfo = loghubInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLoghubDetailResponseBody build() {
            return new DescribeLoghubDetailResponseBody(this);
        } 

    } 

    public static class LogHubStore extends TeaModel {
        @NameInMap("FieldKey")
        private String fieldKey;

        @NameInMap("LogKey")
        private String logKey;

        @NameInMap("Type")
        private String type;

        private LogHubStore(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.logKey = builder.logKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogHubStore create() {
            return builder().build();
        }

        /**
         * @return fieldKey
         */
        public String getFieldKey() {
            return this.fieldKey;
        }

        /**
         * @return logKey
         */
        public String getLogKey() {
            return this.logKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String fieldKey; 
            private String logKey; 
            private String type; 

            /**
             * FieldKey.
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * LogKey.
             */
            public Builder logKey(String logKey) {
                this.logKey = logKey;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LogHubStore build() {
                return new LogHubStore(this);
            } 

        } 

    }
    public static class LogHubStores extends TeaModel {
        @NameInMap("LogHubStore")
        private java.util.List < LogHubStore> logHubStore;

        private LogHubStores(Builder builder) {
            this.logHubStore = builder.logHubStore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogHubStores create() {
            return builder().build();
        }

        /**
         * @return logHubStore
         */
        public java.util.List < LogHubStore> getLogHubStore() {
            return this.logHubStore;
        }

        public static final class Builder {
            private java.util.List < LogHubStore> logHubStore; 

            /**
             * LogHubStore.
             */
            public Builder logHubStore(java.util.List < LogHubStore> logHubStore) {
                this.logHubStore = logHubStore;
                return this;
            }

            public LogHubStores build() {
                return new LogHubStores(this);
            } 

        } 

    }
    public static class LoghubInfo extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("AccessSecret")
        private String accessSecret;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DeliverName")
        private String deliverName;

        @NameInMap("DeliverTime")
        private String deliverTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainUrl")
        private String domainUrl;

        @NameInMap("FilterDirtyData")
        private Boolean filterDirtyData;

        @NameInMap("LogHubStores")
        private LogHubStores logHubStores;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("Password")
        private String password;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("ZoneId")
        private String zoneId;

        private LoghubInfo(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.DBClusterId = builder.DBClusterId;
            this.DBType = builder.DBType;
            this.deliverName = builder.deliverName;
            this.deliverTime = builder.deliverTime;
            this.description = builder.description;
            this.domainUrl = builder.domainUrl;
            this.filterDirtyData = builder.filterDirtyData;
            this.logHubStores = builder.logHubStores;
            this.logStoreName = builder.logStoreName;
            this.password = builder.password;
            this.projectName = builder.projectName;
            this.regionId = builder.regionId;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
            this.userName = builder.userName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoghubInfo create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return deliverName
         */
        public String getDeliverName() {
            return this.deliverName;
        }

        /**
         * @return deliverTime
         */
        public String getDeliverTime() {
            return this.deliverTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainUrl
         */
        public String getDomainUrl() {
            return this.domainUrl;
        }

        /**
         * @return filterDirtyData
         */
        public Boolean getFilterDirtyData() {
            return this.filterDirtyData;
        }

        /**
         * @return logHubStores
         */
        public LogHubStores getLogHubStores() {
            return this.logHubStores;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String DBClusterId; 
            private String DBType; 
            private String deliverName; 
            private String deliverTime; 
            private String description; 
            private String domainUrl; 
            private Boolean filterDirtyData; 
            private LogHubStores logHubStores; 
            private String logStoreName; 
            private String password; 
            private String projectName; 
            private String regionId; 
            private String schemaName; 
            private String tableName; 
            private String userName; 
            private String zoneId; 

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * AccessSecret.
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * DeliverName.
             */
            public Builder deliverName(String deliverName) {
                this.deliverName = deliverName;
                return this;
            }

            /**
             * DeliverTime.
             */
            public Builder deliverTime(String deliverTime) {
                this.deliverTime = deliverTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DomainUrl.
             */
            public Builder domainUrl(String domainUrl) {
                this.domainUrl = domainUrl;
                return this;
            }

            /**
             * FilterDirtyData.
             */
            public Builder filterDirtyData(Boolean filterDirtyData) {
                this.filterDirtyData = filterDirtyData;
                return this;
            }

            /**
             * LogHubStores.
             */
            public Builder logHubStores(LogHubStores logHubStores) {
                this.logHubStores = logHubStores;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public LoghubInfo build() {
                return new LoghubInfo(this);
            } 

        } 

    }
}
