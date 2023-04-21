// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaPendingDesktopsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFotaPendingDesktopsRequest</p>
 */
public class DescribeFotaPendingDesktopsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskUid")
    private String taskUid;

    private DescribeFotaPendingDesktopsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.taskUid = builder.taskUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFotaPendingDesktopsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return taskUid
     */
    public String getTaskUid() {
        return this.taskUid;
    }

    public static final class Builder extends Request.Builder<DescribeFotaPendingDesktopsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String taskUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFotaPendingDesktopsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.taskUid = request.taskUid;
        } 

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100
         * *   Default value: 20
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is left empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the image update task. You can call the DescribeFotaTasks operation to obtain the value of this parameter.
         */
        public Builder taskUid(String taskUid) {
            this.putQueryParameter("TaskUid", taskUid);
            this.taskUid = taskUid;
            return this;
        }

        @Override
        public DescribeFotaPendingDesktopsRequest build() {
            return new DescribeFotaPendingDesktopsRequest(this);
        } 

    } 

}
