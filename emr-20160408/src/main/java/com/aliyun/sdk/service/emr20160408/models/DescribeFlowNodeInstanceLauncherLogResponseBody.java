// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowNodeInstanceLauncherLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowNodeInstanceLauncherLogResponseBody</p>
 */
public class DescribeFlowNodeInstanceLauncherLogResponseBody extends TeaModel {
    @NameInMap("LogEnd")
    private Boolean logEnd;

    @NameInMap("LogEntrys")
    private LogEntrys logEntrys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFlowNodeInstanceLauncherLogResponseBody(Builder builder) {
        this.logEnd = builder.logEnd;
        this.logEntrys = builder.logEntrys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowNodeInstanceLauncherLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return logEnd
     */
    public Boolean getLogEnd() {
        return this.logEnd;
    }

    /**
     * @return logEntrys
     */
    public LogEntrys getLogEntrys() {
        return this.logEntrys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean logEnd; 
        private LogEntrys logEntrys; 
        private String requestId; 

        /**
         * LogEnd.
         */
        public Builder logEnd(Boolean logEnd) {
            this.logEnd = logEnd;
            return this;
        }

        /**
         * LogEntrys.
         */
        public Builder logEntrys(LogEntrys logEntrys) {
            this.logEntrys = logEntrys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFlowNodeInstanceLauncherLogResponseBody build() {
            return new DescribeFlowNodeInstanceLauncherLogResponseBody(this);
        } 

    } 

    public static class LogEntry extends TeaModel {
        @NameInMap("Content")
        private String content;

        private LogEntry(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEntry create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public LogEntry build() {
                return new LogEntry(this);
            } 

        } 

    }
    public static class LogEntrys extends TeaModel {
        @NameInMap("LogEntry")
        private java.util.List < LogEntry> logEntry;

        private LogEntrys(Builder builder) {
            this.logEntry = builder.logEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEntrys create() {
            return builder().build();
        }

        /**
         * @return logEntry
         */
        public java.util.List < LogEntry> getLogEntry() {
            return this.logEntry;
        }

        public static final class Builder {
            private java.util.List < LogEntry> logEntry; 

            /**
             * LogEntry.
             */
            public Builder logEntry(java.util.List < LogEntry> logEntry) {
                this.logEntry = logEntry;
                return this;
            }

            public LogEntrys build() {
                return new LogEntrys(this);
            } 

        } 

    }
}
