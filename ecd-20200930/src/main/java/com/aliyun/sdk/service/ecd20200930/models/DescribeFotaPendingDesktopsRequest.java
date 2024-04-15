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
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskUid")
    private String taskUid;

    private DescribeFotaPendingDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
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
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
        private String desktopId; 
        private String desktopName; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String regionId; 
        private String taskUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFotaPendingDesktopsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.taskUid = request.taskUid;
        } 

        /**
         * The cloud computer ID.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The cloud computer name.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * *   Valid values: 1 to 100.
         * *   Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The office network ID. You can call the [DescribeOfficeSites](~~216071~~) operation to obtain the office network ID.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the image update task. You can call the DescribeFotaTasks operation to obtain the task ID.
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
