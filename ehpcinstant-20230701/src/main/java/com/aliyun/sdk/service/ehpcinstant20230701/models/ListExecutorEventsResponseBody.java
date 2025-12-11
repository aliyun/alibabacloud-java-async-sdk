// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListExecutorEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutorEventsResponseBody</p>
 */
public class ListExecutorEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutorEventList")
    private java.util.List<ExecutorEventList> executorEventList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListExecutorEventsResponseBody(Builder builder) {
        this.executorEventList = builder.executorEventList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executorEventList
     */
    public java.util.List<ExecutorEventList> getExecutorEventList() {
        return this.executorEventList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ExecutorEventList> executorEventList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListExecutorEventsResponseBody model) {
            this.executorEventList = model.executorEventList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ExecutorEventList.
         */
        public Builder executorEventList(java.util.List<ExecutorEventList> executorEventList) {
            this.executorEventList = executorEventList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExecutorEventsResponseBody build() {
            return new ListExecutorEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutorEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorEventsResponseBody</p>
     */
    public static class ExecutorEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ExecutorId")
        private String executorId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ExecutorEventList(Builder builder) {
            this.content = builder.content;
            this.executorId = builder.executorId;
            this.jobId = builder.jobId;
            this.level = builder.level;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorEventList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return executorId
         */
        public String getExecutorId() {
            return this.executorId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String content; 
            private String executorId; 
            private String jobId; 
            private String level; 
            private String time; 

            private Builder() {
            } 

            private Builder(ExecutorEventList model) {
                this.content = model.content;
                this.executorId = model.executorId;
                this.jobId = model.jobId;
                this.level = model.level;
                this.time = model.time;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ExecutorId.
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ExecutorEventList build() {
                return new ExecutorEventList(this);
            } 

        } 

    }
}
