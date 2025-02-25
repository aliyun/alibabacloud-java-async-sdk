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
        private String code; 
        private Long endTime; 
        private String error; 
        private String result; 
        private String resultUri; 
        private Long startTime; 
        private String state; 
        private String statementId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * ResultUri.
         */
        public Builder resultUri(String resultUri) {
            this.resultUri = resultUri;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * StatementId.
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
