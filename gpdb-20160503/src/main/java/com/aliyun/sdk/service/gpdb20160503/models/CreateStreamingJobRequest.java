// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateStreamingJobRequest} extends {@link RequestModel}
 *
 * <p>CreateStreamingJobRequest</p>
 */
public class CreateStreamingJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Consistency")
    private String consistency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestColumns")
    private java.util.List<String> destColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabase")
    private String destDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestSchema")
    private String destSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestTable")
    private String destTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorLimitCount")
    private Long errorLimitCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackOffset")
    private String fallbackOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobConfig")
    private String jobConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDescription")
    private String jobDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchColumns")
    private java.util.List<String> matchColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcColumns")
    private java.util.List<String> srcColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TryRun")
    private Boolean tryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateColumns")
    private java.util.List<String> updateColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WriteMode")
    private String writeMode;

    private CreateStreamingJobRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.consistency = builder.consistency;
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceId = builder.dataSourceId;
        this.destColumns = builder.destColumns;
        this.destDatabase = builder.destDatabase;
        this.destSchema = builder.destSchema;
        this.destTable = builder.destTable;
        this.errorLimitCount = builder.errorLimitCount;
        this.fallbackOffset = builder.fallbackOffset;
        this.groupName = builder.groupName;
        this.jobConfig = builder.jobConfig;
        this.jobDescription = builder.jobDescription;
        this.jobName = builder.jobName;
        this.matchColumns = builder.matchColumns;
        this.mode = builder.mode;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.srcColumns = builder.srcColumns;
        this.tryRun = builder.tryRun;
        this.updateColumns = builder.updateColumns;
        this.writeMode = builder.writeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamingJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return consistency
     */
    public String getConsistency() {
        return this.consistency;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return destColumns
     */
    public java.util.List<String> getDestColumns() {
        return this.destColumns;
    }

    /**
     * @return destDatabase
     */
    public String getDestDatabase() {
        return this.destDatabase;
    }

    /**
     * @return destSchema
     */
    public String getDestSchema() {
        return this.destSchema;
    }

    /**
     * @return destTable
     */
    public String getDestTable() {
        return this.destTable;
    }

    /**
     * @return errorLimitCount
     */
    public Long getErrorLimitCount() {
        return this.errorLimitCount;
    }

    /**
     * @return fallbackOffset
     */
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return jobConfig
     */
    public String getJobConfig() {
        return this.jobConfig;
    }

    /**
     * @return jobDescription
     */
    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return matchColumns
     */
    public java.util.List<String> getMatchColumns() {
        return this.matchColumns;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return srcColumns
     */
    public java.util.List<String> getSrcColumns() {
        return this.srcColumns;
    }

    /**
     * @return tryRun
     */
    public Boolean getTryRun() {
        return this.tryRun;
    }

    /**
     * @return updateColumns
     */
    public java.util.List<String> getUpdateColumns() {
        return this.updateColumns;
    }

    /**
     * @return writeMode
     */
    public String getWriteMode() {
        return this.writeMode;
    }

    public static final class Builder extends Request.Builder<CreateStreamingJobRequest, Builder> {
        private String account; 
        private String consistency; 
        private String DBInstanceId; 
        private String dataSourceId; 
        private java.util.List<String> destColumns; 
        private String destDatabase; 
        private String destSchema; 
        private String destTable; 
        private Long errorLimitCount; 
        private String fallbackOffset; 
        private String groupName; 
        private String jobConfig; 
        private String jobDescription; 
        private String jobName; 
        private java.util.List<String> matchColumns; 
        private String mode; 
        private String password; 
        private String regionId; 
        private java.util.List<String> srcColumns; 
        private Boolean tryRun; 
        private java.util.List<String> updateColumns; 
        private String writeMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateStreamingJobRequest request) {
            super(request);
            this.account = request.account;
            this.consistency = request.consistency;
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceId = request.dataSourceId;
            this.destColumns = request.destColumns;
            this.destDatabase = request.destDatabase;
            this.destSchema = request.destSchema;
            this.destTable = request.destTable;
            this.errorLimitCount = request.errorLimitCount;
            this.fallbackOffset = request.fallbackOffset;
            this.groupName = request.groupName;
            this.jobConfig = request.jobConfig;
            this.jobDescription = request.jobDescription;
            this.jobName = request.jobName;
            this.matchColumns = request.matchColumns;
            this.mode = request.mode;
            this.password = request.password;
            this.regionId = request.regionId;
            this.srcColumns = request.srcColumns;
            this.tryRun = request.tryRun;
            this.updateColumns = request.updateColumns;
            this.writeMode = request.writeMode;
        } 

        /**
         * <p>The account for the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>The delivery guarantee.</p>
         * 
         * <strong>example:</strong>
         * <p>ATLEAST / EXACTLY</p>
         */
        public Builder consistency(String consistency) {
            this.putQueryParameter("Consistency", consistency);
            this.consistency = consistency;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp10g78o9807yv9h3</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The list of mapped fields in the destination table.</p>
         */
        public Builder destColumns(java.util.List<String> destColumns) {
            String destColumnsShrink = shrink(destColumns, "DestColumns", "json");
            this.putQueryParameter("DestColumns", destColumnsShrink);
            this.destColumns = destColumns;
            return this;
        }

        /**
         * <p>The name of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-db</p>
         */
        public Builder destDatabase(String destDatabase) {
            this.putQueryParameter("DestDatabase", destDatabase);
            this.destDatabase = destDatabase;
            return this;
        }

        /**
         * <p>The destination namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-schema</p>
         */
        public Builder destSchema(String destSchema) {
            this.putQueryParameter("DestSchema", destSchema);
            this.destSchema = destSchema;
            return this;
        }

        /**
         * <p>The name of the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-table</p>
         */
        public Builder destTable(String destTable) {
            this.putQueryParameter("DestTable", destTable);
            this.destTable = destTable;
            return this;
        }

        /**
         * <p>The maximum number of allowed error rows. When data in Kafka does not match the destination AnalyticDB for PostgreSQL table, a write failure occurs. If the number of error rows exceeds this value, the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder errorLimitCount(Long errorLimitCount) {
            this.putQueryParameter("ErrorLimitCount", errorLimitCount);
            this.errorLimitCount = errorLimitCount;
            return this;
        }

        /**
         * <p>The fallback offset.</p>
         * <ul>
         * <li>The FallbackOffset parameter defines the behavior when a consumer does not request a specific offset to consume, or when the requested offset exceeds the offset range recorded in the current Kafka cluster. You can choose to start consuming from the earliest or latest offset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EARLIEST /  LATEST</p>
         */
        public Builder fallbackOffset(String fallbackOffset) {
            this.putQueryParameter("FallbackOffset", fallbackOffset);
            this.fallbackOffset = fallbackOffset;
            return this;
        }

        /**
         * <p>The name of the Kafka group.</p>
         * 
         * <strong>example:</strong>
         * <p>group_name。</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The task configuration file. This parameter is required in professional mode.</p>
         * 
         * <strong>example:</strong>
         * <p>DATABASE: adbpgss_test
         * USER: adbpgss_test
         * PASSWORD: adbpgssTest
         * HOST: gp-xxx-master.gpdb.rds-aliyun-pre.rds.aliyuncs.com
         * PORT: 5432
         * KAFKA:
         *   INPUT:
         *     SOURCE:
         *       BROKERS: broker1:9092,broker2:9092,broker3:9092
         *       TOPIC: testtopic
         *       FALLBACK_OFFSET: earliest
         *     KEY:
         *       COLUMNS:
         *       - NAME: customer_id
         *         TYPE: int
         *       FORMAT: delimited
         *       DELIMITED_OPTION:
         *         DELIMITER: &quot;|&quot;
         *     VALUE:
         *       COLUMNS:
         *       - TYPE: integer
         *         NAME: l_orderkey
         *       - TYPE: integer
         *         NAME: l_partkey
         *       - TYPE: integer
         *         NAME: l_suppkey
         *       - TYPE: integer
         *         NAME: l_linenumber
         *       - TYPE: decimal
         *         NAME: l_quantity
         *       - TYPE: decimal
         *         NAME: l_extendedprice
         *       - TYPE: decimal
         *         NAME: l_discount
         *       - TYPE: decimal
         *         NAME: l_tax
         *       - TYPE: char
         *         NAME: l_returnflag
         *       - TYPE: char
         *         NAME: l_linestatus
         *       - TYPE: date
         *         NAME: l_shipdate
         *       - TYPE: date
         *         NAME: l_commitdate
         *       - TYPE: date
         *         NAME: l_receiptdate
         *       - TYPE: text
         *         NAME: l_shipinstruct
         *       - TYPE: text
         *         NAME: l_shipmode
         *       - TYPE: text
         *         NAME: l_comment
         *       FORMAT: delimited
         *       DELIMITED_OPTION:
         *         DELIMITER: &quot;|&quot;
         *     ERROR_LIMIT: 10
         *   OUTPUT:
         *     SCHEMA: adbpgss_test
         *     TABLE: write_with_insert_plaintext
         *     MODE: MERGE
         *     MATCH_COLUMNS:
         *     - l_orderkey
         *     - l_partkey
         *     - l_suppkey
         *     UPDATE_COLUMNS:
         *     - l_linenumber
         *     - l_quantity
         *     - l_extendedprice
         *     - l_discount
         *     - l_tax
         *     - l_returnflag
         *     - l_linestatus
         *     - l_shipdate
         *     - l_commitdate
         *     - l_receiptdate
         *     - l_shipinstruct
         *     - l_shipmode
         *     - l_comment
         *     MAPPING:
         *     - EXPRESSION: l_orderkey
         *       NAME: l_orderkey
         *     - EXPRESSION: l_partkey
         *       NAME: l_partkey
         *     - EXPRESSION: l_suppkey
         *       NAME: l_suppkey
         *     - EXPRESSION: l_linenumber
         *       NAME: l_linenumber
         *     - EXPRESSION: l_quantity
         *       NAME: l_quantity
         *     - EXPRESSION: l_extendedprice
         *       NAME: l_extendedprice
         *     - EXPRESSION: l_discount
         *       NAME: l_discount
         *     - EXPRESSION: l_tax
         *       NAME: l_tax
         *     - EXPRESSION: l_returnflag
         *       NAME: l_returnflag
         *     - EXPRESSION: l_linestatus
         *       NAME: l_linestatus
         *     - EXPRESSION: l_shipdate
         *       NAME: l_shipdate
         *     - EXPRESSION: l_commitdate
         *       NAME: l_commitdate
         *     - EXPRESSION: l_receiptdate
         *       NAME: l_receiptdate
         *     - EXPRESSION: l_shipinstruct
         *       NAME: l_shipinstruct
         *     - EXPRESSION: l_shipmode
         *       NAME: l_shipmode
         *     - EXPRESSION: l_comment
         *       NAME: l_comment
         *   COMMIT:
         *     MAX_ROW: 1000
         *     MINIMAL_INTERVAL: 1000
         *     CONSISTENCY: ATLEAST
         *   POLL:
         *     BATCHSIZE: 1000
         *     TIMEOUT: 1000
         *   PROPERTIES:
         *     group.id: testgroup</p>
         */
        public Builder jobConfig(String jobConfig) {
            this.putQueryParameter("JobConfig", jobConfig);
            this.jobConfig = jobConfig;
            return this;
        }

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        public Builder jobDescription(String jobDescription) {
            this.putQueryParameter("JobDescription", jobDescription);
            this.jobDescription = jobDescription;
            return this;
        }

        /**
         * <p>The task name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The match columns. Typically, these are all the primary key columns of the destination table. If the values of all columns in this configuration are the same, the two rows of data are considered duplicate.</p>
         */
        public Builder matchColumns(java.util.List<String> matchColumns) {
            String matchColumnsShrink = shrink(matchColumns, "MatchColumns", "json");
            this.putQueryParameter("MatchColumns", matchColumnsShrink);
            this.matchColumns = matchColumns;
            return this;
        }

        /**
         * <p>The configuration mode.</p>
         * <ol>
         * <li>The basic mode requires you to specify certain configuration fields.</li>
         * <li>The professional mode supports submitting a YAML file.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>basic / professional</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The password for the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd123</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of source data fields.</p>
         */
        public Builder srcColumns(java.util.List<String> srcColumns) {
            String srcColumnsShrink = shrink(srcColumns, "SrcColumns", "json");
            this.putQueryParameter("SrcColumns", srcColumnsShrink);
            this.srcColumns = srcColumns;
            return this;
        }

        /**
         * <p>Specifies whether to test the real-time task. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder tryRun(Boolean tryRun) {
            this.putQueryParameter("TryRun", tryRun);
            this.tryRun = tryRun;
            return this;
        }

        /**
         * <p>The update columns. Typically, these are all the non-primary key columns of the destination table. When duplicate data is identified based on MatchColumns, updating the values of the UpdateColumns overwrites the old data with the new data.</p>
         */
        public Builder updateColumns(java.util.List<String> updateColumns) {
            String updateColumnsShrink = shrink(updateColumns, "UpdateColumns", "json");
            this.putQueryParameter("UpdateColumns", updateColumnsShrink);
            this.updateColumns = updateColumns;
            return this;
        }

        /**
         * <p>The write mode.</p>
         * 
         * <strong>example:</strong>
         * <p>INSERT/UPDATE/MERGE</p>
         */
        public Builder writeMode(String writeMode) {
            this.putQueryParameter("WriteMode", writeMode);
            this.writeMode = writeMode;
            return this;
        }

        @Override
        public CreateStreamingJobRequest build() {
            return new CreateStreamingJobRequest(this);
        } 

    } 

}
