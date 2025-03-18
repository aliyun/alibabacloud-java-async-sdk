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
 * {@link DescribeStreamingJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamingJobResponseBody</p>
 */
public class DescribeStreamingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.NameInMap("Consistency")
    private String consistency;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.NameInMap("DestColumns")
    private java.util.List<String> destColumns;

    @com.aliyun.core.annotation.NameInMap("DestDatabase")
    private String destDatabase;

    @com.aliyun.core.annotation.NameInMap("DestSchema")
    private String destSchema;

    @com.aliyun.core.annotation.NameInMap("DestTable")
    private String destTable;

    @com.aliyun.core.annotation.NameInMap("ErrorLimitCount")
    private Integer errorLimitCount;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FallbackOffset")
    private String fallbackOffset;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("JobConfig")
    private String jobConfig;

    @com.aliyun.core.annotation.NameInMap("JobDescription")
    private String jobDescription;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("MatchColumns")
    private java.util.List<String> matchColumns;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcColumns")
    private java.util.List<String> srcColumns;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateColumns")
    private java.util.List<String> updateColumns;

    @com.aliyun.core.annotation.NameInMap("WriteMode")
    private String writeMode;

    private DescribeStreamingJobResponseBody(Builder builder) {
        this.account = builder.account;
        this.consistency = builder.consistency;
        this.createTime = builder.createTime;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.destColumns = builder.destColumns;
        this.destDatabase = builder.destDatabase;
        this.destSchema = builder.destSchema;
        this.destTable = builder.destTable;
        this.errorLimitCount = builder.errorLimitCount;
        this.errorMessage = builder.errorMessage;
        this.fallbackOffset = builder.fallbackOffset;
        this.groupName = builder.groupName;
        this.jobConfig = builder.jobConfig;
        this.jobDescription = builder.jobDescription;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.matchColumns = builder.matchColumns;
        this.mode = builder.mode;
        this.modifyTime = builder.modifyTime;
        this.password = builder.password;
        this.requestId = builder.requestId;
        this.srcColumns = builder.srcColumns;
        this.status = builder.status;
        this.updateColumns = builder.updateColumns;
        this.writeMode = builder.writeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamingJobResponseBody create() {
        return builder().build();
    }

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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
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
    public Integer getErrorLimitCount() {
        return this.errorLimitCount;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public String getJobId() {
        return this.jobId;
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
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return srcColumns
     */
    public java.util.List<String> getSrcColumns() {
        return this.srcColumns;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
        private String account; 
        private String consistency; 
        private String createTime; 
        private String dataSourceId; 
        private String dataSourceName; 
        private java.util.List<String> destColumns; 
        private String destDatabase; 
        private String destSchema; 
        private String destTable; 
        private Integer errorLimitCount; 
        private String errorMessage; 
        private String fallbackOffset; 
        private String groupName; 
        private String jobConfig; 
        private String jobDescription; 
        private String jobId; 
        private String jobName; 
        private java.util.List<String> matchColumns; 
        private String mode; 
        private String modifyTime; 
        private String password; 
        private String requestId; 
        private java.util.List<String> srcColumns; 
        private String status; 
        private java.util.List<String> updateColumns; 
        private String writeMode; 

        private Builder() {
        } 

        private Builder(DescribeStreamingJobResponseBody model) {
            this.account = model.account;
            this.consistency = model.consistency;
            this.createTime = model.createTime;
            this.dataSourceId = model.dataSourceId;
            this.dataSourceName = model.dataSourceName;
            this.destColumns = model.destColumns;
            this.destDatabase = model.destDatabase;
            this.destSchema = model.destSchema;
            this.destTable = model.destTable;
            this.errorLimitCount = model.errorLimitCount;
            this.errorMessage = model.errorMessage;
            this.fallbackOffset = model.fallbackOffset;
            this.groupName = model.groupName;
            this.jobConfig = model.jobConfig;
            this.jobDescription = model.jobDescription;
            this.jobId = model.jobId;
            this.jobName = model.jobName;
            this.matchColumns = model.matchColumns;
            this.mode = model.mode;
            this.modifyTime = model.modifyTime;
            this.password = model.password;
            this.requestId = model.requestId;
            this.srcColumns = model.srcColumns;
            this.status = model.status;
            this.updateColumns = model.updateColumns;
            this.writeMode = model.writeMode;
        } 

        /**
         * <p>Target database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        public Builder account(String account) {
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
            this.consistency = consistency;
            return this;
        }

        /**
         * <p>Creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>Data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_kafka</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>Target data table mapping field list.</p>
         */
        public Builder destColumns(java.util.List<String> destColumns) {
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
            this.destDatabase = destDatabase;
            return this;
        }

        /**
         * <p>Target namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-schema</p>
         */
        public Builder destSchema(String destSchema) {
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
            this.destTable = destTable;
            return this;
        }

        /**
         * <p>When data in Kafka does not match the ADBPG target table, it can cause write failures. This value represents the number of error rows allowed; if exceeded, the task will fail.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder errorLimitCount(Integer errorLimitCount) {
            this.errorLimitCount = errorLimitCount;
            return this;
        }

        /**
         * <p>Service status information, such as the reason for an exception. It is empty in the normal Running state.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Fallback offset, which is the fallback position</p>
         * <ul>
         * <li>The FallbackOffset parameter defines the behavior when the consumer has not requested a specific offset to consume or the requested offset exceeds the current record&quot;s offset information in the Kafka cluster. You can choose to start consuming from the earliest (newest) or latest (oldest) offset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EARLIEST /  LATEST</p>
         */
        public Builder fallbackOffset(String fallbackOffset) {
            this.fallbackOffset = fallbackOffset;
            return this;
        }

        /**
         * <p>Kafka group name</p>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Job configuration file.</p>
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
            this.jobConfig = jobConfig;
            return this;
        }

        /**
         * <p>Job description.</p>
         * 
         * <strong>example:</strong>
         * <p>test_job</p>
         */
        public Builder jobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Job name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>Match columns, usually all primary key columns of the target table. If all column values in this configuration are the same, the two rows of data are considered duplicates.</p>
         */
        public Builder matchColumns(java.util.List<String> matchColumns) {
            this.matchColumns = matchColumns;
            return this;
        }

        /**
         * <p>Configuration mode</p>
         * <ol>
         * <li>Basic mode requires specifying some configuration fields</li>
         * <li>Professional mode supports submitting YAML files</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>basic/professional</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>Last modified time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>Target database password.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd123</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Source field list.</p>
         */
        public Builder srcColumns(java.util.List<String> srcColumns) {
            this.srcColumns = srcColumns;
            return this;
        }

        /**
         * <p>Service status, with possible values:</p>
         * <ul>
         * <li><p>Init: Initializing</p>
         * </li>
         * <li><p>Running: Running</p>
         * </li>
         * <li><p>Exception: Exception</p>
         * </li>
         * <li><p>Paused: Paused</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Update columns, usually all non-primary key columns of the target table. When data duplication is determined through MatchColumns, updating the UpdateColumns column values will result in new data overwriting old data.</p>
         */
        public Builder updateColumns(java.util.List<String> updateColumns) {
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
            this.writeMode = writeMode;
            return this;
        }

        public DescribeStreamingJobResponseBody build() {
            return new DescribeStreamingJobResponseBody(this);
        } 

    } 

}
