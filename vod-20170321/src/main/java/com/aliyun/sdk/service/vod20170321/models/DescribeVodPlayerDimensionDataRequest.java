// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerDimensionDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodPlayerDimensionDataRequest</p>
 */
public class DescribeVodPlayerDimensionDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodPlayerDimensionDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.region = builder.region;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerDimensionDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeVodPlayerDimensionDataRequest, Builder> {
        private String appId; 
        private String dimension; 
        private String endTime; 
        private String region; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodPlayerDimensionDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.dimension = request.dimension;
            this.endTime = request.endTime;
            this.region = request.region;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The dimension type. Valid values:</p>
         * <ul>
         * <li>Os: Operating system.</li>
         * <li>AppVersion: App version.</li>
         * <li>SdkVersion: SDK version.</li>
         * <li>Codec: Codec.</li>
         * <li>VideoType: Video format.</li>
         * <li>Network: Network type.</li>
         * <li>Isp: ISP.</li>
         * <li>VideoDefinition: Resolution.</li>
         * <li>Domain: Domain name.</li>
         * <li>Country: Country.</li>
         * <li>Province: Province.</li>
         * <li>ErrorCode: Error code.</li>
         * <li>IsHw: Hardware decoding.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Os</p>
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The end time of the query. Format: yyyy-mm-ddThh:mm:ssZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-05T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The region used to limit the query scope when querying the metadata for the Province and ISP dimensions. Valid values:</p>
         * <ul>
         * <li>ALL (default): All regions.</li>
         * <li>CN: China.</li>
         * <li>OVERSEAS: Outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>You can query playback data history for the past year.</li>
         * <li>The time range for a single query cannot exceed 31 days.</li>
         * <li>The time interval is left-closed and right-open [StartTime, EndTime).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeVodPlayerDimensionDataRequest build() {
            return new DescribeVodPlayerDimensionDataRequest(this);
        } 

    } 

}
