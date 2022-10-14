// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableExtended} extends {@link TeaModel}
 *
 * <p>TableExtended</p>
 */
public class TableExtended extends TeaModel {
    @NameInMap("Cascade")
    private Boolean cascade;

    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("CreatedBy")
    private String createdBy;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("LastAccessTime")
    private Integer lastAccessTime;

    @NameInMap("LastAnalyzedTime")
    private Integer lastAnalyzedTime;

    @NameInMap("Owner")
    private String owner;

    @NameInMap("OwnerType")
    private String ownerType;

    @NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @NameInMap("PartitionKeys")
    private java.util.List < FieldSchema > partitionKeys;

    @NameInMap("Privileges")
    private Privileges privileges;

    @NameInMap("Retention")
    private Integer retention;

    @NameInMap("RewriteEnabled")
    private Boolean rewriteEnabled;

    @NameInMap("Sd")
    private Sd sd;

    @NameInMap("TableFormat")
    private String tableFormat;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("TableType")
    private String tableType;

    @NameInMap("Temporary")
    private Boolean temporary;

    @NameInMap("UpdateTime")
    private Integer updateTime;

    @NameInMap("ViewExpandedText")
    private String viewExpandedText;

    @NameInMap("ViewOriginalText")
    private String viewOriginalText;

