// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeFullProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFullProcessListResponseBody</p>
 */
public class DescribeFullProcessListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.Map<String, ?> configList;

    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("FullProcessList")
    private java.util.List<FullProcessList> fullProcessList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFullProcessListResponseBody(Builder builder) {
        this.code = builder.code;
        this.configList = builder.configList;
        this.dtsJobId = builder.dtsJobId;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.fullProcessList = builder.fullProcessList;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFullProcessListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configList
     */
    public java.util.Map<String, ?> getConfigList() {
        return this.configList;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return fullProcessList
     */
    public java.util.List<FullProcessList> getFullProcessList() {
        return this.fullProcessList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private java.util.Map<String, ?> configList; 
        private String dtsJobId; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private java.util.List<FullProcessList> fullProcessList; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeFullProcessListResponseBody model) {
            this.code = model.code;
            this.configList = model.configList;
            this.dtsJobId = model.dtsJobId;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.fullProcessList = model.fullProcessList;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The throttling configuration. Valid values:</p>
         * <ul>
         * <li><strong>dts.datamove.blaster.qps.max</strong>: The rate at which queries are made to the source database per second.</li>
         * <li><strong>dts.datamove.source.rps.max</strong>: the number of rows that are fully synchronized or migrated per second.</li>
         * <li><strong>dts.datamove.source.bps.max</strong>: the amount of data processed per second for full synchronization or migration. Unit: Byte/s.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>When you set the <strong>JobCode</strong> parameter to <strong>03</strong>, you need to specify the <strong>EnableLimit</strong> parameter as <strong>true</strong>. Otherwise, the configuration cannot take effect.</p>
         * </li>
         * <li><p>When you set the <strong>JobCode</strong> parameter to <strong>04</strong> or <strong>07</strong>, you only need to specify the <strong>dts.datamove.source.rps.max</strong> and <strong>dts.datamove.source.bps.max</strong> parameters.</p>
         * </li>
         * <li><p>A value of **-1** indicates no rate limit.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;dts.datamove.source.rps.max&quot;: 5000,
         *       &quot;dts.datamove.source.bps.max&quot;: 10485760
         * }</p>
         */
        public Builder configList(java.util.Map<String, ?> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>i03e3zty16i****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> The request parameter <strong>DtsJobId</strong> is invalid if <strong>The Value of Input Parameter %s is not valid</strong> is returned for <strong>ErrMessage</strong> and <strong>DtsJobId</strong> is returned for <strong>DynamicMessage</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned when the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned when the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The details of the GA instances.</p>
         */
        public Builder fullProcessList(java.util.List<FullProcessList> fullProcessList) {
            this.fullProcessList = fullProcessList;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
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

        public DescribeFullProcessListResponseBody build() {
            return new DescribeFullProcessListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFullProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFullProcessListResponseBody</p>
     */
    public static class FullProcessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Exception")
        private String exception;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessType")
        private String processType;

        @com.aliyun.core.annotation.NameInMap("RunningSQL")
        private String runningSQL;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskID")
        private String taskID;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private FullProcessList(Builder builder) {
            this.detail = builder.detail;
            this.exception = builder.exception;
            this.processName = builder.processName;
            this.processType = builder.processType;
            this.runningSQL = builder.runningSQL;
            this.state = builder.state;
            this.taskID = builder.taskID;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullProcessList create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return exception
         */
        public String getException() {
            return this.exception;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processType
         */
        public String getProcessType() {
            return this.processType;
        }

        /**
         * @return runningSQL
         */
        public String getRunningSQL() {
            return this.runningSQL;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskID
         */
        public String getTaskID() {
            return this.taskID;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String detail; 
            private String exception; 
            private String processName; 
            private String processType; 
            private String runningSQL; 
            private String state; 
            private String taskID; 
            private Long time; 

            private Builder() {
            } 

            private Builder(FullProcessList model) {
                this.detail = model.detail;
                this.exception = model.exception;
                this.processName = model.processName;
                this.processType = model.processType;
                this.runningSQL = model.runningSQL;
                this.state = model.state;
                this.taskID = model.taskID;
                this.time = model.time;
            } 

            /**
             * <p>Details</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The abnormal status of the task. Valid values:<strong>notstarted</strong>. -<strong>checking</strong>. -<strong>failed</strong>. -<strong>finished</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>notstarted</p>
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * <p>The name of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>universer</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The type of the process. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: trusted</li>
             * <li><strong>2</strong>: suspicious</li>
             * <li><strong>3</strong>: malicious</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processType(String processType) {
                this.processType = processType;
                return this;
            }

            /**
             * <p>SQL that is running</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder runningSQL(String runningSQL) {
                this.runningSQL = runningSQL;
                return this;
            }

            /**
             * <p>The log status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskD4E5F6</p>
             */
            public Builder taskID(String taskID) {
                this.taskID = taskID;
                return this;
            }

            /**
             * <p>The time when the logs were collected. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1729650129452</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public FullProcessList build() {
                return new FullProcessList(this);
            } 

        } 

    }
}
