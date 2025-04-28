// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeLogHubAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogHubAttributeResponseBody</p>
 */
public class DescribeLogHubAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoghubInfo")
    private LoghubInfo loghubInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogHubAttributeResponseBody(Builder builder) {
        this.loghubInfo = builder.loghubInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogHubAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLogHubAttributeResponseBody model) {
            this.loghubInfo = model.loghubInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The log collection information.</p>
         */
        public Builder loghubInfo(LoghubInfo loghubInfo) {
            this.loghubInfo = loghubInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8A564B7F-8C00-43C0-8EC5-919FBB70573</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogHubAttributeResponseBody build() {
            return new DescribeLogHubAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogHubAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogHubAttributeResponseBody</p>
     */
    public static class LogHubStore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldKey")
        private String fieldKey;

        @com.aliyun.core.annotation.NameInMap("LogKey")
        private String logKey;

        private LogHubStore(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.logKey = builder.logKey;
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

        public static final class Builder {
            private String fieldKey; 
            private String logKey; 

            private Builder() {
            } 

            private Builder(LogHubStore model) {
                this.fieldKey = model.fieldKey;
                this.logKey = model.logKey;
            } 

            /**
             * <p>The value of the log keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>255311</p>
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * <p>The log keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>taskid</p>
             */
            public Builder logKey(String logKey) {
                this.logKey = logKey;
                return this;
            }

            public LogHubStore build() {
                return new LogHubStore(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogHubAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogHubAttributeResponseBody</p>
     */
    public static class LogHubStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogHubStore")
        private java.util.List<LogHubStore> logHubStore;

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
        public java.util.List<LogHubStore> getLogHubStore() {
            return this.logHubStore;
        }

        public static final class Builder {
            private java.util.List<LogHubStore> logHubStore; 

            private Builder() {
            } 

            private Builder(LogHubStores model) {
                this.logHubStore = model.logHubStore;
            } 

            /**
             * LogHubStore.
             */
            public Builder logHubStore(java.util.List<LogHubStore> logHubStore) {
                this.logHubStore = logHubStore;
                return this;
            }

            public LogHubStores build() {
                return new LogHubStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogHubAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogHubAttributeResponseBody</p>
     */
    public static class LoghubInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DeliverName")
        private String deliverName;

        @com.aliyun.core.annotation.NameInMap("DeliverTime")
        private String deliverTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FilterDirtyData")
        private Boolean filterDirtyData;

        @com.aliyun.core.annotation.NameInMap("LogHubStores")
        private LogHubStores logHubStores;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SyncStatus")
        private String syncStatus;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private LoghubInfo(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.DBType = builder.DBType;
            this.delay = builder.delay;
            this.deliverName = builder.deliverName;
            this.deliverTime = builder.deliverTime;
            this.description = builder.description;
            this.filterDirtyData = builder.filterDirtyData;
            this.logHubStores = builder.logHubStores;
            this.logStoreName = builder.logStoreName;
            this.message = builder.message;
            this.projectName = builder.projectName;
            this.regionId = builder.regionId;
            this.schemaName = builder.schemaName;
            this.syncStatus = builder.syncStatus;
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
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
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
         * @return syncStatus
         */
        public String getSyncStatus() {
            return this.syncStatus;
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
            private String DBClusterId; 
            private String DBType; 
            private Long delay; 
            private String deliverName; 
            private String deliverTime; 
            private String description; 
            private Boolean filterDirtyData; 
            private LogHubStores logHubStores; 
            private String logStoreName; 
            private String message; 
            private String projectName; 
            private String regionId; 
            private String schemaName; 
            private String syncStatus; 
            private String tableName; 
            private String userName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(LoghubInfo model) {
                this.DBClusterId = model.DBClusterId;
                this.DBType = model.DBType;
                this.delay = model.delay;
                this.deliverName = model.deliverName;
                this.deliverTime = model.deliverTime;
                this.description = model.description;
                this.filterDirtyData = model.filterDirtyData;
                this.logHubStores = model.logHubStores;
                this.logStoreName = model.logStoreName;
                this.message = model.message;
                this.projectName = model.projectName;
                this.regionId = model.regionId;
                this.schemaName = model.schemaName;
                this.syncStatus = model.syncStatus;
                this.tableName = model.tableName;
                this.userName = model.userName;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>am-8vbs48m7553du1gz2</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The synchronization latency, which is the latency between the latest update time of the synchronization job and the current system time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>361</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The name of the log shipping job.</p>
             * 
             * <strong>example:</strong>
             * <p>loghub-web-login-new</p>
             */
            public Builder deliverName(String deliverName) {
                this.deliverName = deliverName;
                return this;
            }

            /**
             * <p>The log shipping time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-06&quot;T&quot;10:15&quot;Z&quot;</p>
             */
            public Builder deliverTime(String deliverTime) {
                this.deliverTime = deliverTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether dirty data is filtered.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder filterDirtyData(Boolean filterDirtyData) {
                this.filterDirtyData = filterDirtyData;
                return this;
            }

            /**
             * <p>The names of the Logstores.</p>
             */
            public Builder logHubStores(LogHubStores logHubStores) {
                this.logHubStores = logHubStores;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>device_login</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-adb</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>cbd_bi</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The synchronization status.</p>
             * 
             * <strong>example:</strong>
             * <p>processing</p>
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
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
