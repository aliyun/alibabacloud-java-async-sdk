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
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

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
        this.authTimeout = builder.authTimeout;
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
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
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
        private Long authTimeout; 
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
            this.authTimeout = request.authTimeout;
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
         * <p>The authentication expiration time. Unit: seconds.</p>
         * <ul>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: 86400.</li>
         * <li>Default value: 3600.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The business type of the media asset. Valid values:</p>
         * <ul>
         * <li><p>&quot;subtitles&quot;: Subtitles.</p>
         * </li>
         * <li><p>&quot;watermark&quot;: Watermark.</p>
         * </li>
         * <li><p>&quot;opening&quot;: Opening.</p>
         * </li>
         * <li><p>&quot;ending&quot;: Ending.</p>
         * </li>
         * <li><p>&quot;general&quot;: General.</p>
         * </li>
         * </ul>
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
         * <p>The end time of the creation time (utcCreated).</p>
         * <ul>
         * <li><p>The interval is closed, which means the time must be earlier than or equal to the end time.</p>
         * </li>
         * <li><p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC+8).</p>
         * </li>
         * </ul>
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
         * <p>Specifies whether to include the basic information of the file in the response.</p>
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
         * <p>The maximum number of records to return for the current request.</p>
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
         * <p>The ID of the media asset. A single media asset ID supports prefix matching.</p>
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
         * <p>The media type of the media asset. Valid values:</p>
         * <ul>
         * <li><p>&quot;image&quot;: Image.</p>
         * </li>
         * <li><p>&quot;video&quot;: Video.</p>
         * </li>
         * <li><p>&quot;audio&quot;: Audio.</p>
         * </li>
         * <li><p>&quot;text&quot;: Text.</p>
         * </li>
         * </ul>
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
         * <p>The token that indicates the position from which the current call starts to read. An empty value indicates that all data has been read.</p>
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
         * <p>The sort order based on utcCreated. Default value: desc. Valid values:</p>
         * <ul>
         * <li><p>&quot;desc&quot;: Descending order.</p>
         * </li>
         * <li><p>&quot;asc&quot;: Ascending order.</p>
         * </li>
         * </ul>
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
         * <p>The source. Valid values:</p>
         * <ul>
         * <li><p>&quot;oss&quot;: OSS storage.</p>
         * </li>
         * <li><p>&quot;vod&quot;: VOD.</p>
         * </li>
         * <li><p>&quot;live&quot;: ApsaraVideo Live.</p>
         * </li>
         * <li><p>&quot;general&quot;: Other sources (default).</p>
         * </li>
         * </ul>
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
         * <p>The start time of the creation time (utcCreated).</p>
         * <ul>
         * <li><p>The interval is open, which means the time must be later than the start time.</p>
         * </li>
         * <li><p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2017-01-11T12:00:00Z indicates 20:00:00 on January 11, 2017 (UTC+8).</p>
         * </li>
         * </ul>
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
         * <p>The resource status. Valid values:</p>
         * <ul>
         * <li><p>Init: Initial state. The source file is not ready.</p>
         * </li>
         * <li><p>Preparing: The source file is being prepared, such as being uploaded or edited and produced.</p>
         * </li>
         * <li><p>PrepareFail: The source file fails to be prepared, such as failing to obtain the source file information.</p>
         * </li>
         * <li><p>Normal: Normal. The source file is ready.</p>
         * </li>
         * </ul>
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
