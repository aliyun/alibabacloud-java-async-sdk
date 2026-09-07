// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SparkBatchSQLStatement} extends {@link TeaModel}
 *
 * <p>SparkBatchSQLStatement</p>
 */
public class SparkBatchSQLStatement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("ResultUri")
    private String resultUri;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("StatementId")
    private String statementId;

    private SparkBatchSQLStatement(Builder builder) {
        this.appId = builder.appId;
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.error = builder.error;
        this.result = builder.result;
        this.resultUri = builder.resultUri;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkBatchSQLStatement create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return resultUri
     */
    public String getResultUri() {
        return this.resultUri;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return statementId
     */
    public String getStatementId() {
        return this.statementId;
    }

    public static final class Builder {
        private String appId; 
        private String code; 
        private Long endTime; 
        private String error; 
        private String result; 
        private String resultUri; 
        private Long startTime; 
        private String state; 
        private String statementId; 

        private Builder() {
        } 

        private Builder(SparkBatchSQLStatement model) {
            this.appId = model.appId;
            this.code = model.code;
            this.endTime = model.endTime;
            this.error = model.error;
            this.result = model.result;
            this.resultUri = model.resultUri;
            this.startTime = model.startTime;
            this.state = model.state;
            this.statementId = model.statementId;
        } 

        /**
         * <p>The ID of the Spark job that executes the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>s20240122jsdx****</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The text of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT 100</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The execution end timestamp of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1723521767000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The error message for the SQL statement execution.</p>
         * 
         * <strong>example:</strong>
         * <p>table is not found</p>
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The execution result of the SQL statement. The content is in the response format of the <code>DataFrame Show</code> statement in Spark.</p>
         * 
         * <strong>example:</strong>
         * <p>+---+-----+
         * |age| name|
         * +---+-----+
         * | 14|  Tom|
         * | 23|Alice|
         * +---+-----+</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) location where the execution results of the SQL statement are stored. If you do not specify a storage location, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://yourbucket/result.json</p>
         */
        public Builder resultUri(String resultUri) {
            this.resultUri = resultUri;
            return this;
        }

        /**
         * <p>The execution start timestamp of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1723521767000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <ul>
         * <li>FAILED</li>
         * <li>RUNNING</li>
         * <li>CANCELED</li>
         * <li>PENDING</li>
         * <li>FINISHED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The ID of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>sq1723521767****-0001</p>
         */
        public Builder statementId(String statementId) {
            this.statementId = statementId;
            return this;
        }

        public SparkBatchSQLStatement build() {
            return new SparkBatchSQLStatement(this);
        } 

    } 

}
