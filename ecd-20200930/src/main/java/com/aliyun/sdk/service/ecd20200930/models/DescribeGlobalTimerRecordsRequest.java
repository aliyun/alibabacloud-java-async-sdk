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
 * {@link DescribeGlobalTimerRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGlobalTimerRecordsRequest</p>
 */
public class DescribeGlobalTimerRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIds")
    private java.util.List<String> desktopIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayResultName")
    private String displayResultName;

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
    @com.aliyun.core.annotation.NameInMap("ResultCategory")
    private String resultCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retryable")
    private Boolean retryable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerResult")
    private String timerResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerTypes")
    private java.util.List<String> timerTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WuyingServerIds")
    private java.util.List<String> wuyingServerIds;

    private DescribeGlobalTimerRecordsRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.desktopIds = builder.desktopIds;
        this.displayResultName = builder.displayResultName;
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceTypes = builder.resourceTypes;
        this.resultCategory = builder.resultCategory;
        this.retryable = builder.retryable;
        this.searchRegionId = builder.searchRegionId;
        this.timerResult = builder.timerResult;
        this.timerTypes = builder.timerTypes;
        this.wuyingServerIds = builder.wuyingServerIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalTimerRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return desktopIds
     */
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return displayResultName
     */
    public String getDisplayResultName() {
        return this.displayResultName;
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
     * @return resultCategory
     */
    public String getResultCategory() {
        return this.resultCategory;
    }

    /**
     * @return retryable
     */
    public Boolean getRetryable() {
        return this.retryable;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    /**
     * @return timerResult
     */
    public String getTimerResult() {
        return this.timerResult;
    }

    /**
     * @return timerTypes
     */
    public java.util.List<String> getTimerTypes() {
        return this.timerTypes;
    }

    /**
     * @return wuyingServerIds
     */
    public java.util.List<String> getWuyingServerIds() {
        return this.wuyingServerIds;
    }

    public static final class Builder extends Request.Builder<DescribeGlobalTimerRecordsRequest, Builder> {
        private String batchId; 
        private java.util.List<String> desktopIds; 
        private String displayResultName; 
        private String groupId; 
        private String maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<String> resourceTypes; 
        private String resultCategory; 
        private Boolean retryable; 
        private String searchRegionId; 
        private String timerResult; 
        private java.util.List<String> timerTypes; 
        private java.util.List<String> wuyingServerIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGlobalTimerRecordsRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.desktopIds = request.desktopIds;
            this.displayResultName = request.displayResultName;
            this.groupId = request.groupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceTypes = request.resourceTypes;
            this.resultCategory = request.resultCategory;
            this.retryable = request.retryable;
            this.searchRegionId = request.searchRegionId;
            this.timerResult = request.timerResult;
            this.timerTypes = request.timerTypes;
            this.wuyingServerIds = request.wuyingServerIds;
        } 

        /**
         * <p>The batch ID of the scheduled task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-****</p>
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The list of cloud computer IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * <p>The display result name.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        public Builder displayResultName(String displayResultName) {
            this.putQueryParameter("DisplayResultName", displayResultName);
            this.displayResultName = displayResultName;
            return this;
        }

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0cvfvf6u1enx1****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Wuying Workspace.</p>
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
         * <p>The list of resource types. If empty, all resource types are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>Filters results by execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        public Builder resultCategory(String resultCategory) {
            this.putQueryParameter("ResultCategory", resultCategory);
            this.resultCategory = resultCategory;
            return this;
        }

        /**
         * <p>Specifies whether the task can be retried.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder retryable(Boolean retryable) {
            this.putQueryParameter("Retryable", retryable);
            this.retryable = retryable;
            return this;
        }

        /**
         * <p>The region ID used to filter cloud computer information for a specified region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * <p>The execution result of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder timerResult(String timerResult) {
            this.putQueryParameter("TimerResult", timerResult);
            this.timerResult = timerResult;
            return this;
        }

        /**
         * <p>The list of scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder timerTypes(java.util.List<String> timerTypes) {
            this.putQueryParameter("TimerTypes", timerTypes);
            this.timerTypes = timerTypes;
            return this;
        }

        /**
         * <p>The list of Wuying server IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        public Builder wuyingServerIds(java.util.List<String> wuyingServerIds) {
            this.putQueryParameter("WuyingServerIds", wuyingServerIds);
            this.wuyingServerIds = wuyingServerIds;
            return this;
        }

        @Override
        public DescribeGlobalTimerRecordsRequest build() {
            return new DescribeGlobalTimerRecordsRequest(this);
        } 

    } 

}
