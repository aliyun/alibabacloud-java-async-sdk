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
 * {@link DescribeLiveDomainStreamTranscodeDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainStreamTranscodeDataRequest</p>
 */
public class DescribeLiveDomainStreamTranscodeDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Precision")
    private String precision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Split")
    private String split;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeLiveDomainStreamTranscodeDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.precision = builder.precision;
        this.regionId = builder.regionId;
        this.split = builder.split;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainStreamTranscodeDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return precision
     */
    public String getPrecision() {
        return this.precision;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return split
     */
    public String getSplit() {
        return this.split;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainStreamTranscodeDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String interval; 
        private Long ownerId; 
        private String precision; 
        private String regionId; 
        private String split; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainStreamTranscodeDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.precision = request.precision;
            this.regionId = request.regionId;
            this.split = request.split;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The main streaming domain to query.</p>
         * <ul>
         * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
         * <li>If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</li>
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T22:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><strong>3600</strong>: 1 hour</li>
         * <li><strong>86400</strong>: 1 day</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the time granularity of 1 hour is used by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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
         * <p>The time precision of the query. Valid values:</p>
         * <ul>
         * <li><strong>min</strong> (default): in minutes.</li>
         * <li><strong>sec</strong>: in seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>min</p>
         */
        public Builder precision(String precision) {
            this.putQueryParameter("Precision", precision);
            this.precision = precision;
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
         * <p>The key that is used to group data. Valid values:</p>
         * <ul>
         * <li><strong>domain</strong>: The DomainName parameter is available in the response only if Split is set to domain.</li>
         * <li><strong>region</strong>: The Region parameter is available in the response only if Split is set to region.</li>
         * <li><strong>transcode_type</strong>: The TanscodeType parameter is available in the response only if Split is set to transcode_type.</li>
         * <li><strong>resolution</strong>: The Resolution parameter is available in the response only if Split is set to resolution.</li>
         * <li><strong>fps</strong>: The Fps parameter is available in the response only if Split is set to fps.</li>
         * </ul>
         * <p>You can specify one or more keys. If you specify multiple keys, separate them with commas (,).</p>
         * <p>Default value: <code>domain,region,transcode_type,resolution,fps</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder split(String split) {
            this.putQueryParameter("Split", split);
            this.split = split;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <ul>
         * <li>The minimum query interval is 1 hour.</li>
         * <li>If you do not set this parameter, the transcoding length for the last 24 hours is returned.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeLiveDomainStreamTranscodeDataRequest build() {
            return new DescribeLiveDomainStreamTranscodeDataRequest(this);
        } 

    } 

}