    private TableExtended(Builder builder) {
        this.cascade = builder.cascade;
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.databaseName = builder.databaseName;
        this.lastAccessTime = builder.lastAccessTime;
        this.lastAnalyzedTime = builder.lastAnalyzedTime;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.parameters = builder.parameters;
        this.partitionKeys = builder.partitionKeys;
        this.privileges = builder.privileges;
        this.retention = builder.retention;
        this.rewriteEnabled = builder.rewriteEnabled;
        this.sd = builder.sd;
        this.tableFormat = builder.tableFormat;
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
        this.temporary = builder.temporary;
        this.updateTime = builder.updateTime;
        this.viewExpandedText = builder.viewExpandedText;
        this.viewOriginalText = builder.viewOriginalText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableExtended create() {
        return builder().build();
    }

    /**
     * @return cascade
     */
    public Boolean getCascade() {
        return this.cascade;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return lastAnalyzedTime
     */
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List < FieldSchema > getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return privileges
     */
    public Privileges getPrivileges() {
        return this.privileges;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return rewriteEnabled
     */
    public Boolean getRewriteEnabled() {
        return this.rewriteEnabled;
    }

    /**
     * @return sd
     */
    public Sd getSd() {
        return this.sd;
    }

    /**
     * @return tableFormat
     */
    public String getTableFormat() {
        return this.tableFormat;
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

    /**
     * @return temporary
     */
    public Boolean getTemporary() {
        return this.temporary;
    }

    /**
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return viewExpandedText
     */
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * @return viewOriginalText
     */
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    public static final class Builder {
        private Boolean cascade; 
        private Integer createTime; 
        private String createdBy; 
        private String databaseName; 
        private Integer lastAccessTime; 
        private Integer lastAnalyzedTime; 
        private String owner; 
        private String ownerType; 
        private java.util.Map < String, String > parameters; 
        private java.util.List < FieldSchema > partitionKeys; 
        private Privileges privileges; 
        private Integer retention; 
        private Boolean rewriteEnabled; 
        private Sd sd; 
        private String tableFormat; 
        private String tableName; 
        private String tableType; 
        private Boolean temporary; 
        private Integer updateTime; 
        private String viewExpandedText; 
        private String viewOriginalText; 

        /**
         * Cascade
         */
        public Builder cascade(Boolean cascade) {
            this.cascade = cascade;
            return this;
        }

        /**
         * CreateTime
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * LastAccessTime
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * LastAnalyzedTime
         */
        public Builder lastAnalyzedTime(Integer lastAnalyzedTime) {
            this.lastAnalyzedTime = lastAnalyzedTime;
            return this;
        }

        /**
         * Owner
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * OwnerType
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
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
         * PartitionKeys.
         */
        public Builder partitionKeys(java.util.List < FieldSchema > partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * privileges
         */
        public Builder privileges(Privileges privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Retention
         */
        public Builder retention(Integer retention) {
            this.retention = retention;
            return this;
        }

        /**
         * RewriteEnabled
         */
        public Builder rewriteEnabled(Boolean rewriteEnabled) {
            this.rewriteEnabled = rewriteEnabled;
            return this;
        }

        /**
         * sd
         */
        public Builder sd(Sd sd) {
            this.sd = sd;
            return this;
        }

        /**
         * TableFormat
         */
        public Builder tableFormat(String tableFormat) {
            this.tableFormat = tableFormat;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * TableType
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * Temporary
         */
        public Builder temporary(Boolean temporary) {
            this.temporary = temporary;
            return this;
        }

        /**
         * UpdateTime
         */
        public Builder updateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * ViewExpandedText
         */
        public Builder viewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        /**
         * ViewOriginalText
         */
        public Builder viewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        public TableExtended build() {
            return new TableExtended(this);
        } 

    } 

    public static class Privileges extends TeaModel {
        @NameInMap("RolePrivileges")
        private java.util.Map < String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> rolePrivileges;

        @NameInMap("UserPrivileges")
        private java.util.Map < String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> userPrivileges;

        @NameInMap("groupPrivileges")
        private java.util.Map < String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> groupPrivileges;

        private Privileges(Builder builder) {
            this.rolePrivileges = builder.rolePrivileges;
            this.userPrivileges = builder.userPrivileges;
            this.groupPrivileges = builder.groupPrivileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Privileges create() {
            return builder().build();
        }

        /**
         * @return rolePrivileges
         */
        public java.util.Map < String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> getRolePrivileges() {
            return this.rolePrivileges;
        }

        /**
         * @return userPrivileges
         */
        public java.util.Map < String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> getUserPrivileges() {
            return this.userPrivileges;
        }

        /**
         * @return groupPrivileges
         */
        public java.util.Map < String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> getGroupPrivileges() {
            return this.groupPrivileges;
        }

        public static final class Builder {
            private java.util.Map < String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> rolePrivileges; 
            private java.util.Map < String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> userPrivileges; 
            private java.util.Map < String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> groupPrivileges; 

            /**
             * rolePrivileges
             */
            public Builder rolePrivileges(java.util.Map < String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> rolePrivileges) {
                this.rolePrivileges = rolePrivileges;
                return this;
            }

            /**
             * userPrivileges
             */
            public Builder userPrivileges(java.util.Map < String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> userPrivileges) {
                this.userPrivileges = userPrivileges;
                return this;
            }

            /**
             * groupPrivileges
             */
            public Builder groupPrivileges(java.util.Map < String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> groupPrivileges) {
                this.groupPrivileges = groupPrivileges;
                return this;
            }

            public Privileges build() {
                return new Privileges(this);
            } 

        } 

    }
    public static class SerDeInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Parameters")
        private java.util.Map < String, String > parameters;

        @NameInMap("SerializationLib")
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
             * Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * SerializationLib
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
    public static class SkewedInfo extends TeaModel {
        @NameInMap("SkewedColNames")
        private java.util.List < String > skewedColNames;

        @NameInMap("SkewedColValueLocationMaps")
        private java.util.Map < String, String > skewedColValueLocationMaps;

        @NameInMap("SkewedColValues")
        private java.util.List < java.util.List < String > > skewedColValues;

        private SkewedInfo(Builder builder) {
            this.skewedColNames = builder.skewedColNames;
            this.skewedColValueLocationMaps = builder.skewedColValueLocationMaps;
            this.skewedColValues = builder.skewedColValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkewedInfo create() {
            return builder().build();
        }

        /**
         * @return skewedColNames
         */
        public java.util.List < String > getSkewedColNames() {
            return this.skewedColNames;
        }

        /**
         * @return skewedColValueLocationMaps
         */
        public java.util.Map < String, String > getSkewedColValueLocationMaps() {
            return this.skewedColValueLocationMaps;
        }

        /**
         * @return skewedColValues
         */
        public java.util.List < java.util.List < String > > getSkewedColValues() {
            return this.skewedColValues;
        }

        public static final class Builder {
            private java.util.List < String > skewedColNames; 
            private java.util.Map < String, String > skewedColValueLocationMaps; 
            private java.util.List < java.util.List < String > > skewedColValues; 

            /**
             * SkewedColNames
             */
            public Builder skewedColNames(java.util.List < String > skewedColNames) {
                this.skewedColNames = skewedColNames;
                return this;
            }

            /**
             * SkewedColValueLocationMaps
             */
            public Builder skewedColValueLocationMaps(java.util.Map < String, String > skewedColValueLocationMaps) {
                this.skewedColValueLocationMaps = skewedColValueLocationMaps;
                return this;
            }

            /**
             * SkewedColValues
             */
            public Builder skewedColValues(java.util.List < java.util.List < String > > skewedColValues) {
                this.skewedColValues = skewedColValues;
                return this;
            }

            public SkewedInfo build() {
                return new SkewedInfo(this);
            } 

        } 

    }
    public static class Sd extends TeaModel {
        @NameInMap("BucketCols")
        private java.util.List < String > bucketCols;

        @NameInMap("Cols")
        private java.util.List < FieldSchema > cols;

        @NameInMap("Compressed")
        private Boolean compressed;

        @NameInMap("InputFormat")
        private String inputFormat;

        @NameInMap("Location")
        private String location;

        @NameInMap("NumBuckets")
        private Integer numBuckets;

        @NameInMap("OutputFormat")
        private String outputFormat;

        @NameInMap("Parameters")
        private java.util.Map < String, String > parameters;

        @NameInMap("SerDeInfo")
        private SerDeInfo serDeInfo;

        @NameInMap("SkewedInfo")
        private SkewedInfo skewedInfo;

        @NameInMap("SortCols")
        private java.util.List < Order > sortCols;

        @NameInMap("StoredAsSubDirectories")
        private Boolean storedAsSubDirectories;

        private Sd(Builder builder) {
            this.bucketCols = builder.bucketCols;
            this.cols = builder.cols;
            this.compressed = builder.compressed;
            this.inputFormat = builder.inputFormat;
            this.location = builder.location;
            this.numBuckets = builder.numBuckets;
            this.outputFormat = builder.outputFormat;
            this.parameters = builder.parameters;
            this.serDeInfo = builder.serDeInfo;
            this.skewedInfo = builder.skewedInfo;
            this.sortCols = builder.sortCols;
            this.storedAsSubDirectories = builder.storedAsSubDirectories;
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
         * @return cols
         */
        public java.util.List < FieldSchema > getCols() {
            return this.cols;
        }

        /**
         * @return compressed
         */
        public Boolean getCompressed() {
            return this.compressed;
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
         * @return numBuckets
         */
        public Integer getNumBuckets() {
            return this.numBuckets;
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

        /**
         * @return skewedInfo
         */
        public SkewedInfo getSkewedInfo() {
            return this.skewedInfo;
        }

        /**
         * @return sortCols
         */
        public java.util.List < Order > getSortCols() {
            return this.sortCols;
        }

        /**
         * @return storedAsSubDirectories
         */
        public Boolean getStoredAsSubDirectories() {
            return this.storedAsSubDirectories;
        }

        public static final class Builder {
            private java.util.List < String > bucketCols; 
            private java.util.List < FieldSchema > cols; 
            private Boolean compressed; 
            private String inputFormat; 
            private String location; 
            private Integer numBuckets; 
            private String outputFormat; 
            private java.util.Map < String, String > parameters; 
            private SerDeInfo serDeInfo; 
            private SkewedInfo skewedInfo; 
            private java.util.List < Order > sortCols; 
            private Boolean storedAsSubDirectories; 

            /**
             * bucketCols
             */
            public Builder bucketCols(java.util.List < String > bucketCols) {
                this.bucketCols = bucketCols;
                return this;
            }

            /**
             * Cols
             */
            public Builder cols(java.util.List < FieldSchema > cols) {
                this.cols = cols;
                return this;
            }

            /**
             * Compressed
             */
            public Builder compressed(Boolean compressed) {
                this.compressed = compressed;
                return this;
            }

            /**
             * InputFormat
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * Location
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * NumBuckets
             */
            public Builder numBuckets(Integer numBuckets) {
                this.numBuckets = numBuckets;
                return this;
            }

            /**
             * OutputFormat
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            /**
             * Parameters
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * SerDeInfo
             */
            public Builder serDeInfo(SerDeInfo serDeInfo) {
                this.serDeInfo = serDeInfo;
                return this;
            }

            /**
             * SkewedInfo
             */
            public Builder skewedInfo(SkewedInfo skewedInfo) {
                this.skewedInfo = skewedInfo;
                return this;
            }

            /**
             * SortCols
             */
            public Builder sortCols(java.util.List < Order > sortCols) {
                this.sortCols = sortCols;
                return this;
            }

            /**
             * StoredAsSubDirectories
             */
            public Builder storedAsSubDirectories(Boolean storedAsSubDirectories) {
                this.storedAsSubDirectories = storedAsSubDirectories;
                return this;
            }

            public Sd build() {
                return new Sd(this);
            } 

        } 

    }
}
