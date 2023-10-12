// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskLog} extends {@link TeaModel}
 *
 * <p>TaskLog</p>
 */
public class TaskLog extends TeaModel {
    @NameInMap("FuncName")
    private String funcName;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("Level")
    private String level;

    @NameInMap("LineNo")
    private Integer lineNo;

    @NameInMap("LogId")
    private String logId;

    @NameInMap("Message")
    private String message;

    @NameInMap("TaskId")
    private String taskId;

    private TaskLog(Builder builder) {
        this.funcName = builder.funcName;
        this.gmtCreate = builder.gmtCreate;
        this.level = builder.level;
        this.lineNo = builder.lineNo;
        this.logId = builder.logId;
        this.message = builder.message;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskLog create() {
        return builder().build();
    }

    /**
     * @return funcName
     */
    public String getFuncName() {
        return this.funcName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return lineNo
     */
    public Integer getLineNo() {
        return this.lineNo;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String funcName; 
        private String gmtCreate; 
        private String level; 
        private Integer lineNo; 
        private String logId; 
        private String message; 
        private String taskId; 

        /**
         * FuncName.
         */
        public Builder funcName(String funcName) {
            this.funcName = funcName;
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
         * Level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * LineNo.
         */
        public Builder lineNo(Integer lineNo) {
            this.lineNo = lineNo;
            return this;
        }

        /**
         * LogId.
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public TaskLog build() {
            return new TaskLog(this);
        } 

    } 

}
