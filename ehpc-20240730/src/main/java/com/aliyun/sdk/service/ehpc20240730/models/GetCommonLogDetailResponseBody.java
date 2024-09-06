// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < LogDetail> logDetail;

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
    public java.util.List < LogDetail> getLogDetail() {
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
        private java.util.List < LogDetail> logDetail; 
        private String logType; 
        private String operatorUid; 
        private String requestId; 
        private String uid; 

        /**
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * LogDetail.
         */
        public Builder logDetail(java.util.List < LogDetail> logDetail) {
            this.logDetail = logDetail;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.logType = logType;
            return this;
        }

        /**
         * OperatorUid.
         */
        public Builder operatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetCommonLogDetailResponseBody build() {
            return new GetCommonLogDetailResponseBody(this);
        } 

    } 

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

            /**
             * LogLevel.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
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
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * Time.
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
    public static class LogDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private java.util.List < Stages> stages;

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
        public java.util.List < Stages> getStages() {
            return this.stages;
        }

        public static final class Builder {
            private String stageName; 
            private java.util.List < Stages> stages; 

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * Stages.
             */
            public Builder stages(java.util.List < Stages> stages) {
                this.stages = stages;
                return this;
            }

            public LogDetail build() {
                return new LogDetail(this);
            } 

        } 

    }
}
