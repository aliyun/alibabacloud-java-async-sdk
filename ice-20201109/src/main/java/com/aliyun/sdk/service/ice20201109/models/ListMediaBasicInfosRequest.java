// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaBasicInfosRequest} extends {@link RequestModel}
 *
 * <p>ListMediaBasicInfosRequest</p>
 */
public class ListMediaBasicInfosRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("IncludeFileBasicInfo")
    private Boolean includeFileBasicInfo;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("MediaType")
    private String mediaType;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private ListMediaBasicInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessType = builder.businessType;
        this.endTime = builder.endTime;
        this.includeFileBasicInfo = builder.includeFileBasicInfo;
        this.maxResults = builder.maxResults;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.nextToken = builder.nextToken;
        this.sortBy = builder.sortBy;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaBasicInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return includeFileBasicInfo
     */
    public Boolean getIncludeFileBasicInfo() {
        return this.includeFileBasicInfo;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMediaBasicInfosRequest, Builder> {
        private String regionId; 
        private String businessType; 
        private String endTime; 
        private Boolean includeFileBasicInfo; 
        private Integer maxResults; 
        private String mediaId; 
        private String mediaType; 
        private String nextToken; 
        private String sortBy; 
        private String source; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaBasicInfosRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessType = request.businessType;
            this.endTime = request.endTime;
            this.includeFileBasicInfo = request.includeFileBasicInfo;
            this.maxResults = request.maxResults;
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.nextToken = request.nextToken;
            this.sortBy = request.sortBy;
            this.source = request.source;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
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
         * IncludeFileBasicInfo.
         */
        public Builder includeFileBasicInfo(Boolean includeFileBasicInfo) {
            this.putQueryParameter("IncludeFileBasicInfo", includeFileBasicInfo);
            this.includeFileBasicInfo = includeFileBasicInfo;
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMediaBasicInfosRequest build() {
            return new ListMediaBasicInfosRequest(this);
        } 

    } 

}
