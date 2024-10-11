// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Statement} extends {@link TeaModel}
 *
 * <p>Statement</p>
 */
public class Statement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    private Long aliyunUid;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CodeState")
    private String codeState;

    @com.aliyun.core.annotation.NameInMap("CodeType")
    private String codeType;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("HaveRows")
    private Boolean haveRows;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private Long sessionId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("StatementId")
    private Long statementId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private Statement(Builder builder) {
        this.aliyunUid = builder.aliyunUid;
        this.code = builder.code;
        this.codeState = builder.codeState;
        this.codeType = builder.codeType;
        this.endTime = builder.endTime;
        this.error = builder.error;
        this.haveRows = builder.haveRows;
        this.output = builder.output;
        this.resourceGroup = builder.resourceGroup;
        this.sessionId = builder.sessionId;
        this.startTime = builder.startTime;
        this.statementId = builder.statementId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Statement create() {
        return builder().build();
    }

    /**
     * @return aliyunUid
     */
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeState
     */
    public String getCodeState() {
        return this.codeState;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
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
     * @return haveRows
     */
    public Boolean getHaveRows() {
        return this.haveRows;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return sessionId
     */
    public Long getSessionId() {
        return this.sessionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statementId
     */
    public Long getStatementId() {
        return this.statementId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long aliyunUid; 
        private String code; 
        private String codeState; 
        private String codeType; 
        private Long endTime; 
        private String error; 
        private Boolean haveRows; 
        private String output; 
        private String resourceGroup; 
        private Long sessionId; 
        private Long startTime; 
        private Long statementId; 
        private Long totalCount; 

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CodeState.
         */
        public Builder codeState(String codeState) {
            this.codeState = codeState;
            return this;
        }

        /**
         * CodeType.
         */
        public Builder codeType(String codeType) {
            this.codeType = codeType;
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
         * HaveRows.
         */
        public Builder haveRows(Boolean haveRows) {
            this.haveRows = haveRows;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * ResourceGroup.
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(Long sessionId) {
            this.sessionId = sessionId;
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
         * StatementId.
         */
        public Builder statementId(Long statementId) {
            this.statementId = statementId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Statement build() {
            return new Statement(this);
        } 

    } 

}
