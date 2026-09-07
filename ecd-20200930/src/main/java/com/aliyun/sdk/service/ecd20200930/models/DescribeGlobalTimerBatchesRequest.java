// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeGlobalTimerBatchesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGlobalTimerBatchesRequest</p>
 */
public class DescribeGlobalTimerBatchesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<String> resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerType")
    private String timerType;

    private DescribeGlobalTimerBatchesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceTypes = builder.resourceTypes;
        this.searchRegionId = builder.searchRegionId;
        this.timerType = builder.timerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalTimerBatchesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    /**
     * @return timerType
     */
    public String getTimerType() {
        return this.timerType;
    }

    public static final class Builder extends Request.Builder<DescribeGlobalTimerBatchesRequest, Builder> {
        private String groupId; 
        private String maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<String> resourceTypes; 
        private String searchRegionId; 
        private String timerType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGlobalTimerBatchesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceTypes = request.resourceTypes;
            this.searchRegionId = request.searchRegionId;
            this.timerType = request.timerType;
        } 

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-i1ruuudp92qpj****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
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
         * <p>The pagination token for the next query. An empty value indicates that no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <ul>
         * <li>Shanghai</li>
         * <li>Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of resource types.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The region ID used to filter cloud desktop information for a specific region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * <p>The type of the task to query. Only scheduled tasks have batch information.</p>
         * <ul>
         * <li>TimerBoot: scheduled startup</li>
         * <li>TimerShutdown: scheduled shutdown</li>
         * <li>TimerReboot: scheduled restart</li>
         * <li>TimerReset: scheduled reset</li>
         * <li>TimerMaintenance: scheduled maintenance mode</li>
         * <li>TimerHibernate: scheduled hibernation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timerType(String timerType) {
            this.putQueryParameter("TimerType", timerType);
            this.timerType = timerType;
            return this;
        }

        @Override
        public DescribeGlobalTimerBatchesRequest build() {
            return new DescribeGlobalTimerBatchesRequest(this);
        } 

    } 

}
