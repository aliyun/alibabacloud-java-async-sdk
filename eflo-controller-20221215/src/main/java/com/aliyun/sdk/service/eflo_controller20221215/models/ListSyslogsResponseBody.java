// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListSyslogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSyslogsResponseBody</p>
 */
public class ListSyslogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSyslogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSyslogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Logs> logs; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSyslogsResponseBody model) {
            this.logs = model.logs;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Logs.
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2FE2B22C-CF9D-59DE-BF63-DC9B9B33A9D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSyslogsResponseBody build() {
            return new ListSyslogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSyslogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSyslogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Facility")
        private String facility;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Syslogtag")
        private String syslogtag;

        @com.aliyun.core.annotation.NameInMap("TagHostname")
        private String tagHostname;

        @com.aliyun.core.annotation.NameInMap("TagPackId")
        private String tagPackId;

        @com.aliyun.core.annotation.NameInMap("TagPath")
        private String tagPath;

        @com.aliyun.core.annotation.NameInMap("TagReceiveTime")
        private String tagReceiveTime;

        @com.aliyun.core.annotation.NameInMap("TagUserDefinedId")
        private String tagUserDefinedId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private Logs(Builder builder) {
            this.clusterId = builder.clusterId;
            this.domain = builder.domain;
            this.facility = builder.facility;
            this.hostname = builder.hostname;
            this.ip = builder.ip;
            this.msg = builder.msg;
            this.nodeId = builder.nodeId;
            this.severity = builder.severity;
            this.sn = builder.sn;
            this.source = builder.source;
            this.syslogtag = builder.syslogtag;
            this.tagHostname = builder.tagHostname;
            this.tagPackId = builder.tagPackId;
            this.tagPath = builder.tagPath;
            this.tagReceiveTime = builder.tagReceiveTime;
            this.tagUserDefinedId = builder.tagUserDefinedId;
            this.time = builder.time;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return facility
         */
        public String getFacility() {
            return this.facility;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return syslogtag
         */
        public String getSyslogtag() {
            return this.syslogtag;
        }

        /**
         * @return tagHostname
         */
        public String getTagHostname() {
            return this.tagHostname;
        }

        /**
         * @return tagPackId
         */
        public String getTagPackId() {
            return this.tagPackId;
        }

        /**
         * @return tagPath
         */
        public String getTagPath() {
            return this.tagPath;
        }

        /**
         * @return tagReceiveTime
         */
        public String getTagReceiveTime() {
            return this.tagReceiveTime;
        }

        /**
         * @return tagUserDefinedId
         */
        public String getTagUserDefinedId() {
            return this.tagUserDefinedId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String clusterId; 
            private String domain; 
            private String facility; 
            private String hostname; 
            private String ip; 
            private String msg; 
            private String nodeId; 
            private String severity; 
            private String sn; 
            private String source; 
            private String syslogtag; 
            private String tagHostname; 
            private String tagPackId; 
            private String tagPath; 
            private String tagReceiveTime; 
            private String tagUserDefinedId; 
            private String time; 
            private String topic; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.clusterId = model.clusterId;
                this.domain = model.domain;
                this.facility = model.facility;
                this.hostname = model.hostname;
                this.ip = model.ip;
                this.msg = model.msg;
                this.nodeId = model.nodeId;
                this.severity = model.severity;
                this.sn = model.sn;
                this.source = model.source;
                this.syslogtag = model.syslogtag;
                this.tagHostname = model.tagHostname;
                this.tagPackId = model.tagPackId;
                this.tagPath = model.tagPath;
                this.tagReceiveTime = model.tagReceiveTime;
                this.tagUserDefinedId = model.tagUserDefinedId;
                this.time = model.time;
                this.topic = model.topic;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Facility.
             */
            public Builder facility(String facility) {
                this.facility = facility;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Syslogtag.
             */
            public Builder syslogtag(String syslogtag) {
                this.syslogtag = syslogtag;
                return this;
            }

            /**
             * TagHostname.
             */
            public Builder tagHostname(String tagHostname) {
                this.tagHostname = tagHostname;
                return this;
            }

            /**
             * TagPackId.
             */
            public Builder tagPackId(String tagPackId) {
                this.tagPackId = tagPackId;
                return this;
            }

            /**
             * TagPath.
             */
            public Builder tagPath(String tagPath) {
                this.tagPath = tagPath;
                return this;
            }

            /**
             * TagReceiveTime.
             */
            public Builder tagReceiveTime(String tagReceiveTime) {
                this.tagReceiveTime = tagReceiveTime;
                return this;
            }

            /**
             * TagUserDefinedId.
             */
            public Builder tagUserDefinedId(String tagUserDefinedId) {
                this.tagUserDefinedId = tagUserDefinedId;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
