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

        private Builder(ListAsynJobsRequest response) {
            super(response);
            this.apiName = response.apiName;
            this.beginTime = response.beginTime;
            this.endTime = response.endTime;
            this.jobIds = response.jobIds;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.resourceIds = response.resourceIds;
            this.resourceType = response.resourceType;
        } 

        /**
         * 操作接口名
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * 任务过滤时间范围-开始时间
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * 任务过滤时间范围-结束时间
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 任务ID列表
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * 本次读取的最大数据记录数量
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 下一个查询开始Token
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 资源实例ID列表
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * 资源类型类型
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
