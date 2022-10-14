// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogInfo} extends {@link TeaModel}
 *
 * <p>LogInfo</p>
 */
public class LogInfo extends TeaModel {
    @NameInMap("BizTime")
    private String bizTime;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("LogContent")
    private String logContent;

    @NameInMap("LogId")
    private String logId;

    @NameInMap("LogSummary")
    private String logSummary;

    @NameInMap("LogType")
    private String logType;

    private LogInfo(Builder builder) {
        this.bizTime = builder.bizTime;
        this.gmtCreate = builder.gmtCreate;
        this.instanceId = builder.instanceId;
        this.logContent = builder.logContent;
        this.logId = builder.logId;
        this.logSummary = builder.logSummary;
        this.logType = builder.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogInfo create() {
        return builder().build();
    }

    /**
     * @return bizTime
     */
    public String getBizTime() {
        return this.bizTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logContent
     */
    public String getLogContent() {
        return this.logContent;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return logSummary
     */
    public String getLogSummary() {
        return this.logSummary;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    public static final class Builder {
        private String bizTime; 
        private String gmtCreate; 
        private String instanceId; 
        private String logContent; 
        private String logId; 
        private String logSummary; 
        private String logType; 

        /**
         * 业务运行时间
         */
        public Builder bizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 日志内容
         */
        public Builder logContent(String logContent) {
            this.logContent = logContent;
            return this;
        }

        /**
         * 日志id
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * 日志概要
         */
        public Builder logSummary(String logSummary) {
            this.logSummary = logSummary;
            return this;
        }

        /**
         * 日志级别
         */
        public Builder logType(String logType) {
            this.logType = logType;
            return this;
        }

        public LogInfo build() {
            return new LogInfo(this);
        } 

    } 

}
