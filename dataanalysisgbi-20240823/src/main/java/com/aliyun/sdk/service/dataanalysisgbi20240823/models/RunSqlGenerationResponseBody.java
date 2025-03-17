// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link RunSqlGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>RunSqlGenerationResponseBody</p>
 */
public class RunSqlGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private RunSqlGenerationResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSqlGenerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Data data; 

        private Builder() {
        } 

        private Builder(RunSqlGenerationResponseBody model) {
            this.data = model.data;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public RunSqlGenerationResponseBody build() {
            return new RunSqlGenerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunSqlGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunSqlGenerationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("evidence")
        private String evidence;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("rewrite")
        private String rewrite;

        @com.aliyun.core.annotation.NameInMap("selector")
        private java.util.List<String> selector;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("sqlError")
        private String sqlError;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.evidence = builder.evidence;
            this.requestId = builder.requestId;
            this.rewrite = builder.rewrite;
            this.selector = builder.selector;
            this.sessionId = builder.sessionId;
            this.sql = builder.sql;
            this.sqlError = builder.sqlError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return evidence
         */
        public String getEvidence() {
            return this.evidence;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return rewrite
         */
        public String getRewrite() {
            return this.rewrite;
        }

        /**
         * @return selector
         */
        public java.util.List<String> getSelector() {
            return this.selector;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlError
         */
        public String getSqlError() {
            return this.sqlError;
        }

        public static final class Builder {
            private String errorMessage; 
            private String event; 
            private String evidence; 
            private String requestId; 
            private String rewrite; 
            private java.util.List<String> selector; 
            private String sessionId; 
            private String sql; 
            private String sqlError; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.evidence = model.evidence;
                this.requestId = model.requestId;
                this.rewrite = model.rewrite;
                this.selector = model.selector;
                this.sessionId = model.sessionId;
                this.sql = model.sql;
                this.sqlError = model.sqlError;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * evidence.
             */
            public Builder evidence(String evidence) {
                this.evidence = evidence;
                return this;
            }

            /**
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * rewrite.
             */
            public Builder rewrite(String rewrite) {
                this.rewrite = rewrite;
                return this;
            }

            /**
             * selector.
             */
            public Builder selector(java.util.List<String> selector) {
                this.selector = selector;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * sqlError.
             */
            public Builder sqlError(String sqlError) {
                this.sqlError = sqlError;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
