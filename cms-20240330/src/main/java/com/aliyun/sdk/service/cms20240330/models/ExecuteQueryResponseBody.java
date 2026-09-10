// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ExecuteQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteQueryResponseBody</p>
 */
public class ExecuteQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<java.util.Map<String, String>> data;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ExecuteQueryResponseBody(Builder builder) {
        this.data = builder.data;
        this.meta = builder.meta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, String>> data; 
        private Meta meta; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteQueryResponseBody model) {
            this.data = model.data;
            this.meta = model.meta;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array of log entries. Each object in the array represents a log entry.</p>
         */
        public Builder data(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Metadata about the query execution.</p>
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteQueryResponseBody build() {
            return new ExecuteQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteQueryResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("affectedRows")
        private Integer affectedRows;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("elapsedMillisecond")
        private Long elapsedMillisecond;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        private Meta(Builder builder) {
            this.affectedRows = builder.affectedRows;
            this.count = builder.count;
            this.elapsedMillisecond = builder.elapsedMillisecond;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return affectedRows
         */
        public Integer getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return elapsedMillisecond
         */
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Integer affectedRows; 
            private Integer count; 
            private Long elapsedMillisecond; 
            private String progress; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.affectedRows = model.affectedRows;
                this.count = model.count;
                this.elapsedMillisecond = model.elapsedMillisecond;
                this.progress = model.progress;
            } 

            /**
             * <p>The number of scanned or processed log entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder affectedRows(Integer affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * <p>The number of log entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The query execution time in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1231243</p>
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * <p>The query completion status. A value of <code>Complete</code> indicates that the query has finished.</p>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
