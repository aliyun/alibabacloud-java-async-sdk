// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobRunsRequest} extends {@link RequestModel}
 *
 * <p>ListJobRunsRequest</p>
 */
public class ListJobRunsRequest extends Request {
    @Path
    @NameInMap("workspaceId")
    private String workspaceId;

    @Query
    @NameInMap("creator")
    private String creator;

    @Query
    @NameInMap("endTime")
    private EndTime endTime;

    @Query
    @NameInMap("jobRunId")
    private String jobRunId;

    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("regionId")
    private String regionId;

    @Query
    @NameInMap("resourceQueueId")
    private String resourceQueueId;

    @Query
    @NameInMap("startTime")
    private StartTime startTime;

    @Query
    @NameInMap("states")
    private java.util.List < String > states;

    @Query
    @NameInMap("tags")
    private java.util.List < Tags> tags;

    private ListJobRunsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.creator = builder.creator;
        this.endTime = builder.endTime;
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
         * 工作空间id。
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * 创建用户Uid。
         */
        public Builder creator(String creator) {
            this.putQueryParameter("creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(EndTime endTime) {
            String endTimeShrink = shrink(endTime, "endTime", "json");
            this.putQueryParameter("endTime", endTimeShrink);
            this.endTime = endTime;
            return this;
        }

        /**
         * 作业id。
         */
        public Builder jobRunId(String jobRunId) {
            this.putQueryParameter("jobRunId", jobRunId);
            this.jobRunId = jobRunId;
            return this;
        }

        /**
         * 一次获取的最大记录数。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 作业名称。
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * resourceQueueId.
         */
        public Builder resourceQueueId(String resourceQueueId) {
            this.putQueryParameter("resourceQueueId", resourceQueueId);
            this.resourceQueueId = resourceQueueId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(StartTime startTime) {
            String startTimeShrink = shrink(startTime, "startTime", "json");
            this.putQueryParameter("startTime", startTimeShrink);
            this.startTime = startTime;
            return this;
        }

        /**
         * 作业状态。
         */
        public Builder states(java.util.List < String > states) {
            String statesShrink = shrink(states, "states", "json");
            this.putQueryParameter("states", statesShrink);
            this.states = states;
            return this;
        }

        /**
         * 标签。
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
        @NameInMap("endTime")
        private Long endTime;

        @NameInMap("startTime")
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
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
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
        @NameInMap("endTime")
        private Long endTime;

        @NameInMap("startTime")
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
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
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
        @NameInMap("key")
        private String key;

        @NameInMap("value")
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
