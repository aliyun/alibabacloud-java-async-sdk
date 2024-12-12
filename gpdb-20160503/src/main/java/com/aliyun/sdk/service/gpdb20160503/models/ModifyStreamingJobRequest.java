// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyStreamingJobRequest} extends {@link RequestModel}
 *
 * <p>ModifyStreamingJobRequest</p>
 */
public class ModifyStreamingJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DestColumns")
    private java.util.List < String > destColumns;

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
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchColumns")
    private java.util.List < String > matchColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcColumns")
    private java.util.List < String > srcColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TryRun")
    private Boolean tryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateColumns")
    private java.util.List < String > updateColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WriteMode")
    private String writeMode;

    private ModifyStreamingJobRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.consistency = builder.consistency;
        this.DBInstanceId = builder.DBInstanceId;
        this.destColumns = builder.destColumns;
        this.destDatabase = builder.destDatabase;
        this.destSchema = builder.destSchema;
        this.destTable = builder.destTable;
        this.errorLimitCount = builder.errorLimitCount;
        this.fallbackOffset = builder.fallbackOffset;
        this.groupName = builder.groupName;
        this.jobConfig = builder.jobConfig;
        this.jobDescription = builder.jobDescription;
        this.jobId = builder.jobId;
        this.matchColumns = builder.matchColumns;
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

    public static ModifyStreamingJobRequest create() {
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
     * @return destColumns
     */
    public java.util.List < String > getDestColumns() {
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
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return matchColumns
     */
    public java.util.List < String > getMatchColumns() {
        return this.matchColumns;
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
    public java.util.List < String > getSrcColumns() {
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
    public java.util.List < String > getUpdateColumns() {
        return this.updateColumns;
    }

    /**
     * @return writeMode
     */
    public String getWriteMode() {
        return this.writeMode;
    }

    public static final class Builder extends Request.Builder<ModifyStreamingJobRequest, Builder> {
        private String account; 
        private String consistency; 
        private String DBInstanceId; 
        private java.util.List < String > destColumns; 
        private String destDatabase; 
        private String destSchema; 
        private String destTable; 
        private Long errorLimitCount; 
        private String fallbackOffset; 
        private String groupName; 
        private String jobConfig; 
        private String jobDescription; 
        private Long jobId; 
        private java.util.List < String > matchColumns; 
        private String password; 
        private String regionId; 
        private java.util.List < String > srcColumns; 
        private Boolean tryRun; 
        private java.util.List < String > updateColumns; 
        private String writeMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStreamingJobRequest request) {
            super(request);
            this.account = request.account;
            this.consistency = request.consistency;
            this.DBInstanceId = request.DBInstanceId;
            this.destColumns = request.destColumns;
            this.destDatabase = request.destDatabase;
            this.destSchema = request.destSchema;
            this.destTable = request.destTable;
            this.errorLimitCount = request.errorLimitCount;
            this.fallbackOffset = request.fallbackOffset;
            this.groupName = request.groupName;
            this.jobConfig = request.jobConfig;
            this.jobDescription = request.jobDescription;
            this.jobId = request.jobId;
            this.matchColumns = request.matchColumns;
            this.password = request.password;
            this.regionId = request.regionId;
            this.srcColumns = request.srcColumns;
            this.tryRun = request.tryRun;
            this.updateColumns = request.updateColumns;
            this.writeMode = request.writeMode;
        } 

        /**
         * <p>Account name.</p>
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
         * <p>Delivery guarantee.</p>
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
         * <p>Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ModifyStreamingJob</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Target data table mapping field list.</p>
         */
        public Builder destColumns(java.util.List < String > destColumns) {
            String destColumnsShrink = shrink(destColumns, "DestColumns", "json");
            this.putQueryParameter("DestColumns", destColumnsShrink);
            this.destColumns = destColumns;
            return this;
        }

        /**
         * <p>Target database name.</p>
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
         * <p>Target schema.</p>
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
         * <p>Target table name.</p>
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
         * <p>When the data in Kafka does not match the ADBPG target table, it will cause a write failure. This value is the number of error rows allowed; exceeding this will cause the task to fail.</p>
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
         * <p>FallbackOffset rollback position, offset rollback</p>
         * <ul>
         * <li>The FallbackOffset parameter defines the behavior when the consumer does not request a specific consumption point or the requested consumption point exceeds the current Kafka cluster&quot;s recorded points. You can choose to start consuming from the earliest (newest) or latest (oldest) point.</li>
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
         * <p>Kafka group name</p>
         * 
         * <strong>example:</strong>
         * <p>group_name</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Job configuration file, required for professional mode.</p>
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
         * <p>Job description.</p>
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
         * <p>Job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Match columns, usually all primary key columns of the target table. If all column values in this configuration are the same, the two rows of data are considered duplicates.</p>
         */
        public Builder matchColumns(java.util.List < String > matchColumns) {
            String matchColumnsShrink = shrink(matchColumns, "MatchColumns", "json");
            this.putQueryParameter("MatchColumns", matchColumnsShrink);
            this.matchColumns = matchColumns;
            return this;
        }

        /**
         * <p>Password.</p>
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
         * <p>Region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
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
         * <p>Source data field list.</p>
         */
        public Builder srcColumns(java.util.List < String > srcColumns) {
            String srcColumnsShrink = shrink(srcColumns, "SrcColumns", "json");
            this.putQueryParameter("SrcColumns", srcColumnsShrink);
            this.srcColumns = srcColumns;
            return this;
        }

        /**
         * <p>Whether to test the real-time task, values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Update columns, usually all non-primary key columns of the target table. When data duplication is determined through MatchColumns, updating the UpdateColumns column values will result in new data overwriting old data.</p>
         */
        public Builder updateColumns(java.util.List < String > updateColumns) {
            String updateColumnsShrink = shrink(updateColumns, "UpdateColumns", "json");
            this.putQueryParameter("UpdateColumns", updateColumnsShrink);
            this.updateColumns = updateColumns;
            return this;
        }

        /**
         * <p>Write mode.</p>
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
        public ModifyStreamingJobRequest build() {
            return new ModifyStreamingJobRequest(this);
        } 

    } 

}
