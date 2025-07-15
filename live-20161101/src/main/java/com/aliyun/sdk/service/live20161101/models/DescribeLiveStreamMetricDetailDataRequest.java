// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamMetricDetailDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamMetricDetailDataRequest</p>
 */
public class DescribeLiveStreamMetricDetailDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    private DescribeLiveStreamMetricDetailDataRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.nextPageToken = builder.nextPageToken;
        this.ownerId = builder.ownerId;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamMetricDetailDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamMetricDetailDataRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String endTime; 
        private String nextPageToken; 
        private Long ownerId; 
        private String protocol; 
        private String regionId; 
        private String startTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamMetricDetailDataRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.nextPageToken = request.nextPageToken;
            this.ownerId = request.ownerId;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application for which you want to query the monitoring data of streams.</p>
         * <blockquote>
         * <p> If you specify the StreamName parameter, you must also specify the AppName parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <ul>
         * <li>The accelerated domain name. You can specify only one domain name. If you specify multiple domain names, an error occurs.</li>
         * <li>If you do not specify the AppName and StreamName parameters, monitoring data of all streams for the domain name is returned.</li>
         * <li>If you leave this parameter empty, monitoring data of streams under all domain names is returned.</li>
         * <li>If you specify the DomainName parameter and set both the AppName and StreamName parameters to all, monitoring data of all streams in all applications under the specified domain name is returned.</li>
         * <li>When you specify the DomainName parameter, make sure that the domain name is a domain name used for live streaming and that you have the permissions on the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time, and the maximum time range that can be specified is one day. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The token used to query data by page. Up to 5,000 rows of data can be returned per query. If the number of rows exceeds 5,000, a token that determines the start point of the next query is provided in the response. If you specify this parameter, data continues to be obtained from the end of the previous query.</p>
         * 
         * <strong>example:</strong>
         * <p>UjsM9x3aVcJi9a0-ArwJUTTC67CIBKLw*****</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The streaming protocol. Valid values: <strong>flv</strong>, <strong>hls</strong>, <strong>rtmp</strong>, <strong>rts</strong>, and <strong>p2p</strong>.</p>
         * <p>You can specify multiple protocols. Separate multiple protocols with commas (,). However, data over multiple protocols is not aggregated and is returned based on the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the stream. The stream must belong to the application that is specified by the AppName parameter.</p>
         * <blockquote>
         * <p> If you specify the StreamName parameter, you must also specify the AppName parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public DescribeLiveStreamMetricDetailDataRequest build() {
            return new DescribeLiveStreamMetricDetailDataRequest(this);
        } 

    } 

}
