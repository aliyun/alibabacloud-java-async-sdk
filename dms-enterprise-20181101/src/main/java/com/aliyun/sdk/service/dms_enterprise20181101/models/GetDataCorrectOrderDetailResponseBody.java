// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCorrectOrderDetailResponseBody</p>
 */
public class GetDataCorrectOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCorrectOrderDetail")
    private DataCorrectOrderDetail dataCorrectOrderDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataCorrectOrderDetailResponseBody(Builder builder) {
        this.dataCorrectOrderDetail = builder.dataCorrectOrderDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCorrectOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCorrectOrderDetail
     */
    public DataCorrectOrderDetail getDataCorrectOrderDetail() {
        return this.dataCorrectOrderDetail;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DataCorrectOrderDetail dataCorrectOrderDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The information about the data change ticket.</p>
         */
        public Builder dataCorrectOrderDetail(DataCorrectOrderDetail dataCorrectOrderDetail) {
            this.dataCorrectOrderDetail = dataCorrectOrderDetail;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCorrectOrderDetailResponseBody build() {
            return new GetDataCorrectOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class CronExtConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentClearTaskCount")
        private Integer currentClearTaskCount;

        @com.aliyun.core.annotation.NameInMap("OptimizeTableAfterEveryClearTimes")
        private Integer optimizeTableAfterEveryClearTimes;

        private CronExtConfig(Builder builder) {
            this.currentClearTaskCount = builder.currentClearTaskCount;
            this.optimizeTableAfterEveryClearTimes = builder.optimizeTableAfterEveryClearTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CronExtConfig create() {
            return builder().build();
        }

        /**
         * @return currentClearTaskCount
         */
        public Integer getCurrentClearTaskCount() {
            return this.currentClearTaskCount;
        }

        /**
         * @return optimizeTableAfterEveryClearTimes
         */
        public Integer getOptimizeTableAfterEveryClearTimes() {
            return this.optimizeTableAfterEveryClearTimes;
        }

        public static final class Builder {
            private Integer currentClearTaskCount; 
            private Integer optimizeTableAfterEveryClearTimes; 

            /**
             * <p>The number of times defragmentation is performed. This parameter is valid only if the value of OptimizeTableAfterEveryClearTimes is greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentClearTaskCount(Integer currentClearTaskCount) {
                this.currentClearTaskCount = currentClearTaskCount;
                return this;
            }

            /**
             * <p>Indicates whether the Periodically Optimize Table feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (default): The feature is disabled.</li>
             * <li><strong>A value greater than 0</strong>: The feature is enabled. The value indicates the number of cleanups after which the system performs defragmentation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder optimizeTableAfterEveryClearTimes(Integer optimizeTableAfterEveryClearTimes) {
                this.optimizeTableAfterEveryClearTimes = optimizeTableAfterEveryClearTimes;
                return this;
            }

            public CronExtConfig build() {
                return new CronExtConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class ImportExtConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CsvFirstRowIsColumnDef")
        private Boolean csvFirstRowIsColumnDef;

        @com.aliyun.core.annotation.NameInMap("IgnoreError")
        private Boolean ignoreError;

        @com.aliyun.core.annotation.NameInMap("ImportMode")
        private String importMode;

        @com.aliyun.core.annotation.NameInMap("InsertType")
        private String insertType;

        private ImportExtConfig(Builder builder) {
            this.csvFirstRowIsColumnDef = builder.csvFirstRowIsColumnDef;
            this.ignoreError = builder.ignoreError;
            this.importMode = builder.importMode;
            this.insertType = builder.insertType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportExtConfig create() {
            return builder().build();
        }

        /**
         * @return csvFirstRowIsColumnDef
         */
        public Boolean getCsvFirstRowIsColumnDef() {
            return this.csvFirstRowIsColumnDef;
        }

        /**
         * @return ignoreError
         */
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        /**
         * @return importMode
         */
        public String getImportMode() {
            return this.importMode;
        }

        /**
         * @return insertType
         */
        public String getInsertType() {
            return this.insertType;
        }

        public static final class Builder {
            private Boolean csvFirstRowIsColumnDef; 
            private Boolean ignoreError; 
            private String importMode; 
            private String insertType; 

            /**
             * <p>Indicates whether the first row of the CSV file contains field names. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The first row in the CSV file contains field names.</li>
             * <li><strong>false</strong>: The first row in the CSV file contains data.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is valid if the value of <strong>FileType</strong> is <strong>CSV</strong> or <strong>EXCEL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder csvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
                this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
                return this;
            }

            /**
             * <p>Indicates whether an error that occurs is ignored. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: If an error occurs when SQL statements are being executed, DMS skips the current SQL statement and continues to execute subsequent SQL statements.</li>
             * <li><strong>false</strong>: If an error occurs when SQL statements are being executed, DMS stops executing subsequent SQL statements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * <p>The import mode. Valid values:</p>
             * <ul>
             * <li><strong>FAST_MODE</strong>: fast mode. In the Execute step, the uploaded file is read and SQL statements are executed to import data to the specified destination database. Compared with the security mode, this mode can be used to import data in a less secure but more efficient manner.</li>
             * <li><strong>SAFE_MODE</strong>: security mode. In the Precheck step, the uploaded file is parsed, and SQL statements or CSV file data is cached. In the Execute step, the cached SQL statements are read and executed to import data, or the cached CSV file data is read and imported to the specified destination database. Compared with the fast mode, this mode can be used to import data in a more secure but less efficient manner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAST_MODE</p>
             */
            public Builder importMode(String importMode) {
                this.importMode = importMode;
                return this;
            }

            /**
             * <p>The mode in which data is to be imported to the destination table. Valid values:</p>
             * <ul>
             * <li><strong>INSERT</strong>: The database checks the primary key during data insertion. If the primary key is duplicated, an error is reported.</li>
             * <li><strong>INSERT_IGNORE</strong>: If the imported data contains data records that are the same as those in the destination table, the new data records are ignored.</li>
             * <li><strong>REPLACE_INTO</strong>: If the imported data contains a row that has the same value for the primary key or unique index as an existing row in the destination table, the system deletes the existing row and inserts the new row into the destination table.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is valid if the value of FileType is CSV or EXCEL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>INSERT</p>
             */
            public Builder insertType(String insertType) {
                this.insertType = insertType;
                return this;
            }

            public ImportExtConfig build() {
                return new ImportExtConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class ConfigDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private Boolean cron;

        @com.aliyun.core.annotation.NameInMap("CronCallTimes")
        private Integer cronCallTimes;

        @com.aliyun.core.annotation.NameInMap("CronExtConfig")
        private CronExtConfig cronExtConfig;

        @com.aliyun.core.annotation.NameInMap("CronFormat")
        private String cronFormat;

        @com.aliyun.core.annotation.NameInMap("CronLastCallStartTime")
        private String cronLastCallStartTime;

        @com.aliyun.core.annotation.NameInMap("CronNextCallTime")
        private String cronNextCallTime;

        @com.aliyun.core.annotation.NameInMap("CronStatus")
        private String cronStatus;

        @com.aliyun.core.annotation.NameInMap("CsvTableName")
        private String csvTableName;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskId")
        private Long currentTaskId;

        @com.aliyun.core.annotation.NameInMap("DetailType")
        private String detailType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FileEncoding")
        private String fileEncoding;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("ImportExtConfig")
        private ImportExtConfig importExtConfig;

        private ConfigDetail(Builder builder) {
            this.cron = builder.cron;
            this.cronCallTimes = builder.cronCallTimes;
            this.cronExtConfig = builder.cronExtConfig;
            this.cronFormat = builder.cronFormat;
            this.cronLastCallStartTime = builder.cronLastCallStartTime;
            this.cronNextCallTime = builder.cronNextCallTime;
            this.cronStatus = builder.cronStatus;
            this.csvTableName = builder.csvTableName;
            this.currentTaskId = builder.currentTaskId;
            this.detailType = builder.detailType;
            this.duration = builder.duration;
            this.fileEncoding = builder.fileEncoding;
            this.fileType = builder.fileType;
            this.importExtConfig = builder.importExtConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigDetail create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public Boolean getCron() {
            return this.cron;
        }

        /**
         * @return cronCallTimes
         */
        public Integer getCronCallTimes() {
            return this.cronCallTimes;
        }

        /**
         * @return cronExtConfig
         */
        public CronExtConfig getCronExtConfig() {
            return this.cronExtConfig;
        }

        /**
         * @return cronFormat
         */
        public String getCronFormat() {
            return this.cronFormat;
        }

        /**
         * @return cronLastCallStartTime
         */
        public String getCronLastCallStartTime() {
            return this.cronLastCallStartTime;
        }

        /**
         * @return cronNextCallTime
         */
        public String getCronNextCallTime() {
            return this.cronNextCallTime;
        }

        /**
         * @return cronStatus
         */
        public String getCronStatus() {
            return this.cronStatus;
        }

        /**
         * @return csvTableName
         */
        public String getCsvTableName() {
            return this.csvTableName;
        }

        /**
         * @return currentTaskId
         */
        public Long getCurrentTaskId() {
            return this.currentTaskId;
        }

        /**
         * @return detailType
         */
        public String getDetailType() {
            return this.detailType;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fileEncoding
         */
        public String getFileEncoding() {
            return this.fileEncoding;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return importExtConfig
         */
        public ImportExtConfig getImportExtConfig() {
            return this.importExtConfig;
        }

        public static final class Builder {
            private Boolean cron; 
            private Integer cronCallTimes; 
            private CronExtConfig cronExtConfig; 
            private String cronFormat; 
            private String cronLastCallStartTime; 
            private String cronNextCallTime; 
            private String cronStatus; 
            private String csvTableName; 
            private Long currentTaskId; 
            private String detailType; 
            private Integer duration; 
            private String fileEncoding; 
            private String fileType; 
            private ImportExtConfig importExtConfig; 

            /**
             * <p>Indicates whether the task is a scheduled task for historical data cleanup. This parameter is a reserved parameter and is valid only if the value of DetailType is CRON_CLEAR_DATA.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cron(Boolean cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The number of times the scheduled task is run. This parameter is valid only if the value of DetailType is CRON_CLEAR_DATA.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cronCallTimes(Integer cronCallTimes) {
                this.cronCallTimes = cronCallTimes;
                return this;
            }

            /**
             * <p>The additional configuration information about historical data cleanup. This parameter is valid only if the value of DetailType is CRON_CLEAR_DATA.</p>
             */
            public Builder cronExtConfig(CronExtConfig cronExtConfig) {
                this.cronExtConfig = cronExtConfig;
                return this;
            }

            /**
             * <p>The CRON expression of the scheduled task. This parameter is valid only if the value of DetailType is CRON_CLEAR_DATA.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cronFormat(String cronFormat) {
                this.cronFormat = cronFormat;
                return this;
            }

            /**
             * <p>The time when the task was last run.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-19 02:00:00.0</p>
             */
            public Builder cronLastCallStartTime(String cronLastCallStartTime) {
                this.cronLastCallStartTime = cronLastCallStartTime;
                return this;
            }

            /**
             * <p>The time when the task is run next time. This parameter is returned only if the value of CronStatus is SUCCESS.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-19 02:00:00</p>
             */
            public Builder cronNextCallTime(String cronNextCallTime) {
                this.cronNextCallTime = cronNextCallTime;
                return this;
            }

            /**
             * <p>The state of the scheduled task. If this parameter is empty, the task is not run. Valid values:</p>
             * <ul>
             * <li>PAUSE: The task is suspended.</li>
             * <li>WAITING: The task is waiting to be run.</li>
             * <li>SUCCESS: The task is run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder cronStatus(String cronStatus) {
                this.cronStatus = cronStatus;
                return this;
            }

            /**
             * <p>The name of the table to which data is to be imported. This parameter is valid only if the value of DetailType is BIG_FILE. If the value of FileType is SQL, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>tb_import_tb_name</p>
             */
            public Builder csvTableName(String csvTableName) {
                this.csvTableName = csvTableName;
                return this;
            }

            /**
             * <p>The ID of the current data change task. This is a reserved parameter and can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>13***</p>
             */
            public Builder currentTaskId(Long currentTaskId) {
                this.currentTaskId = currentTaskId;
                return this;
            }

            /**
             * <p>The type of the ticket. Valid values:</p>
             * <ul>
             * <li>COMMON: regular data change.</li>
             * <li>CHUNK_DML: lock-free data change.</li>
             * <li>BIG_FILE: large data import.</li>
             * <li>CRON_CLEAR_DATA: historical data cleanup.</li>
             * <li>PROCEDURE: programmable object change.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BIG_FILE</p>
             */
            public Builder detailType(String detailType) {
                this.detailType = detailType;
                return this;
            }

            /**
             * <p>The execution duration of the scheduled task. Unit: hour. This parameter is valid only if the value of DetailType is CRON_CLEAR_DATA. If the value is greater than 0, an execution duration is set.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The encoding method of the file. This parameter may be empty, which indicates the value of AUTO. Valid values:</p>
             * <ul>
             * <li><strong>AUTO</strong>: automatic identification.</li>
             * <li><strong>UTF-8</strong>: UTF-8 encoding.</li>
             * <li><strong>GBK</strong>: GBK encoding.</li>
             * <li><strong>ISO-8859-1</strong>: ISO-8859-1 encoding.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UTF-8</p>
             */
            public Builder fileEncoding(String fileEncoding) {
                this.fileEncoding = fileEncoding;
                return this;
            }

            /**
             * <p>The type of the file to be imported. This parameter is valid if the value of DetailType is BIG_FILE. Valid values:</p>
             * <ul>
             * <li><strong>SQL</strong>: an SQL file.</li>
             * <li><strong>CSV</strong>: a CSV file.</li>
             * <li><strong>EXCEL</strong>: an Excel file.</li>
             * <li><strong>JSON</strong>: a JSON file, which is supported only by MongoDB databases.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The additional configuration information about data import. This parameter is valid if the value of DetailType is BIG_FILE.</p>
             */
            public Builder importExtConfig(ImportExtConfig importExtConfig) {
                this.importExtConfig = importExtConfig;
                return this;
            }

            public ConfigDetail build() {
                return new ConfigDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private Database(Builder builder) {
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private Integer dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String searchName; 

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1860****</p>
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The engine of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs. Valid values:</p>
             * <ul>
             * <li>product: production environment.</li>
             * <li>dev: development environment.</li>
             * <li>pre: pre-release environment.</li>
             * <li>test: test environment.</li>
             * <li>sit: system integration testing (SIT) environment</li>
             * <li>uat: user acceptance testing (UAT) environment.</li>
             * <li>pet: stress testing environment.</li>
             * <li>stag: staging environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true.</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx@xxx:3306</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class DatabaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private java.util.List<Database> database;

        private DatabaseList(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List<Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List<Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List<Database> database) {
                this.database = database;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class OrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @com.aliyun.core.annotation.NameInMap("AttachmentName")
        private String attachmentName;

        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("EstimateAffectRows")
        private Long estimateAffectRows;

        @com.aliyun.core.annotation.NameInMap("ExeSQL")
        private String exeSQL;

        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRows")
        private Boolean ignoreAffectRows;

        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRowsReason")
        private String ignoreAffectRowsReason;

        @com.aliyun.core.annotation.NameInMap("RbAttachmentName")
        private String rbAttachmentName;

        @com.aliyun.core.annotation.NameInMap("RbSQL")
        private String rbSQL;

        @com.aliyun.core.annotation.NameInMap("RbSQLType")
        private String rbSQLType;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        private OrderDetail(Builder builder) {
            this.actualAffectRows = builder.actualAffectRows;
            this.attachmentName = builder.attachmentName;
            this.classify = builder.classify;
            this.estimateAffectRows = builder.estimateAffectRows;
            this.exeSQL = builder.exeSQL;
            this.ignoreAffectRows = builder.ignoreAffectRows;
            this.ignoreAffectRowsReason = builder.ignoreAffectRowsReason;
            this.rbAttachmentName = builder.rbAttachmentName;
            this.rbSQL = builder.rbSQL;
            this.rbSQLType = builder.rbSQLType;
            this.sqlType = builder.sqlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetail create() {
            return builder().build();
        }

        /**
         * @return actualAffectRows
         */
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        /**
         * @return attachmentName
         */
        public String getAttachmentName() {
            return this.attachmentName;
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return estimateAffectRows
         */
        public Long getEstimateAffectRows() {
            return this.estimateAffectRows;
        }

        /**
         * @return exeSQL
         */
        public String getExeSQL() {
            return this.exeSQL;
        }

        /**
         * @return ignoreAffectRows
         */
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        /**
         * @return ignoreAffectRowsReason
         */
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        /**
         * @return rbAttachmentName
         */
        public String getRbAttachmentName() {
            return this.rbAttachmentName;
        }

        /**
         * @return rbSQL
         */
        public String getRbSQL() {
            return this.rbSQL;
        }

        /**
         * @return rbSQLType
         */
        public String getRbSQLType() {
            return this.rbSQLType;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        public static final class Builder {
            private Long actualAffectRows; 
            private String attachmentName; 
            private String classify; 
            private Long estimateAffectRows; 
            private String exeSQL; 
            private Boolean ignoreAffectRows; 
            private String ignoreAffectRowsReason; 
            private String rbAttachmentName; 
            private String rbSQL; 
            private String rbSQLType; 
            private String sqlType; 

            /**
             * <p>The number of affected rows that is obtained by the precheck.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * <p>The name of the attachment that contains the SQL statements used to change data.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * <p>The category of the reason for the data change.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The estimated number of affected rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder estimateAffectRows(Long estimateAffectRows) {
                this.estimateAffectRows = estimateAffectRows;
                return this;
            }

            /**
             * <p>The executed SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>update t1 set name = &quot;xxx&quot; where id &lt;= 100</p>
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * <p>Indicates whether the precheck result is ignored. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The precheck result is ignored.</li>
             * <li><strong>false</strong>: The precheck result is not ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * <p>The reason why the precheck result is ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * <p>The name of the attachment that contains the SQL statements used to roll back the data change.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rbAttachmentName(String rbAttachmentName) {
                this.rbAttachmentName = rbAttachmentName;
                return this;
            }

            /**
             * <p>The SQL statements used to roll back the data change.</p>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder rbSQL(String rbSQL) {
                this.rbSQL = rbSQL;
                return this;
            }

            /**
             * <p>The format of the SQL statements used to roll back the data change. Valid values:</p>
             * <ul>
             * <li><strong>TEXT</strong>: text</li>
             * <li><strong>ATTACHMENT</strong>: attachment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder rbSQLType(String rbSQLType) {
                this.rbSQLType = rbSQLType;
                return this;
            }

            /**
             * <p>The format of the SQL statements used to change data. Valid values:</p>
             * <ul>
             * <li><strong>TEXT</strong>: text</li>
             * <li><strong>ATTACHMENT</strong>: attachment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            public OrderDetail build() {
                return new OrderDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class TaskCheckDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckStep")
        private String checkStep;

        @com.aliyun.core.annotation.NameInMap("UserTip")
        private String userTip;

        private TaskCheckDO(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.checkStep = builder.checkStep;
            this.userTip = builder.userTip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskCheckDO create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkStep
         */
        public String getCheckStep() {
            return this.checkStep;
        }

        /**
         * @return userTip
         */
        public String getUserTip() {
            return this.userTip;
        }

        public static final class Builder {
            private String checkStatus; 
            private String checkStep; 
            private String userTip; 

            /**
             * <p>The state of the precheck. Valid values:</p>
             * <ul>
             * <li><strong>WAITING</strong>: The ticket is pending precheck.</li>
             * <li><strong>RUNNING</strong>: The ticket is being prechecked.</li>
             * <li><strong>SUCCESS</strong>: The ticket passes the precheck.</li>
             * <li><strong>FAIL</strong>: The ticket fails the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The check step of the precheck. Valid values:</p>
             * <ul>
             * <li><strong>SQL_PARSE</strong>: The system checks the syntax of the SQL statement.</li>
             * <li><strong>SQL_TYPE_CHECK</strong>: The system checks the type of the SQL statement.</li>
             * <li><strong>PERMISSION_CHECK</strong>: The system checks the permissions required for the data change.</li>
             * <li><strong>ROW_CHECK</strong>: The system checks the number of affected rows.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PERMISSION_CHECK</p>
             */
            public Builder checkStep(String checkStep) {
                this.checkStep = checkStep;
                return this;
            }

            /**
             * <p>The message that appears when a check step is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>tip messsage</p>
             */
            public Builder userTip(String userTip) {
                this.userTip = userTip;
                return this;
            }

            public TaskCheckDO build() {
                return new TaskCheckDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class PreCheckDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskCheckDO")
        private java.util.List<TaskCheckDO> taskCheckDO;

        private PreCheckDetail(Builder builder) {
            this.taskCheckDO = builder.taskCheckDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckDetail create() {
            return builder().build();
        }

        /**
         * @return taskCheckDO
         */
        public java.util.List<TaskCheckDO> getTaskCheckDO() {
            return this.taskCheckDO;
        }

        public static final class Builder {
            private java.util.List<TaskCheckDO> taskCheckDO; 

            /**
             * TaskCheckDO.
             */
            public Builder taskCheckDO(java.util.List<TaskCheckDO> taskCheckDO) {
                this.taskCheckDO = taskCheckDO;
                return this;
            }

            public PreCheckDetail build() {
                return new PreCheckDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectOrderDetailResponseBody</p>
     */
    public static class DataCorrectOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigDetail")
        private ConfigDetail configDetail;

        @com.aliyun.core.annotation.NameInMap("DatabaseList")
        private DatabaseList databaseList;

        @com.aliyun.core.annotation.NameInMap("ExecMode")
        private String execMode;

        @com.aliyun.core.annotation.NameInMap("OrderDetail")
        private OrderDetail orderDetail;

        @com.aliyun.core.annotation.NameInMap("PreCheckDetail")
        private PreCheckDetail preCheckDetail;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataCorrectOrderDetail(Builder builder) {
            this.configDetail = builder.configDetail;
            this.databaseList = builder.databaseList;
            this.execMode = builder.execMode;
            this.orderDetail = builder.orderDetail;
            this.preCheckDetail = builder.preCheckDetail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCorrectOrderDetail create() {
            return builder().build();
        }

        /**
         * @return configDetail
         */
        public ConfigDetail getConfigDetail() {
            return this.configDetail;
        }

        /**
         * @return databaseList
         */
        public DatabaseList getDatabaseList() {
            return this.databaseList;
        }

        /**
         * @return execMode
         */
        public String getExecMode() {
            return this.execMode;
        }

        /**
         * @return orderDetail
         */
        public OrderDetail getOrderDetail() {
            return this.orderDetail;
        }

        /**
         * @return preCheckDetail
         */
        public PreCheckDetail getPreCheckDetail() {
            return this.preCheckDetail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private ConfigDetail configDetail; 
            private DatabaseList databaseList; 
            private String execMode; 
            private OrderDetail orderDetail; 
            private PreCheckDetail preCheckDetail; 
            private String status; 

            /**
             * <p>The configurations of the ticket. This parameter is used to store the configuration information specific to a data change ticket type.</p>
             */
            public Builder configDetail(ConfigDetail configDetail) {
                this.configDetail = configDetail;
                return this;
            }

            /**
             * <p>The information about the database in which data is changed.</p>
             */
            public Builder databaseList(DatabaseList databaseList) {
                this.databaseList = databaseList;
                return this;
            }

            /**
             * <p>The execution mode of the ticket after the ticket is approved. Valid values:</p>
             * <ul>
             * <li><strong>COMMITOR</strong>: The data change is performed by the user who submits the ticket.</li>
             * <li><strong>AUTO</strong>: The data change is automatically performed after the ticket is approved.</li>
             * <li><strong>LAST_AUDITOR</strong>: The data change is performed by the last approver of the ticket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMMITOR</p>
             */
            public Builder execMode(String execMode) {
                this.execMode = execMode;
                return this;
            }

            /**
             * <p>The details of the ticket.</p>
             */
            public Builder orderDetail(OrderDetail orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            /**
             * <p>The precheck details of the ticket.</p>
             */
            public Builder preCheckDetail(PreCheckDetail preCheckDetail) {
                this.preCheckDetail = preCheckDetail;
                return this;
            }

            /**
             * <p>The specific state of the data change ticket. Valid values:</p>
             * <blockquote>
             * <p> The state of the ticket is not exactly equivalent to the status code for the ticket. To query the status code of the ticket, you can call the <a href="https://help.aliyun.com/document_detail/465868.html">GetOrderBaseInfo</a> operation and check the value of StatusCode in the response.</p>
             * </blockquote>
             * <ul>
             * <li><strong>new</strong>: The ticket is created.</li>
             * <li><strong>precheck</strong>: The ticket is in the pre-check phase.</li>
             * <li><strong>precheckFailed</strong>: The ticket failed to pass the precheck.</li>
             * <li><strong>precheck_success</strong>: The ticket passes the precheck and waits to be submitted for approval.</li>
             * <li><strong>toaudit</strong>: The ticket is being reviewed.</li>
             * <li><strong>Approved</strong>: The ticket is approved.</li>
             * <li><strong>reject</strong>: The ticket is rejected.</li>
             * <li><strong>waiting</strong>: The task is submitted and waits to be scheduled.</li>
             * <li><strong>processing</strong>: The task is being executed.</li>
             * <li><strong>Success</strong>: The task is successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>approved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataCorrectOrderDetail build() {
                return new DataCorrectOrderDetail(this);
            } 

        } 

    }
}
