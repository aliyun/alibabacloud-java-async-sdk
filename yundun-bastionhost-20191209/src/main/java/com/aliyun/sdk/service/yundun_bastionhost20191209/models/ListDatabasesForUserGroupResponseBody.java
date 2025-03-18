// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListDatabasesForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesForUserGroupResponseBody</p>
 */
public class ListDatabasesForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<Databases> databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDatabasesForUserGroupResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesForUserGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public java.util.List<Databases> getDatabases() {
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
        private java.util.List<Databases> databases; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDatabasesForUserGroupResponseBody model) {
            this.databases = model.databases;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The databases returned.</p>
         */
        public Builder databases(java.util.List<Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of databases returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatabasesForUserGroupResponseBody build() {
            return new ListDatabasesForUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabasesForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesForUserGroupResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
        private String activeAddressType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountCount")
        private Long databaseAccountCount;

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

        private Databases(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.databaseAccountCount = builder.databaseAccountCount;
            this.databaseId = builder.databaseId;
            this.databaseName = builder.databaseName;
            this.databasePort = builder.databasePort;
            this.databasePrivateAddress = builder.databasePrivateAddress;
            this.databasePublicAddress = builder.databasePublicAddress;
            this.databaseType = builder.databaseType;
            this.networkDomainId = builder.networkDomainId;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
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
         * @return databaseAccountCount
         */
        public Long getDatabaseAccountCount() {
            return this.databaseAccountCount;
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

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private Long databaseAccountCount; 
            private String databaseId; 
            private String databaseName; 
            private Long databasePort; 
            private String databasePrivateAddress; 
            private String databasePublicAddress; 
            private String databaseType; 
            private String networkDomainId; 
            private String source; 
            private String sourceInstanceId; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.activeAddressType = model.activeAddressType;
                this.comment = model.comment;
                this.databaseAccountCount = model.databaseAccountCount;
                this.databaseId = model.databaseId;
                this.databaseName = model.databaseName;
                this.databasePort = model.databasePort;
                this.databasePrivateAddress = model.databasePrivateAddress;
                this.databasePublicAddress = model.databasePublicAddress;
                this.databaseType = model.databaseType;
                this.networkDomainId = model.networkDomainId;
                this.source = model.source;
                this.sourceInstanceId = model.sourceInstanceId;
            } 

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
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The total number of database accounts returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseAccountCount(Long databaseAccountCount) {
                this.databaseAccountCount = databaseAccountCount;
                return this;
            }

            /**
             * <p>The ID of the database to which the database account belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL0</p>
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
             * <p>The internal address of the database. The value is a domain name or an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1******</p>
             */
            public Builder databasePrivateAddress(String databasePrivateAddress) {
                this.databasePrivateAddress = databasePrivateAddress;
                return this;
            }

            /**
             * <p>The public address of the database. The value is a domain name or an IP address.</p>
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
             * <li><strong>MySQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>PostgreSQL</strong></li>
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
             * <p>The ID of the network domain where the database resides.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder networkDomainId(String networkDomainId) {
                this.networkDomainId = networkDomainId;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
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
             * <p>No value is returned for this parameter if <strong>Source</strong> is set to <strong>Local</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-wz9c7mjxywmdmqk7q6e4</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
