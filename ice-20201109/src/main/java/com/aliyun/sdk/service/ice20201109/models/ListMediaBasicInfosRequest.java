// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaBasicInfosRequest} extends {@link RequestModel}
 *
 * <p>ListMediaBasicInfosRequest</p>
 */
public class ListMediaBasicInfosRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeFileBasicInfo")
    private Boolean includeFileBasicInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The business type of the media asset. Valid values:</p>
         * <p>- subtitles</p>
         * <p>- watermark</p>
         * <p>- opening</p>
         * <p>- ending</p>
         * <p>- general</p>
         * 
         * <strong>example:</strong>
         * <p>opening</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The end time of utcCreated.</p>
         * <p>- The value is the end of the left-open right-closed interval.</p>
         * <p>- Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC +8).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T13:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to return the basic information of the source file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeFileBasicInfo(Boolean includeFileBasicInfo) {
            this.putQueryParameter("IncludeFileBasicInfo", includeFileBasicInfo);
            this.includeFileBasicInfo = includeFileBasicInfo;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The type of the media asset. Valid values:</p>
         * <p>- image</p>
         * <p>- video</p>
         * <p>- audio</p>
         * <p>- text</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The order of sorting by utcCreated. Default value: desc. Valid values:</p>
         * <p>- desc</p>
         * <p>- asc</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The source of the media asset. Valid values:</p>
         * <p>- oss: Object Storage Service (OSS).</p>
         * <p>- vod: ApsaraVideo VOD.</p>
         * <p>- live: ApsaraVideo Live.</p>
         * <p>- general: other sources. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The start time of utcCreated.</p>
         * <p>- The value is the beginning of a left-open right-closed interval.</p>
         * <p>- Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC +8).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the media asset. Valid values:</p>
         * <p>- Init: the initial state, which indicates that the source file is not ready.</p>
         * <p>- Preparing: The source file is being prepared. For example, the file is being uploaded or edited.</p>
         * <p>- PrepareFail: The source file failed to be prepared. For example, the information of the source file failed to be obtained.</p>
         * <p>- Normal: The source file is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
