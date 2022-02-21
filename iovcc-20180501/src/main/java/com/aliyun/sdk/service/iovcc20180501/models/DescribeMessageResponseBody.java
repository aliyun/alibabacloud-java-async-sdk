// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMessageResponseBody</p>
 */
public class DescribeMessageResponseBody extends TeaModel {
    @NameInMap("Message")
    private Message message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMessageResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Message message; 
        private String requestId; 

        /**
         * Message.
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMessageResponseBody build() {
            return new DescribeMessageResponseBody(this);
        } 

    } 

    public static class Message extends TeaModel {
        @NameInMap("AckCnt")
        private Integer ackCnt;

        @NameInMap("Action")
        private String action;

        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Audit")
        private Integer audit;

        @NameInMap("AuditMsg")
        private String auditMsg;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("ExipiredTime")
        private Long exipiredTime;

        @NameInMap("GmtCreateTime")
        private Long gmtCreateTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Parameter")
        private String parameter;

        @NameInMap("PredictSendCnt")
        private Integer predictSendCnt;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("SendStatus")
        private Integer sendStatus;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Uri")
        private String uri;

        private Message(Builder builder) {
            this.ackCnt = builder.ackCnt;
            this.action = builder.action;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.audit = builder.audit;
            this.auditMsg = builder.auditMsg;
            this.desc = builder.desc;
            this.exipiredTime = builder.exipiredTime;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.id = builder.id;
            this.parameter = builder.parameter;
            this.predictSendCnt = builder.predictSendCnt;
            this.projectId = builder.projectId;
            this.sendStatus = builder.sendStatus;
            this.title = builder.title;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return ackCnt
         */
        public Integer getAckCnt() {
            return this.ackCnt;
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return audit
         */
        public Integer getAudit() {
            return this.audit;
        }

        /**
         * @return auditMsg
         */
        public String getAuditMsg() {
            return this.auditMsg;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return exipiredTime
         */
        public Long getExipiredTime() {
            return this.exipiredTime;
        }

        /**
         * @return gmtCreateTime
         */
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return parameter
         */
        public String getParameter() {
            return this.parameter;
        }

        /**
         * @return predictSendCnt
         */
        public Integer getPredictSendCnt() {
            return this.predictSendCnt;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return sendStatus
         */
        public Integer getSendStatus() {
            return this.sendStatus;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Integer ackCnt; 
            private String action; 
            private String appKey; 
            private String appName; 
            private Integer audit; 
            private String auditMsg; 
            private String desc; 
            private Long exipiredTime; 
            private Long gmtCreateTime; 
            private Long id; 
            private String parameter; 
            private Integer predictSendCnt; 
            private String projectId; 
            private Integer sendStatus; 
            private String title; 
            private Integer type; 
            private String uri; 

            /**
             * AckCnt.
             */
            public Builder ackCnt(Integer ackCnt) {
                this.ackCnt = ackCnt;
                return this;
            }

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Audit.
             */
            public Builder audit(Integer audit) {
                this.audit = audit;
                return this;
            }

            /**
             * AuditMsg.
             */
            public Builder auditMsg(String auditMsg) {
                this.auditMsg = auditMsg;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * ExipiredTime.
             */
            public Builder exipiredTime(Long exipiredTime) {
                this.exipiredTime = exipiredTime;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(Long gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Parameter.
             */
            public Builder parameter(String parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * PredictSendCnt.
             */
            public Builder predictSendCnt(Integer predictSendCnt) {
                this.predictSendCnt = predictSendCnt;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SendStatus.
             */
            public Builder sendStatus(Integer sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
}
