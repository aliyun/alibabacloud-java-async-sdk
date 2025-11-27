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
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private SortBy sortBy;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsRequest create() {
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

    /**
     * @return sortBy
     */
    public SortBy getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private Filter filter; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private SortBy sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.filter = request.filter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
        } 

        /**
         * <p>Queries job filter conditions.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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

        /**
         * <p>The sorting method.</p>
         */
        public Builder sortBy(SortBy sortBy) {
            String sortByShrink = shrink(sortBy, "SortBy", "json");
            this.putQueryParameter("SortBy", sortByShrink);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListJobsRequest build() {
            return new ListJobsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsRequest} extends {@link TeaModel}
     *
     * <p>ListJobsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeCreatedAfter")
        private Integer timeCreatedAfter;

        @com.aliyun.core.annotation.NameInMap("TimeCreatedBefore")
        private Integer timeCreatedBefore;

        private Filter(Builder builder) {
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.status = builder.status;
            this.timeCreatedAfter = builder.timeCreatedAfter;
            this.timeCreatedBefore = builder.timeCreatedBefore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeCreatedAfter
         */
        public Integer getTimeCreatedAfter() {
            return this.timeCreatedAfter;
        }

        /**
         * @return timeCreatedBefore
         */
        public Integer getTimeCreatedBefore() {
            return this.timeCreatedBefore;
        }

        public static final class Builder {
            private String jobId; 
            private String jobName; 
            private String status; 
            private Integer timeCreatedAfter; 
            private Integer timeCreatedBefore; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.status = model.status;
                this.timeCreatedAfter = model.timeCreatedAfter;
                this.timeCreatedBefore = model.timeCreatedBefore;
            } 

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>job-xxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job name. Fuzzy search is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>testJob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>initing</li>
             * <li>Succeed</li>
             * <li>Failed</li>
             * <li>Running</li>
             * <li>Exception</li>
             * <li>Retrying</li>
             * <li>Expired</li>
             * <li>Suspended</li>
             * <li>Restarting</li>
             * <li>Deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>For jobs submitted after this time, the time in the region is converted into a UNIX timestamp (UI8).</p>
             * 
             * <strong>example:</strong>
             * <p>1703819914</p>
             */
            public Builder timeCreatedAfter(Integer timeCreatedAfter) {
                this.timeCreatedAfter = timeCreatedAfter;
                return this;
            }

            /**
             * <p>For jobs submitted before this time, the time in the region is converted into a Unix timestamp (for domestic sites, the UI8 region).</p>
             * 
             * <strong>example:</strong>
             * <p>1703820113</p>
             */
            public Builder timeCreatedBefore(Integer timeCreatedBefore) {
                this.timeCreatedBefore = timeCreatedBefore;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsRequest} extends {@link TeaModel}
     *
     * <p>ListJobsRequest</p>
     */
    public static class SortBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Order")
        private String order;

        private SortBy(Builder builder) {
            this.label = builder.label;
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortBy create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        public static final class Builder {
            private String label; 
            private String order; 

            private Builder() {
            } 

            private Builder(SortBy model) {
                this.label = model.label;
                this.order = model.order;
            } 

            /**
             * <p>The sorting label. Valid values:</p>
             * <ul>
             * <li>time_start</li>
             * <li>job_name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>time_start</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The sorting order. Valid values:</p>
             * <ul>
             * <li>ASC (default): ascending order</li>
             * <li>DESC: descending order</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASC</p>
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            public SortBy build() {
                return new SortBy(this);
            } 

        } 

    }
}
