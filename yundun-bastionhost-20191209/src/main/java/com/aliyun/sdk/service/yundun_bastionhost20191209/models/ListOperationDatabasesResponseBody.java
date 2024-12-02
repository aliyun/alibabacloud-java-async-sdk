// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOperationDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationDatabasesResponseBody</p>
 */
public class ListOperationDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List < Databases> databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public java.util.List < Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Databases> databases; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The databases returned.</p>
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationDatabasesResponseBody build() {
            return new ListOperationDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationDatabasesResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
        private String activeAddressType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DatabasePort")
        private Long databasePort;

        @com.aliyun.core.annotation.NameInMap("DatabasePrivateAddress")
        private String databasePrivateAddress;

        @com.aliyun.core.annotation.NameInMap("DatabasePublicAddress")
        private String databasePublicAddress;

        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceRegionId")
        private String sourceInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceState")
        private String sourceInstanceState;

        private Databases(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.databaseId = builder.databaseId;
            this.databaseName = builder.databaseName;
            this.databasePort = builder.databasePort;
            this.databasePrivateAddress = builder.databasePrivateAddress;
            this.databasePublicAddress = builder.databasePublicAddress;
            this.databaseType = builder.databaseType;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceRegionId = builder.sourceInstanceRegionId;
            this.sourceInstanceState = builder.sourceInstanceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return activeAddressType
         */
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return databasePort
         */
        public Long getDatabasePort() {
            return this.databasePort;
        }

        /**
         * @return databasePrivateAddress
         */
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        /**
         * @return databasePublicAddress
         */
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceRegionId
         */
        public String getSourceInstanceRegionId() {
            return this.sourceInstanceRegionId;
        }

        /**
         * @return sourceInstanceState
         */
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private String databaseId; 
            private String databaseName; 
            private Long databasePort; 
            private String databasePrivateAddress; 
            private String databasePublicAddress; 
            private String databaseType; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceRegionId; 
            private String sourceInstanceState; 

            /**
             * <p>The address type of the database. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong></li>
             * <li><strong>Private</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * <p>The remarks of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>cpp</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>zDatabase</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The port of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder databasePort(Long databasePort) {
                this.databasePort = databasePort;
                return this;
            }

            /**
             * <p>The private address of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-b******9b.mysql.rds.aliyuncs.com</p>
             */
            public Builder databasePrivateAddress(String databasePrivateAddress) {
                this.databasePrivateAddress = databasePrivateAddress;
                return this;
            }

            /**
             * <p>The public address of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf******p45.mysql.rds.aliyuncs.com</p>
             */
            public Builder databasePublicAddress(String databasePublicAddress) {
                this.databasePublicAddress = databasePublicAddress;
                return this;
            }

            /**
             * <p>The database engine. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>SQLServer</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>The database type. Valid values:</p>
             * <ul>
             * <li><strong>Local</strong>: on-premises database.</li>
             * <li><strong>Rds</strong>: ApsaraDB RDS instance.</li>
             * <li><strong>PolarDB</strong>: PolarDB cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Local</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the ApsaraDB RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9225bhipya******</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the ApsaraDB RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
                this.sourceInstanceRegionId = sourceInstanceRegionId;
                return this;
            }

            /**
             * <p>The database status. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>Release</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder sourceInstanceState(String sourceInstanceState) {
                this.sourceInstanceState = sourceInstanceState;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
