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

    private DescribeGlobalTimerRecordsRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.desktopIds = builder.desktopIds;
        this.displayResultName = builder.displayResultName;
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resultCategory = builder.resultCategory;
        this.retryable = builder.retryable;
        this.searchRegionId = builder.searchRegionId;
        this.timerResult = builder.timerResult;
        this.timerTypes = builder.timerTypes;
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

    public static final class Builder extends Request.Builder<DescribeGlobalTimerRecordsRequest, Builder> {
        private String batchId; 
        private java.util.List<String> desktopIds; 
        private String displayResultName; 
        private String groupId; 
        private String maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resultCategory; 
        private Boolean retryable; 
        private String searchRegionId; 
        private String timerResult; 
        private java.util.List<String> timerTypes; 

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
            this.resultCategory = request.resultCategory;
            this.retryable = request.retryable;
            this.searchRegionId = request.searchRegionId;
            this.timerResult = request.timerResult;
            this.timerTypes = request.timerTypes;
        } 

        /**
         * <p>The ID of the batch in which the scheduled task is executed.</p>
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
         * <p>The cloud computer IDs.</p>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * DisplayResultName.
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
         * <p>The number of entries per page.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
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
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
         * <p>The type of the execution result. You can specify this parameter to filter the execution results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FAILED: The execution is successful.</li>
         * <li>FAILED: The execution failed.</li>
         * <li>RUNNING: The execution is in progress.</li>
         * <li>SKIPPED: The execution is skipped.</li>
         * </ul>
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
         * Retryable.
         */
        public Builder retryable(Boolean retryable) {
            this.putQueryParameter("Retryable", retryable);
            this.retryable = retryable;
            return this;
        }

        /**
         * <p>The ID of the searched region. You can specify this parameter to filter cloud computers in specific regions.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>CONNECTED_NOT_RUN: The cloud computer is connected, but the scheduled task is not executed.</li>
         * <li>PAUSED: The scheduled task is suspended.</li>
         * <li>COMPLETED: The scheduled task is executed.</li>
         * <li>FAILED: The scheduled task failed to be executed.</li>
         * <li>RUNNING: The scheduled task is being executed.</li>
         * <li>TERMINATED: The scheduled task is stopped.</li>
         * </ul>
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
         * <p>The scheduled tasks.</p>
         */
        public Builder timerTypes(java.util.List<String> timerTypes) {
            this.putQueryParameter("TimerTypes", timerTypes);
            this.timerTypes = timerTypes;
            return this;
        }

        @Override
        public DescribeGlobalTimerRecordsRequest build() {
            return new DescribeGlobalTimerRecordsRequest(this);
        } 

    } 

}
