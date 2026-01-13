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
 * {@link ListExecutorEventsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutorEventsRequest</p>
 */
public class ListExecutorEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListExecutorEventsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
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

    public static final class Builder extends Request.Builder<ListExecutorEventsRequest, Builder> {
        private Filter filter; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutorEventsRequest request) {
            super(request);
            this.filter = request.filter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Queries the Executor filter conditions.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The current page number.<br>Starting value: 1<br>Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page. Default value: 50. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListExecutorEventsRequest build() {
            return new ListExecutorEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutorEventsRequest} extends {@link TeaModel}
     *
     * <p>ListExecutorEventsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutorIds")
        private java.util.List<String> executorIds;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("TimeAfter")
        private Long timeAfter;

        @com.aliyun.core.annotation.NameInMap("TimeBefore")
        private Long timeBefore;

        private Filter(Builder builder) {
            this.executorIds = builder.executorIds;
            this.jobId = builder.jobId;
            this.level = builder.level;
            this.timeAfter = builder.timeAfter;
            this.timeBefore = builder.timeBefore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return executorIds
         */
        public java.util.List<String> getExecutorIds() {
            return this.executorIds;
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
         * @return timeAfter
         */
        public Long getTimeAfter() {
            return this.timeAfter;
        }

        /**
         * @return timeBefore
         */
        public Long getTimeBefore() {
            return this.timeBefore;
        }

        public static final class Builder {
            private java.util.List<String> executorIds; 
            private String jobId; 
            private String level; 
            private Long timeAfter; 
            private Long timeBefore; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.executorIds = model.executorIds;
                this.jobId = model.jobId;
                this.level = model.level;
                this.timeAfter = model.timeAfter;
                this.timeBefore = model.timeBefore;
            } 

            /**
             * <p>The list of executor IDs. A maximum of 100 IDs are supported.</p>
             */
            public Builder executorIds(java.util.List<String> executorIds) {
                this.executorIds = executorIds;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-xxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The level of the running event. Valid value:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Warning</li>
             * <li>Error</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>For jobs submitted after this time, the time in the region is converted into a Unix timestamp (UI8 regionfor Aliyun sites).</p>
             * 
             * <strong>example:</strong>
             * <p>1703820113</p>
             */
            public Builder timeAfter(Long timeAfter) {
                this.timeAfter = timeAfter;
                return this;
            }

            /**
             * <p>For jobs submitted before this time, the time in the region is converted into a Unix timestamp (UI8 regionfor Aliyun sites).</p>
             * 
             * <strong>example:</strong>
             * <p>1703819914</p>
             */
            public Builder timeBefore(Long timeBefore) {
                this.timeBefore = timeBefore;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
