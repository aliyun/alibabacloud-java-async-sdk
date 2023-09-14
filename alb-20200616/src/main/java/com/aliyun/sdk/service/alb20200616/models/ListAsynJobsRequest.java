// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsynJobsRequest} extends {@link RequestModel}
 *
 * <p>ListAsynJobsRequest</p>
 */
public class ListAsynJobsRequest extends Request {
    @Query
    @NameInMap("ApiName")
    private String apiName;

    @Query
    @NameInMap("BeginTime")
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("JobIds")
    private java.util.List < String > jobIds;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @Query
    @NameInMap("ResourceType")
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
         * The name of the operation.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * The start time of the task. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The end time of the task. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The asynchronous task IDs.
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of **NextToken**.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The resource IDs.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The type of the associated resource. Valid values:
         * <p>
         * 
         * *   **loadbalancer**: an Application Load Balancer (ALB) instance
         * *   **listener**: a listener
         * *   **rule**: a forwarding rule
         * *   **acl**: an access control list (ACL)
         * *   **securitypolicy**: a security policy
         * *   **servergroup**: a server group
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
