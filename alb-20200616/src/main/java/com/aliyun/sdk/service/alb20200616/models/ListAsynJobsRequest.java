// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAsynJobsRequest} extends {@link RequestModel}
 *
 * <p>ListAsynJobsRequest</p>
 */
public class ListAsynJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List < String > jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private ListAsynJobsRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.jobIds = builder.jobIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsynJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobIds
     */
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListAsynJobsRequest, Builder> {
        private String apiName; 
        private Long beginTime; 
        private Long endTime; 
        private java.util.List < String > jobIds; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListAsynJobsRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.jobIds = request.jobIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The name of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateLoadBalancer</p>
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>The timestamp that indicates the start time of the task. Unit: milliseconds.</p>
         * <p>Specify the timestamp in the Unix format to indicate the total amount of time that is from 00:00:00 (UTC+0) on January 1, 1970 to when the status of the asynchronous task is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-03T17:22Z</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The timestamp that indicates the end time of the task. Unit: milliseconds.</p>
         * <p>Specify the timestamp in the Unix format to indicate the total amount of time that is from 00:00:00 (UTC+0) on January 1, 1970 to when the status of the asynchronous task is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-04T17:22Z</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The asynchronous task IDs.</p>
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource IDs.</p>
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>loadbalancer</strong>: an Application Load Balancer (ALB) instance</li>
         * <li><strong>listener</strong>: a listener</li>
         * <li><strong>rule</strong>: a forwarding rule</li>
         * <li><strong>acl</strong>: an access control list (ACL)</li>
         * <li><strong>securitypolicy</strong>: a security policy</li>
         * <li><strong>servergroup</strong>: a server group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acl</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListAsynJobsRequest build() {
            return new ListAsynJobsRequest(this);
        } 

    } 

}
