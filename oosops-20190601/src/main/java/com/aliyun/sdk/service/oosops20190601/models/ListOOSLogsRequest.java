// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOOSLogsRequest} extends {@link RequestModel}
 *
 * <p>ListOOSLogsRequest</p>
 */
public class ListOOSLogsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("ExecutionId")
    private String executionId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RequestFingerprint")
    private String requestFingerprint;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private ListOOSLogsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.executionId = builder.executionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.requestFingerprint = builder.requestFingerprint;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOOSLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestFingerprint
     */
    public String getRequestFingerprint() {
        return this.requestFingerprint;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListOOSLogsRequest, Builder> {
        private String endTime; 
        private String executionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String requestFingerprint; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListOOSLogsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.executionId = request.executionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.requestFingerprint = request.requestFingerprint;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestFingerprint.
         */
        public Builder requestFingerprint(String requestFingerprint) {
            this.putQueryParameter("RequestFingerprint", requestFingerprint);
            this.requestFingerprint = requestFingerprint;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListOOSLogsRequest build() {
            return new ListOOSLogsRequest(this);
        } 

    } 

}
