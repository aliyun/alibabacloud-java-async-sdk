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
 * {@link DescribeLoghubDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoghubDetailResponseBody</p>
 */
public class DescribeLoghubDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoghubInfo")
    private LoghubInfo loghubInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(DescribeLoghubDetailResponseBody model) {
            this.loghubInfo = model.loghubInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried log collection information.</p>
         */
        public Builder loghubInfo(LoghubInfo loghubInfo) {
            this.loghubInfo = loghubInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLoghubDetailResponseBody build() {
            return new DescribeLoghubDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoghubDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoghubDetailResponseBody</p>
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
             * <p>channel_id</p>
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * <p>The log keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>put_request</p>
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
     * {@link DescribeLoghubDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoghubDetailResponseBody</p>
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
     * {@link DescribeLoghubDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoghubDetailResponseBody</p>
     */
    public static class LoghubInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DeliverName")
        private String deliverName;

        @com.aliyun.core.annotation.NameInMap("DeliverTime")
        private String deliverTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainUrl")
        private String domainUrl;

        @com.aliyun.core.annotation.NameInMap("FilterDirtyData")
        private Boolean filterDirtyData;

        @com.aliyun.core.annotation.NameInMap("LogHubStores")
        private LogHubStores logHubStores;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private LoghubInfo(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.DBType = builder.DBType;
            this.deliverName = builder.deliverName;
            this.deliverTime = builder.deliverTime;
            this.description = builder.description;
            this.domainUrl = builder.domainUrl;
            this.filterDirtyData = builder.filterDirtyData;
            this.logHubStores = builder.logHubStores;
            this.logStoreName = builder.logStoreName;
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
            private String DBClusterId; 
            private String DBType; 
            private String deliverName; 
            private String deliverTime; 
            private String description; 
            private String domainUrl; 
            private Boolean filterDirtyData; 
            private LogHubStores logHubStores; 
            private String logStoreName; 
            private String projectName; 
            private String regionId; 
            private String schemaName; 
            private String tableName; 
            private String userName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(LoghubInfo model) {
                this.DBClusterId = model.DBClusterId;
                this.DBType = model.DBType;
                this.deliverName = model.deliverName;
                this.deliverTime = model.deliverTime;
                this.description = model.description;
                this.domainUrl = model.domainUrl;
                this.filterDirtyData = model.filterDirtyData;
                this.logHubStores = model.logHubStores;
                this.logStoreName = model.logStoreName;
                this.projectName = model.projectName;
                this.regionId = model.regionId;
                this.schemaName = model.schemaName;
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
             * <p>The name of the log shipping job.</p>
             * 
             * <strong>example:</strong>
             * <p>hub-pay-callback-ykt</p>
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
             * <p>aaa</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>am-bp1p38m2c26s7hpk690650.ads.aliyuncs.com</p>
             */
            public Builder domainUrl(String domainUrl) {
                this.domainUrl = domainUrl;
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
             * <p>The log keywords.</p>
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
             * <p>cn-shenzhen</p>
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
             * <p>test</p>
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
