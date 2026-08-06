// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCrawlerRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrawlerRunsResponseBody</p>
 */
public class ListCrawlerRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCrawlerRunsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrawlerRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
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
        private PagingInfo pagingInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCrawlerRunsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCrawlerRunsResponseBody build() {
            return new ListCrawlerRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCrawlerRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrawlerRunsResponseBody</p>
     */
    public static class CrawlerRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
        private Long taskInstanceId;

        @com.aliyun.core.annotation.NameInMap("TotalTableCount")
        private Long totalTableCount;

        private CrawlerRuns(Builder builder) {
            this.duration = builder.duration;
            this.finishedTime = builder.finishedTime;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.taskInstanceId = builder.taskInstanceId;
            this.totalTableCount = builder.totalTableCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrawlerRuns create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskInstanceId
         */
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        /**
         * @return totalTableCount
         */
        public Long getTotalTableCount() {
            return this.totalTableCount;
        }

        public static final class Builder {
            private Double duration; 
            private Long finishedTime; 
            private Long startedTime; 
            private String status; 
            private Long taskInstanceId; 
            private Long totalTableCount; 

            private Builder() {
            } 

            private Builder(CrawlerRuns model) {
                this.duration = model.duration;
                this.finishedTime = model.finishedTime;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.taskInstanceId = model.taskInstanceId;
                this.totalTableCount = model.totalTableCount;
            } 

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * StartedTime.
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
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
             * TaskInstanceId.
             */
            public Builder taskInstanceId(Long taskInstanceId) {
                this.taskInstanceId = taskInstanceId;
                return this;
            }

            /**
             * TotalTableCount.
             */
            public Builder totalTableCount(Long totalTableCount) {
                this.totalTableCount = totalTableCount;
                return this;
            }

            public CrawlerRuns build() {
                return new CrawlerRuns(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCrawlerRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrawlerRunsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrawlerRuns")
        private java.util.List<CrawlerRuns> crawlerRuns;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.crawlerRuns = builder.crawlerRuns;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return crawlerRuns
         */
        public java.util.List<CrawlerRuns> getCrawlerRuns() {
            return this.crawlerRuns;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CrawlerRuns> crawlerRuns; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.crawlerRuns = model.crawlerRuns;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * CrawlerRuns.
             */
            public Builder crawlerRuns(java.util.List<CrawlerRuns> crawlerRuns) {
                this.crawlerRuns = crawlerRuns;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
