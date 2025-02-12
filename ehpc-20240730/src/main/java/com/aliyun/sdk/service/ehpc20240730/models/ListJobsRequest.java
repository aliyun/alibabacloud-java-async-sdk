// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFilter")
    private JobFilter jobFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobFilter = builder.jobFilter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobFilter
     */
    public JobFilter getJobFilter() {
        return this.jobFilter;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String clusterId; 
        private JobFilter jobFilter; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobFilter = request.jobFilter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-csbua72***</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The job filter information.</p>
         */
        public Builder jobFilter(JobFilter jobFilter) {
            String jobFilterShrink = shrink(jobFilter, "JobFilter", "json");
            this.putQueryParameter("JobFilter", jobFilterShrink);
            this.jobFilter = jobFilter;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * <ul>
         * <li>Pages start from page 1.</li>
         * <li>Default value: 1</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Maximum value: 50.</li>
         * <li>Default value: 10</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
    public static class Diagnosis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Option")
        private String option;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private Diagnosis(Builder builder) {
            this.operator = builder.operator;
            this.option = builder.option;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diagnosis create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String operator; 
            private String option; 
            private String threshold; 

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Option.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public Diagnosis build() {
                return new Diagnosis(this);
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
        @com.aliyun.core.annotation.NameInMap("ExecuteOrder")
        private String executeOrder;

        @com.aliyun.core.annotation.NameInMap("PendOrder")
        private String pendOrder;

        @com.aliyun.core.annotation.NameInMap("SubmitOrder")
        private String submitOrder;

        private SortBy(Builder builder) {
            this.executeOrder = builder.executeOrder;
            this.pendOrder = builder.pendOrder;
            this.submitOrder = builder.submitOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortBy create() {
            return builder().build();
        }

        /**
         * @return executeOrder
         */
        public String getExecuteOrder() {
            return this.executeOrder;
        }

        /**
         * @return pendOrder
         */
        public String getPendOrder() {
            return this.pendOrder;
        }

        /**
         * @return submitOrder
         */
        public String getSubmitOrder() {
            return this.submitOrder;
        }

        public static final class Builder {
            private String executeOrder; 
            private String pendOrder; 
            private String submitOrder; 

            /**
             * <p>The order in which jobs are sorted based on their execution time. Valid values:</p>
             * <ul>
             * <li>asc: in ascending order.</li>
             * <li>desc: in descending order.</li>
             * </ul>
             * <p>Default value: desc.</p>
             * 
             * <strong>example:</strong>
             * <p>asc</p>
             */
            public Builder executeOrder(String executeOrder) {
                this.executeOrder = executeOrder;
                return this;
            }

            /**
             * <p>The order in which jobs are sorted based on their queuing time. Valid values:</p>
             * <ul>
             * <li>asc: in ascending order.</li>
             * <li>desc: in descending order.</li>
             * </ul>
             * <p>Default value: desc.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder pendOrder(String pendOrder) {
                this.pendOrder = pendOrder;
                return this;
            }

            /**
             * <p>The order in which jobs are sorted based on their submitting time. Valid values:</p>
             * <ul>
             * <li>asc: in ascending order.</li>
             * <li>desc: in descending order.</li>
             * </ul>
             * <p>Default value: desc.</p>
             * 
             * <strong>example:</strong>
             * <p>asc</p>
             */
            public Builder submitOrder(String submitOrder) {
                this.submitOrder = submitOrder;
                return this;
            }

            public SortBy build() {
                return new SortBy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsRequest} extends {@link TeaModel}
     *
     * <p>ListJobsRequest</p>
     */
    public static class JobFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
        private String createTimeEnd;

        @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
        private String createTimeStart;

        @com.aliyun.core.annotation.NameInMap("Diagnosis")
        private java.util.List<Diagnosis> diagnosis;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<String> nodes;

        @com.aliyun.core.annotation.NameInMap("Queues")
        private java.util.List<String> queues;

        @com.aliyun.core.annotation.NameInMap("SortBy")
        private SortBy sortBy;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<String> users;

        private JobFilter(Builder builder) {
            this.createTimeEnd = builder.createTimeEnd;
            this.createTimeStart = builder.createTimeStart;
            this.diagnosis = builder.diagnosis;
            this.jobName = builder.jobName;
            this.jobStatus = builder.jobStatus;
            this.nodes = builder.nodes;
            this.queues = builder.queues;
            this.sortBy = builder.sortBy;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobFilter create() {
            return builder().build();
        }

        /**
         * @return createTimeEnd
         */
        public String getCreateTimeEnd() {
            return this.createTimeEnd;
        }

        /**
         * @return createTimeStart
         */
        public String getCreateTimeStart() {
            return this.createTimeStart;
        }

        /**
         * @return diagnosis
         */
        public java.util.List<Diagnosis> getDiagnosis() {
            return this.diagnosis;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return nodes
         */
        public java.util.List<String> getNodes() {
            return this.nodes;
        }

        /**
         * @return queues
         */
        public java.util.List<String> getQueues() {
            return this.queues;
        }

        /**
         * @return sortBy
         */
        public SortBy getSortBy() {
            return this.sortBy;
        }

        /**
         * @return users
         */
        public java.util.List<String> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String createTimeEnd; 
            private String createTimeStart; 
            private java.util.List<Diagnosis> diagnosis; 
            private String jobName; 
            private String jobStatus; 
            private java.util.List<String> nodes; 
            private java.util.List<String> queues; 
            private SortBy sortBy; 
            private java.util.List<String> users; 

            /**
             * <p>The time when the job was last updated. The value is a UNIX timestamp representing the number of seconds that have elapsed since 1970-01-01T00:00:00Z.</p>
             * 
             * <strong>example:</strong>
             * <p>1724123085</p>
             */
            public Builder createTimeEnd(String createTimeEnd) {
                this.createTimeEnd = createTimeEnd;
                return this;
            }

            /**
             * <p>The time when the job started. The value is a UNIX timestamp representing the number of seconds that have elapsed since 1970-01-01T00:00:00Z.</p>
             * 
             * <strong>example:</strong>
             * <p>1724122486</p>
             */
            public Builder createTimeStart(String createTimeStart) {
                this.createTimeStart = createTimeStart;
                return this;
            }

            /**
             * Diagnosis.
             */
            public Builder diagnosis(java.util.List<Diagnosis> diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * <p>The job name. Fuzzy match is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>testjob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>all: returns all jobs.</li>
             * <li>finished: returns completed jobs.</li>
             * <li>notfinish: returns uncompleted jobs.</li>
             * </ul>
             * <p>Default value: all.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The compute nodes that run the jobs.</p>
             */
            public Builder nodes(java.util.List<String> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The queues to which the jobs belong.</p>
             */
            public Builder queues(java.util.List<String> queues) {
                this.queues = queues;
                return this;
            }

            /**
             * <p>The result sorting configurations.</p>
             */
            public Builder sortBy(SortBy sortBy) {
                this.sortBy = sortBy;
                return this;
            }

            /**
             * <p>The users that run the jobs.</p>
             */
            public Builder users(java.util.List<String> users) {
                this.users = users;
                return this;
            }

            public JobFilter build() {
                return new JobFilter(this);
            } 

        } 

    }
}
