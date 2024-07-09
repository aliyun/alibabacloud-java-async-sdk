// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobRunsRequest} extends {@link RequestModel}
 *
 * <p>ListJobRunsRequest</p>
 */
public class ListJobRunsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private EndTime endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobRunDeploymentId")
    private String jobRunDeploymentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobRunId")
    private String jobRunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceQueueId")
    private String resourceQueueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private StartTime startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("states")
    private java.util.List < String > states;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tags> tags;

    private ListJobRunsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.creator = builder.creator;
        this.endTime = builder.endTime;
        this.jobRunDeploymentId = builder.jobRunDeploymentId;
        this.jobRunId = builder.jobRunId;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceQueueId = builder.resourceQueueId;
        this.startTime = builder.startTime;
        this.states = builder.states;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobRunsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return endTime
     */
    public EndTime getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobRunDeploymentId
     */
    public String getJobRunDeploymentId() {
        return this.jobRunDeploymentId;
    }

    /**
     * @return jobRunId
     */
    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceQueueId
     */
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    /**
     * @return startTime
     */
    public StartTime getStartTime() {
        return this.startTime;
    }

    /**
     * @return states
     */
    public java.util.List < String > getStates() {
        return this.states;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListJobRunsRequest, Builder> {
        private String workspaceId; 
        private String creator; 
        private EndTime endTime; 
        private String jobRunDeploymentId; 
        private String jobRunId; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String regionId; 
        private String resourceQueueId; 
        private StartTime startTime; 
        private java.util.List < String > states; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListJobRunsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.creator = request.creator;
            this.endTime = request.endTime;
            this.jobRunDeploymentId = request.jobRunDeploymentId;
            this.jobRunId = request.jobRunId;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceQueueId = request.resourceQueueId;
            this.startTime = request.startTime;
            this.states = request.states;
            this.tags = request.tags;
        } 

        /**
         * The workspace ID.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The ID of the user who creates a Spark job.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * The range of end time.
         */
        public Builder endTime(EndTime endTime) {
            String endTimeShrink = shrink(endTime, "endTime", "json");
            this.putQueryParameter("endTime", endTimeShrink);
            this.endTime = endTime;
            return this;
        }

        /**
         * jobRunDeploymentId.
         */
        public Builder jobRunDeploymentId(String jobRunDeploymentId) {
            this.putQueryParameter("jobRunDeploymentId", jobRunDeploymentId);
            this.jobRunDeploymentId = jobRunDeploymentId;
            return this;
        }

        /**
         * The job ID.
         */
        public Builder jobRunId(String jobRunId) {
            this.putQueryParameter("jobRunId", jobRunId);
            this.jobRunId = jobRunId;
            return this;
        }

        /**
         * The maximum number of entries to return.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The job name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The pagination token that is used in the request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the resource queue on which the Spark jobs run.
         */
        public Builder resourceQueueId(String resourceQueueId) {
            this.putQueryParameter("resourceQueueId", resourceQueueId);
            this.resourceQueueId = resourceQueueId;
            return this;
        }

        /**
         * The range of start time.
         */
        public Builder startTime(StartTime startTime) {
            String startTimeShrink = shrink(startTime, "startTime", "json");
            this.putQueryParameter("startTime", startTimeShrink);
            this.startTime = startTime;
            return this;
        }

        /**
         * The job states.
         */
        public Builder states(java.util.List < String > states) {
            String statesShrink = shrink(states, "states", "json");
            this.putQueryParameter("states", statesShrink);
            this.states = states;
            return this;
        }

        /**
         * The tags of the job.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListJobRunsRequest build() {
            return new ListJobRunsRequest(this);
        } 

    } 

    public static class EndTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private EndTime(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndTime create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            /**
             * The end of the end time range.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The beginning of the end time range.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public EndTime build() {
                return new EndTime(this);
            } 

        } 

    }
    public static class StartTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private StartTime(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartTime create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            /**
             * The end of the start time range.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The beginning of the start time range.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public StartTime build() {
                return new StartTime(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
