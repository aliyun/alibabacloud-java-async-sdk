// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link GetCommonLogDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommonLogDetailResponseBody</p>
 */
public class GetCommonLogDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("LogDetail")
    private java.util.List<LogDetail> logDetail;

    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.NameInMap("OperatorUid")
    private String operatorUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private GetCommonLogDetailResponseBody(Builder builder) {
        this.action = builder.action;
        this.clusterId = builder.clusterId;
        this.logDetail = builder.logDetail;
        this.logType = builder.logType;
        this.operatorUid = builder.operatorUid;
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonLogDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return logDetail
     */
    public java.util.List<LogDetail> getLogDetail() {
        return this.logDetail;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return operatorUid
     */
    public String getOperatorUid() {
        return this.operatorUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String action; 
        private String clusterId; 
        private java.util.List<LogDetail> logDetail; 
        private String logType; 
        private String operatorUid; 
        private String requestId; 
        private String uid; 

        private Builder() {
        } 

        private Builder(GetCommonLogDetailResponseBody model) {
            this.action = model.action;
            this.clusterId = model.clusterId;
            this.logDetail = model.logDetail;
            this.logType = model.logType;
            this.operatorUid = model.operatorUid;
            this.requestId = model.requestId;
            this.uid = model.uid;
        } 

        /**
         * <p>The action name.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateCluster</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-abc***</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The information about the logs.</p>
         */
        public Builder logDetail(java.util.List<LogDetail> logDetail) {
            this.logDetail = logDetail;
            return this;
        }

        /**
         * <p>The log type.</p>
         * 
         * <strong>example:</strong>
         * <p>operation</p>
         */
        public Builder logType(String logType) {
            this.logType = logType;
            return this;
        }

        /**
         * <p>The account ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>239***</p>
         */
        public Builder operatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>464E9919-D04F-4D1D-B375-15989492****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>137***</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetCommonLogDetailResponseBody build() {
            return new GetCommonLogDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCommonLogDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommonLogDetailResponseBody</p>
     */
    public static class Stages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Stages(Builder builder) {
            this.logLevel = builder.logLevel;
            this.message = builder.message;
            this.method = builder.method;
            this.requestId = builder.requestId;
            this.status = builder.status;
            this.target = builder.target;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stages create() {
            return builder().build();
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String logLevel; 
            private String message; 
            private String method; 
            private String requestId; 
            private String status; 
            private String target; 
            private String time; 

            private Builder() {
            } 

            private Builder(Stages model) {
                this.logLevel = model.logLevel;
                this.message = model.message;
                this.method = model.method;
                this.requestId = model.requestId;
                this.status = model.status;
                this.target = model.target;
                this.time = model.time;
            } 

            /**
             * <p>The log level.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ERROR</li>
             * <li>INFO</li>
             * <li>WARN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * <p>The output message of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>Successfully created security group sg-bcd***</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The method involved in the log.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateSecurityGroup</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The request ID associated with the log.</p>
             * 
             * <strong>example:</strong>
             * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The action state involved in the log. Valid values:</p>
             * <ul>
             * <li>InProgress: The action is being performed.</li>
             * <li>Finished: The action is completed.</li>
             * <li>Failed: The action failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The resource involved in the log.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bcd***</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The time when the log was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-22 14:21:54</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Stages build() {
                return new Stages(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCommonLogDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommonLogDetailResponseBody</p>
     */
    public static class LogDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private java.util.List<Stages> stages;

        private LogDetail(Builder builder) {
            this.stageName = builder.stageName;
            this.stages = builder.stages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDetail create() {
            return builder().build();
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return stages
         */
        public java.util.List<Stages> getStages() {
            return this.stages;
        }

        public static final class Builder {
            private String stageName; 
            private java.util.List<Stages> stages; 

            private Builder() {
            } 

            private Builder(LogDetail model) {
                this.stageName = model.stageName;
                this.stages = model.stages;
            } 

            /**
             * <p>The stage name of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigNetwork</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The information about the log stages.</p>
             */
            public Builder stages(java.util.List<Stages> stages) {
                this.stages = stages;
                return this;
            }

            public LogDetail build() {
                return new LogDetail(this);
            } 

        } 

    }
}
