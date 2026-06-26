// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListUserPoolSyncJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPoolSyncJobsResponseBody</p>
 */
public class ListUserPoolSyncJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobs")
    private java.util.List<SynchronizationJobs> synchronizationJobs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListUserPoolSyncJobsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.synchronizationJobs = builder.synchronizationJobs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserPoolSyncJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return synchronizationJobs
     */
    public java.util.List<SynchronizationJobs> getSynchronizationJobs() {
        return this.synchronizationJobs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SynchronizationJobs> synchronizationJobs; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListUserPoolSyncJobsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.synchronizationJobs = model.synchronizationJobs;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SynchronizationJobs.
         */
        public Builder synchronizationJobs(java.util.List<SynchronizationJobs> synchronizationJobs) {
            this.synchronizationJobs = synchronizationJobs;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserPoolSyncJobsResponseBody build() {
            return new ListUserPoolSyncJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserPoolSyncJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPoolSyncJobsResponseBody</p>
     */
    public static class JobSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private String deleted;

        @com.aliyun.core.annotation.NameInMap("Same")
        private String same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private String updated;

        private JobSummary(Builder builder) {
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSummary create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public String getDeleted() {
            return this.deleted;
        }

        /**
         * @return same
         */
        public String getSame() {
            return this.same;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String created; 
            private String deleted; 
            private String same; 
            private String updated; 

            private Builder() {
            } 

            private Builder(JobSummary model) {
                this.created = model.created;
                this.deleted = model.deleted;
                this.same = model.same;
                this.updated = model.updated;
            } 

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(String deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Same.
             */
            public Builder same(String same) {
                this.same = same;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public JobSummary build() {
                return new JobSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserPoolSyncJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPoolSyncJobsResponseBody</p>
     */
    public static class SynchronizationJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("JobSummary")
        private JobSummary jobSummary;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
        private String synchronizationJobId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private SynchronizationJobs(Builder builder) {
            this.endTime = builder.endTime;
            this.errorMessage = builder.errorMessage;
            this.identityProviderType = builder.identityProviderType;
            this.jobSummary = builder.jobSummary;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.synchronizationJobId = builder.synchronizationJobId;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationJobs create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return jobSummary
         */
        public JobSummary getJobSummary() {
            return this.jobSummary;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return synchronizationJobId
         */
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String endTime; 
            private String errorMessage; 
            private String identityProviderType; 
            private JobSummary jobSummary; 
            private String startTime; 
            private String status; 
            private String synchronizationJobId; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(SynchronizationJobs model) {
                this.endTime = model.endTime;
                this.errorMessage = model.errorMessage;
                this.identityProviderType = model.identityProviderType;
                this.jobSummary = model.jobSummary;
                this.startTime = model.startTime;
                this.status = model.status;
                this.synchronizationJobId = model.synchronizationJobId;
                this.triggerType = model.triggerType;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * IdentityProviderType.
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * JobSummary.
             */
            public Builder jobSummary(JobSummary jobSummary) {
                this.jobSummary = jobSummary;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * SynchronizationJobId.
             */
            public Builder synchronizationJobId(String synchronizationJobId) {
                this.synchronizationJobId = synchronizationJobId;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public SynchronizationJobs build() {
                return new SynchronizationJobs(this);
            } 

        } 

    }
}
