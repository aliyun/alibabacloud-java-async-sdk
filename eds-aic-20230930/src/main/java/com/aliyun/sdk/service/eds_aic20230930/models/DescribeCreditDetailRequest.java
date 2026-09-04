// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCreditDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCreditDetailRequest</p>
 */
public class DescribeCreditDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTypes")
    private java.util.List<String> agentTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private String pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeCreditDetailRequest(Builder builder) {
        super(builder);
        this.agentTypes = builder.agentTypes;
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.packageIds = builder.packageIds;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentTypes
     */
    public java.util.List<String> getAgentTypes() {
        return this.agentTypes;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return packageIds
     */
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeCreditDetailRequest, Builder> {
        private java.util.List<String> agentTypes; 
        private Long endTime; 
        private java.util.List<String> instanceIds; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> packageIds; 
        private String pageNum; 
        private String pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreditDetailRequest request) {
            super(request);
            this.agentTypes = request.agentTypes;
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.packageIds = request.packageIds;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * AgentTypes.
         */
        public Builder agentTypes(java.util.List<String> agentTypes) {
            this.putQueryParameter("AgentTypes", agentTypes);
            this.agentTypes = agentTypes;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PackageIds.
         */
        public Builder packageIds(java.util.List<String> packageIds) {
            this.putQueryParameter("PackageIds", packageIds);
            this.packageIds = packageIds;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCreditDetailRequest build() {
            return new DescribeCreditDetailRequest(this);
        } 

    } 

}
