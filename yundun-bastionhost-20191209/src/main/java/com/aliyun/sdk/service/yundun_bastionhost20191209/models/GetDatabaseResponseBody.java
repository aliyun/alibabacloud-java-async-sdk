// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseResponseBody</p>
 */
public class GetDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Database")
    private Database database;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDatabaseResponseBody(Builder builder) {
        this.database = builder.database;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return database
     */
    public Database getDatabase() {
        return this.database;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Database database; 
        private String requestId; 

        /**
         * <p>The returned detailed information about the database.</p>
         */
        public Builder database(Database database) {
            this.database = database;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4D72B883-9D15-5B05-B987-DFD10EB1FFB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDatabaseResponseBody build() {
            return new GetDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseResponseBody</p>
     */
    public static class Database extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
        private String networkDomainId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceRegionId")
        private String sourceInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceState")
        private String sourceInstanceState;

        private Database(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.databaseId = builder.databaseId;
            this.databaseName = builder.databaseName;
            this.databasePort = builder.databasePort;
            this.databasePrivateAddress = builder.databasePrivateAddress;
            this.databasePublicAddress = builder.databasePublicAddress;
            this.databaseType = builder.databaseType;
            this.networkDomainId = builder.networkDomainId;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceRegionId = builder.sourceInstanceRegionId;
            this.sourceInstanceState = builder.sourceInstanceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
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
         * @return networkDomainId
         */
        public String getNetworkDomainId() {
            return this.networkDomainId;
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
            private String networkDomainId; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceRegionId; 
            private String sourceInstanceState; 

            /**
             * <p>The address type of the database. Valid values:</p>
             * <ul>
             * <li>Public</li>
             * <li>Private</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * <p>The remarks of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
             * <p>The internal endpoint of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1zq******</p>
             */
            public Builder databasePrivateAddress(String databasePrivateAddress) {
                this.databasePrivateAddress = databasePrivateAddress;
                return this;
            }

            /**
             * <p>The public endpoint of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf65******</p>
             */
            public Builder databasePublicAddress(String databasePublicAddress) {
                this.databasePublicAddress = databasePublicAddress;
                return this;
            }

            /**
             * <p>The database engine. Valid values:</p>
             * <ul>
             * <li><strong>mysql</strong></li>
             * <li><strong>sqlserver</strong></li>
             * <li><strong>postgresql</strong></li>
             * <li><strong>oracle</strong></li>
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
             * <p>The ID of the network domain to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder networkDomainId(String networkDomainId) {
                this.networkDomainId = networkDomainId;
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
             * <p>The ID of the ApsaraDB RDS instance or PolarDB cluster.</p>
             * <blockquote>
             * <p>If <strong>Source</strong> is set to <strong>Local</strong>, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-wz9527ob0e0nftcsffke</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the ApsaraDB RDS instance or PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
                this.sourceInstanceRegionId = sourceInstanceRegionId;
                return this;
            }

            /**
             * <p>The status of the database. Valid values:</p>
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

            public Database build() {
                return new Database(this);
            } 

        } 

    }
}
