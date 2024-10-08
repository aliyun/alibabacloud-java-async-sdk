// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LifecycleResource} extends {@link TeaModel}
 *
 * <p>LifecycleResource</p>
 */
public class LifecycleResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("Database")
    private Database database;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("DatabaseProfile")
    private DatabaseProfile databaseProfile;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("LifecycleRuleBizId")
    private String lifecycleRuleBizId;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private Long owner;

    @com.aliyun.core.annotation.NameInMap("Table")
    private Table table;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("TableProfile")
    private TableProfile tableProfile;

    private LifecycleResource(Builder builder) {
        this.bizId = builder.bizId;
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.databaseName = builder.databaseName;
        this.databaseProfile = builder.databaseProfile;
        this.gmtCreate = builder.gmtCreate;
        this.lifecycleRuleBizId = builder.lifecycleRuleBizId;
        this.owner = builder.owner;
        this.table = builder.table;
        this.tableName = builder.tableName;
        this.tableProfile = builder.tableProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LifecycleResource create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return database
     */
    public Database getDatabase() {
        return this.database;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return databaseProfile
     */
    public DatabaseProfile getDatabaseProfile() {
        return this.databaseProfile;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return lifecycleRuleBizId
     */
    public String getLifecycleRuleBizId() {
        return this.lifecycleRuleBizId;
    }

    /**
     * @return owner
     */
    public Long getOwner() {
        return this.owner;
    }

    /**
     * @return table
     */
    public Table getTable() {
        return this.table;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableProfile
     */
    public TableProfile getTableProfile() {
        return this.tableProfile;
    }

    public static final class Builder {
        private String bizId; 
        private String catalogId; 
        private Database database; 
        private String databaseName; 
        private DatabaseProfile databaseProfile; 
        private String gmtCreate; 
        private String lifecycleRuleBizId; 
        private Long owner; 
        private Table table; 
        private String tableName; 
        private TableProfile tableProfile; 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(Database database) {
            this.database = database;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * DatabaseProfile.
         */
        public Builder databaseProfile(DatabaseProfile databaseProfile) {
            this.databaseProfile = databaseProfile;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * LifecycleRuleBizId.
         */
        public Builder lifecycleRuleBizId(String lifecycleRuleBizId) {
            this.lifecycleRuleBizId = lifecycleRuleBizId;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Long owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Table.
         */
        public Builder table(Table table) {
            this.table = table;
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
         * TableProfile.
         */
        public Builder tableProfile(TableProfile tableProfile) {
            this.tableProfile = tableProfile;
            return this;
        }

        public LifecycleResource build() {
            return new LifecycleResource(this);
        } 

    } 

    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LocationUri")
        private String locationUri;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Database(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.locationUri = builder.locationUri;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return locationUri
         */
        public String getLocationUri() {
            return this.locationUri;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String locationUri; 
            private String name; 
            private Long updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * LocationUri.
             */
            public Builder locationUri(String locationUri) {
                this.locationUri = locationUri;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    public static class SerDeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map < String, String > parameters;

        @com.aliyun.core.annotation.NameInMap("SerializationLib")
        private String serializationLib;

        private SerDeInfo(Builder builder) {
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.serializationLib = builder.serializationLib;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SerDeInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, String > getParameters() {
            return this.parameters;
        }

        /**
         * @return serializationLib
         */
        public String getSerializationLib() {
            return this.serializationLib;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map < String, String > parameters; 
            private String serializationLib; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * SerializationLib.
             */
            public Builder serializationLib(String serializationLib) {
                this.serializationLib = serializationLib;
                return this;
            }

            public SerDeInfo build() {
                return new SerDeInfo(this);
            } 

        } 

    }
    public static class Sd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketCols")
        private java.util.List < String > bucketCols;

        @com.aliyun.core.annotation.NameInMap("InputFormat")
        private String inputFormat;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OutputFormat")
        private String outputFormat;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map < String, String > parameters;

        @com.aliyun.core.annotation.NameInMap("SerDeInfo")
        private SerDeInfo serDeInfo;

        private Sd(Builder builder) {
            this.bucketCols = builder.bucketCols;
            this.inputFormat = builder.inputFormat;
            this.location = builder.location;
            this.outputFormat = builder.outputFormat;
            this.parameters = builder.parameters;
            this.serDeInfo = builder.serDeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sd create() {
            return builder().build();
        }

        /**
         * @return bucketCols
         */
        public java.util.List < String > getBucketCols() {
            return this.bucketCols;
        }

        /**
         * @return inputFormat
         */
        public String getInputFormat() {
            return this.inputFormat;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return outputFormat
         */
        public String getOutputFormat() {
            return this.outputFormat;
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, String > getParameters() {
            return this.parameters;
        }

        /**
         * @return serDeInfo
         */
        public SerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

        public static final class Builder {
            private java.util.List < String > bucketCols; 
            private String inputFormat; 
            private String location; 
            private String outputFormat; 
            private java.util.Map < String, String > parameters; 
            private SerDeInfo serDeInfo; 

            /**
             * BucketCols.
             */
            public Builder bucketCols(java.util.List < String > bucketCols) {
                this.bucketCols = bucketCols;
                return this;
            }

            /**
             * InputFormat.
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OutputFormat.
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * SerDeInfo.
             */
            public Builder serDeInfo(SerDeInfo serDeInfo) {
                this.serDeInfo = serDeInfo;
                return this;
            }

            public Sd build() {
                return new Sd(this);
            } 

        } 

    }
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map < String, String > parameters;

        @com.aliyun.core.annotation.NameInMap("Sd")
        private Sd sd;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        private Table(Builder builder) {
            this.createTime = builder.createTime;
            this.databaseName = builder.databaseName;
            this.parameters = builder.parameters;
            this.sd = builder.sd;
            this.tableName = builder.tableName;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, String > getParameters() {
            return this.parameters;
        }

        /**
         * @return sd
         */
        public Sd getSd() {
            return this.sd;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private Long createTime; 
            private String databaseName; 
            private java.util.Map < String, String > parameters; 
            private Sd sd; 
            private String tableName; 
            private String tableType; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Sd.
             */
            public Builder sd(Sd sd) {
                this.sd = sd;
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
             * TableType.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
}
