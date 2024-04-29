// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogMetaResponseBody</p>
 */
public class GetLogMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogMeta")
    private LogMeta logMeta;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLogMetaResponseBody(Builder builder) {
        this.logMeta = builder.logMeta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return logMeta
     */
    public LogMeta getLogMeta() {
        return this.logMeta;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogMeta logMeta; 
        private String requestId; 

        /**
         * The data of a data shipping task.
         */
        public Builder logMeta(LogMeta logMeta) {
            this.logMeta = logMeta;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLogMetaResponseBody build() {
            return new GetLogMetaResponseBody(this);
        } 

    } 

    public static class LogMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LogMeta(Builder builder) {
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogMeta create() {
            return builder().build();
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String logStore; 
            private String project; 
            private String status; 

            /**
             * The name of the dedicated Logstore in which logs are stored.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The Simple Log Service project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The status of a data shipping task of a log. Valid values:
             * <p>
             * 
             * *   **enabled**
             * *   **disabled**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LogMeta build() {
                return new LogMeta(this);
            } 

        } 

    }
}
