// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupsRequest</p>
 */
public class DescribeGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupResourceTypes")
    private java.util.List<String> groupResourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("States")
    private java.util.List<String> states;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeUsingPeriod")
    private Boolean timeUsingPeriod;

    private DescribeGroupsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.groupResourceTypes = builder.groupResourceTypes;
        this.groupType = builder.groupType;
        this.instanceIds = builder.instanceIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceIds = builder.resourceIds;
        this.startTime = builder.startTime;
        this.states = builder.states;
        this.timeUsingPeriod = builder.timeUsingPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupResourceTypes
     */
    public java.util.List<String> getGroupResourceTypes() {
        return this.groupResourceTypes;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return states
     */
    public java.util.List<String> getStates() {
        return this.states;
    }

    /**
     * @return timeUsingPeriod
     */
    public Boolean getTimeUsingPeriod() {
        return this.timeUsingPeriod;
    }

    public static final class Builder extends Request.Builder<DescribeGroupsRequest, Builder> {
        private Long endTime; 
        private java.util.List<String> groupResourceTypes; 
        private String groupType; 
        private java.util.List<String> instanceIds; 
        private String maxResults; 
        private String nextToken; 
        private java.util.List<String> resourceIds; 
        private Long startTime; 
        private java.util.List<String> states; 
        private Boolean timeUsingPeriod; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.groupResourceTypes = request.groupResourceTypes;
            this.groupType = request.groupType;
            this.instanceIds = request.instanceIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceIds = request.resourceIds;
            this.startTime = request.startTime;
            this.states = request.states;
            this.timeUsingPeriod = request.timeUsingPeriod;
        } 

        /**
         * <p>The end time of the period.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-28T02:06:00Z</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of group resource types.</p>
         */
        public Builder groupResourceTypes(java.util.List<String> groupResourceTypes) {
            this.putQueryParameter("GroupResourceTypes", groupResourceTypes);
            this.groupResourceTypes = groupResourceTypes;
            return this;
        }

        /**
         * <p>The group type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The Lingxiao instance ID.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the <code>nextToken</code> value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of resource IDs.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The start time of the period.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-25 10:26:44</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The list of states.</p>
         */
        public Builder states(java.util.List<String> states) {
            this.putQueryParameter("States", states);
            this.states = states;
            return this;
        }

        /**
         * <p>The effective period used for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        public Builder timeUsingPeriod(Boolean timeUsingPeriod) {
            this.putQueryParameter("TimeUsingPeriod", timeUsingPeriod);
            this.timeUsingPeriod = timeUsingPeriod;
            return this;
        }

        @Override
        public DescribeGroupsRequest build() {
            return new DescribeGroupsRequest(this);
        } 

    } 

}
